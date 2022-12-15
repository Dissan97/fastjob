package com.agnese_dissan.fastjob.controllers;

import com.agnese_dissan.fastjob.storage.Storage;
import com.agnese_dissan.fastjob.storage.StorageManager;
import com.agnese_dissan.fastjob.cli.Input;

public class Login {

    private String username = null;
    private String pwd = null;

    public Login() {
        signIn();
    }

    private void signIn() {
        String username = Input.in();

        if(username != null){
            this.username = username;
        }

        String pwd = Input.in();

        if (pwd != null){
            this.pwd = pwd;
        }

        this.store();

    }

    private void store(){
        try {
            if (this.pwd == null || this.username == null)
                throw new LoginExceptions();
        }catch (LoginExceptions e){
            e.printStackTrace();
        }
        Storage save = StorageManager.getStorageSystem(true);
        save.storeLogin(this.username, this.pwd);
    }

    public Login(String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
    }
}
