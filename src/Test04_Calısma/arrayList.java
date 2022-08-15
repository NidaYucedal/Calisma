package Test04_Calısma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars.contains("Ford"));//true
        System.out.println(cars.contains("Audi"));//false


        Collections.sort(cars);
        for (String i : cars) {
            System.out.println(i);  // BMW Ford Mazda Volvo
        }

        cars.clear();
        System.out.println(cars); //[]
    }
}