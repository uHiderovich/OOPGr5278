package Interfaces;

import Classes.Actor;

public interface iQueueBehaviour {
    /**
     * Это метод добавления покумателя в очеред
     * @param actor Покуматель
     */
    public void takeInQueue(iActorBehaviour actor);

    /**
     * Это метод удаления покумателя из очереди
     */
    public void releaseFromQueue();

    /**
     * Это метод создания заказа покумателем
     */
    public void takeOrder();

    /**
     * Это метод получения заказа покумателем
     */
    public void giveOrder();
}
