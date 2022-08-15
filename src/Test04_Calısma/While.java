package Test04_Calısma;

public class While {
    public static void main(String[] args) {


        String str = "Java is also easy";

        int tekrar=0;

        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    tekrar++;

                }
            }

            System.out.println(str.charAt(i)+"--"+tekrar);
            String d=String.valueOf(str.charAt(i)).trim();
            str=str.replaceAll(d,"");
            tekrar = 0;
        }

    }
}




