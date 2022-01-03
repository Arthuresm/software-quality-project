package com.company.commandLine.command.exit;

import com.company.commandLine.command.Command;

import java.util.Optional;

import static java.lang.System.exit;

public class ExitCommand implements Command {
  @Override
  public void start() {
    System.out.println("0 - Sair");
  }

  @Override
  public void execute() {
    exit(0);
  }
}
