package Classes;

public class PromotionalClient extends Actor {
    private static int count = 0;
    private static int lastId = 0;

    private String promotionName;
    private Integer id;

    public PromotionalClient(String name, String promotionName) {
        super(name);
        this.promotionName = promotionName;

        PromotionalClient.lastId += 1;
        this.id = PromotionalClient.lastId;

        PromotionalClient.count += 1;
    }

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

    public Actor geActor() {
        return this;
    }

    public String getName() {
        return super.name;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public int getId() {
        return id;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }
}
