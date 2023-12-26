package Services;

public class CoinDispenser {
    private int amountCoins = 0;

    public void addCoins(int coins) {
        this.amountCoins += coins;
    }

    @Override
    public String toString() {
        return "Мы заработали: " + amountCoins + "Руб.";
    }
}
