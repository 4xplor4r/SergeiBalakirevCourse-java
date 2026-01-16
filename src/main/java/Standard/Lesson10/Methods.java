package Standard.Lesson10;

public class Methods {
    public static void main(String[] args) {

        int w = 5;
        float h = 3.4f;
        // методы
        float P1 = perimetr(w, h);
        float P2 = perimetr(5, 4);

        System.out.println(P1);
        System.out.println(P2);
        // произвольное число аргументов
        showAr(1, 3, 0, -2, 7, 9);
        // перегрузка
        int a1 = module(-8);
        float a2 = module(-15.1f);
        System.out.println('\n');
        // рекурсия
        upAndDown(1);
    }

    /* Методы вызванные статическим методом, так же должны быть статическими */

    static void showAr(int ...ar) {  // произвольное число аргументов
        for (int val: ar)
            System.out.print(val + " ");
    }


    static float perimetr(float a, float b) {
        float res = 2 * (a + b);
        return res;
    }

    // перегрузка методов
    static int module(int x) {
        if (x < 0) x = -x;
        return x;
    }

    static float module(float x) {
        return x < 0 ? -x : x;
    }

    // рекурсия
    static void upAndDown(int n) {
        System.out.println("Уровень вниз: " + n);
        if (n < 4) upAndDown(n + 1);
        System.out.println("Уровень вверх: " + n);
    }
}
