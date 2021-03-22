package br.com.dio.collection.set;

import java.util.*;

/*
Crie uma classe Serie que possua os atributos nome, gênero e tempoEpisodio.
Em seguida, crie um conjunto com 3 séries e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural (tempoEpisiodio);
c) Nome;
d) Gênero;
f) Nome, gênero e tempoEpisodio;
*/
public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "Fantasia", 60));
            add(new Serie("dark", "Suspense", 60));
            add(new Serie("wandavision", "Super-heroi", 25));
        }};

        System.out.println("--\tOrdem aleatória\t--");
        for (Serie serie: minhasSeries) System.out.println(serie);

        System.out.println("--\tOrdem Inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "Fantasia", 60));
            add(new Serie("dark", "Suspense", 60));
            add(new Serie("wandavision", "Super-heroi", 25));
        }};
        for (Serie serie: minhasSeries1) System.out.println(serie);

        System.out.println("--\tOrdem tempo de episódio\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries);
        for (Serie serie: minhasSeries2) System.out.println(serie);

        System.out.println("--\tOrdem Nome\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorSerieNome());
        minhasSeries3.addAll(minhasSeries2);
        for (Serie serie: minhasSeries3) System.out.println(serie);

        System.out.println("--\tOrdem Gênero\t--");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorSerieGenero());
        minhasSeries4.addAll(minhasSeries);
        for (Serie serie: minhasSeries4) System.out.println(serie);

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries5.addAll(minhasSeries);
        for (Serie serie: minhasSeries5) System.out.println(serie);



    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
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
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisiodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisiodio != 0) return tempoEpisiodio;

        return this.getNome().compareToIgnoreCase(serie.getNome());
    }
}

class ComparatorSerieNome implements Comparator<Serie>{
    @Override
    public int compare(Serie s1, Serie s2) {
        return s1.getNome().compareToIgnoreCase(s2.getNome());
    }
}

class ComparatorSerieGenero implements Comparator<Serie>{
    @Override
    public int compare(Serie s1, Serie s2) {
        return s1.getGenero().compareToIgnoreCase(s2.getGenero());
    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareToIgnoreCase(s2.getNome());
        if(nome != 0) return nome;

        int genero = s1.getGenero().compareToIgnoreCase(s2.getGenero());
        if(genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}