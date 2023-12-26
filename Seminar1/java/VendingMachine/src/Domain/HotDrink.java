package Domain;

public class HotDrink extends Product {
    private float temp;

    public HotDrink(int price, int place, String name, float temp) {
        super(price, place, name);
        this.temp = temp;
    }

    public float getTemperature() {
        return temp;
    }

    public void setTemperature(float temperature) {
        this.temp = temperature;
    }

    @Override
    public String toString() {
        return this.getName() + " " + temp + "°" + " - " + this.getPrice() + "Руб.";
    }
}
