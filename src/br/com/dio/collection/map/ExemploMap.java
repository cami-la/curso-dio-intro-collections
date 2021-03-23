package br.com.dio.collection.map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");

        Map<String, Double> carrosPopulares = new HashMap<>();
        carrosPopulares.put("gol", 14.4);
        carrosPopulares.put("uno", 15.6);
        carrosPopulares.put("mobi", 16.1);
        carrosPopulares.put("hb20", 14.5);
        carrosPopulares.put("kwid", 15.6);
        System.out.println(carrosPopulares);

        //Map<String, Double> carrosPopulares2020 = new HashMap<>(3);
        //Map carrosPopulares2020 = new HashMap(); //antes do java 5
        //Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)
        //HashMap<String, Double> carrosPopulares2020 = new HashMap<>();
        //Map<String, Double> carrosPopulares2020 = new HashMap<>(3); //Generics (java 5) - Diamond Operator (Java 7)

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares.toString());

        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>();
        carrosPopulares1.put("gol", 14.4);
        carrosPopulares1.put("uno", 15.6);
        carrosPopulares1.put("mobi", 16.1);
        carrosPopulares1.put("hb20", 14.5);
        carrosPopulares1.put("kwid", 15.6);
        System.out.println(carrosPopulares1);

//        System.out.println("Exiba o terceiro modelo adicionado: ");

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

//        System.out.println(Collections.max(carrosPopulares.keySet()));

        //O mais econômico é o que faz mais km/l
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();

        String modeloMaisEconomico = "";
        Double valorMaisEconomico = 0d;
        for (Map.Entry<String, Double> entry : entries) {
            if(entry.getValue().equals(Collections.max(carrosPopulares.values()))) {
                modeloMaisEconomico = entry.getKey();
                valorMaisEconomico = entry.getValue();
            }
        }
        System.out.println("Exiba o modelo do carro mais econômico: " + modeloMaisEconomico);

        System.out.println("Exiba o valor do menor consumo: " + valorMaisEconomico);

//        consumos.iterator();
        Double soma = 0d;
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        while(iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);

        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));

        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()) {
            if (iterator1.next() == 15.6) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("Ordene a dicionário por modelo");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares);
        System.out.println(carrosPopulares2);

        /*System.out.println("Apague o conjunto de carros: ");
        carrosPopulares.clear();
*/
        System.out.println("Confira se a lista está vazia: " + carrosPopulares.isEmpty());
    }
}
