
public class Book {
    private String title;
    private int pages;
    private String year;

    public Book(String title, int pages, String year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }
    
    public void getEverything(){
        System.out.println(this.title + ", " + this.pages + " pages, " + this.year);
    }
    
    public void getname(){
        System.out.println(this.title);
    }
}
