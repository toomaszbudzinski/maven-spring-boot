package pl.sample;

public class Book {
    private String author;
    private String title;
    private String rating;

    public Book(String author, String title, String rating) {
        this.author = author;
        this.title = title;
        this.rating = rating;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}