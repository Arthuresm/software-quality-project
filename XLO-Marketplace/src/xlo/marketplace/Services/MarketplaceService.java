/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xlo.marketplace.Services;

import java.util.AbstractCollection;
import xlo.marketplace.Models.Item;
import xlo.marketplace.Models.User;
import xlo.marketplace.Services.Interfaces.IMarketplaceService;

/**
 *
 * @author arthu
 */
public class MarketplaceService implements IMarketplaceService{

    @Override
    public boolean AddUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean AddItem(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean RemoveItem(String itemId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean EditItem(String itemId, String name, String price, String description) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AbstractCollection<Item> SearchItem(String keyWords, String category) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
