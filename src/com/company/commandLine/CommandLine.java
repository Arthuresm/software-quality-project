package com.company.commandLine;

import com.company.commandLine.command.Command;
import com.company.commandLine.command.authentication.LoginCommand;
import com.company.commandLine.command.authentication.LogoutCommand;
import com.company.commandLine.command.exit.ExitCommand;
import com.company.commandLine.command.invalid.InvalidCommand;
import com.company.commandLine.command.item.CreateItemCommand;
import com.company.commandLine.command.item.EditItemCommand;
import com.company.commandLine.command.item.PurchaseItemCommand;
import com.company.commandLine.command.item.RemoveItemCommand;
import com.company.commandLine.command.item.ShowItemsCommand;
import com.company.commandLine.command.user.CreateUserCommand;
import com.company.model.Authentication;
import com.company.service.ItemService;
import com.company.service.UserService;

import java.util.HashMap;
import java.util.Scanner;

public class CommandLine {
  private final HashMap<Integer, Command> commands;
  private final Authentication authentication;
  private final UserService userService;
  private final ItemService itemService;

  public CommandLine() {
    this.commands = new HashMap<>();
    this.authentication = new Authentication();
    this.userService = new UserService();
    this.itemService  = new ItemService();
    commands.put(1, new CreateUserCommand(1, this.userService, this.authentication));
    commands.put(2, new LoginCommand(2, this.userService, this.authentication));
    commands.put(3, new PurchaseItemCommand(3, this.itemService, this.userService, this.authentication));
    commands.put(4, new CreateItemCommand(4, this.itemService, this.authentication));
    commands.put(5, new RemoveItemCommand(5, this.itemService, this.authentication));
    commands.put(6, new EditItemCommand(6, this.itemService, this.authentication));
    commands.put(7, new ShowItemsCommand(7, this.itemService));
    commands.put(8, new LogoutCommand(8, this.authentication));
    commands.put(0, new ExitCommand(0));
  }

  public void execute() {
    System.out.println("Bem vindo ao XLO seu marketplace para desapegar");
    while (true) {
      commands.forEach((key, value) -> value.start());
      int option = this.getOption();
      getCommand(option).execute();
    }
  }
  
  private int getOption(){
      Scanner scanner = new Scanner(System.in);
      return scanner.nextInt();
  }
  
  private Command getCommand(int option)  {
      if (!optionIsValid(option)) {
          return new InvalidCommand(option);
      }
      return this.commands.get(option);
  }
  
  private boolean optionIsValid(int option) {
      return this.commands.containsKey(option);
  }
}
