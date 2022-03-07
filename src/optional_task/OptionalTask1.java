package optional_task;

import optional_task.optional_task_services.OptionalTask1Service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OptionalTask1 {
    public static void main(String[] args) {
        File fileOutput = new File("src/resources/OptionalTask1SortingOutput.txt");
        try( FileWriter fileWriter = new FileWriter(fileOutput); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            OptionalTask1Service.createUnsortedNumbers(bufferedWriter);
            OptionalTask1Service.doTheSorting();
            OptionalTask1Service.writeSortedArray(bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
