/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.commandLine.command.invalid;

import com.company.commandLine.command.Command;

/**
 *
 * @author guilhermegiacomin
 */
public class InvalidCommand extends Command {    
    public InvalidCommand(int option) {
      super.option = option;
    }
    
    @Override
    public void start() {
    }
    
    @Override
    public void execute() {
      System.out.println("Comando \"" + option + "\" inválido.");
    }
}
