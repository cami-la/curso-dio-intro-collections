package br.com.dio.collection.list;


import java.util.*;

class ExemploList {
    public static void main(String[] args) {
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
      System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas);


        //List<Double> notas2 = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        //List<Double> notas2 = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        //ArrayList<Double> notas2 = new ArrayList<>();

        System.out.println("Substitua a 5 nota pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5 está na lista: " + notas.contains(5.0));

        System.out.println("Exiba a posição da nota 8.5: " + notas.indexOf(8.5));

        System.out.println("Exiba todas as notas na ordem em que foram informados: " );
        for (Double nota: notas) {
            System.out.print(nota + " ");
        }
        System.out.println();

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Collections.sort(notas);
        System.out.println(notas);

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Double soma = 0.0;
        Iterator<Double> iterator = notas.iterator();
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + soma/notas.size());

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double proximo = iterator1.next();
            if(proximo < 7) iterator1.remove();
        }
        System.out.println(notas);

        /*System.out.println("Apague a lista de notas: ");
        notas.clear();
        */

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

    }
}
