package OOP.Lesson13;

// стандартный вариант реализации
public class Point {
    double x, y;
    int color;

    // инициализация
    {
        x = 0; y = 0;
        color = 0;
    }

    public Point() {}

    public Point(double x, double y) {
        this.x = x; this.y = y;
        color = 1;
    }
}


// инициализация конструктора с параметрами через конструктор по умолчанию
// без указания модификатора доступа, считается что класс package-private,
// то есть виден только внутри файла и используется для реализации внутренней логики пакета\
class PointOld {
    double x, y;
    int color;

    public PointOld() {
        x = 0; y = 0;
        color = 0;
    }

    public PointOld(double x, double y) {
        this();  // вызов конструктора по умолчанию для инициализации
        this.x = x; this.y = y;
    }
}
