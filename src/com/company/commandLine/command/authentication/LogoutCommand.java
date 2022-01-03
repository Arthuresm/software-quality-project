package com.company.commandLine.command.authentication;

import com.company.commandLine.command.Command;
import com.company.model.Authentication;

public class LogoutCommand implements Command {
  private final Authentication auth;

  public LogoutCommand(Authentication auth) {this.auth = auth;}

  @Override
  public void start() {
    if(this.auth.isLoggedIn()) {
      System.out.println("7 - Logout");
    }
  }

  @Override
  public void execute() {
    this.auth.authenticate(false, null);
  }
}
