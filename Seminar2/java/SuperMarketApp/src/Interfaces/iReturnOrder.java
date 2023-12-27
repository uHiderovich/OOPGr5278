package Interfaces;

import Classes.Actor;

public interface iReturnOrder {
    /**
     * Возвращает флаг наличия товара с дефектом
     * @return Флаг наличия товара с дефектом
     */
    public boolean isHasDefectiveProduct();

    /**
     * Метод установки флага наличия дефектного товара
     * @param val Флаг наличия дефектного товара
     */
    public void setHasDefectiveProduct(boolean val);

    /**
     * Метод возврата дефектного товара
     */
    public void returnOrder();

    /**
     * Метод получения объекта покумателя
     */
    public Actor getActor();
}
