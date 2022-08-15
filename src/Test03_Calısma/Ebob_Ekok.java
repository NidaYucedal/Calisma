package Test03_Calısma;

public class Ebob_Ekok {
    public static void main(String[] args) {


        int a=30;
        int b=40;
        int buyuk=0;
        int kucuk=0;
        int ekok = a * b;

        for(int i = 1; i < a; i++){
            if(a % i == 0 && b % i == 0) {
                buyuk = i;
            }
        }

        for(int i = ekok; i > 0; i--){
            if(i % a == 0 && i % b == 0) {
                ekok = i;
            }
        }

        System.out.println(buyuk);
        System.out.println("Ekok = " + ekok);


    }
}

