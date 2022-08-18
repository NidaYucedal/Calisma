package Test14_Calisma;


import  java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Maps {
    public static void main(String[] args) {


        //tum ogrencilerin isim ve soyisimlerini alt alta yazdirin


        Map<Integer, String> sinifList = new HashMap<>();

        sinifList.put(101, "Ali, Can, JDev");
        sinifList.put(102, "Enes, Cem, Tester");
        sinifList.put(103, "Emine, Cam, Java");
        sinifList.put(104, "Nida, Sena, Tester");
        System.out.println(sinifList);

        Collection<String> list = sinifList.values();//value lerde olusan bir toplulugu bir arda tutmak icin collection

        String[] arr;
        int sira = 1;

        for (String each : list) {
            arr = each.split(",");
            sira++;
            System.out.println(sira + " - " + arr[0] + " " + arr[1]);
        }


        //Map de bulunan ogrencilerin, isim ve soyisimlerini birlestirerek bir siniif listesi olusturun

        List<String> sinif = new ArrayList<String>();

        for(String each:list){
            arr=each.split(",");
            sinif.add(arr[0]+" "+arr[1]);


        }

        System.out.println(sinif);


    }
}
