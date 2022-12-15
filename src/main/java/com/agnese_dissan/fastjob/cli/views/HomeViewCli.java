package com.agnese_dissan.fastjob.cli.views;

import com.agnese_dissan.fastjob.ApplicationView;
import com.agnese_dissan.fastjob.beans.HomeBean;
import com.agnese_dissan.fastjob.cli.Input;
import com.agnese_dissan.fastjob.cli.Output;

public class HomeViewCli extends Thread implements ApplicationView {

    Thread thread;
    HomeBean homeBean;

    public HomeViewCli(){
        thread = new Thread(this);
        homeBean = new HomeBean();
    }

    @Override
    public void go() {
        thread.start();
    }

    @Override
    public String getInput(String in) {
        Output.print(in);
        return Input.in();
    }

    @Override
    public void run(){
        getInput();
    }

    private void getInput() {
        String command;
        do {
            getCommandList();
            Output.print("Insert command: ");
            command = Input.in();
            assert command != null;
            command = command.toUpperCase();
        } while (!homeBean.getCmd().contains(command));

        homeBean.operate(command);
    }

    private void startLogin(){
        Output.print("Login started... ");
    }

    void getCommandList(){
        int n = 1;
        Output.println("Available command: ");
        for (String str: homeBean.getCmd()
        ) {
            Output.println((n++) + ": " + str);
        }
    }

}
