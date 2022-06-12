package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<City>city=new HashSet<>();
        city.add(new City(315,"Bishkek"));
        city.add(new City(317,"Talas"));
        city.add(new City(313,"Osh"));
        city.add(new City(312,"Djalabat"));
        city.add(new City(316,"Naryn"));
        city.add(new City(312,"Yssyk-kol"));
        city.add(new City(318,"Batken"));


        Set<City>city1=new TreeSet<>();
        for (City s:city) {
        if (s.getCode()%2!=0){
            city1.add(s);
        }
        }
        city1.forEach(System.out::println);
    }
}
