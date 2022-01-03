package com.company.model;

import com.company.model.req.ItemRequest;

import java.util.Date;

public class Item {

  private String id;
  private String name;
  private String description;
  private String category;
  private String price;
  private Date created_at;
  private Date updated_at;
  private String ref;

  public Item(String name, String description, String category, String price, String userId) {
    this.name = name;
    this.description = description;
    this.category = category;
    this.price = price;
    this.ref = userId;
    this.id = Random.GetUUID();
    this.created_at = new Date();
  }

  public String getName() {
    return name;
  }

  public void setUserId(String UserId) {
    this.ref = UserId;
  }

  public String getUserRef() {
    return ref;
  }

  public String id() {
    return this.id;
  }
  public static Item create(ItemRequest item, String userRef) {
    return new Item(item.name, item.description, item.price, item.category, userRef);
  }

  public void update(ItemRequest request) {
    this.name = request.name;
    this.category = request.category;
    this.description = request.description;
    this.price = request.price;
    this.updated_at = new Date();
  }
}