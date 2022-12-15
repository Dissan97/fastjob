package com.agnese_dissan.fastjob.cli;

import org.jetbrains.annotations.Nullable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

    private Input(){}
    private static final BufferedReader input = new BufferedReader(
            new InputStreamReader(System.in)
    );

    public static @Nullable String in(){
        try {
            return input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }



}
