package com.company.model;

public class Authentication {
  private Boolean authentication;
  private User user;
  public Authentication() {
    this.authentication = false;
  }

  public void authenticate(boolean auth, User user) {
    this.authentication = auth;
    this.user = user;
  }

  public boolean isLoggedIn() {
    return this.authentication;
  }

  public String userREF() {
    return this.user.getEmail();
  }

  public User getUser() {
    return user;
  }
}
