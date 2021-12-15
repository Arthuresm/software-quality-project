/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author uriel
 */
public abstract class Menu {
    
    public void Start(){
        this.MenuBeginText();
        this.GetUserOptions();
        int response = GetUserResponse();
        this.RouteUserResponse(response);
    }
    

    
    protected abstract void GetUserOptions();
    
    protected abstract void RouteUserResponse(int response);
    
    protected void InvalidInput(){
        System.out.println("\nValor inválido. Tente novamente\n");
    }
    
    private void MenuBeginText(){
        System.out.println("\n\nInforme a operação que deseja realizar");
    }
    
    private int GetUserResponse(){
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        try {
            int input= sc.nextInt();
            return input;
        } catch(InputMismatchException e){
            return -1;
        }
    }
    
}
