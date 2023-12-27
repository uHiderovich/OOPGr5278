package Interfaces;

import Classes.Actor;

public interface iActorBehaviour {
    /**
     * Метод проверки, что заказ получен
     * @return boolean
     */
    public boolean isTakeOrder();

    /**
     * Метод проверки, что покуматель сделал заказ
     * @return boolean
     */
    public boolean isMakeOrder();

    /**
     * Метод установки флага получения заказа
     * @param val Новое значение флага
     */
    public void setTakeOrder(boolean val);

    /**
     * Метод установки флага наличия заказа
     * @param val Новое значение флага
     */
    public void setMakeOrder(boolean val);

    /**
     * Метод получения объекта покумателя
     */
    public Actor getActor();
}
