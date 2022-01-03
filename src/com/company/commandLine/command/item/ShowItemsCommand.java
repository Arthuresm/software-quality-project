package com.company.commandLine.command.item;

import com.company.commandLine.command.Command;
import com.company.model.Item;
import com.company.service.ItemService;

import java.util.List;

public class ShowItemsCommand implements Command {
  private final ItemService service;

  public ShowItemsCommand(ItemService service) {
    this.service = service;
  }

  @Override
  public void start() {
    System.out.println("6 - Listar todos os items");
  }

  @Override
  public void execute() {
    this.service.show();
  }
}
