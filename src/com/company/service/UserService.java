package com.company.service;

import com.company.model.Item;
import com.company.model.User;

import java.util.HashMap;

public class UserService {
  private HashMap<String, User> users;

  public UserService() {
    this.users = new HashMap<>();
    users.put("admin",
              new User("admin", "admin", "admin", "admin", "admin")
    );
  }

  public void insertUser(User user) {
    this.users.put(user.getEmail(), user);
  }

  public User getUserBy(String query) {
    return this.users.get(query);
  }

  public void processPayment(Item purchasedItem, String userRef) {
    User seller = this.users.get(purchasedItem.getUserRef());
    User buyer = this.users.get(userRef);
    seller.transferItem(purchasedItem);
    buyer.receiveItem(purchasedItem);
  }
}
