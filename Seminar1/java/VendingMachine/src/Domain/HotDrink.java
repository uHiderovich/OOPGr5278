package Domain;

public class HotDrink extends Product {
    private float temp;
    private float volume;

    public HotDrink(int price, int place, String name, long id, float volume, float temp) {
        super(price, place, name, id);
        this.temp = temp;
        this.volume = volume;
    }

    public float getTemperature() {
        return temp;
    }

    public void setTemperature(float temperature) {
        this.temp = temperature;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + "Volume = " + volume + "\n" + "Temperature = " + temp + "\n";
    }
}
