package com.agnese_dissan.fastjob.storage;

import java.io.File;

public interface Storage{
    void writeFile(File file);
    File readFile(String path);

    void storeLogin(String username, String pwd);


}
