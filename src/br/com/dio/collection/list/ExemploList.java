package br.com.dio.collection.list;

import java.util.*;

class ExemploList {
    public static void main(String[] args) {
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//        Crie uma lista e coloque as sete notas.
        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6d);

        notas.remove(new Double(7d));
        notas.remove(new Double(7d));
        notas.remove(1);

        System.out.println(notas);

        //List<Double> notas1 = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        //List<Double> notas2 = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);

/*        System.out.println("Exiba se a lista está vazia: " + notas.isEmpty());
        System.out.println("Exiba todas as notas na ordem em que foram informados, um ao lado do outro: " + notas.toString());
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        Collections.sort(notas);
        System.out.println("Exiba todas as notas na ordem crescente: " + notas);
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        Double soma = 0.0;
        Iterator<Double> iteratorNotas = notas.iterator();
        while(iteratorNotas.hasNext()) {
            soma += iteratorNotas.next();
        }
        System.out.println("Calcule e mostre a soma dos valores: " + soma);
        System.out.println("Calcule e mostre a média das notas: " + (soma/notas.size()));
        Iterator<Double> iteratorNotasMenor7 = notas.iterator();
        while(iteratorNotasMenor7.hasNext()) {
            Double nota = iteratorNotasMenor7.next();
            if(nota < 7) iteratorNotasMenor7.remove();
        }
        System.out.println("Remova as notas menores que 7 e exiba a lista: " + notas);
        System.out.println("Apague a lista de notas: ");
        notas.clear();
        System.out.println("Confira novamente se está vazia: " + notas.isEmpty());
        System.out.println("Encerre o programa com uma mensagem: ");
        System.out.println("Aprendi um pouco sobre List e seus métodos!");
*/
    }


}
