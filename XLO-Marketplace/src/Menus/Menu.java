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
    
    protected String AskForValue(String value){
        System.out.println("\nInsira um valor para o campo " + value);
        return this.GetKeyboardStringInput();
    }
    
    protected String GetKeyboardStringInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    
    protected int GetKeyboardIntInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    
    private void MenuBeginText(){
        System.out.println("\n\nInforme a operação que deseja realizar");
    }
    
    private int GetUserResponse(){
        
        try {
            int input = this.GetKeyboardIntInput();
            return input;
        } catch(InputMismatchException e){
            return -1;
        }
    }
    
}
