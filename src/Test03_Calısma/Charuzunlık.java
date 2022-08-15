package Test03_Calısma;

public class Charuzunlık {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

INPUT : Mustafa

OUTPUT : fafafa
         */



        String input="nida";

        char son=input.charAt(input.length()-2);
        char iki=input.charAt(input.length()-1);

        String sonuc=input.charAt(input.length()-2)>=2?
                ""+son+iki+son+iki+son+iki:input;
        System.out.println(sonuc);
    }
}
