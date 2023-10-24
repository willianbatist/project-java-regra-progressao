package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int qtsAtividades = scan.nextInt();
    for (int i = 1; i <= qtsAtividades; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      String atividade = scan.next();
      String atividade2 = scan.next();
      System.out.println("Digite o peso da atividade " + i + ":");
      String pesoAtividade = scan.next();
      System.out.println("Digite a nota obtida para " + atividade + " " + atividade2 + ":");
      String notaAtividade = scan.next();
    }

    scan.close();
  }
}