/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xlo.marketplace.Services.Interfaces;

import xlo.marketplace.Models.User;

/**
 *
 * @author arthu
 */
public interface IAuthenticationService {
    
    public boolean VerifyUserCredentials(User user, String password);
    public boolean IsLogged();
}
