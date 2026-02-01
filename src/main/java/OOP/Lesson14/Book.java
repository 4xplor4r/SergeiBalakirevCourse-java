package OOP.Lesson14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
    private String title;
    private String author;
    private Date date;
    private Integer pagesCount;

    public Book(String title, String author, Date date, Integer pagesCount) {
        this.title = title;
        this.author = author;
        this.date = date;
        this.pagesCount = pagesCount;
    }

    // геттеры
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public Date getDate() { return date; }
    public Integer getPagesCount() { return pagesCount; }
    // сеттеры
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setDate(Date date) { this.date = date; }
    public void setPagesCount(Integer pagesCount) { this.pagesCount = pagesCount; }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", date=" + sdf.format(this.date) +
                ", pagesCount=" + pagesCount +
                '}';
    }
}
