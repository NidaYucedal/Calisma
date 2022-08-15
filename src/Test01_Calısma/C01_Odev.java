package Test01_Calısma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Odev {
    public static void main(String[] args) {



        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */

        int[][] sayilar = {{-1, 2, 3}, {2, 3, 1}, {9, 5, 5}, {2, 1, 3}};
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for(int i = 0; i < sayilar.length; i++) {
            Arrays.sort(sayilar[i]);

            if(sayilar[i][0] < minimum) minimum = sayilar[i][0];
            if(sayilar[i][sayilar[i].length - 1] > maximum) maximum = sayilar[i][sayilar[i].length - 1];
        }

        System.out.println("Minimum = " + minimum);
        System.out.println("Maximum = " + maximum);
    }
}




