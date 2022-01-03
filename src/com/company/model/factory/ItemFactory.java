package com.company.model.factory;

import com.company.commandLine.command.InputCommand;
import com.company.model.Item;
import com.company.model.req.ItemRequest;

import java.util.Date;

public class ItemFactory {

  public static ItemRequest makeItemRequest() {
    InputCommand inputCommand = new InputCommand();
    String name = inputCommand.readValue("nome");
    String description = inputCommand.readValue("descrição");
    String category = inputCommand.readValue("categoria");
    String price = inputCommand.readValue("preço");
    return new ItemRequest(name, description, category, price);
  }
}
