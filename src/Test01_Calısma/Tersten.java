package Test01_Calısma;

import java.util.Arrays;
import java.util.Scanner;

public class Tersten {
    public static void main(String[] args) {

        //Kullanıcının girdiği integer sayıyı tersten yazdıran kod bloğu yazınız.
        // 123==>321 yada 1045==>5401 gibi.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        String sayi= scan.next();
        String çikti="";


        String[] arr= sayi.split("");
        System.out.println(Arrays.toString(arr));

        for (int i = arr.length-1; i >=0 ; i--) {
           çikti+=arr[i];

        }
        System.out.println(çikti);


       
    }
}
