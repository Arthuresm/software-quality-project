package com.company.commandLine.command.authentication;

import com.company.commandLine.command.Command;
import com.company.commandLine.command.InputCommand;
import com.company.model.Authentication;
import com.company.model.User;
import com.company.service.UserService;

public class LoginCommand implements Command {
  private final UserService userService;
  private final Authentication authentication;
  public LoginCommand(UserService users, Authentication authentication) {
    this.userService = users;
    this.authentication = authentication;
  }

  @Override
  public void start() {
    if(!this.authentication.isLoggedIn()) {
      System.out.println("2 - Fazer Login");
    }
  }

  @Override
  public void execute() {
    InputCommand input = new InputCommand();
    String email, password;
    email = input.readValue("email");
    password = input.readValue("senha");
    User user = this.userService.getUserBy(email);

    if (user.getPassword().equals(password)) {
      this.authentication.authenticate(true, user);
    } else {
      System.out.println("Usuário não encontrado.");
    }
  }
}
