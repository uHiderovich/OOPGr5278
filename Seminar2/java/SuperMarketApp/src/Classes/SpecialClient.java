package Classes;

public class SpecialClient extends Actor {
    /**
     * Последный установленный уникальный идентификатор покупателя
     */
    private static int lastId = 0;

    /**
     * Уникальный идентификатор покупателя
     */
    private Integer id;

    /**
     * Флаг наличия дефектного товара
     */
    private boolean isHasDefectiveProduct;

    /**
     * Уникальный идентификатор VIP покупателя
     */
    private int idVIP;

    public SpecialClient(String name, int idVIP) {
        super(name);
        this.idVIP = idVIP;

        SpecialClient.lastId += 1;
        this.id = this.lastId;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }

    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }

    public Actor getActor() {
        return this;
    }

    public String getName() {
        return super.name;
    }

    public int getId() {
        return id;
    }

    public int getIdVIP() {
        return idVIP;
    }

    public boolean isHasDefectiveProduct() {
        return isHasDefectiveProduct;
    }

    public void setHasDefectiveProduct(boolean val) {
        this.isHasDefectiveProduct = val;
    }

    public void returnOrder() {
        setHasDefectiveProduct(false);
    }

    public boolean isServiceAvailable() {
        return true;
    }
}
