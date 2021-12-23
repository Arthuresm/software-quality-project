/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import java.util.ArrayList;
import java.util.Date;
import xlo.marketplace.Models.Item;
import xlo.marketplace.Models.User;

/**
 *
 * @author uriel
 */
public class UserMenu extends Menu {
    
    private User connectedUser = new User("Teste", "teste@testee", "senhaTeste", "31 98753-8787", "Rua Testee número 0" );
   
    @Override
    protected void GetUserOptions(){
        System.out.println("1- Cadastrar item de desapego");
        System.out.println("2- Remover item de desapego");
        System.out.println("3- Editar item de desapego");
        System.out.println("4- Pesquisar itens disponíveis");
    }
    @Override
    protected void RouteUserResponse(int response){
        switch(response){
            case 1:
                this.AddItem();
            break;
            case 2:
                this.RemoveItem();
            break;
            case 3:
                this.RemoveItem();
            break;
            case 4:
                System.out.println("Vamos Pesquisar itens de desapego");
            break;
            default: this.InvalidInput(); break;
        }
    }
    
    
    private void AddItem() {
        String Name = this.AskForValue("nome");
        String Description = this.AskForValue("descrição");
        String Category = this.AskForValue("categoria");
        String Price = this.AskForValue("preço");
  
        Item newItem = new Item(Name, Description, Category, Price, new Date(), connectedUser.getID());
        newItem.ShowItemSummary("Item criado com sucesso!\n");
        
        connectedUser.AddItem(newItem);
        this.ShowUserItems();
    }
    
    private void RemoveItem(){
        Item found = FindItemOnUserItems();
        if(found == null){
            this.ItemNotFound();
        } else {
            ArrayList<Item> Items = connectedUser.GetItems();
            Items.remove(Items.indexOf(found));
            this.ShowUserItems();
        }
    }
    
    private void EditItem(){
        Item found = FindItemOnUserItems();
        if(found == null){
            this.ItemNotFound();
        } else {
            
        }
    }
    
    
    private void ShowUserItems(){
        System.out.println("\n\nItems do usuário:");
        ArrayList<Item> Items = connectedUser.GetItems();
        int index = 0;
        for(Item item : Items) {
            item.ShowItemSummary("Item " + ++index);
        }
    }
    
    private Item FindItemOnUserItems(){
        this.ShowUserItems();
        System.out.println("\n\nQual o número do item que deseja remover?");
        int index = this.GetKeyboardIntInput();
        ArrayList<Item> Items = connectedUser.GetItems();
        try{
            return Items.get(index - 1);
        } catch(IndexOutOfBoundsException err){
            return null;
        }
        
    }
    private void ItemNotFound(){
        System.out.println("Operação inválida! Item não encontrado");
    }
    
}
