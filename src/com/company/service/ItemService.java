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

  public HashMap<Integer, String> showAll() {
    List<Item> itemsList = new ArrayList<>(this.items.values());
    HashMap<Integer, String> itemsRef = new HashMap<>();
    for (int i = 0; i < itemsList.size(); i++) {
        Item item = itemsList.get(i);
        itemsRef.put(i, item.id());
        System.out.println("Id: " + i + " - Item: " + item.getName());
    }
    return itemsRef;
  }
  
  public HashMap<Integer, String> showAvailablesToBuy(String userRef) {
    List<Item> itemsList = new ArrayList<>(this.items.values());
    HashMap<Integer, String> itemsRef = new HashMap<>();
    for (int i = 0; i < itemsList.size(); i++) {
        Item item = itemsList.get(i);
        if (!item.getUserRef().equals(userRef)) {
            itemsRef.put(i, item.id());
            System.out.println("Id: " + i + " - Item: " + item.getName());
        }
    }
    return itemsRef;
  }
  
}
