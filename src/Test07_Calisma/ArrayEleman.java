package Test07_Calisma;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEleman {
    public static void main(String[] args) {


        Scanner klavye = new Scanner(System.in);

        System.out.println("Kaç Adet Malzeme Gireceksiniz ? ");
        int n = klavye.nextInt();
        System.out.println("Pasta Malzemelerini Giriniz");

        ArrayList<String> malzemeler = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            malzemeler.add(klavye.next());
        }
        System.out.println("Alınacak Malzemeler : ");

        for (int k = 0; k < n; k++) {
            System.out.println(malzemeler.get(k));
        }

        System.out.println("Dizideki Kaçıncı Elemanı Silmek İstiyorsunuz ?");

        int sil = klavye.nextInt();
        malzemeler.remove(sil - 1);

        System.out.println("Listenin " + sil + (". Elemanı Silindi"));
        System.out.println("Malzeme Listesinin Son Hali : ");
        for (int j = 0; j < malzemeler.size(); j++) {
            System.out.println(malzemeler.get(j));
        }

    }
}