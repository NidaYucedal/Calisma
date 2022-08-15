package Test12_Calisma;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C05_LİstIterator {
    public static void main(String[] args) {

        //String bir listedeki tum elemanlarin sonuna x ekleyin

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);

        for (String str : list) {
            str = str + "x";
            System.out.println(str);
        }


        ListIterator<String> iter = list.listIterator();
        while (iter.hasNext()) {
            String str = iter.next();
            iter.set(str + "x");

        }


        System.out.println("iterator den sonra list: " + list);


    }
}
