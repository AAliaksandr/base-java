package com.basjava.lesson8;


import com.basjava.lesson8.exception.MenuActionException;
import com.basjava.lesson8.logger.Logger;
import com.basjava.lesson8.menu.MainMenuTextConst;
import com.basjava.lesson8.menu.MenuFactory;
import com.basjava.lesson8.menu.item.MainMenuAction;
import com.basjava.lesson8.menu.item.MenuItem;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;


public class Menu {

    private FileManager fileManager;
    private Scanner scanner;
    private Logger logger = new Logger();


    public Menu(String rootDirPath) {
        this.fileManager = new FileManager(rootDirPath);
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            printMenuItems(MenuFactory.getMainMenu(MainMenuAction.values()));
            try {
                int menuNumber = readIntFromConsole();
                MainMenuAction mainMenuAction = MainMenuAction.getMainMenuAction(menuNumber);
                mainMenuAction(mainMenuAction);
            } catch (MenuActionException e) {
                e.printStackTrace();
                printText(MainMenuTextConst.ACTION_ITEM_ERROR_MESSAGE);
            }
        }
    }

    private void mainMenuAction(MainMenuAction mainMenuAction) {
        switch (mainMenuAction) {
            case READ_FILE:
                workWithFiles();
                break;
            case ADD_FILE:
                addNewFileAction();
                break;
            case DELETE_FILE:
                delFile();
                break;
            case ADD_NEW_ENTRIES:
                addNewEntries();
                break;
            case BACKUP_FILE:
                makeBackup();
                break;
            case RESTORE_FILE:
                restoreBackup();
                break;
            case EXIT:
                System.exit(0);
        }

    }

    private void addNewFileAction() {
        String fileName = readStringFromConsole();
        String fileText = readStringLines();

        try {
            fileManager.writeFile(fileName, fileText);
            logger.info("Created file", Menu.class);
        } catch (IOException e) {
            e.printStackTrace();
            printText(MainMenuTextConst.WRITE_FILE_ERROR_MESSAGE);
            logger.error("Error", Menu.class);
        }
    }

    private void workWithFiles() {
        List<File> files = fileManager.getFileList();
        printFiles(files);
        File file = files.get(readIntFromConsole());

        String text;
        try {
            text = fileManager.readFile(file);
            logger.info("Read file", Menu.class);
        } catch (IOException e) {
            e.printStackTrace();
            text = MainMenuTextConst.READ_FILE_ERROR_MESSAGE;
            logger.error("Error " + e, Menu.class);
        }
        printText(text);
    }

    private void delFile() {
        List<File> files = fileManager.getFileList();
        printFiles(files);
        File file = files.get(readIntFromConsole());
        try {
            if (file.delete()) {
                System.out.println("Файл " + file.getName() + " удален");
                logger.info("File is deleted " + file.getName(), Menu.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Error", Menu.class);
        }
    }

    private void addNewEntries() {

        List<File> files = fileManager.getFileList();
        printFiles(files);
        File file = files.get(readIntFromConsole());
        String fileText = readStringLines();

        try {
            fileManager.addWrite(file.getName(), fileText);
            logger.info("Add new line", Menu.class);
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("Error", Menu.class);
        }
    }

    private void makeBackup() {
        try (FileOutputStream dest = new FileOutputStream(new File(Consts.ROOT_DIR_BACKUP));
             ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(dest))) {
            byte[] data = new byte[Consts.BUFFER];

            File dir = new File(Consts.ROOT_DIR_PATH);
            String[] dirList = dir.list();
            if (dirList != null) {
                Arrays.stream(dirList).forEach(sd -> {
                    File f = new File(Consts.ROOT_DIR_PATH + "/" + sd);
                    if(f.isFile()){
                        try (FileInputStream fi = new FileInputStream(f);
                             BufferedInputStream origin = new BufferedInputStream(fi, Consts.BUFFER)) {
                            fileManager.writeArchive(sd, out, origin, data);

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Файлы загружены в архив " + sd);
                        logger.info("Files backup " + sd, Menu.class);
                    } else{
                        logger.info("No files for backup", Menu.class);
                    }

                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void restoreBackup() {
        try (ZipInputStream zin = new ZipInputStream(new FileInputStream(Consts.ROOT_DIR_BACKUP))) {
            ZipEntry entry;
            String name;

            while ((entry = zin.getNextEntry()) != null) {

                name = entry.getName();

                FileOutputStream fout = new FileOutputStream(Consts.ROOT_DIR_PATH + "/" + "/" + name);
                for (int c = zin.read(); c != -1; c = zin.read()) {
                    fout.write(c);
                }
                fout.flush();
                zin.closeEntry();
                fout.close();
                logger.info("Restore backup " + name, Menu.class);
            }
            System.out.println("Архив загружен " + Consts.ROOT_DIR_PATH);

        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Error", Menu.class);
        }
    }

    private <T> void printText(T text) {
        System.out.println(text.toString());
    }

    private void printFiles(List<File> files) {
        for (int i = 0; i < files.size(); i++) {
            File file = files.get(i);
            printText(String.format(MainMenuTextConst.ITEM_WITH_NUMBER, i, file.getName()));
        }
    }

    private void printMenuItems(List<MenuItem> menuItems) {
        for (MenuItem menuItem : menuItems) {
            printText(menuItem);
        }
    }

    private int readIntFromConsole() {
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    private String readStringFromConsole() {
        return scanner.nextLine();
    }

    private String readStringLines() {
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = readStringFromConsole()) != null && !line.equals("*exit")) {
            stringBuilder.append(line).append("\n");
        }
        return stringBuilder.toString();
    }
}
