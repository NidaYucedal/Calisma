package Test13_Calisma;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class C04_Deque_Queue {
    public static void main(String[] args) {


        //ilk elemanlari silin ve eleman ekleyin

        Queue<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(5);
        list.add(4);

        System.out.println(list.peek()); //2 ilk elemani getirdi
        System.out.println(list.poll()); //2 ilk elemani sildi ve sileneni getirdi
        System.out.println(list);
        list.offer(6);
        System.out.println(list);//6 eklendi


        Deque<String> liste = new LinkedList<>();
        liste.add("a");
        liste.add("b");
        liste.add("c");

        System.out.println(liste.peekLast());//c son eleman
        System.out.println(liste.pollLast());//c yi sildi ve dondurdu
        System.out.println(liste);//[a, b]


    }
}
