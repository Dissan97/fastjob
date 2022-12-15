package com.agnese_dissan.fastjob.beans;

import java.util.ArrayList;
import java.util.List;

public class HomeBean {

    private String username;
    private String pwd;



    private final List<String> cmd = new ArrayList<>();
    public HomeBean() {
        cmd.add("LOGIN");
        cmd.add("REGISTER");
        cmd.add("EXIT");
    }

    public List<String> getCmd(){
        return this.cmd;
    }



    public void operate(String command) {
        switch (cmd.indexOf(command)){

            case 0 ->{

            }

            case 1 ->{

            }

            default -> {

            }

        }
    }
}
