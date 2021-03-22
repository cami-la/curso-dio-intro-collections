package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Crie uma classe Gato que possua os atributos: nome, idade e cor.
Em seguida, crie uma lista com 3 gatos e faça um programa que ordene esta lista por:
a) Nome;
b) Idade;
d) Nome, Cor, Idade;
 */
public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        Gato gato1 = new Gato("Jon", 18, "Preto");
        Gato gato2 = new Gato("Simba", 6, "Tigrado");
        Gato gato3 = new Gato("Jon", 12, "Amarelo");

        List<Gato> meusGatos = new ArrayList<>(){{
            add(gato1);
            add(gato2);
            add(gato3);
        }};
        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Nome\t---");
        Collections.sort(meusGatos);
//        meusGatos.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Idade\t---");
//        Collections.sort(meusGatos, new ComparatorGatoIdade());
        meusGatos.sort(new ComparatorGatoIdade());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
        Collections.sort(meusGatos, new ComparatorGatoNomeCorIdade());
//        meusGatos.sort(new ComparatorGatoNomeCorIdade());
        System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorGatoIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorGatoNomeCorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;

        int idade = Integer.compare(g1.getIdade(), g2.getIdade());
        return idade;
    }
}
