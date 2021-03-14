package br.com.dio.collection.set;

import java.util.*;

/*
Crie uma classe Serie que possua os atributos nome, gênero e tempoEpisodio.
Em seguida, crie um conjunto com 3 séries e faça um programa que ordene esse conjunto por:
a) Ordene por ordem de inserção
b) Ordene por nome;
c) Ordene por gênero;
c) Ordene por nome, gênero e tempoEpisodio;
4. Ao final, exiba o conjunto no console.
*/
public class ExemploComparableSet {
    public static void main(String[] args) {
        Serie got = new Serie("Game Of Thrones", "Fantasia", 60);
        Serie stranger = new Serie("Stranger Things", "Suspense", 60);
        Serie theGoodPlace = new Serie("The Good Place", "Comédia", 23);

        Set<Serie> minhasSeries = new HashSet<>(Arrays.asList(got, theGoodPlace,stranger));
        System.out.println("HashSet");
        System.out.println(minhasSeries);

        Set<Serie> minhasSeriesLinkedHasSet = new LinkedHashSet<>(Arrays.asList(got, stranger, theGoodPlace));
        System.out.println("LinkedHashSet");
        System.out.println(minhasSeriesLinkedHasSet);

        Set<Serie> minhasSeriesTreeSet = new TreeSet<>(minhasSeries);
        System.out.println("TreeSet");
        System.out.println(minhasSeriesTreeSet);

        List<Serie> minhasSeriesList = new ArrayList<>(minhasSeriesTreeSet);
        System.out.println("ArrayList");
        System.out.println(minhasSeriesList);


    }
}

class Serie implements Comparable<Serie> {
    public String nome;
    public String genero;
    public Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        return this.nome.compareToIgnoreCase(serie.nome);
    }
}


