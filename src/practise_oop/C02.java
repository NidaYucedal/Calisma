package practise_oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02 {
    public static void main(String[] args) {


        String[] pazarSepeti = new String[5];

        String[] pazarSepeti2 = {"elma", "patates", "kivi", "karpuz", "muz"};

        //interface den obje olusturamayız
        //list interface olarak parent calss dır


        List<String> list = new ArrayList<>();
        list.add("elma");
        list.add("patates");
        list.remove("patates");
        list.add(0, "çikolata");
        list.set(0, "pasta");


        System.out.println(list);
        System.out.println(list.get(0));



        List<String> list2 = Arrays.asList(pazarSepeti2);
        System.out.println(list2.size());



    }


}
