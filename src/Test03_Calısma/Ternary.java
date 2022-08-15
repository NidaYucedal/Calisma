package Test03_Calısma;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır. Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

      Eger aynı karakterlere sahipse

      "isim ayni karakterlere sahiptir." yazdirin.

      Eger ayni kaakterlere sahip degilse

      "Dizenin benzersiz karakterleri var" yazdirin.

       Ternary kullanin.
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("isim giriniz:");
        String isim = scan.nextLine();

        String sonuc = isim.length() == 3 ? "isim ayni karakterlere sahiptir" : "Dizenin benzersiz karakterleri var.";
        System.out.println(sonuc);


    }
}

