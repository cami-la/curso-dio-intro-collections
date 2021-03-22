package br.com.dio.collection.set;


import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
        System.out.println("Crie um conjunto e coloque as sete notas: ");

        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        //Set notas = new HashSet(); //antes do java 5
        //Set<Double> notas = new HashSet<Double>(3); //Generics (java 5) - Diamond Operator (Java 7)
        //HashSet<Double> notas = new HashSet<>();
        /*Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas2.add(1d);
        notas2.remove(5d);
        System.out.println(notas);
        */

//        System.out.println("Substitua a 5 nota pela nota 6.0: ");

        System.out.println("Confira se a nota 5 está na lista: " + notas.contains(5d));

//        System.out.println("Exiba a posição da nota 5: ");

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas2);

//        System.out.println("Exiba a terceira nota adicionada: ");

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas);
        System.out.println(notas3);

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague o conjunto de notas: ");
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto está vazio: " + notas3.isEmpty());

    }
}
