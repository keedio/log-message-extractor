package com.keedio.utils;

import java.io.*;

public class LogMessageExtractor {

    public static void main(String[] args) {

        if ( args.length < 1 ) {
            System.out.println("Usage: LogMessageExtractor INPUT OUTPUT, where:");
            System.out.println("\tINPUT: input log file in JSON format (Enriched Flume Event)");
            System.out.println("\tOUTPUT: output file (Optional, defaults to console)");
            System.exit(1);
        }

        boolean printToFile = (args.length == 2);

        String input = args[0];
        PrintStream stdout = System.out;
        PrintStream output = stdout;
        try (BufferedReader buffer = new BufferedReader(new FileReader(input))) {
            if ( printToFile ) {
                System.out.println("\nOutput to: " + args[1]);
                output = new PrintStream(new FileOutputStream(args[1]));
            }
            System.setOut(output);

            String line;
            while ((line = buffer.readLine()) != null) {
                FlumePayload data = JsonSerializer.fromJSONString(line, FlumePayload.class);
                output.println(data.getMessage());
            }
            if (printToFile) {
                output.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.setOut(stdout);
        }
    }
}
