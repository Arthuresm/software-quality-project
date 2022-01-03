package com.company.commandLine.command.item;

import com.company.commandLine.command.Command;
import com.company.commandLine.command.InputCommand;
import com.company.model.Authentication;
import com.company.model.Item;
import com.company.service.ItemService;
import com.company.service.UserService;

import java.util.HashMap;

public class PurchaseItemCommand implements Command {
  private final ItemService itemService;
  private final UserService userService;
  private final Authentication authentication;

  public PurchaseItemCommand(
      ItemService itemService, UserService userService, Authentication authentication) {
    this.itemService = itemService;
    this.userService = userService;
    this.authentication = authentication;
  }

  @Override
  public void start() {
    if(this.authentication.isLoggedIn()){
      System.out.println("7 - Comprar item");
    }
  }

  @Override
  public void execute() {
    InputCommand inputCommand = new InputCommand();
    HashMap<Integer, String> itemsRef = this.itemService.show();
    int opt = inputCommand.readInt();
    Item item = this.itemService.getItemBy(itemsRef.get(opt));
    this.userService.processPayment(item, this.authentication.userREF());
  }
}
