package Standard.Lesson9;

public class BitMultiplication {
    public static void main(String[] args) {
        byte flags, mask;

        // проверка на включенный бит
        flags = 5;  // двоичный вид: 00000101
        mask = 4;   // двоичный вид: 00000100
        if ((flags & mask) == mask) System.out.println("Включен 2-ой бит числа");
        else System.out.println("2-й бит выключен");

        // выключение битов
        flags = 13;  // двоичный вид: 00001101
        mask = 5;    // двоичный вид: 00000101
        flags = (byte)(flags & ~mask);  // двоичная запись: 00001000
        System.out.println(flags);
    }
}
