package Domain;

public class HotDrink extends Product {
    private float temp;

    public HotDrink(int price, int place, String name, long id, float temp) {
        super(price, place, name, id);
        this.temp = temp;
    }

    public float getTemperature() {
        return temp;
    }

    public void setTemperature(float temperature) {
        this.temp = temperature;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Temperature = " + temp + "\n";
    }
}
