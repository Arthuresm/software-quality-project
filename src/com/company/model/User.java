package com.company.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class User {

  private String id;
  private String name;
  private String email;
  private String password;
  private String phone;
  private String address;
  private List<Item> items;

  public User(String name, String email, String password, String phone, String address) {
    this.id = Random.GetUUID();
    this.name = name;
    this.email = email;
    this.password = password;
    this.phone = phone;
    this.address = address;
    this.items = new ArrayList<>();
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public void insertItem(Item item) {
    this.items.add(item);
  }

  public void receiveItem(Item item) {
    item.setUserId(this.getEmail());
    this.insertItem(item);
  }

  public void transferItem(Item item) {
    this.items.remove(item);
  }

  public HashMap<Integer, String> showItems() {
    HashMap<Integer, String> itemsRef = new HashMap<>();
    this.items.forEach(item -> {
      int i = 0;
      itemsRef.put(i, item.id());
      System.out.println("Id: " + i + " - Item: " + item.getName());
      i++;
    });
    return itemsRef;
  }
}
