package OCP;

public class Vehicle {
    int maxSpeed;
    String type;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    /**
     * Метод получения максимальной скорости
     * @return
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Метод получения типа транспорта
     * @return
     */
    public String getType() {
        return this.type;
    }

    /**
     * Метод получения допустимой скорости
     * @return
     */
    public double calculateAllowedSpeed() {
        return 0.0;
    }
}
