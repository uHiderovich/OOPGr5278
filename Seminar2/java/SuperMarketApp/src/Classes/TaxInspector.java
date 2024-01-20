package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public class TaxInspector implements iActorBehaviour, iReturnOrder {
    private String name;

    private boolean isTakeOrder;

    private boolean isMakeOrder;

    /**
     * Флаг наличия дефектного товара
     */
    private boolean isHasDefectiveProduct;

    public TaxInspector() {
        this.name = "Tax audit";
    }

    public String getName() {
        return name;
    }

    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    public void setTakeOrder(boolean val) {
        this.isTakeOrder = val;
    }

    public void setMakeOrder(boolean val) {
        this.isMakeOrder = val;
    }

    public Actor getActor() {
        return new OrdinaryClient(name);
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
