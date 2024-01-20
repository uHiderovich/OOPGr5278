package Interfaces;

import java.util.List;

import Classes.Actor;

public interface iMarketBehaviour {
    /**
     * Метод добавления покупателя в супер-маркет
     * @param actor Покупатель
     */
    public void acceptToMarket(iActorBehaviour actor);

    /**
     * Метод удаления покупателя из супер-маркета
     * @param actors Список покупателей
     */
    public void releaseFromMarket(List<Actor> actors);

    /**
     * Метод обновления состояния супер-маркета
     */
    public void update();
}
