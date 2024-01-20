package Classes;

import Interfaces.iReturnOrder;

public class OrdinaryClient extends Actor {
    /**
     * Последный установленный уникальный идентификатор покупателя
     */
    private static int lastId = 0;

    /**
     * Уникальный идентификатор покупателя
     */
    private Integer id;

    private boolean isHasDefectiveProduct;

    public OrdinaryClient(String name) {
        super(name);

        OrdinaryClient.lastId += 1;
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

    public int getId() {
        return id;
    }

    public String getName() {
        return super.name;
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
