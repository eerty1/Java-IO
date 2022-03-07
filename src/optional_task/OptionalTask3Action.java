package optional_task;

import optional_task.optional_task_services.OptionalTask3Service;

import java.io.*;

public class OptionalTask3Action {
    public static void main(String[] args) {
        File fileTake = new File("G:\\GitRepositories\\Java-IO\\src\\optional_task\\utility_classes\\OptionalTask3WhatITake.java");
        File fileReplace = new File("G:\\GitRepositories\\Java-IO\\src\\optional_task\\utility_classes\\OptionalTask3WhatIGet.java");
        try (FileReader fileReader = new FileReader(fileTake); BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(fileReplace); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            OptionalTask3Service.reverseFileContent(bufferedReader, bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
