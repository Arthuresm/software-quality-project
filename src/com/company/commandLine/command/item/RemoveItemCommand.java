package com.company.commandLine.command.item;

import com.company.commandLine.command.Command;
import com.company.commandLine.command.InputCommand;
import com.company.model.Authentication;
import com.company.service.ItemService;

import java.util.HashMap;

public class RemoveItemCommand extends Command {
  public final ItemService itemService;
  public final Authentication auth;

  public RemoveItemCommand(int option, ItemService itemService, Authentication auth) {
    super.option = option;
    this.itemService = itemService;
    this.auth = auth;
  }

  @Override
  public void start() {
    if(auth.isLoggedIn()) {
      super.print("Remover item");
    }
  }

  @Override
  public void execute() {
    InputCommand inputCommand = new InputCommand();
    var user = this.auth.getUser();
    HashMap<Integer, String> items = user.showItems();
    if (items.isEmpty()) {
        System.out.println("Nenhum item cadastrado.");
        return;
    }
    int opt = inputCommand.readInt();
    var itemRef = items.get(opt);
    this.itemService.delete(itemRef);
    user.deleteItem(itemRef);
  }
}
