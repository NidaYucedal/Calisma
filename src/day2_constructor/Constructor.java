package day2_constructor;

public class Constructor {


    public String isim="isim belirtilmedi.";
    public String soyad="soyad belirtilmedi.";

    public String dogumYil="dogumYil belirtilmedi.";
    public String no="no belirtilmedi.";


    public Constructor() {



    }

    public Constructor(String isim, String soyad) {


        this.isim = isim;
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "\nisim: " + isim +
                "\nsoyad: " + soyad +
                "\ndogumYil: " + dogumYil +
                "\nno: " + no;
    }

    public Constructor(String isim, String soyad, String dogumYil, String no) {
        this.isim = isim;
        this.soyad = soyad;
        this.dogumYil = dogumYil;
        this.no = no;



    }
}
