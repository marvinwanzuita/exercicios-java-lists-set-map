package AulasCollections.ExerciciosCollections;

import java.sql.SQLOutput;
import java.util.*;

public class _E3_ArcoIris {

  public static void main(String[] args) {

    System.out.println();
    System.out.println("EXERCÍCIO 03 - SET");
    System.out.println("Crie um conjunto contendo as cores do arco-íris e\n" +
                  "resolva as seguintes questões: ");

    Set<String> arcoIris = new HashSet<>(Arrays.asList("Vermelho",
            "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));

    System.out.println();
    System.out.println("1: Exiba todas as cores uma abaixo da outra:");
    for (String cor: arcoIris) {
      System.out.println(cor);
    }

    System.out.println();
    System.out.println("2: A quantidade de cores que o arco-íris tem:");
    System.out.println(arcoIris.size());

    System.out.println();
    System.out.println("3: Exiba as cores em ordem alfabética:");
    Set<String> arcoIrisOrdenado = new TreeSet<>(arcoIris);
    for (String corOrdenado: arcoIrisOrdenado) {
      System.out.println(corOrdenado);
    }

    System.out.println();
    System.out.println("4: Exiba as cores na ordem inversa da que foi informada:");
    List<String> arcoIrisList = new ArrayList<>(
            Arrays.asList("Violeta", "Laranja", "Vermelho", "Amarelo",
                           "Verde", "Azul", "Anil"));
    Collections.reverse(arcoIrisList);
    for (String corInversa: arcoIrisList) {
      System.out.println(corInversa);
    }

    System.out.println();
    System.out.println("5: Exiba todas as cores que começam com a letra 'v':");
    for (String cor: arcoIrisList) {
      if (cor.charAt(0) == 'V'){
        System.out.println(cor);
      }
    }

    System.out.println();
    System.out.println("6: Remova todas as cores que não começam com a letra 'v':");
    for (String cor: arcoIrisList) {
      if (cor.charAt(0) != 'V'){
        arcoIris.remove(cor);
      } else {
        System.out.println(cor);
      }
    }

    System.out.println();
    System.out.println("7: Limpe o conjunto:");
    arcoIris.clear();
    System.out.println(arcoIris);

    System.out.println();
    System.out.println("8: Confira se o conjunto está vazio: " + arcoIris.isEmpty());

  }
}
