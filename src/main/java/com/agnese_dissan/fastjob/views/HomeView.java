package com.agnese_dissan.fastjob.views;

import javafx.application.Application;
import javafx.stage.Stage;
import org.jetbrains.annotations.NotNull;

public class HomeView extends Application implements Runnable {

    public HomeView(@NotNull Boolean gui){
        if (gui){
            launch();
        }
        startCli();
    }

    private void startCli() {
        Thread commandLine = new Thread(this);
        commandLine.start();
    }

    @Override
    public void start(Stage stage) throws Exception {

    }

    @Override
    public void run() {

    }
}
