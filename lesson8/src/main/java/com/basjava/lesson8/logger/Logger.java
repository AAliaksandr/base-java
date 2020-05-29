package com.basjava.lesson8.logger;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static com.basjava.lesson8.Consts.ROOT_DIR_LOGGER;

public class Logger {

    public void info(String message, Class javaClass) {
        writeToLogFile(formatString(message, javaClass, LoggerType.INFO));
    }

    public void warn(String message, Class javaClass) {
        writeToLogFile(formatString(message, javaClass, LoggerType.WARN));
    }

    public void error(String message, Class javaClass) {
        writeToLogFile(formatString(message, javaClass, LoggerType.ERROR));
    }

    private String formatString(String message, Class javaClass, LoggerType type) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime = LocalDateTime.now().format(formatter);

        return formatDateTime +
                " " +
                javaClass +
                " " +
                type +
                " " +
                message +
                System.lineSeparator();
    }

    private void writeToLogFile(String message) {
        LocalDate now = LocalDate.now();

        String fileName = ROOT_DIR_LOGGER + "/" + now + ".txt";

        Path filePath = Paths.get(fileName);

        try {
            if (!Files.exists(filePath)) {
                Files.createFile(filePath);
            }
            Files.write(filePath, message.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Error happens");
        }
    }
}


