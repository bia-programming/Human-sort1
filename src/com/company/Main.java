package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Human h=new Human(19,90,false,170,true,false,true,false,"Bianca","Pascalau","black","operator","Oradea","Romania");
        Human h2=new Human(21,75,false,190,true,false,true,true,"Nae","Bara","green","programator","Oradea","Romania");
        Human h3=new Human(30,60,true,160,false,true,true,true,"Carina","Amanda","blue","menajera","Brazzaville","Congo");
        Human h4=new Human(14,50,false,150,false,false,true,true,"Mihai","Alexandru","green","-","Marghita","Romania");
        Human h5=new Human(22,120,false,170,true,true,true,true,"Antonio","Ionescu","blue","inginer","Budapesta","Ungaria");

        ArrayList<Human> humans = new ArrayList<>(h,h2,h3,h4,h5);

        ArrayList<Human> humans1=sortedAge(humans);
        System.out.println(humans1);

        public static ArrayList<Human> sortedAge(ArrayList<Human> humans) {
            int size = humans.size();
            ArrayList<Human> sortedAge = new ArrayList<>();
            boolean isSorted = false;
            int min = humans.get(0);
            while (isSorted != true) {
                for (int i = 0; i < humans.size(); i++) {
                    if (humans.get(i) < min) {
                        min = humans.get(i);
                    }
                }
            }
            if (sortedAge.size() == size) {
                isSorted = true;
            }
            sortedAge.add(min);
            humans.remove(humans.indexOf(min));

            return sortedAge;
        }
    }
}
