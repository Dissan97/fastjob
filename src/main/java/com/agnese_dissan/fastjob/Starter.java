package com.agnese_dissan.fastjob;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;

public class Starter{

    private final static Logger LOGGER = LoggerFactory.getLogger(Starter.class);
    public static void main(String @NotNull [] args){
        if (args.length < 1){
            LOGGER.debug("Pass at least one arguments");
        }
        String arg = args[0].toUpperCase(Locale.ROOT);
        ApplicationView app = HomeFactory.getStarter(arg);
        if (app == null){
            LOGGER.debug("Cannot start the app");
            System.exit(1);
        }
        app.go();
    }
}
