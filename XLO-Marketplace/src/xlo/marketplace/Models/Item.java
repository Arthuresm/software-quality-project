/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xlo.marketplace.Models;

import Utils.Random;
import java.util.Date;

/**
 *
 * @author arthu
 */
public class Item {
    
    private String Id;
    private String Name;
    private String Description;
    private String Category;
    private String Price;
    private Date PublicationDate;
    private String UserId;
    
    public Item(String Name, String Description, String Category, String Price, Date PublicationDate, String UserId) {
        this.Name = Name;
        this.Description = Description;
        this.Category = Category;
        this.Price = Price;
        this.PublicationDate = PublicationDate;
        this.UserId = UserId;
        this.Id = Random.GetUUID();
    }
    
    public void ShowItemSummary(String message){
        System.out.println("\n========================================");
        System.out.println(message);
        System.out.println("Identificador: " + Id);
        System.out.println("Nome: " + Name);
        System.out.println("Descrição: " + Description);
        System.out.println("Categoria: " + Category);
        System.out.println("Preço: " + Price);
        System.out.println("Criado em: " + PublicationDate);
        System.out.println("Usuário: " + UserId);
        System.out.println("========================================\n");
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }
    
    public String getCategory() {
        return Category;
    }

    public Date getPublicationDate() {
        return PublicationDate;
    }

    public String getUserId() {
        return UserId;
    }

}
