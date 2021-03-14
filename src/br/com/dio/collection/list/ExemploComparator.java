package br.com.dio.collection.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Crie uma classe Gato que possua os atributos nome, idade e cor.
Em seguida, crie uma lista com 3 gatos e faça um programa que ordene esta lista por:
a) Nome;
b) Idade;
c) Cor;
d) Nome, Idade, Cor;
Ao final, exiba a lista no console, um elemento abaixo do outro.
 */
public class ExemploComparator {
    public static void main(String[] args) {
        Gato jon = new Gato("Jon", 18, "Tigrado");
        Gato simba = new Gato("Simba", 6, "Amarelo");
        Gato jon1 = new Gato("Jon", 12, "Preta");

        List<Gato> meusGatos = Arrays.asList(jon, simba, jon1);
        System.out.println(meusGatos);

        /*System.out.println("Comparação nome: ");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Comparação idade: ");
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("Comparação cor: ");
        Collections.sort(meusGatos, new CompatorCor());
        System.out.println(meusGatos);

        System.out.println("Comparação nome/idade/cor: ");
        meusGatos.sort(new ComparatorNomeIdadeCor());
        System.out.println(meusGatos);*/

        for (Gato gato: meusGatos) {
            System.out.println(gato);
        }

    }
}

class Gato implements Comparable<Gato>{
    public String nome;
    public Integer idade;
    public String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
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
        return this.nome.compareToIgnoreCase(gato.nome);
    }
}

class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.idade, g2.idade);
    }
}

class CompatorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.cor.compareToIgnoreCase(g2.cor);
    }
}

class ComparatorNomeIdadeCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.nome.compareToIgnoreCase(g2.nome);
        int idade = Integer.compare(g1.idade, g2.idade);

        if (nome != 0) return nome;
        if (idade != 0) return idade;
        return g1.cor.compareToIgnoreCase(g2.cor);
    }
}

