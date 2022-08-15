package Test06_Calisma;

import Test03_Calısma.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PIslemler {


    static List<Kisi> ogretmenlist = new ArrayList<>();
    static List<Kisi> ogrencilist = new ArrayList<>();
    static String kisiTuru;
    static Scanner scan = new Scanner(System.in); //static olmasinin nedeni tum methodlardan ulasmak icin


    public static void girisPaneli() {
        System.out.println("====================================");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
        System.out.println("Q- ÇIKIŞ");

        String secim = scan.next().toUpperCase();

        switch (secim) {
            case "1":
                kisiTuru = "OGRENCİ";
                islemMenusu();
                break;

            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();

                break;

            case "Q":
                break;

            default:
                System.out.println("hatali giris :(");
                girisPaneli();
                break;

        }


    }

    private static void islemMenusu() {
        System.out.println("sectigin kisi turu " + kisiTuru + " lutfen asagidaki isimleri seciniz");

        System.out.println("============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         0-ÇIKIŞ");


        System.out.println("islem tercihinizi giriniz : ");
        int secilenIslem = scan.nextInt();

        switch (secilenIslem) {
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                listeleme();
                islemMenusu();
                break;
            case 4:
                silme();
                islemMenusu();
                break;
            case 5:
                girisPaneli();//yani ana menu
                break;
            case 0:
                cikis();
                break;
            default:
                System.out.println("guzel birsey gir");
                islemMenusu();
                break;


        }


    }

    private static void cikis() {
        System.out.println("isleminiz gerceklesmistir");
    }

    private static void arama() {
        System.out.println("   ***   " + kisiTuru + " arama sayfası   ***");

        boolean kontrol = true;

        if (kisiTuru.equalsIgnoreCase("OGRENCI")){
            scan.nextLine();//dummy
            System.out.println();//bos satır print
            System.out.print("aradıgınız ogrenci kimlik no giriniz : ");

            String arananKimlikNo=scan.next();

            for (Kisi k:ogrencilist) {
                if (k.getKimlikNo().equals(arananKimlikNo)){
                    System.out.println("aradıgınız ogrenci : "+k.getAdSoyad());
                    kontrol=false;
                }

            }if (kontrol){
                System.out.println("aradıgınız ogrenci mevcut değil ");
            }
        }else{//ogretmen aranıyorsa else body calışacak
            System.out.print("aradıgınız ogretmenin kimlik no giriniz : ");
            String arananKimlikNo=scan.next();
            for (Kisi k: ogretmenlist) {
                if (k.getKimlikNo().equalsIgnoreCase(arananKimlikNo)){
                    System.out.println("aradıgınız ogretmen : "+k.getAdSoyad());
                    kontrol=false;
                }

            }if (kontrol){
                System.out.println("aradıgınız ogretmen mevcut değil ");
            }
        }


    }




        private static void listeleme () {

            System.out.println("ÖĞRENCİ LİSTESİ : " + ogrencilist);
            scan.nextLine();
            System.out.println("ÖĞRETMEN LİSTESİ : " + ogretmenlist);

        }


        private static void silme () {

            System.out.println("   ***   " + kisiTuru + " silme sayfası   ***");

            boolean kontrol= true;

            if (kisiTuru.equalsIgnoreCase("OGRENCI")){
                scan.nextLine();//dummy
                System.out.println();//bos satır print
                System.out.print("silinecek ogrenci kimlik no giriniz : ");

                String silinecekKimlikNo=scan.next();

                for (Kisi k:ogrencilist) {
                    if (k.getKimlikNo().equals(silinecekKimlikNo)){
                        System.out.println("silinen ogrenci : "+k.getAdSoyad());
                        ogrencilist.remove(k);
                        kontrol=false;
                        break;
                    }

                }if (kontrol){
                    System.out.println("silinecek ogrenci mevcut değil ");
                }
            }else{//ogretmen aranıyorsa else body calışacak
                System.out.print("silinecek ogretmenin kimlik no giriniz : ");
                String silinecekOgrtKimlikNo=scan.next();
                for (Kisi k: ogretmenlist) {
                    if (k.getKimlikNo().equalsIgnoreCase(silinecekOgrtKimlikNo)){
                        System.out.println("silinen ogretmen : "+k.getAdSoyad());
                        ogretmenlist.remove(k);
                        kontrol=false;
                        break;
                    }

                }if (kontrol){
                    System.out.println("silnecek ogretmen mevcut değil ");
                }
            }

        }



    private static void ekle () { //bu method hem ogrenci hem de ogretmen icin tasarlandi

            System.out.println("****** " + kisiTuru + " eklme sayfasina hosgeldin ");

            scan.nextLine();
            System.out.println("isim soyisim gir");
            String adSoyad = scan.nextLine();


            System.out.println("kimlik gir");
            String kimlikNo = scan.nextLine();

            System.out.println("yas gir");
            int yas = scan.nextInt();

            scan.nextLine();


            if (kisiTuru.equals("OGRETMEN")) {

                System.out.println("bolum giriniz");

                String bolum = scan.nextLine();


                System.out.println("sicil no giriniz: ");

                int sicilNo = scan.nextInt();


                Ogretmen ogretmen = new Ogretmen(adSoyad, kimlikNo, yas, bolum, sicilNo);
                ogretmenlist.add(ogretmen);

                System.out.println(ogretmenlist);

            } else {


                System.out.println("ogrenci no giriniz");
                String ogrenciNo = scan.nextLine();


                System.out.println("sinif no giriniz ");
                String sinif = scan.nextLine();


                Ogrenci ogrenci = new Ogrenci(adSoyad, kimlikNo, yas, ogrenciNo, sinif);
                ogrencilist.add(ogrenci);

                System.out.println(ogrencilist);

            }

        }

    }

