// кстати пакеты - аналог пространства имен в c++
package OOP.Lesson13;

// линия задается через две точки по условию задания
public class Line {
    // по умолчанию поля публичны
    Point start, end;
    int color;

    {  // инициализация
        start = new Point();
        end = new Point();
        color = 0;
    }

    public Line() {}

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }
}
