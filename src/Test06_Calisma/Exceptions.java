package Test06_Calisma;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {

           /*
       Marketteki tum urunleri bir array de tuttugumuz var sayalim
       Kullaniciya index sorup, o index deki urunu yazdiran bir program hazirlayalim
       Kullanici urun sayisindan buyuk bir index girerse
       exception vermesinin onune gecelim
         */

        String[] urunler={"Nutella","Cokokrem","Sut","Cay","Findik"};
        Scanner scan=new Scanner(System.in);
        boolean control=true;


        while (control) {
            System.out.println("Istediginiz urunu sira nosunu giriniz");
            int istenenIndex = 0;
            try {
                istenenIndex = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Hata mesaji " + e.getMessage());
            }
            try {
                System.out.println("Aradiginiz urun : " + urunler[istenenIndex - 1]);
                control=false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Girdiginiiz sira listemizde bulunmuyor\nen fazla " + urunler.length + " olur");
            }
        }

    }
}
