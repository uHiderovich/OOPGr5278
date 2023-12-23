package Domain;

public class Product {
    // Поля
    static long lastId = 0;
    private long id;
    private int price;
    private int place;
    private String name;

    // Конструктор
    public Product(int price, int place, String name) {
        this.id = Product.lastId + 1;
        Product.lastId = this.id;

        this.price = price;
        this.place = place;
        this.name = name;
    }

    //Методы
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            this.price = 10;
        } else {
            this.price = price;
        }
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Переопределяем вывод текста
    @Override
    public String toString(){
        return this.name + " - " + this.price + "Руб.";
    }
}
