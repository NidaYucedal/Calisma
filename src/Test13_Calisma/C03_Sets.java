package Test13_Calisma;

import java.util.*;

public class C03_Sets {
    public static void main(String[] args) {

        //bir treeset ve hashset e random 100 sayi ekleyin islem surelerini kıyaslayın


        HashSet<Integer> hash = new HashSet<>();

        Random sayi = new Random();


        for (int i = 1; i <= 10; i++) {
            hash.add(sayi.nextInt(100));

        }
        long time = System.currentTimeMillis();
        System.out.println("hash : " + hash);
        System.out.println(time);


        TreeSet<Integer> tree = new TreeSet<>();

        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            tree.add(rnd.nextInt(100));


        }
        long time2 = System.currentTimeMillis();
        System.out.println("tree : " + tree);
        System.out.println(time2);

        //long time = System.currentTimeMillis();
        //System.out.println("useHashThenTreeSet: " + time );


        //ilk soruya 3. bir islem ekle
        //seti hashset olarak olusturup
        //eleman ekleyelim treeste cevirip yazdir

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(5);
        set2.add(6);

        Set<Integer> set3 = new TreeSet<>(set2);
        System.out.println(set3);


    }
}
