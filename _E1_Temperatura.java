package AulasCollections.ExerciciosCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class _E1_Temperatura {

  public static void main(String[] args) {

    System.out.println();
    System.out.println("EXERCÍCIO 01 - LIST");
    System.out.println("Faça um programa que receba a temperatura média dos 6\n" +
            "primeiros meses do ano e armazene-as em uma lista.\n" +
            "Após isto, calcule a média semestral das temperaturas e \n" +
            "mostre todas as temperaturas acima desta média, e em que\n" +
            "mês elas ocorreram(mostrar o mês por extenso: 1 - Janeiro, \n" +
            "2 - Fevereiro e etc.)");

    Scanner sc = new Scanner(System.in);

    final int QUANTIDADE_MESES = 6;

    List<Double> temperaturas = new ArrayList<>();

    System.out.println();
    System.out.println("DIGITE A TEMPERATURA DOS SEGUINTES MESES: ");
    for (int i = 0; i < QUANTIDADE_MESES; i++){
      System.out.print("Mês " + (i +1) + " : ");
      temperaturas.add(sc.nextDouble());
    }

    Iterator<Double> iterator = temperaturas.iterator();
    Double soma = 0.0;
    while (iterator.hasNext()){
      Double next = iterator.next();
      soma += next;
    }

    Double mediaTemperatura = soma / QUANTIDADE_MESES;
    System.out.println("Temperatura média: " + String.format("%.2f", mediaTemperatura));

    System.out.println();
    System.out.println("Exiba os mês e suas respectivas temperaturas acima da média: ");

    Iterator<Double> iteratorMedia = temperaturas.iterator();
    int contadorMes = 1;
    while (iteratorMedia.hasNext()){
      Double next = iteratorMedia.next();
      if (next > mediaTemperatura){
        System.out.println("Mês: " + mostrarMesExtenso(contadorMes) + " - " +
                          "Temperatura: " + next);
      }
      contadorMes++;
    }
  }

  public static String mostrarMesExtenso(int mes){
    switch(mes){
      case 1:
        return "Janeiro";
      case 2:
        return "Fevereiro";
      case 3:
        return "Março";
      case 4:
        return "Abril";
      case 5:
        return "Maio";
      case 6:
        return "Junho";
      case 7:
        return "Julho";
      case 8:
        return "Agosto";
      case 9:
        return "Setembro";
      case 10:
        return "Outubro";
      case 11:
        return "Novembro";
      case 12:
        return "Dezembro";
      default:
        return "Mês inválido";
    }
  }

}


