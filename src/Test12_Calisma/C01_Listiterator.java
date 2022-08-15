package Test12_Calisma;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_Listiterator {
    public static void main(String[] args) {

        //list elemanlarini listiterator a ekleyip 5 artirin

        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        ListIterator<Integer>iterator=list.listIterator();

      while (iterator.hasNext()) {
          int temp=iterator.next()+5;
          iterator.set(temp);

      }


        System.out.println(list);




    }
}
