package com.agnese_dissan.fastjob.storage;

import com.agnese_dissan.fastjob.cli.Output;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileSystem implements Storage{
    @Override
    public void writeFile(File file) {

    }

    @Override
    public File readFile(String path) {
        File file = new File(path);
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(file)
            );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return file;
    }

    @Override
    public void storeLogin(String username, String pwd) {
        Output.println("Storing: \nUsername [" + username + "]\nPassword [" + pwd +"]");
    }
}
