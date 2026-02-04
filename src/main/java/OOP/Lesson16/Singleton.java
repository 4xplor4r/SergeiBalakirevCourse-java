package OOP.Lesson16;

public class Singleton {
    private static Singleton instance = null;  // по умолчанию нет объекта

    // закрытый конструктор
    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null)            // если ранее экземпляр не создавался,
            instance = new Singleton();  // создается новый экземпляр
        // однако, если создавать каждый раз создавать новый объект, то ссылка будет указывать
        // на другой объект. Например так:
//        else instance = new Singleton();

        return instance;
    }
}
