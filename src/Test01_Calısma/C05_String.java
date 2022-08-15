package Test01_Calısma;

import java.util.Arrays;

public class C05_String {
    public static void main(String[] args) {


        /*
        1. İki String ifadeyi parametre olarak alan bir metot tanımlayınız.                                                                                                                                           1. İki String ifadeyi parametre olarak alan bir metot tanımlayınız.
        2. Metodumuz bir cümle ve bu cümleden çıkarmak istediğimiz kelimeyi  parametre olarak alsın.
        3. Sonuç olarak metodumuz cümle içinden istediğimiz kelimeyi çıkararak bize döndürsün.
        Örneğin;
        ("bugün hava çok güzel", "çok") ➞ "Bugün hava güzel"
        ("merhaba dünya", "dünya") ➞ "merhaba"
         */


        String input = "bugün hava çok güzel ama çok";


        String kelime = "çok";


        System.out.println(kelimeCikar(input, kelime));


    }


    public static String kelimeCikar(String input, String kelime) {


        String[] arr = input.split(" ");


        String yeniCumle = "";

        for (String each : arr) {
            if (!each.equals(kelime)) {
                yeniCumle += each + " ";

            }
        }

        return yeniCumle;
    }
}