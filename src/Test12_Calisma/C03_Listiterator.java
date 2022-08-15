package Test12_Calisma;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C03_Listiterator {
    public static void main(String[] args) {

        //Soru 4) Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdirin


        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);


        ListIterator li1=list.listIterator();

        while(li1.hasNext()){
            li1.next();
        }


        while(li1.hasPrevious()){
            System.out.print(li1.previous()+" ");


        }


    }
}
