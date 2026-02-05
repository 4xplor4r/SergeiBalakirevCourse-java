package OOP.Lesson17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MusicalTool {
    private String name;
    private Integer type;
    private Dimensions dimensions;
    private double price;
    private Date productionYear;

    private static Stat stat = new Stat();

    public MusicalTool(String name, int type,
                       double width, double height, double depth,
                       double price, Date productionYear) {
        this.name = name;

        this.type = type;
        stat.register(this.type);

        this.dimensions = new Dimensions(width, height, depth);
        this.price = price;
        this.productionYear = productionYear;
    }

    public class Dimensions {
        double width; double height; double depth;

        private Dimensions(double width, double height, double depth) {
            this.width = width;
            this.height = height;
            this.depth = depth;
        }

        public String toString() {
            return "Dimensions{" +
                    "width=" + width +
                    ", height=" + height +
                    ", depth=" + depth +
                    '}';
        }

        public double[] toArray() {
            return new double[] {width, height, depth};
        }
    }

    public static class Stat {  // статический вложенный класс
        private static List<List<Integer>> typesDict;

        private Stat() { typesDict = new ArrayList<>(); }

        private static void register(Integer type) {
            for (List<Integer> pair : typesDict) {
                if (pair.get(0).equals(type)) {  // если ключ верный, инкриминируется значение
                    pair.set(1, pair.get(1) + 1);
                    return;
                }
            }
            // если не нашлось совпадений с переданным ключом,
            // создается новая пара {ключ, значение}. Значение - счетчик
            List<Integer> pair = Arrays.asList(type, 1);
            typesDict.add(pair);
        }

        public static void displayInfo() {
            for (List<Integer> pair : typesDict)
                System.out.println("Type " + pair.get(0) + " counted " + pair.get(1) + " times");
        }
    }

    public String toString() {
        return "MusicalTools{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", dimensiosn" + dimensions.toString() +
                ", price=" + price +
                ", productionYear=" + productionYear +
                '}';
    }

    public Dimensions getDimentions() {
        return dimensions;
    }
}
