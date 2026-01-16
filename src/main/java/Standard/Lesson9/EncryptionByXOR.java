package Standard.Lesson9;

public class EncryptionByXOR {
    public static void main(String[] args) {
        String msg = "Привет мир!";
        byte key = 52;

        System.out.println("Исходное сообщение: " + msg);

        // кодировка
        char[] str = msg.toCharArray();
        for (int i = 0; i < str.length; ++i)
            str[i] ^= (char)key;

        msg = new String(str);  // собираем массив char в строку
        System.out.println("Сообщение закодировано по xor: " + msg);

        // декодировка (алгоритм тот же)
        for (int i = 0; i < str.length; ++i)
            str[i] ^= (char)key;

        msg = new String(str);
        System.out.println("Сообщение декодировано: " + msg);
    }
}
