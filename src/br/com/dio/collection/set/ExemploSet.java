package br.com.dio.collection.set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
//      Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
//      Crie um conjunto e coloque as sete notas.
        Set<Double> notas = new HashSet<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3d);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6d);

        System.out.println(notas);

        //Set<Double> notas1 = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        //Set<Double> notas2 = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);


        System.out.println("Exiba se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Exiba todas as notas na ordem em que foram informados, um ao lado do outro: ");
        Set<Double> notas1 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas1);
        System.out.println("Exiba a terceira nota adicionada: NÃO É PERMITIDO");
        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas);
        System.out.println(notas3);
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        Double soma = 0d;
        Iterator<Double> iteratorSet = notas.iterator();
        while(iteratorSet.hasNext()) {
            soma += iteratorSet.next();
        }
        System.out.println("Calcule e mostre a soma dos valores: " + soma);
        System.out.println("Calcule e mostre a média das notas: " + (soma/notas.size()));
        System.out.println("Remova as notas menores que 7 e exiba o conjunto: ");
        Iterator<Double> iteratorNotasMenor7 = notas.iterator();
        while(iteratorNotasMenor7.hasNext()) {
            Double nota = iteratorNotasMenor7.next();
            if (nota < 7) iteratorNotasMenor7.remove();
        }
        System.out.println(notas);
        System.out.println("Apague o conjunto de notas: ");
        notas.clear();
        System.out.println("Confira novamente se está vazio: " + notas.isEmpty());
        System.out.println("Encerre o programa com uma mensagem: ");
        System.out.println("Agora aprendi sobre conjuntos: Set! ");

    }
}
