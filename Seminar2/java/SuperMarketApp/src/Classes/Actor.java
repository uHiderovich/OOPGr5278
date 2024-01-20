package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour, iReturnOrder {
    /**
     * Имя покупателя
     */
    protected String name;

    /**
     * Флаг получения заказа
     */
    protected boolean isTakeOrder;

    /**
     * Флаг наличия заказа
     */
    protected boolean isMakeOrder;

    /**
     * Конструктор объекта покумателя
     * @param name Имя покупателя
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * Метод получения имени покупателя
     * @return Имя покупателя
     */
    public abstract String getName();

    /**
     * Метод получения уникального id покупателя
     * @return Уникальный id покупателя
     */
    public abstract int getId();

    /**
     * Метод проверки доступности обслуживания покупателя
     * @return
     */
    public abstract boolean isServiceAvailable();
}
