package com.company.commandLine.command.item;

import com.company.commandLine.command.Command;
import com.company.commandLine.command.InputCommand;
import com.company.model.Authentication;
import com.company.model.Item;
import com.company.model.factory.ItemFactory;
import com.company.model.req.ItemRequest;
import com.company.service.ItemService;

import java.util.HashMap;

public class EditItemCommand implements Command {
  private final ItemService service;
  private final Authentication auth;

  public EditItemCommand(ItemService service, Authentication auth) {
    this.service = service;
    this.auth = auth;
  }

  @Override
  public void start() {
    if(auth.isLoggedIn()) {
      System.out.println("5 - Editar item");
    }
  }

  @Override
  public void execute() {
    InputCommand inputCommand = new InputCommand();
    HashMap<Integer, String> items = this.auth.getUser().showItems();
    int opt = inputCommand.readInt();
    ItemRequest req = ItemFactory.makeItemRequest();
    Item item = this.service.getItemBy(items.get(opt));
    item.update(req);
  }
}
