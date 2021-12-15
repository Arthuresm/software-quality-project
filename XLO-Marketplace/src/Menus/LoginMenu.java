/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

/**
 *
 * @author uriel
 */
public class LoginMenu extends Menu {
    
    @Override
    protected void GetUserOptions(){
        System.out.println("1- Cadastrar usuário");
        System.out.println("2- Login de usuários");
    }
    @Override
    protected void RouteUserResponse(int response){
        
    }
    
}
