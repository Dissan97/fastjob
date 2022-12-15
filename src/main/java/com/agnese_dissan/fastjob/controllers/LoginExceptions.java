package com.agnese_dissan.fastjob.controllers;

import com.agnese_dissan.fastjob.Starter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginExceptions  extends Exception{

    private final static Logger LOGGER = LoggerFactory.getLogger(Starter.class);
    public LoginExceptions() throws LoginExceptions {
        LOGGER.trace("LOGIN FAILED...");
        throw new LoginExceptions("LOGIN FAILED");
    }

    public LoginExceptions(String message) {
        super(message);
    }
}
