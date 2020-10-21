package com.rachenterpise.beeradvisor;
/* Code written by Uchechi-Chinaemerem Alionye Paschal
   On 20/10/2020
   At 06:11 PM 
*/


import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color){
        List<String> brands = new ArrayList<>();

        if(color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
            brands.add("Star");
            brands.add("Guilder");
            brands.add("Legend");
            brands.add("Hero");
            brands.add("Life");
            brands.add("Heineken");
            brands.add("Harp");
            brands.add("33");
        }else{
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
            brands.add("Guinness Stout");
            brands.add("Orijin");
            brands.add("Smirnoff Ice");
            brands.add("Smirnoff Chocolate");
            brands.add("Budweiser");
            brands.add("Guinness Stout Smooth");
        }
        return brands;
    }
}
