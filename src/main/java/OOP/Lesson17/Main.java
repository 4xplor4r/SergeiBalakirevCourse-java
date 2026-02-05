package OOP.Lesson17;

import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws Exception {
        /* === Задание 1 === */
        Properties prop1 = new Properties((byte)2, "filled", 255, 60, 60);
        Properties prop2 = new Properties((byte)2, "points", 67, 19, 23);
        Properties prop3 = new Properties((byte)1, "filled", 132, 47, 84);

        System.out.println(prop1.toString());
        System.out.println(prop2.toString());
        System.out.println(prop3.getColor().toString());
        // но нельзя создать объект класса через Properties
//        Properties.Color someColor = new Properties.Color(255, 255, 255);
        System.out.println();

        /* === Задание 2 === */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // Тип 1 (гитары)
        MusicalTool guitar1 = new MusicalTool("Fender Stratocaster", 1,
                40.0, 10.0, 4.0, 1200.0, sdf.parse("2020-05-15"));
        MusicalTool guitar2 = new MusicalTool("Gibson Les Paul", 1,
                42.0, 12.0, 5.0, 2500.0, sdf.parse("2019-08-20"));
        MusicalTool guitar3 = new MusicalTool("Yamaha C40", 1,
                38.0, 9.5, 3.5, 300.0, sdf.parse("2021-03-10"));
        // Тип 2 (клавишные)
        MusicalTool piano1 = new MusicalTool("Yamaha U1", 2,
                150.0, 120.0, 60.0, 8000.0, sdf.parse("2018-11-30"));
        MusicalTool piano2 = new MusicalTool("Kawai K300", 2,
                145.0, 122.0, 58.0, 9500.0, sdf.parse("2022-01-25"));
        // Тип 3 (ударные)
        MusicalTool drums1 = new MusicalTool("Pearl Export", 3,
                200.0, 150.0, 180.0, 1500.0, sdf.parse("2020-07-12"));
        // Тип 4 (духовые)
        MusicalTool saxophone1 = new MusicalTool("Yamaha YAS-280", 4,
                70.0, 30.0, 20.0, 1200.0, sdf.parse("2021-09-05"));
        MusicalTool saxophone2 = new MusicalTool("Selmer Paris", 4,
                72.0, 32.0, 22.0, 4500.0, sdf.parse("2019-04-18"));
        // Тип 5 (скрипки) - еще один повторяющийся тип
        MusicalTool violin1 = new MusicalTool("Stradivarius Copy", 5,
                60.0, 20.0, 10.0, 800.0, sdf.parse("2022-06-10"));
        // всего 9 инструментов

        System.out.println("Статистика по инструментам: ");
        MusicalTool.Stat.displayInfo();
    }
}
