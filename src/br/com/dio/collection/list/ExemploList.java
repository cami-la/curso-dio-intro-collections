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
        System.out.println(notas.toString());

//      List<Double> notas2 = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

//        List notas = new ArrayList(); //antes do java 5
//        ArrayList<Double> notas = new ArrayList<>();
        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);*/
        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

        System.out.println("Exiba a posição da nota 5: " + notas.indexOf(5d));

        System.out.println("Substitua a nota 5 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5 está na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        System.out.println(notas);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

      /*System.out.println("Exiba todas as notas na ordem crescente: ");
      Collections.sort(notas);
      System.out.println(notas);*/

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Double soma = 0.0;
        Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        /*System.out.println("Apague toda a lista");
        notas.clear();*/

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

// Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:

        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");
        LinkedList<Double> notas2 = new LinkedList<>(notas);

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.peekFirst());
        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da nova lista removendo-o: " + notas2.pollFirst());
        System.out.println(notas2);

        System.out.println("Apague a lista");
        notas2.clear();

        System.out.println("Confira lista está vazia: " + notas2.isEmpty());
    }
}
