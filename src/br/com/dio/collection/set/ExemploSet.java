package br.com.dio.collection.set;


import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
        // formas de inicializar:
//      Set notas = new HashSet(); //antes do java 5
//      HashSet<Double> notas = new HashSet<>();
//      Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
/*      Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
*/

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));// fazer os imports do set, hashset
        System.out.println(notas.toString()); // imprimiu, mas n na ordem criada, pq HashSet n mostra na ordem, elementos repetidos ele só mostra uma vez

        //System.out.println("Exiba a posição da nota 5.0: "); set n faz busca de acordo com a posição, n tem método index

//        System.out.println("Adicione na lista a nota 8.0 na posição 4: "); n dá para trabalhar com posição dentro do set pelo mesmo motivo acima

//        System.out.println("Substitua a nota 5.0 pela nota 6.0: "); // só daria pra fazer se fosse list

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

//        System.out.println("Exiba a terceira nota adicionada: ");// n dá n tem o método get, que passa o índice e que daí passaria a nota

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator(); // igual no list, porém o numero n vai dar igual pq numeros repetidos só entram 1x
        Double soma = 0.0;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/ notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

//        System.out.println("Remova a nota da posição 0");

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>(); //usar o LinkedHashSet para que eu consiga ver a ordem pq se fosse só o hash n dava 
        notas2.add(7d); // outra forma de botar os números, mas poderia ser como foi no HashSet
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: "); // aqui usar a TreeSet pq organiza de acordo com a ordem natural dos elementos
        Set<Double> notas3 = new TreeSet<>(notas2);// pq é da Classe Double tem o comparable por isso posso fazer assim
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());

    }
}
