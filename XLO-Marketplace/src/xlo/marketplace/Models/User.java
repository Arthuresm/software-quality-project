/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xlo.marketplace.Models;

import Utils.Random;
import java.util.ArrayList;

/**
 *
 * @author arthu
 */
public class User {
    
    private String Id;
    private String Name;
    private String Email;
    private String Password;
    private String Phone;
    private String Address;
    private ArrayList<Item> Items;
    
    public User(String Name, String Email, String Password, String Phone, String Address) {
        this.Name = Name;
        this.Email = Email;
        this.Password = Password;
        this.Phone = Phone;
        this.Address = Address;
        this.Id = Random.GetUUID();
        this.Items = new ArrayList<>();
    }
    public User(String Name, String Email, String Password, String Phone, String Address, ArrayList<Item> Items) {
        this.Name = Name;
        this.Email = Email;
        this.Password = Password;
        this.Phone = Phone;
        this.Address = Address;
        this.Id = Random.GetUUID();
        Items.forEach(item -> item.setUserId(this.Id));
        this.Items = Items;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    
    public String getID() {
        return Id;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    public void AddItem(Item item) {
        this.Items.add(item);
    }
    
    public ArrayList<Item> GetItems() {
        return this.Items;
    }
    
       
}
