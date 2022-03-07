package main_task.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DirectoryTreeService {
    private static int amountOfFolders = 0;
    private static int amountOfFiles = 0;
    private static final List<String> ONLY_FILES = new ArrayList<>();

    public static String walkThoughTheTree(File root, List<File> fileList) {
        if (root.isDirectory()) {
            fileList.add(root);
            File[] directoryFiles = root.listFiles();
            if (directoryFiles != null) {
                for (File filesInDirectory : directoryFiles) {
                    if (filesInDirectory.isDirectory()) {
                        walkThoughTheTree(filesInDirectory, fileList);
                        amountOfFolders++;
                    } else {
                        fileList.add(filesInDirectory);
                        ONLY_FILES.add(filesInDirectory.getName());
                        amountOfFiles++;
                    }
                }
            }
        }
        return "Amount of folders is: " + amountOfFolders + "; Amount of files is: " + amountOfFiles;
    }

    public static void writeTreeStructureInFile (List<File> fileList, BufferedWriter bufferedWriter) throws IOException {
        for(File writeFile : fileList) {
            bufferedWriter.write(writeFile.getName() + "\n");
        }
    }

    public static int findAvgAmountOfFilesInFolders() {
        return amountOfFiles / amountOfFolders;
    }

    public static int findAvgLengthOfFileName() {
        int totalCharAmount = 0;
        for (String amountOfChars : ONLY_FILES){
            totalCharAmount += amountOfChars.length();
        }
        return totalCharAmount / amountOfFiles;
    }
}
