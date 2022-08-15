package day2_constructor;

public class Isci {

    public String isim="isim belirtilmedi.";
    public String soyad="soyad belirtilmedi.";
    public String mail="mail belirtilmedi.";
    public String unvan="unvan belirtilmedi.";

    public Isci(String isim) {
        this.isim = isim;
    }

    public Isci() {

    }

    @Override
    public String toString() {
        return
                "\nisim=" + isim +
                "\nsoyad=" + soyad +
                "\nmail=" + mail +
                "\nunvan=" + unvan;
    }

    public Isci(String isim, String soyad, String mail, String unvan) {
        this.isim = isim;
        this.soyad = soyad;
        this.mail = mail;
        this.unvan = unvan;
    }
}
