package com.company.commandLine.command.item;

import com.company.commandLine.command.Command;
import com.company.model.Authentication;
import com.company.model.Item;
import com.company.model.factory.ItemFactory;
import com.company.model.req.ItemRequest;
import com.company.service.ItemService;


public class CreateItemCommand extends Command {
  private final Authentication auth;
  private final ItemService itemService;
  
  public CreateItemCommand(int option, ItemService itemService, Authentication auth) {
    super.option = option;
    this.auth = auth;
    this.itemService = itemService;
  }
  @Override
  public void start() {
    if(this.auth.isLoggedIn()) {
      super.print("Criar item");
    }
  }

  @Override
  public void execute() {
    ItemRequest req = ItemFactory.makeItemRequest();
    Item item = Item.create(req, this.auth.userREF());
    this.itemService.insert(item);
    this.auth.getUser().insertItem(item);
  }
}
