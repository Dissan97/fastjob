package com.agnese_dissan.fastjob.cli;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Output{

    private static final BufferedWriter OUTPUT = new BufferedWriter(
            new OutputStreamWriter(System.out)
    );
    private Output() {}

    public static void print(String msg) {
        try {
            OUTPUT.write(msg, 0, msg.length());
            OUTPUT.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void println(String msg) {
        print(msg + "\n");
    }
}
