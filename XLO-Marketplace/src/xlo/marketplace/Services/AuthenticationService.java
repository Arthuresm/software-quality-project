/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xlo.marketplace.Services;

import xlo.marketplace.Models.User;
import xlo.marketplace.Services.Interfaces.IAuthenticationService;

/**
 *
 * @author arthu
 */
public class AuthenticationService implements IAuthenticationService{
    private boolean isLogged = true;
    
    @Override
    public boolean VerifyUserCredentials(User user, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean IsLogged(){
        return isLogged;
    }
    
}
