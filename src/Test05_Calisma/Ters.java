package Test05_Calisma;

import java.util.Scanner;

public class Ters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String[] ch = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = String.valueOf(str.charAt(i));
        }

        // String str[] = "i like this program very much".split(" ");
        String ters = "";

        for (int i = ch.length - 1; i >= 0; i--) {
            ters += ch[i];
        }
        System.out.println("Ters String:");
        System.out.println(ters.substring(0,ters.length()-1));
    }
}

