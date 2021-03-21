package br.com.dio.collection.list;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Crie uma classe Gato que possua os atributos: nome, idade e cor.
Em seguida, crie uma lista com 3 gatos e faça um programa que ordene esta lista por:
a) Nome;
b) Idade;
d) Nome, Idade, Cor;
 */
public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "Tigrado"));
            add(new Gato("Simba", 6, "Amarelo"));
            add(new Gato("Jon", 12, "Preto"));
        }};

        System.out.println("----\tOrdem de Inserção\t---");
        for (Gato gato: meusGatos) System.out.println(gato);

        System.out.println("----\t'Ordem Natural': Nome\t---");
        Collections.sort(meusGatos);
        for (Gato gato: meusGatos) System.out.println(gato);

        System.out.println("----\tOrdem Idade\t---");
        //meusGatos.sort(new ComparatorIdade());
        Collections.sort(meusGatos, new ComparatorIdade());
        for (Gato gato: meusGatos) System.out.println(gato);

        System.out.println("----\tOrdem Nome/Idade/Cor\t---");
        meusGatos.sort(new ComparatorNomeIdadeCor());
        for (Gato gato: meusGatos) System.out.println(gato);

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
        return "{nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorNomeIdadeCor implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        int idade = Integer.compare(g1.getIdade(), g2.getIdade());
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());

        if(nome != 0) return nome;
        if(idade != 0) return idade;
        return cor;
    }
}

