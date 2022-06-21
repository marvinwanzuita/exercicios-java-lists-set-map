package AulasCollections.ExerciciosCollections;

import java.util.*;

public class _E5_Nordeste {

  public static void main(String[] args) {

    System.out.println();
    System.out.println("EXERCÍCIO 05 - MAP");
    System.out.println("Dada a população estimada de alguns estados \n" +
            "do nordeste brasileiro, faça: \n");

    System.out.println();
    System.out.println("Crie um dicionário e relacione os estados\n" +
            "e suas populações: ");
    Map<String, Integer> estadosNordestinos = new HashMap<>(){{
      put("Pernambuco", 9616621);
      put("Alagoas", 3351543);
      put("Ceará", 9187103);
      put("Rio Grande do Norte", 3534265);
    }};
    System.out.println(estadosNordestinos);

    System.out.println();
    System.out.println("Substitua a população do estado do\n" +
            "Rio Grande do Norte por 3534165: ");
    estadosNordestinos.put("Rio Grande do Norte", 3534165);
    System.out.println(estadosNordestinos);

    System.out.println();
    System.out.println("Confira se o estado Pernanbuco está\n" +
            "no dicionário, caso não, adicione: Pernambuco - 4039277");
    if (estadosNordestinos.containsKey("Pernambuco")){
      estadosNordestinos.put("Pernambuco", 4039277);
    }
    System.out.println(estadosNordestinos);

    System.out.println();
    System.out.println("Exiba a população de Pernambuco: " +
            estadosNordestinos.get("Pernambuco"));

    System.out.println();
    System.out.println("Exiba todos os estados e suas populações\n" +
            "na ordem em que foram informado: ");
    Map<String, Integer> estadosNordestinosInsercao = new LinkedHashMap<>(){{
      put("Pernambuco", 9616621);
      put("Alagoas", 3351543);
      put("Ceará", 9187103);
      put("Rio Grande do Norte", 3534265);
    }};
    for (Map.Entry<String, Integer> estado : estadosNordestinosInsercao.entrySet()){
      System.out.println(estado.getKey() + " - " + estado.getValue());
    }

    System.out.println();
    System.out.println("Exiba os estados e suas populações\n" +
            "em ordem alfabética: ");
    Map<String, Integer> estadosNordestinosOrdemNome = new TreeMap<>(estadosNordestinos);
    for (Map.Entry<String, Integer> estado : estadosNordestinosOrdemNome.entrySet()) {
      System.out.println(estado.getKey() + " - " + estado.getValue());
    }

    System.out.println();
    System.out.println("Exiba o estado com a menor população\n" +
            "e sua quantidade: ");
    Integer valorMenorPopulacao = Collections.min(estadosNordestinos.values());
    String estadoMenorPopulacao = "";
    for (Map.Entry<String, Integer> entry : estadosNordestinos.entrySet()) {
      if (entry.getValue().equals(valorMenorPopulacao)){
        estadoMenorPopulacao = entry.getKey();
        System.out.println(estadoMenorPopulacao + " - " + valorMenorPopulacao);
      }
    }

    System.out.println();
    System.out.println("Exiba o estado com a maior população\n" +
            "e sua quantidade: ");
    Integer valorMaiorPopulacao = Collections.max(estadosNordestinos.values());
    String estadoMaiorPopulacao = "";
    for (Map.Entry<String, Integer> entry : estadosNordestinos.entrySet()) {
      if (entry.getValue().equals(valorMaiorPopulacao)){
        estadoMaiorPopulacao = entry.getKey();
        System.out.println(estadoMaiorPopulacao + " - " + valorMaiorPopulacao);
      }
    }

    System.out.println();
    Iterator<Integer> iterator = estadosNordestinos.values().iterator();
    Integer soma = 0;
    while(iterator.hasNext()){
      soma += iterator.next();
    }
    System.out.println("Exiba a soma da população desses estados: " + soma);

    System.out.println();
    System.out.println("Exiba a média da população deste dicionário de estados: \n" +
            (soma / estadosNordestinos.size()));

    System.out.println();
    System.out.println("Remova os estados com a população menor que 4000000 :");
    Iterator<Integer> iteratorMenor = estadosNordestinos.values().iterator();
    while(iteratorMenor.hasNext()){
      if(iteratorMenor.next() < 4000000){
        iteratorMenor.remove();
      }
    }
    System.out.println(estadosNordestinos);

    System.out.println();
    System.out.println("Apague o dicionário de estados: ");
    estadosNordestinos.clear();
    System.out.println(estadosNordestinos);

    System.out.println();
    System.out.println("Confira se o dicionário está vazio: " +
    estadosNordestinos.isEmpty());

  }

}
