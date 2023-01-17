package com.kodilla.patterns.singleton;

public class Logger {

    private static Logger INSTANCE;

    public static Logger getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Logger();
        }
        return INSTANCE;
    }

    private Logger(){

    }


    private String lastLog = " ";

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}
