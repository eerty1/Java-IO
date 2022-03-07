package optional_task.optional_task_services;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Random;

public class OptionalTask1Service {
    private static final int[] ARRAY = new int[10];
    public static void createUnsortedNumbers (BufferedWriter bufferedWriter) throws IOException {
        String line;
        Random random = new Random();
        bufferedWriter.write("Before sorting: " + "\n");
        for (int i = 0; i < ARRAY.length; i++) {
            ARRAY[i] = random.nextInt(100);
            line = ARRAY[i] + "\n";
            bufferedWriter.write(line);
        }
    }

    public static void doTheSorting () {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < ARRAY.length; i++) {
                if (ARRAY[i] < ARRAY[i-1]) {
                    int temp = ARRAY[i];
                    ARRAY[i] = ARRAY[i-1];
                    ARRAY[i-1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    public static void writeSortedArray (BufferedWriter bufferedWriter) throws IOException {
        bufferedWriter.write("After sorting: " + "\n");
        for (int i = 0; i < ARRAY.length; i++) {
            String sortedLine = ARRAY[i] + "\n";
            bufferedWriter.write(sortedLine);
        }
    }
}
