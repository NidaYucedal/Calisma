package Test15_Calisma;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public abstract class Collections<S> {
    public static void main(String[] args) {


        /*
        Ortak elemanları olan 2 farklı TreeSet
        oluşturalım ve elemanlarını tektek
        karşılaştırıp aynı olanlar için "yes"  farklı olanlar için "no" yazdıralım.

        TreeSet: mavi,yesil,kirmizi,sari

        TreeSet: yesil,mavi,pembe,turuncu
         */

        TreeSet<String> renk = new TreeSet<>();
        renk.add("mavi");
        renk.add("yesil");
        renk.add("kirmizi");
        renk.add("sari");
        System.out.println(renk.size());


        TreeSet<String> renk2 = new TreeSet<>();
        renk2.add("yesil");
        renk2.add("mavi");
        renk2.add("pembe");
        renk2.add("turuncu");


       //List<String> ayni = new ArrayList<>(renk);
       //ayni.retainAll(renk2);

        ArrayList<String> ayni= new ArrayList<>();

        for(String each : renk)
            ayni.add(renk2.contains(each) ? "Yes" : "No");
        System.out.println(ayni);


    }

}