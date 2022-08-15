package Test05_Calisma;

public class Enbuyukikinci {
    public static void main(String[] args) {

        int[]arr= {1232,2345,5467,678,3454,2312,3451};
        int buyuk=0;
        int ikinci=0;

        for (int i = 0; i<arr.length; i++) {
            if(arr[i]>buyuk){

                ikinci=buyuk;
                buyuk=arr[i];

            } else if (arr[i]>ikinci){

                ikinci=arr[i];

            }

        }

        System.out.println("ikinci en buyuk: "+ikinci);



    }
}