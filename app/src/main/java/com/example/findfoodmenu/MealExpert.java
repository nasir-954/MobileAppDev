package com.example.findfoodmenu;

import java.util.ArrayList;
import java.util.List;

public class MealExpert {
    List<String> getMenus(String meal) {
        List<String> menus = new ArrayList<>();
        if (meal.equals("breakfast")){
            menus.add("Porota, Dal, Tea");
            menus.add("Nan, Vegetable, Tea");
            menus.add("Vuna Khisuri");
        } else if(meal.equals("lunch")){
            menus.add("Plain Rice, Fish, Vegetable, Dal");
            menus.add("Chicken Biriyani");
            menus.add("Mutton Kassi");
        } else {
            menus.add("Beef Teheri");
            menus.add("Grill and Nan");
            menus.add("Porota and Chicken Chap");
        }
        return menus;
    }
}
