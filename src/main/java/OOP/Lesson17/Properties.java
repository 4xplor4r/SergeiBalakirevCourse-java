package OOP.Lesson17;

public class Properties {  // класс с настройками графичесих примитивов
    private Byte borderWidth;
    private String borderType;   // например сплошной или пунктирный типы
    private Color color;

    {
        this.borderWidth = 1;
        this.borderType = "stipple";
        this.color = new Color(255, 0, 0);
    }

    public Properties(Byte borderWidth, String borderType, int r, int g, int b) {
        this.borderWidth = borderWidth;
        this.borderType = borderType;
        this.color = new Color(r, g, b);
    }

    // встроенный класс
    public class Color {
        int r; int g; int b;

        private Color(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }

        public String toString() { return "(" + r + ", " + g + ", "  + b + ')'; }
    }

    public Color getColor() {  // геттер ссылка на объект Color
        return color;
    }

    public String toString() {
        return "Properties{" +
                "borderWidth=" + borderWidth +
                ", borderType='" + borderType + '\'' +
                ", color=" + color.toString() +
                '}';
    }
}
