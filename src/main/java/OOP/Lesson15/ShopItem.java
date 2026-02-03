
package OOP.Lesson15;

class ShopItem {  // package-private
    private Integer id;
    private static int objectCount;  // поле для подсчета количества объектов
    private String itemName;
    // полей с габаритами не будет, ибо лень
    private double weight;
    private double price;

    // статическая инициализация
    static { objectCount = 0; }

    public ShopItem(String itemName, double weight, double price) {
        this.id = objectCount++;
        this.itemName = itemName;
        this.weight = weight;
        this.price = price;
    }

    // геттеры
    public Integer getId() { return id; }
    public String getItemName() { return itemName; }
    public double getWeight() { return weight; }
    public double getPrice() { return price; }
    // сеттеры
    public void setItemName(String itemName) { this.itemName = itemName; }
    public void setWeight(double weight) { this.weight = weight; }
    public void setPrice(double price) { this.price = price; }

}
