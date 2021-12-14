/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xlo.marketplace.Models;

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
    
    public User(String Name, String Email, String Password, String Phone, String Address) {
        this.Name = Name;
        this.Email = Email;
        this.Password = Password;
        this.Phone = Phone;
        this.Address = Address;
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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
       
}
