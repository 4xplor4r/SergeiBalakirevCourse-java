package OOP.Lesson12;

public class Main {
    public static void main(String[] args) {
        Point pt = new Point();
        pt.x = 1;
        pt.y = 2;

        Point pt2 = new Point();
        pt2.x = 10;
        pt2.y = 22;

        System.out.println("x = " + pt.x + ", y = " + pt.y);
        System.out.println("x = " + pt2.x + ", y = " + pt2.y);
        System.out.println();

        // домашка от Сергея Балакирева

        // Point3D
        Point3D pt3 = new Point3D();
        Point3D pt4 = new Point3D();
        Point3D pt5 = new Point3D();

        setPoint3DCoords(pt3, 1.2f, 7.8f, 9.45f);
        setPoint3DCoords(pt4, 3.4f, 9.1f, 10.56f);
        setPoint3DCoords(pt5, 5.6f, 2.3f, 11.67f);

        printPoint3DCoords(pt3);
        printPoint3DCoords(pt4);
        printPoint3DCoords(pt5);
        System.out.println();

        // Line
        Line l1 = new Line();
        Line l2 = new Line();

        // line 1 init
        l1.start = new Point();
        l1.start.x = 1;
        l1.start.y = 2;
        l1.end = new Point();
        l1.end.x = 2;
        l1.end.y = 4;

        // line 2 init
        l2.start = new Point();
        l2.start.x = 2;
        l2.start.y = 3;
        l2.end = new Point();
        l2.end.x = 3;
        l2.end.y = 5;

        // печать координат точек линий
        printLinePoints(l1);
        System.out.println();
        printLinePoints(l2);
    }

    // учитываем что статик методы это не канон, в дальнейшем этим будут заниматься
    // геттеры и сеттеры
    private static void setPoint3DCoords(Point3D pt, float x, float y, float z) {
        pt.x = x;
        pt.y = y;
        pt.z = z;
    }

    private static void printPoint3DCoords(Point3D pt) {
        System.out.println("x = " + pt.x + ", y = " + pt.y + ", z = " + pt.z);
    }

    private static void printPoint(Point pt) { System.out.println("x = " + pt.x + ", y = " + pt.y); }
    private static void printLinePoints(Line l) {
        printPoint(l.start);
        printPoint(l.end);
    }
}
