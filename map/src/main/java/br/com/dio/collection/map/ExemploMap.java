package br.com.dio.collection.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus repectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consuumo do gol por 12,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionário: ");

        System.out.println("Exiba o consumo do uno: ");

    }
}
