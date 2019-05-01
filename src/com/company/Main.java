package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> ingred = new HashMap<String,ArrayList<String>>();

        ArrayList<String> rice   = new ArrayList<>();
        ArrayList<String> meat   = new ArrayList<>();
        ArrayList<String> beans  = new ArrayList<>();
        ArrayList<String> salsa  = new ArrayList<>();
        ArrayList<String> veggies = new ArrayList<>();

        ingred.put("rice", rice);
        ingred.put("meat", meat);
        ingred.put("beans", beans);
        ingred.put("salsa", salsa);
        ingred.put("veggies", veggies);

        rice.add("white rice");
        rice.add("brown rice");
        rice.add("none");

        meat.add("chicken");
        meat.add("steak");
        meat.add("carnidas");
        meat.add("chorizo");
        meat.add("sofritas");
        meat.add("none");

        beans.add("pinto bean");
        beans.add("black bean");
        beans.add("none");

        salsa.add("mild salsa");
        salsa.add("medium salsa");
        salsa.add("hot salsa");
        salsa.add("none");
        salsa.add("all");

        veggies.add("lettuce");
        veggies.add("fajita veggies");
        veggies.add("none");
        veggies.add("all");


    for (int i=1; i<26; i++){
        System.out.println("burrito " + i + ": ");
        for (String key : ingred.keySet()){
            System.out.print(key + ingred.get(key) + " ");
            Collections.shuffle(ingred.get(key));
            System.out.println(ingred.get(key).get(0)+ " ");
        }
        System.out.println();
    }
    }
}
