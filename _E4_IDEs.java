package AulasCollections.ExerciciosCollections;

import java.util.*;

import static java.lang.CharSequence.compare;

public class _E4_IDEs {
  public static void main(String[] args) {

    System.out.println();
    System.out.println("EXERCÍCIO 04 - SET");
    System.out.println("Crie uma classe LinguagemFavorita que possua os atributos\n" +
            "nome, anoDeCriacao, e ide. Em seguida, crei um conjunto com 3 linguagens\n" +
            "e faça um programa que ordene esse conjunto por:\n" +
            "A: Ordem de inserção;\n" +
            "B: Ordem Natural(nome)\n" +
            "C: IDE;\n" +
            "D: Ano de Criação e Nome;\n" +
            "E: Nome, Ano de Criação e IDE;\n" +
            "Ao final, exiba as linguagens no console, um embaixo do outro.");


    System.out.println();
    System.out.println("--\tOrdem Inserção\t--");
    Set<LinguagemFavorita> linguagens = new LinkedHashSet<>(){{
      add(new LinguagemFavorita("Object Pascal", 1971, "Delphi"));
      add(new LinguagemFavorita("Java", 1995, "IntelliJ"));
      add(new LinguagemFavorita("Ruby", 1995, "RubyMine"));
      add(new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"));
    }};
    for (LinguagemFavorita linguagem : linguagens) {
      System.out.println(linguagem.getNome() + " - " +
              linguagem.getAnoDeCriacao() + " - " +
              linguagem.getIde());
    }

    System.out.println();
    System.out.println("--\tOrdem Natural (Nome) \t--");
    Set<LinguagemFavorita> linguagensNome = new TreeSet<>(linguagens);
    for (LinguagemFavorita linguagem : linguagensNome) {
      System.out.println(linguagem.getNome() + " - " +
              linguagem.getAnoDeCriacao() + " - " +
              linguagem.getIde());
    }

    System.out.println();
    System.out.println("--\tOrdem Natural (IDE) \t--");
    Set<LinguagemFavorita> linguagensIDE = new TreeSet<>(new ComparatorIde());
    linguagensIDE.addAll(linguagens);
    for (LinguagemFavorita linguagem : linguagensIDE) {
      System.out.println(linguagem.getNome() + " - " +
              linguagem.getAnoDeCriacao() + " - " +
              linguagem.getIde());
    }

    System.out.println();
    System.out.println("--\tOrdem Ano de Criação e Nome \t--");
    Set<LinguagemFavorita> linguagensAnoCriacao = new TreeSet<>(new ComparatorAnoCriacaoNome());
    linguagensAnoCriacao.addAll(linguagens);
    for (LinguagemFavorita linguagem : linguagensAnoCriacao) {
      System.out.println(linguagem.getNome() + " - " +
              linguagem.getAnoDeCriacao() + " - " +
              linguagem.getIde());
    }

    System.out.println();
    System.out.println("--\tOrdem Nome, Ano de Criação e IDE \t--");
    Set<LinguagemFavorita> linguagensNomeAnoIDE = new TreeSet<>(new ComparatorNomeAnoIDE());
    linguagensNomeAnoIDE.addAll(linguagens);
    for (LinguagemFavorita linguagem : linguagensNomeAnoIDE) {
      System.out.println(linguagem.getNome() + " - " +
              linguagem.getAnoDeCriacao() + " - " +
              linguagem.getIde());
    }



  }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita>{

  private String nome;
  private int anoDeCriacao;
  private String ide;

  public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
    this.nome = nome;
    this.anoDeCriacao = anoDeCriacao;
    this.ide = ide;
  }

  public String getNome() {
    return nome;
  }

  public int getAnoDeCriacao() {
    return anoDeCriacao;
  }

  public String getIde() {
    return ide;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LinguagemFavorita that = (LinguagemFavorita) o;
    return anoDeCriacao == that.anoDeCriacao && nome.equals(that.nome) && ide.equals(that.ide);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, anoDeCriacao, ide);
  }

  @Override
  public int compareTo(LinguagemFavorita linguagem) {
    int nome = compare(this.getNome(), linguagem.getNome());
    if (nome != 0) return  nome;

    return this.getIde().compareTo(linguagem.getIde());
  }
}

class ComparatorIde implements Comparator<LinguagemFavorita>{

  @Override
  public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {

    int ide = lf1.getIde().compareTo(lf2.getIde());
    if(ide != 0) return ide;

    int nome = lf1.getNome().compareTo(lf2.getNome());
    if(nome != 0) return nome;

    return Integer.compare(lf1.getAnoDeCriacao(), lf2.getAnoDeCriacao());
  }
}

class ComparatorAnoCriacaoNome implements Comparator<LinguagemFavorita>{

  @Override
  public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {

    int ano = Integer.compare(lf1.getAnoDeCriacao(), lf2.getAnoDeCriacao());
    if(ano != 0) return ano;

    int nome = lf1.getNome().compareToIgnoreCase(lf2.getNome());
    if(nome != 0) return nome;

    return lf1.getIde().compareToIgnoreCase(lf2.getIde());
  }
}

class ComparatorNomeAnoIDE implements Comparator<LinguagemFavorita>{

  @Override
  public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {

    int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
    if(nome != 0) return nome;

    int ano = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
    if(ano != 0) return ano;

    return l1.getIde().compareToIgnoreCase(l2.getIde());
  }
}

