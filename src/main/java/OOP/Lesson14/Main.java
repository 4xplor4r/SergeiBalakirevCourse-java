package OOP.Lesson14;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {

        /* === 3 задание === */
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        Lib testLib = new Lib( new Book[] {
                new Book(
                        "1984",
                        "Джордж Оруэлл",
                        sdf.parse("08.06.1949"),
                        328
                ),
                new Book(
                        "Преступление и наказание",
                        "Фёдор Достоевский",
                        sdf.parse("01.01.1866"),
                        672
                ),
                new Book(
                        "Гарри Поттер и философский камень",
                        "Джоан Роулинг",
                        sdf.parse("26.06.1997"),
                        320
                ),
                new Book(
                        "451 градус по Фаренгейту",
                        "Рэй Брэдбери",
                        sdf.parse("19.10.1953"),
                        256
                )
        });

        // поиск книги по названию
        System.out.println(testLib.getBookByTitle("Преступление и наказание").toString());

        System.out.println("Размер библеотеки: " + testLib.size);
        testLib.displayBooks();  // вывод всех книг в библиотеке
    }
}
