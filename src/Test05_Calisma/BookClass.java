package Test05_Calisma;

public class BookClass {
    public static void main(String[] args) {


        // class da body icinde sag click->
      // Generate-> kullanacagin parametreleri sec-> ok (Parametreli Constructor olusturulur)
      //2  ve 3 pm li const olusturun
    //main method bu class da olsun
    //main method icinde obj leri create edin iki const tu da kullanin
      //yazdir isimli method create edin
      //ve bu methodlar olusturdugunuz obj leri yazdirin


        Book b1=new Book();
        b1.name="Persuasion";
        b1.auter="Jane Austen";
        b1.page=250;
        b1.year=1817;


        System.out.println(b1);


        Book b2=new Book("Pride and Prejudice","Jane Austen",230,1813);

        System.out.println(b2);


        Book b3=new Book(1817);
        System.out.println(b3);



        Book b4=new Book("Emma","Jane Austen",453,1820);

        System.out.println("Book 4 informations :"+b4);
    }

}
