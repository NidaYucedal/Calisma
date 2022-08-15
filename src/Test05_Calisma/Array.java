package Test05_Calisma;

import java.util.regex.Pattern;

public class Array {
    public static String main(String[] args) {


        String str = "";

        Pattern pattern = Pattern.compile("\\s");
        String[] temp = pattern.split(str);
        String result = "";

        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;
    }
}