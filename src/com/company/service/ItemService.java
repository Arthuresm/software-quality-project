package com.company.service;

import com.company.model.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ItemService {
  private HashMap<String, Item> items;
  public ItemService() {
    this.items = new HashMap<>();
  }

  public void insert(Item item) {
    this.items.put(item.id(), item);
  }

  public void delete(String ref) {
    this.items.remove(ref);
  }

  public Item getItemBy(String ref) {
    return this.items.get(ref);
  }

  public HashMap<Integer, String> show() {
    List<Item> items = new ArrayList<>(this.items.values());
    HashMap<Integer, String> itemsRef = new HashMap<>();
    items.forEach(item -> {
      int i = 0;
      itemsRef.put(i, item.id());
      System.out.println("Id: " + i + " - Item: " + item.getName());
      i++;
    });
    return itemsRef;
  }
}
