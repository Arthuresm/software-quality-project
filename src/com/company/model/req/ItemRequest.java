package com.company.model.req;

public class ItemRequest {
  public String name, description, category, price;

  public ItemRequest(String name, String description, String category, String price) {
    this.name = name;
    this.description = description;
    this.category = category;
    this.price = price;
  }
}
