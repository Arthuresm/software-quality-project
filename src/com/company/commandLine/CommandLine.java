package com.company.commandLine;

import com.company.commandLine.command.Command;
import com.company.commandLine.command.authentication.LoginCommand;
import com.company.commandLine.command.authentication.LogoutCommand;
import com.company.commandLine.command.exit.ExitCommand;
import com.company.commandLine.command.item.CreateItemCommand;
import com.company.commandLine.command.item.EditItemCommand;
import com.company.commandLine.command.item.RemoveItemCommand;
import com.company.commandLine.command.item.ShowItemsCommand;
import com.company.commandLine.command.user.CreateCommand;
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
    commands.put(1, new CreateCommand(this.userService, this.authentication));
    commands.put(2, new LoginCommand(this.userService, this.authentication));
    commands.put(3, new CreateItemCommand(this.itemService, this.authentication));
    commands.put(4, new RemoveItemCommand(this.itemService, this.authentication));
    commands.put(5, new EditItemCommand(this.itemService, this.authentication));
    commands.put(6, new ShowItemsCommand(this.itemService));
    commands.put(7, new LogoutCommand(this.authentication));
    commands.put(0, new ExitCommand());
  }

  public void execute() {
    System.out.println("Bem vindo ao XLO seu marketplace para desapegar");
    while (true) {
      commands.forEach((key, value) -> value.start());
      int option = this.getOption();
      this.commands.get(option).execute();
    }
  }
  private int getOption(){
      Scanner scanner = new Scanner(System.in);
      return scanner.nextInt();
  }
}
