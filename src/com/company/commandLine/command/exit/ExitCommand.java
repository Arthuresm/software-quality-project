package com.company.commandLine.command.exit;

import com.company.commandLine.command.Command;

import static java.lang.System.exit;

public class ExitCommand extends Command {  
  public ExitCommand(int option) {
    super.option = option;
  }
    
  @Override
  public void start() {
    super.print("Sair");
  }

  @Override
  public void execute() {
    exit(0);
  }
}
