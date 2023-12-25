package Classes;

import Interfaces.iActorBehaviour;

public abstract class Actor implements iActorBehaviour {
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
}
