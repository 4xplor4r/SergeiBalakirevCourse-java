/*
В 7 уроке показано, как инициализируются
стандартные массивы в java,
без использования сторонних классов, коллекций.

Так же здесь демонстрируются все знания, полученные
в ходе предыдущих шести уроков. Такие, как:
 * типы данных и переменные;
 * приведение типов
 * оператор сравнения - if/else;
 * ввод и вывод через - java.util.Scanner, System.out.print\-ln\-f;
 * цикл for, do while и вложенные циклы.
*/

package Standard.Lesson7;

public class StandardArrays {
    public static void main(String[] args) {
        /* === Инициализация простых массивов === */
        java.util.Scanner in = new java.util.Scanner(System.in);

        short[][] standardArray2D;
        short counter;
        int rows, columns;

        // ввод размерностей
        do {
            System.out.print("Введите количество рядов 2D массива (> 0): ");
            rows = in.nextInt();
        } while(rows < 0);
        do {
            System.out.print("Введите количество столбцов 2D массива (> 0): ");
            columns = in.nextInt();
        } while(columns < 0);

        System.out.println("=== Короткая инициализация ===");
        // упрощенная + укороченная инициализация, для прямоугольных/квадратных массивов
        standardArray2D = new short[rows][columns];

        // заполнение массива
        // массивы в java изначально обладают информацией о размерности,
        // для этого используется свойство (публичное поле?) .length
        counter = 0;
        for (int i = 0; i < standardArray2D.length; ++i) {
            for (int j = 0; j < standardArray2D[i].length; ++j) {
                short elementValue = ++counter;
                standardArray2D[i][j] = elementValue;
            }
        }

        // печать массива в консоль
        for (int i = 0; i < standardArray2D.length; ++i) {
            // конструкция цикла for each выглядит так:
            // for(<type iterVar>: <iterableObj>) { statement; }
            for (int element: standardArray2D[i]) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("=== Длинная инициализация ===");
        // второй вариант инициализации через перебор,
        // на манер с++
        // позволяет задавать массивы разной длины (зубчатые массивы)
        standardArray2D = new short[rows][];
        for(int i = 0; i < rows; ++i) {
            standardArray2D[i] = new short[columns - i];
        }

        // заполнение массива
        counter = 0;
        for (int i = 0; i < standardArray2D.length; ++i) {
            for (int j = 0; j < standardArray2D[i].length; ++j) {
                short elementValue = ++counter;
                standardArray2D[i][j] = elementValue;
            }
        }

        // печать массива в консоль
        for (int i = 0; i < standardArray2D.length; ++i) {
            for (int j = 0; j < standardArray2D[i].length; ++j) {
                System.out.print(standardArray2D[i][j]);
                // для вывода разделителей
                if (j == standardArray2D[i].length - 1) { System.out.print('\n'); }
                else { System.out.print(", "); }
            }
        }
        System.out.println();

        /* === Алгоритм удаление элемента === */
        final int N = 9;
        int deleteIndex = 5;
        short[] standardArray = new short[N];

        for(int i = 0; i < N; ++i) standardArray[i] = (short)(i + 1);

        // удаление, т.е. сдвиг
        for(int i = deleteIndex; i < N - 1; ++i) standardArray[i] = standardArray[i + 1];

        for(short element: standardArray) System.out.print(element + " ");
    }
}