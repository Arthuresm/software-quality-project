package com.company.commandLine.command;

import java.util.Scanner;

public class InputCommand {
  public String readValue(String value) {
    System.out.println("Insira o valor para o campo: ".concat(value));
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }

  public int readInt() {
    System.out.println("Escolha um numero: ");
    Scanner scanner = new Scanner(System.in);
    return scanner.nextInt();
  }
}
