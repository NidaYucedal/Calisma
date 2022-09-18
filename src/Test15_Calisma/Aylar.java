package Test15_Calisma;

import java.util.Scanner;

public class Aylar {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int gun = 0;
        String ayAdi = "";

        System.out.print("ay giriniz: ");
        int ay = input.nextInt();

        System.out.print("yil giriniz: ");
        int yil = input.nextInt();


        switch (ay) {
            case 1:
                ayAdi = "ocak";
                gun = 31;
                break;
            case 2:
                ayAdi = "şubat";
                if ((yil % 400 == 0) || ((yil % 4 == 0) && (yil % 100 != 0))) {
                    gun = 29;
                } else {
                    gun = 28;
                }
                break;
            case 3:
                ayAdi = "mart";
                gun = 31;
                break;
            case 4:
                ayAdi = "nisan";
                gun = 30;
                break;
            case 5:
                ayAdi = "mayis";
                gun = 31;
                break;
            case 6:
                ayAdi = "haziran";
                gun = 30;
                break;
            case 7:
                ayAdi = "temmuz";
                gun = 31;
                break;
            case 8:
                ayAdi = "agustos";
                gun = 31;
                break;
            case 9:
                ayAdi = "eylul";
                gun = 30;
                break;
            case 10:
                ayAdi = "ekim";
                gun = 31;
                break;
            case 11:
                ayAdi = "kasim";
                gun = 30;
                break;
            case 12:
                ayAdi = "aralik";
                gun = 31;
                break;


        }

        System.out.print(ayAdi + " " + yil + "  " + gun + " gundur\n");


    }
}
