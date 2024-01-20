package Classes;

public class PromotionalClient extends Actor {
    /**
     * Последный установленный уникальный идентификатор покупателя
     */
    private static int lastId = 0;

    /**
     * Текущее кол-во полкупателей участвующих в акции
     */
    private static int count = 0;

    /**
     * Максимальное кол-во полкупателей участвующих в акции
     */
    private static int maxCount = 2;

    /**
     * Уникальный идентификатор покупателя
     */
    private Integer id;

    /**
     * Флаг наличия дефектного товара
     */
    private boolean isHasDefectiveProduct;

    /**
     * Текущее кол-во полкупателей участвующих в акции
     */
    private int promotionNumber = 0;

    /**
     * Название акции
     */
    private String promotionName;

    public PromotionalClient(String name, String promotionName) {
        super(name);
        this.promotionName = promotionName;

        PromotionalClient.lastId += 1;
        this.id = this.lastId;

        PromotionalClient.count += 1;
        this.promotionNumber = PromotionalClient.count;
    }

    /**
     * Метод получаения кол-ва покупателей участвующих в акции
     * @return count Кол-во покупателей
     */
    public static int getCount() {
        return count;
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

    public boolean isHasDefectiveProduct() {
        return isHasDefectiveProduct;
    }

    public void setHasDefectiveProduct(boolean val) {
        this.isHasDefectiveProduct = val;
    }

    public void returnOrder() {
        setHasDefectiveProduct(false);
    }

    /**
     * Метод получения названия акции в которой участвует покуматель
     * @return
     */
    public String getPromotionName() {
        return promotionName;
    }

    /**
     * Метод установки названия акции в которой участвует покуматель
     * @return
     */
    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public boolean isServiceAvailable() {
        return this.promotionNumber < PromotionalClient.maxCount;
    }
}
