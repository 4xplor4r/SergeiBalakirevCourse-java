package OOP.Lesson16;

import static java.lang.System.out;  // статический импорт,
                                     // для испольхзования стат. классов в стат. main

public class Main {
    // <модификатор доступа> <ключевое слово 'static'> <константа> <тип данных> имя_переменной = значение переменной;
    private static final int CONST = 52;

    public static void main(String[] args) {
        /* === Задание 1 === */
        ShopItem item1 = new ShopItem("Ноутбук", 2.5, 1200.00);
        ShopItem item2 = new ShopItem("Смартфон", 0.3, 800.00);
        ShopItem item3 = new ShopItem("Наушники", 0.2, 150.00);

        out.println("item1.getId() = " + item1.getId() +
                "\nitem2.getId() = " + item2.getId() +
                "\nitem3.getId() = " + item3.getId());

        item2 = new ShopItem("Плеер", 0.2, 599.99);
        item2 = new ShopItem("Плеер", 0.2, 599.99);
        // ссылка указывает на новые объекты, старые очищаются
        // общая переменная увеличивается, и id присваивается верно
        out.println("item2.getId() = " + item2.getId() + '\n');

        /* === Задание 2 === */
        Rect verticalRect = new Rect(5, 10, 3, 5);
        out.printf("Ширина - %.2f, Высота - %.2f\n",
                Rect.calculateWidth(verticalRect),
                Rect.calculateHeight(verticalRect));

        Rect horizontalRect = new Rect(10, 6, 2, 3);
        out.printf("Ширина - %.2f, Высота - %.2f\n\n",
                Rect.calculateWidth(horizontalRect),
                Rect.calculateHeight(horizontalRect));

        /* === Задание 3 === */
        out.println(Singleton.getInstance());  // начальный адрес используемой памяти 2e0fa5d3 (пример)
        out.println(Singleton.getInstance());  // остается таким же, как и раньше: 2e0fa5d3
    }
}
