package Test13_Calisma;

import java.util.LinkedList;
import java.util.Scanner;

public class C01_Linkedlist {
    public static void main(String[] args) {

        /*
        ali veli can ve ayse olan bir linkedlist olusturun
        kullanicidan bir isim alin
        bu isim listde varsa silin ve kullaniciya
        bu kullanici linkedliste vardi ve silindi
        mesaji verin,bu isim linkedliste yoksa bu
        isim linkedlist de yok bu yuzden silinemedi mesaji verin
         */


        LinkedList<String> list = new LinkedList<String>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");
        list.add("Ayse");

        Scanner scan=new Scanner(System.in);
        boolean kontrol=false;
        String isim="";


        do {
            System.out.println("bir isism giriniz:");
            isim=scan.nextLine();
            kontrol=false;

        }while (kontrol==false);
        System.out.println("baska bir isim giriniz");


       if (list.contains(isim)){
           System.out.println("bu isim linkedliste var");
       }

       if(list.remove(isim)){
           System.out.println("bu isim silindi");
       }




        System.out.println(list);


    }
}
