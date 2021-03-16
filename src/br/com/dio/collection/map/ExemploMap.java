package br.com.dio.collection.map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
/*
 Dada os modelos dos carros e seus respectivos consumo na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */
//        System.out.println("Crie uma coleção que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carros = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6);

        Map<String, Double> carros2 = new TreeMap<>(){
            {put("gol",14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
            }
        };

//        System.out.println("Substitua o consumo da tucson por 10,2 km/l: ");
//        System.out.println("Confira se o modelo tucson está no conjunto: ");
//        System.out.println("Adicione o modelo siena com o consumo de 15,6 km/l: ");
//        System.out.println("Exiba a posição do uno: ");
//        System.out.println("Exiba todos os carros na ordem em que foram informados: " );
//        System.out.println("Exiba o terceiro modelo adicionado: ");
//        System.out.println("Exiba todas os os modelos e seus consumos na ordem crescente: ");
//        System.out.println("Exiba o menor consumo: " );
//        System.out.println("Exiba a maior consumo: " );
//        System.out.println("Exiba a soma dos consumos: ");
//        System.out.println("Exiba a média dos consumos deste conjunto de carros: ");
//        System.out.println("Remova os modelos com o consumo maior que 15 km/l: ");
//        System.out.println("Apague o conjunto de carros: ");
//        System.out.println("Confira se a lista está vazia: ");
    }
}
