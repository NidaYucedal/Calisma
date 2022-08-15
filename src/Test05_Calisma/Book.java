package Test05_Calisma;

public class Book {

    String name;
    String auter;
    int page;
    int year;

    public Book(int year) {
        this.year = year;
    }


    public Book(String name, String auter) {
        this.name = name;
        this.auter = auter;
    }

    public Book(String name, String auter, int page, int year) {
        this.name = name;
        this.auter = auter;
        this.page = page;
        this.year = year;
    }

    public Book() {
    }


    @Override
    public String toString() {
        return
                "\nname= " + name +
                "\nauter= " + auter +
                "\npage=" + page +
                "\nyear= "+year ;
    }

    public Book(String name, String auter, int page) {
        this.name = name;
        this.auter = auter;
        this.page = page;
    }




}
