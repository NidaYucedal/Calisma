package Test05_Calisma;

public class While {
    public static void main(String[] args) {



        String str = "Java is also easy";

        int sayac= 0;

        char[] input = str.toCharArray();



        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (input[i] == input[j]) {
                    System.out.println(input[j]);
                    sayac++;
                    break;
                }
            }
        }



    }
}

