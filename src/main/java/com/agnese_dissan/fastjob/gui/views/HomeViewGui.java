package com.agnese_dissan.fastjob.gui.views;

import com.agnese_dissan.fastjob.ApplicationView;
import javafx.application.Application;
import javafx.stage.Stage;

public class HomeViewGui extends Application implements ApplicationView {

    public HomeViewGui(){

    }

    @Override
    public void start(Stage stage) throws Exception {

    }

    @Override
    public void go() {
        launch();
    }

    @Override
    public String getInput(String in) {
        return null;
    }
}
