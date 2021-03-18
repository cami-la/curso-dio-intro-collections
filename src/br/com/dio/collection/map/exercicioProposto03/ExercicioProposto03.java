package br.com.dio.collection.map.exercicioProposto03;

import java.util.*;

public class ExercicioProposto03 {
/*Dadas as seguintas informações para ser criada uma agenda, faça:
id = 1 - Contato = nome: Simba, numero: 819223;
id = 4 - Contato = nome: Cami, numero: 819321;
id = 3 - Contato = nome: Jon, numero: 819223;

1. Crie uma classe Contato com os atributos nome e numero;
2. Crie um dicionário para relacionar o contato e um número de identificação na agenda.
3. Mostre a agenda das seguintes maneiras.
a) Ordem de Inserção;
b) Ordem dos códigos
c) Ordem numérica;
d) Ordem alfabética;
*/
    public static void main(String[] args) {
        Map<Integer, Contato> agenda = new HashMap<>() {{
           put(1, new Contato("Simba", 819223));
           put(4, new Contato("Cami", 819321));
           put(3, new Contato("Jon", 819123));
        }};

        System.out.println(agenda);
        System.out.println("Agenda");
        for (Map.Entry<Integer, Contato> entry: agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("---------\nAgenda Ordem de Inserção: ");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {{
            put(1, new Contato("Simba", 819223));
            put(4, new Contato("Cami", 819321));
            put(3, new Contato("Jon", 819123));
        }};
        System.out.println(agenda1);
        for (Map.Entry<Integer, Contato> entry: agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("---------\nAgenda Ordem dos códigos: ");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contato> entry: agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("---------\nAgenda Ordem de Numérica: ");
        //precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new ComparatorOrdemNumerica());
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("---------\nAgenda Ordem Alfabética: ");
        //precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new ComparatorOrdemNomeContato());
        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
    }
}

class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
    }
}
