package com.company;

import varB7.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Breakfast myBreakfast = new Breakfast(args);

        System.out.println(myBreakfast.getMyList());

        System.out.print("Какой продукт вас интересует? ");

        Scanner in = new Scanner(System.in);
        String s;
        s = in.nextLine();
        Food a = null;

        if (s.equals("Сыр")) {
            a = new Cheese("Сыр");
        }
        if (s.equals("Яблоко большое")) {
            a = new Apple("Яблоко", "большое");
        }
        if (s.equals("Яблоко маленькое")) {
            a = new Apple("Яблоко", "маленькое");
        }
        if (s.equals("Яблоко среднее")) {
            a = new Apple("Яблоко", "среднее");
        }
        if (s.equals("Мороженое с шоколадным сиропом")) {
            a = new IceCream("Мороженое", "шоколадный");
        }
        if (s.equals("Мороженое с карамельным сиропом")) {
            a = new IceCream("Мороженое", "карамельный");
        }

        myBreakfast.outputRecount(a);

        for(int i=0; i<myBreakfast.getMyList().size(); i++){
            myBreakfast.getMyList().get(i).consume();
        }

    }
}

