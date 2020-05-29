package com.basjava.lesson8;

import com.basjava.lesson8.logger.Logger;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;


class FileManager {

    private Logger logger = new Logger();

    private static int compare(File file1, File file2) {
        return file1.getName().compareTo(file2.getName());
    }

    private File rootDirectory;

    FileManager(String rootDirPath) {
        this.rootDirectory = new File(rootDirPath);
    }

    List<File> getFileList() {
        File[] fileArray = rootDirectory.listFiles();
        if (fileArray != null) {
            Arrays.sort(fileArray, FileManager::compare);
        }
        return fileArray != null ? asList(fileArray) : emptyList();
    }

    String readFile(File file) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                stringBuilder.append(line)
                        .append("\n");
            }
        }
        return stringBuilder.toString();
    }

    void writeFile(String fileName, String fileText) throws IOException {
        File file = new File(rootDirectory, fileName);
        if (!file.exists()) {
            file.createNewFile();
        }

        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(fileText);
        }
    }

    void addWrite(String fileName, String fileText) throws IOException {
        File file = new File(rootDirectory, fileName);
        if (!file.exists()) {
            file.createNewFile();
        }

        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(fileText);
        }
    }

    public void writeArchive(String sd,
                             ZipOutputStream out,
                             BufferedInputStream origin,
                             byte[] data) throws IOException {
        ZipEntry entry = new ZipEntry(sd);
        out.putNextEntry(entry);
        int count;
        while ((count = origin.read(data, 0, Consts.BUFFER)) != -1) {
            out.write(data, 0, count);
            out.flush();
        }
    }
}