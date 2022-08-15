package Test13_Calisma;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C03_Sets {
    public static void main(String[] args) {

        //bir treeset ve hashset e random 100 sayi ekleyin islem surelerini kıyaslayın



        Set<Integer> hash=new HashSet<>();

        Random sayi=new Random();

        for (int i = 1; i <= 10; i++) {
            hash.add(sayi.nextInt(100));
        }
        System.out.println("hash : "+hash);




        Set<Integer> tree=new TreeSet<>();

        Random rnd=new Random();

        for (int i = 0; i <10; i++) {
            tree.add(rnd.nextInt(100));

        }

        System.out.println("tree : "+tree);





        Long time=System.currentTimeMillis()+hash.hashCode();






        //ilk soruya 3. bir islem ekle
        //seti hashset olarak olusturup
        //eleman ekleyelim treeste cevirip yazdir



    }
}
