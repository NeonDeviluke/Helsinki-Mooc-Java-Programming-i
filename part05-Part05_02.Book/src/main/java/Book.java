
public class Book {
    private String author;
    private String name;
    private int count;

    public Book(String author, String name, int pages) {
        this.author = author;
        this.name = name;
        this.count = pages;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPages(){
        return this.count;
    }

    public String toString() {
        return  author + ", " + name + ", " + count + " pages";
    }

    
}
