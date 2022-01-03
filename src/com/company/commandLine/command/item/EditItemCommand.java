package com.company.commandLine.command.item;

import com.company.commandLine.command.Command;
import com.company.commandLine.command.InputCommand;
import com.company.model.Authentication;
import com.company.model.Item;
import com.company.model.factory.ItemFactory;
import com.company.model.req.ItemRequest;
import com.company.service.ItemService;

import java.util.HashMap;

public class EditItemCommand extends Command {
  private final ItemService service;
  private final Authentication auth;

  public EditItemCommand(int option, ItemService service, Authentication auth) {
    super.option = option;
    this.service = service;
    this.auth = auth;
  }

  @Override
  public void start() {
    if(auth.isLoggedIn()) {
      super.print("Editar item");
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
    ItemRequest req = ItemFactory.makeItemRequest();
    Item item = this.service.getItemBy(items.get(opt));
    
    item.update(req);
    user.deleteItem(item.getId());
    user.insertItem(item);
  }
}
