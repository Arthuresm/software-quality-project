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
public class UserMenu extends Menu {
   
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
                System.out.println("Vamos Cadastrar item de desapego");
            break;
            case 2:
                System.out.println("Vamos Remover item de desapego");
            break;
            case 3:
                System.out.println("Vamos Editar item de desapego");
            break;
            case 4:
                System.out.println("Vamos Pesquisar itens1 de desapego");
            break;
            default: this.InvalidInput(); break;
        }
    }
    
}
