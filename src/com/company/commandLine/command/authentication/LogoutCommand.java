package com.company.commandLine.command.authentication;

import com.company.commandLine.command.Command;
import com.company.model.Authentication;

public class LogoutCommand extends Command {
  private final int option;
  private final Authentication auth;

  public LogoutCommand(int option, Authentication auth) {
    this.option = option;
    this.auth = auth;
  }

  @Override
  public void start() {
    if(this.auth.isLoggedIn()) {
      System.out.println(option + " - Logout");
    }
  }

  @Override
  public void execute() {
    this.auth.authenticate(false, null);
  }
}
