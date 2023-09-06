package cbs.dp.ua.Lambdas_9_3;

public class Book {

    private String title;
    private String author;
    private int numbPages;

    public Book(String title, String author, int numbPages) {
        this.title = title;
        this.author = author;
        this.numbPages = numbPages;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumbPages() {
        return numbPages;
    }

    public void setNumbPages(int numbPages) {
        this.numbPages = numbPages;
    }
}
