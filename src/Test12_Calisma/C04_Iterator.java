package Test12_Calisma;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C04_Iterator {
    public static void main(String[] args) {


        //bir listedeki tum elemntşleri iterator kullanarak silin

        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer>it=list.iterator();
        while(it.hasNext()){
            it.next();
            it.remove();
        }
        System.out.println(list);



    }
}
