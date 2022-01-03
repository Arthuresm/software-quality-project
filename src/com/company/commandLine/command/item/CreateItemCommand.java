package com.company.commandLine.command.item;

import com.company.commandLine.command.Command;
import com.company.commandLine.command.InputCommand;
import com.company.model.Authentication;
import com.company.model.Item;
import com.company.model.factory.ItemFactory;
import com.company.model.req.ItemRequest;
import com.company.service.ItemService;

import java.util.Date;

public class CreateItemCommand implements Command {
  private final Authentication auth;
  private final ItemService itemService;
  public CreateItemCommand(ItemService itemService, Authentication auth) {
    this.auth = auth;
    this.itemService = itemService;
  }
  @Override
  public void start() {
    if(this.auth.isLoggedIn()) {
      System.out.println("3 - Criar item.");
    }
  }

  @Override
  public void execute() {
    ItemRequest req = ItemFactory.makeItemRequest();
    Item item = Item.create(req, this.auth.userREF());
    this.auth.getUser().insertItem(item);
  }
}
