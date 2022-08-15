package Test12_Calisma;

import java.util.Collections;
import java.util.LinkedList;

public class C07_Linkedlist {
    public static void main(String[] args) {


       // Bir LinkedList oluşturalım ve ilk eleman ile 4. elemanı yerdeğiştiren java kodunu yazınız.

        /*
        LinkedList: mavi,kirmizi,beyaz,siyah,yesil,turuncu

        hint: Collections.swap();

       Beklene Çıktı:
       Orjinal LinkedList: [mavi,kirmizi,beyaz,siyah,yesil,turuncu]
      Swap sonrası durum: [**siyah**,kirmizi,beyaz,**mavi**,yesil,turuncu]
         */



        LinkedList<Integer>list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(5);
        System.out.println(list);


        Collections.swap(list, 0, 4);
        System.out.println("swap sonrası list: " + list);

        LinkedList<String> renkler=new LinkedList<>();
        renkler.add("sari");
        renkler.add("mavi");
        renkler.add("yesil");
        renkler.add("kirmizi");
        renkler.add("beyaz");
        renkler.add("mor");
        System.out.println(renkler);

        Collections.swap(renkler,0,4);
        System.out.println("swaptan sonra renkler :"+renkler);





    }
}
