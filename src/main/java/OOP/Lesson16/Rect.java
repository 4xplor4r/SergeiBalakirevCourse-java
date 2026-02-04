package OOP.Lesson16;

class Rect {
    private double x1; private double y1;  // правый верхний
    private double x2; private double y2;  // левый нижний

    public Rect(double x1, double y1, double x2, double y2) {
        this.x1 = x1; this.y1 = y1;
        this.x2 = x2; this.y2 = y2;
    }

    public static double calculateHeight(Rect rect) {
        return rect.y1 - rect.y2;
    }

    public static double calculateWidth(Rect rect) {
       return rect.x1 - rect.x2;
    }
}
