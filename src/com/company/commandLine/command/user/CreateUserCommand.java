package com.company.commandLine.command.user;

import com.company.commandLine.command.Command;
import com.company.commandLine.command.InputCommand;
import com.company.model.Authentication;
import com.company.model.User;
import com.company.service.UserService;

public class CreateUserCommand extends Command {
  private final UserService userService;
  private final Authentication authentication;
    
  public CreateUserCommand(int option, UserService userService, Authentication authentication) {
    super.option = option;
    this.userService = userService;
    this.authentication = authentication;
  }

  @Override
  public void start() {
    if(!this.authentication.isLoggedIn()) {
      super.print("Cadastrar usuário");
    }
  }

  @Override
  public void execute() {
    InputCommand input = new InputCommand();
    String email, name, password, phone, street, cpf;
    email = input.readValue("Email");
    name = input.readValue("Nome");
    cpf = input.readValue("CPF");
    password = input.readValue("Senha");
    phone = input.readValue("Telefone");
    street = input.readValue("Endereço");
    this.userService.insertUser(new User(name, cpf, email, password, phone, street));
  }
}
