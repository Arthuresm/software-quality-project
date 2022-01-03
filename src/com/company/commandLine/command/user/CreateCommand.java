package com.company.commandLine.command.user;

import com.company.commandLine.command.Command;
import com.company.commandLine.command.InputCommand;
import com.company.model.Authentication;
import com.company.model.User;
import com.company.service.UserService;

import java.util.HashMap;

public class CreateCommand implements Command {
  private final UserService userService;
  private Authentication authentication;
  public CreateCommand(UserService userService, Authentication authentication) {
    this.userService = userService;
    this.authentication = authentication;
  }

  @Override
  public void start() {
    if(!this.authentication.isLoggedIn()) {
      System.out.println("1 - Cadastrar usuário.");
    }
  }

  @Override
  public void execute() {
    InputCommand input = new InputCommand();
    String email, name, password, phone, street;
    email = input.readValue("Email");
    name = input.readValue("Nome");
    password = input.readValue("Senha");
    phone = input.readValue("Telefone");
    street = input.readValue("Endereço");
    this.userService.insertUser(new User(name, email, password, phone, street));
  }
}
