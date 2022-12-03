package br.com.dio.collection.list;


import java.util.*;

class ExemploList {
    public static void main(String[] args) {
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      List notas = new ArrayList(); //antes do java 5
//      ArrayList<Double> notas = new ArrayList<>();
//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d); // assim eu não posso add, posso usar praticamente todos os outros métodos
        System.out.println(notas);*/
        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d); // assim eu não posso add e remover, posso outros métodos
        notas.remove(5d);
        System.out.println(notas);*/

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>(); //Generics(jdk 5) - Diamond Operator(jdk 7)
        notas.add(7.0); //n posso colocar só o 7 pq é double, então ou ponho como está ou ponho 7d. Foi usado o add(Double)
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());//poderia usar só notas. Salva na lista na mesma ordem que foi add

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d); //add (int i, Double e) posição e elemento, i: 4, e:8d
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0); //primeiro acha a posição da nota e depois diz a nova nota
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d)); //dentro do parênteses vai o objeto, a nota 5

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);// vai imprimir um abaixo do outro

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2)); // está na posição 2 pq começa a contar do zero
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator(); //ao digitar notas.iterator(); e press crtl alt v, cria a variável, iterator() é método
        Double soma = 0d; //soma inicia com zero
        while(iterator.hasNext()){ //iterator tem próximo elemento?
            Double next = iterator.next();//pego o prox elemento boto dentro da variavel next
            soma += next; // e somo ela...e assim sigo o laço até dar false no iterator next, passo anterior
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d); //se eu n boto o d ele entende que é da posição zero e não a nota zero, q é double
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();// notas.iterator, em cima de iterator ctrl alt v e ele cria a variavel
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        /*System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);
        */
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

/*
Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:

        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");

        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
*/

    }
}
