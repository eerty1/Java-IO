package optional_task;

import optional_task.optional_task_services.OptionalTask2Service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OptionalTask2Action {
    public static void main(String[] args) {
        File fileRead = new File("G:\\GitRepositories\\Java-IO\\src\\optional_task\\utility_classes\\OptionalTask2WhatITake.java");
        File fileWrite = new File("G:\\GitRepositories\\Java-IO\\src\\optional_task\\utility_classes\\OptionalTask2WhatIGet.java");
        try (FileReader fileReader = new FileReader(fileRead); BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(fileWrite); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            OptionalTask2Service.replaceText(bufferedReader, bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
