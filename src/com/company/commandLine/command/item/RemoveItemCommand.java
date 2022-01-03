package com.company.commandLine.command.item;

import com.company.commandLine.command.Command;
import com.company.commandLine.command.InputCommand;
import com.company.model.Authentication;
import com.company.model.Item;
import com.company.service.ItemService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveItemCommand implements Command {
  public final ItemService service;
  public final Authentication auth;

  public RemoveItemCommand(ItemService service, Authentication auth) {
    this.service = service;
    this.auth = auth;
  }

  @Override
  public void start() {
    if(auth.isLoggedIn()) {
      System.out.println("4 - Remover item");
    }
  }

  @Override
  public void execute() {
    InputCommand inputCommand = new InputCommand();
    HashMap<Integer, String> items = this.auth.getUser().showItems();
    int opt = inputCommand.readInt();
    this.service.delete(items.get(opt));
  }
}
