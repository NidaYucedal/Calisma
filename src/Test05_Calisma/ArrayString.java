package Test05_Calisma;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ArrayString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        char[] ch = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        System.out.println(ch);


        String ters="";

        for (int i = 0; i < ch.length; i++) {
            if (i == ch.length-1)
               ters = ch[i] + ters;
            else
                ters = ch[i] + ters;
        }
        System.out.println(ters);



    }
}
