package Test12_Calisma;

import java.util.LinkedList;
import java.util.ListIterator;

public class C06_LinkedList {
    public static void main(String[] args) {

        //Bir LinkedList oluşturalım ve ListIterator yöntemi ile tersten yazdıralım.


        LinkedList<String> renkler=new LinkedList<>();
        renkler.add("sari");
        renkler.add("mavi");
        renkler.add("yesil");
        renkler.add("kirmizi");
        renkler.add("beyaz");
        renkler.add("mor");
        System.out.println(renkler);

        ListIterator<String> iterator=renkler.listIterator();
        System.out.println("Bastan sona yazdiralim: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Sondan basa yazdiralim:");

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());

        }
    }
}

