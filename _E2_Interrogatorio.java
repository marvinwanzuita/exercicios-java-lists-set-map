package AulasCollections.ExerciciosCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class _E2_Interrogatorio {

  public static void main(String[] args) {

    System.out.println();
    System.out.println("EXERCÍCIO 02 - LIST");
    System.out.println("Utilizando listas, faça um programa que faça 5 perguntas\n" +
            "para uma pessoa sobre um crime. As pergunas são:\n" +
            "1 - Telefonou para a vítima?\n" +
            "2 - Esteve no local do crime?\n" +
            "3 - Mora perto da vítima?\n" +
            "4 - Devia para a vítima?\n" +
            "5 - Já trabalhou com a vítima?\n" +
            "Se a pessoa responder positivamente a 2 questões ela deve ser\n" +
            "classificada como 'Suspeita', entre 3 e 4 como 'Cúmplice' e\n" +
            "5 como 'Assassina'. Caso contrário, ela será classificada\n" +
            "como 'Inocente'.");

    Scanner sc = new Scanner(System.in);

    List<Boolean> interrogatorio = new ArrayList<>();

    System.out.println();
    System.out.println("--- INTERROGATÓRIO ---");
    System.out.print("Telefonou para a vítima? ");
    interrogatorio.add(sc.nextBoolean());
    System.out.print("Esteve no local do crime? ");
    interrogatorio.add(sc.nextBoolean());
    System.out.print("Mora perto da vítima? ");
    interrogatorio.add(sc.nextBoolean());
    System.out.print("Devia para a vítima? ");
    interrogatorio.add(sc.nextBoolean());
    System.out.print("Já trabalhou com a vítima? ");
    interrogatorio.add(sc.nextBoolean());

    Iterator<Boolean> iterator = interrogatorio.iterator();
    int afirmacoes = 0;
    while (iterator.hasNext()){
      Boolean next = iterator.next();
      if(next == true){
        afirmacoes++;
      }
    }
    String conclusao = "";
    switch (afirmacoes){
      case 0:
      case 1:
        conclusao = "Inocente";
        break;
      case 2:
        conclusao = "Suspeita";
        break;
      case 3:
      case 4:
        conclusao = "Cúmplice";
        break;
      case 5:
        conclusao = "Assassina";
        break;
      default:
        conclusao = "Perguntas insuficientes";
    }

    System.out.println();
    System.out.println("Conclusão do interrogatório: " + conclusao);

  }
}
