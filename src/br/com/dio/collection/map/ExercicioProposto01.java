package br.com.dio.collection.map;

import java.util.*;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */
public class ExercicioProposto01 {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> populaçãoEstadosNE = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populaçãoEstadosNE);
        System.out.println("Substitua a população do estado RN por : 3.534.165");
        populaçãoEstadosNE.put("RN", 3534165);
        System.out.println(populaçãoEstadosNE);
        System.out.println("Confira se o estado da Paraíba (PB) tucson está no dicionário, caso não, adicione " +
        "PB - 4.039.277: ");
        populaçãoEstadosNE.put("PB", 4039277);
        System.out.println(populaçãoEstadosNE);
        System.out.println("Exiba a população do estado PE: " + populaçãoEstadosNE.get("PE"));
        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> populaçãoEstadosNE2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(populaçãoEstadosNE2);
        System.out.println("Exiba todos os estados e suas populaçãos na ordem alfabética: ");
        Map<String, Integer> populaçãoEstadosNE3 = new TreeMap<>(populaçãoEstadosNE);
        System.out.println(populaçãoEstadosNE3);
        Set<String> estados = populaçãoEstadosNE.keySet();
        Collection<Integer> populacao = populaçãoEstadosNE.values();
/*        System.out.printf("Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n", Collections.min(estados), Collections.min(populacao));
        System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)", Collections.max(estados), Collections.max(populacao));
*/

//        System.out.println("Exiba o estado com a maior população e seu valor: " );
//        System.out.println("Exiba a soma dos consumos: ");
//        System.out.println("Exiba a média dos consumos deste dicionário de carros: ");
//        System.out.println("Remova os modelos com o consumo maior que 15 km/l: ");
//        System.out.println("Ordene a dicionário por modelo");
//        System.out.println("Apague o conjunto de carros: ");
//        System.out.println("Confira se a lista está vazia: ");
    }
}
