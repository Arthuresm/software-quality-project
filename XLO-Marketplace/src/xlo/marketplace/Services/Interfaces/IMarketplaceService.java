/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xlo.marketplace.Services.Interfaces;

import java.util.AbstractCollection;
import xlo.marketplace.Models.Item;
import xlo.marketplace.Models.User;

/**
 *
 * @author arthu
 */
public interface IMarketplaceService {
    public boolean AddUser(User user);
    
    public boolean AddItem(Item item);
    
    public boolean RemoveItem(String itemId);
    
    public boolean EditItem(String itemId,
            String name,
            String price,
            String description);
    
    public AbstractCollection<Item> SearchItem(String keyWords,
            String category);
}
