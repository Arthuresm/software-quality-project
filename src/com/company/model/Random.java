package com.company.model;

import java.util.UUID;

public class Random {
  public static String GetUUID(){
    return  UUID.randomUUID().toString();
  }
}
