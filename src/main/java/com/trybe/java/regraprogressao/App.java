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
      somaPesos += Integer.parseInt(pesoAtividade);
      totalPesoNota += Integer.parseInt(notaAtividade) * Integer.parseInt(pesoAtividade);
    }

    if (somaPesos != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }
    double aprovacao = (double) totalPesoNota / (double) somaPesos;
    String texto;
    if (aprovacao >= 85) {
      texto = "Parabéns! Você alcançou " + aprovacao + "%"
          + "! E temos o prazer de informar que você obteve aprovação!";
    } else {
      texto =
          "Lamentamos informar que, com base na sua pontuação alcançada neste período, " + aprovacao
              + "%, você não atingiu a pontuação mínima necessária para sua aprovação.";
    }
    System.out.println(texto);

    scan.close();
  }
}
