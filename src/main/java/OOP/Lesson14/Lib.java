package OOP.Lesson14;

import java.util.ArrayList;
import java.util.List;

public class Lib {
    private static final Integer MAX_BOOKS = 3;
    private Book[] lib;
    public Integer size;

    {
        this.size = 0;
        this.lib = new Book[MAX_BOOKS];
    }

    Lib(Book[] new_books) {
        if (new_books.length > 0) {
            int i = 0;
            while (i < MAX_BOOKS && i < new_books.length) {
                lib[i] = new_books[i];
                ++i;
            }
            size = i;  // в конце размер на больше 1, чем в цикле
        }
    }

    public void add(Book book) {
        if (size <= MAX_BOOKS)
            lib[size - 1] = book;
    }

    public Book getBookByTitle(String title) {
        for (Book book : this.lib) {
            if (book.getTitle().equals(title))
                return book;
        }
        return null;
    }

    public void displayBooks() {
        for (int i = 0; i < this.size; ++i)
            System.out.println(lib[i].toString());
    }
}
