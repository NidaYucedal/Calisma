package Test07_Calisma;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {


        /*
        string str[] urun isimlerinin tuttugu bir array olsun
        kullanicidan istedigi urunun sirasini isteyin
        ve istenen urunu yazdirin kullanici array'de
        olan urun sayisindan buyuk bir sira no girerse
        girdiginz sira urun sayisindan buyuk yazdirin
         */

        String[] urunler = {"Pecete", "Pirinc", "Sut", "Cay", "Kahve"};

        Scanner scan=new Scanner(System.in);
        System.out.println("istediginiz urunun sirasini giriniz");

        int istenenSira=0;
        boolean kontrol=true;

        while (kontrol){


            try {
                scan = new Scanner(System.in);
                istenenSira = scan.nextInt();
                kontrol = false;

            } catch (InputMismatchException deneme) {
                System.out.println("Urun indexi icin bir tam sayi girmeniz gerekli");
            }
            try {

                System.out.println("Aradiginiz urun : " + urunler[istenenSira - 1]);

            } catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("Girdiginiz sira listemizde bulunmuyor" +
                        "\nSira numarasi en fazla : " + urunler.length + " olabilir");
            }


        }


    }
}
