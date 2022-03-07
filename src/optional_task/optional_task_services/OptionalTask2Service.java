package optional_task.optional_task_services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class OptionalTask2Service {
    private static final String PRIVATE = "private";
    private static final String PUBLIC = "public";
    private static final String CLASS_NAME_TAKE = "OptionalTask2WhatITake";
    private static final String CLASS_NAME_GET = "OptionalTask2WhatIGet";

    public static void replaceText (BufferedReader bufferedReader, BufferedWriter bufferedWriter) throws IOException {
        String line;
        while ((line = bufferedReader.readLine())!=null) {
            bufferedWriter.append(line.replaceAll(PUBLIC, PRIVATE)
                    .replaceAll(CLASS_NAME_TAKE, CLASS_NAME_GET)).append(System.lineSeparator());

        }
    }
}
