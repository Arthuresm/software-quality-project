/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xlo.marketplace;

import Menus.LoginMenu;
import Menus.Menu;
import Menus.UserMenu;
import xlo.marketplace.Services.AuthenticationService;

/**
 *
 * @author arthu
 */
public class XLOMarketplace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\t==================================================\t");
        System.out.println("Seja bem vindo ao XLO!");

        Menu loginMenu = new LoginMenu();
        Menu userMenu = new UserMenu();
        
        AuthenticationService auth = new AuthenticationService();
        
        while(true){
            if(!auth.IsLogged()){
                loginMenu.Start();
            } else {
                userMenu.Start();
            }
        }
        
        
    }
    
}
