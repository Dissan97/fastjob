package com.agnese_dissan.fastjob;

import com.agnese_dissan.fastjob.cli.views.HomeViewCli;
import com.agnese_dissan.fastjob.gui.views.HomeViewGui;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeFactory {

    private final static Logger LOGGER = LoggerFactory.getLogger(Starter.class);
    private static HomeViewCli cli;
    private static HomeViewGui gui;
    private HomeFactory(){}

    public static ApplicationView getStarter(String arg){

        switch (arg){

            case "CLI" ->{
                if (cli == null){
                    cli = new HomeViewCli();
                }
                return cli;
            }

            case "GUI" ->{
                if(gui == null){
                    gui = new HomeViewGui();
                }
                return gui;
            }

            default -> LOGGER.debug("Pass in arg cli or gui");

        }
        return null;
    }
}
