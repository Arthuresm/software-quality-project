package com.company.commandLine.command;

public abstract class Command {
    public int option;
    
    public abstract void start();
    public abstract void execute();
    
    protected void print(String description) {
        System.out.println(option + " - " + description);
    }
}
