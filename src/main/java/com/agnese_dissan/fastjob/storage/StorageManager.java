package com.agnese_dissan.fastjob.storage;

import java.io.File;

public class StorageManager{

    private static FileSystem fileSystem = null;
    private static Dbms dbms = null;
    private StorageManager(){}

    /**
     *
     * @param fs declaring which want file system or dbms
     * @return Storage if !fs will be DBMS else FileSystem
     */
    public static Storage getStorageSystem(boolean fs){
        if (!fs){
            if (dbms == null){
                dbms = new Dbms();
            }
            return dbms;
        }
       if(fileSystem == null){
           fileSystem = new FileSystem();
       }
       return fileSystem;
    }

}
