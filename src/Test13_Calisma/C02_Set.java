package Test13_Calisma;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C02_Set {
    public static void main(String[] args) {


        //verilen bir Arraydeki tekrar eden elemnetleri silip
        //tekrarsız halini yazdirin

        String[]arr={"A","A","B","C","C","D","E","E"};

        Set<String> tekrarsiz=new HashSet<>();

        for(String each:arr){
            tekrarsiz.add(each);

        }



        System.out.println(tekrarsiz);
        System.out.println(tekrarsiz.size()); //5


        Set<String> set = new HashSet<String>();
        set.add("ali");
        set.add("ayse");
        set.add("fatma");

        Set<String> set2 = new TreeSet<>();
        set2.add("ali");
        set2.add("fatma");
        set2.add("can");
        set2.add("cem");

        System.out.println(set.retainAll(set2));//true
        System.out.println(set);//[fatma, ali]
        System.out.println(set2.retainAll(set));//true
        System.out.println(set2);//[ali, fatma]
    }
}
