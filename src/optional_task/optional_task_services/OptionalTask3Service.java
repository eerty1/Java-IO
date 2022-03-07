package optional_task.optional_task_services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class OptionalTask3Service {
    public static void reverseFileContent (BufferedReader bufferedReader, BufferedWriter bufferedWriter) throws IOException {
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            for (int i = line.length(); i > 0; i--) {
                bufferedWriter.write(line.charAt(i-1));
            }
            bufferedWriter.write("\r\n");
        }
    }
}
