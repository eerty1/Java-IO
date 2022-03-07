package main_task;

import main_task.service.DirectoryTreeService;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DirectoryTreeAction {
    public static void main(String[] args) {
        File root = new File(args[0]);
        File readAndWriteDirectoryContent = new File("src\\resources\\MainTaskTreePath.txt");
        List<File> listOfFiles = new ArrayList<>();
        try (FileWriter fileWriter = new FileWriter(readAndWriteDirectoryContent);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            System.out.println(DirectoryTreeService.walkThoughTheTree(root, listOfFiles));
            System.out.println("Average amount of files in folders is: " + DirectoryTreeService.findAvgAmountOfFilesInFolders());
            System.out.println("Average length of filename is: " + DirectoryTreeService.findAvgLengthOfFileName());
            DirectoryTreeService.writeTreeStructureInFile(listOfFiles, bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
