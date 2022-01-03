package com.company.commandLine.command.item;

import com.company.commandLine.command.Command;
import com.company.service.ItemService;

public class ShowItemsCommand extends Command {
  private final ItemService service;

  public ShowItemsCommand(int option, ItemService service) {
    super.option = option;
    this.service = service;
  }

  @Override
  public void start() {
    super.print("Listar todos os items");
  }

  @Override
  public void execute() {
    var items = this.service.showAll();
    if (items.isEmpty()) {
        System.out.println("Nenhum item cadastrado.");
    }
  }
}
