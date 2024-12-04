package com.amalvadkar.jia.util;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class JavaInActionUtils {

    public static List<Integer> realAllIntegersFromTextFile(String textFilePath) {

        // Note : make sure we should be able to read when run from jar
        ClassPathResource classPathResource = new ClassPathResource(textFilePath);

        // Reading data from file
        try {
            Path path = Paths.get(classPathResource.getURI());
            return readContent(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Integer> readContent(Path path) {
        try (Stream<String> linesStream = Files.lines(path)) {
            return linesStream
                    .map(Integer::parseInt)
                    .toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
