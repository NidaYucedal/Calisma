package Test07_Calisma;

import java.util.ArrayList;
import java.util.List;

public class ArrayArama {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.add("Java");
        names.add("Python");
        names.add("Swift");
        names.add("C");
        names.add("Go");
        names.add("C#");

        // Check if an ArrayList contains a given element
        System.out.println("Does names array contain \"C\"? : " + names.contains("C"));

        // Find the index of the first occurrence of an element in an ArrayList
        System.out.println("indexOf \"Java\": " + names.indexOf("Java"));
        System.out.println("indexOf \"C\": " + names.indexOf("C"));

        // Find the index of the last occurrence of an element in an ArrayList
        System.out.println("lastIndexOf \"Python\" : " + names.lastIndexOf("Python"));
        System.out.println("lastIndexOf \"C#\" : " + names.lastIndexOf("C#"));












    }


}
