package Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Interfaces.*;

public class Market implements iMarketBehaviour, iQueueBehaviour, iLoggerBehaviour {
    private List<iActorBehaviour> queue;
    private MarkerLogger logger;

    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();

        this.logger = new MarkerLogger();
        this.logger.initLogFileWriter();
    }

    public void checkOrder() {
        for (iActorBehaviour actor : queue) {
            // ---Для проверки функционала---
            int[] ids = new int[] {1, 2, 3, 4};
            if (Arrays.asList(ids).contains(actor.getActor().getId())) {
                actor.getActor().setHasDefectiveProduct(true);
            }
            // ------------------------------

            Actor actorObject = actor.getActor();

            if (actorObject.isHasDefectiveProduct()) {
                actorObject.returnOrder();
                writeLog(actorObject.getName() + " клиент обнаружил дефект в товаре");

                if (!actorObject.isHasDefectiveProduct()) {
                    writeLog(actorObject.getName() + " клиент вернул товар");
                }
            }
        }
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        writeLog(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        writeLog(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            queue.remove(actor);
            writeLog(actor.getName() + " клиент ушел из магазина ");
        }
    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        checkOrder();
        releaseFromQueue();
    }

    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            Actor actorObject = actor.getActor();

            if (actorObject.isMakeOrder()) {
                if (actorObject.isServiceAvailable()) {
                    actor.setTakeOrder(true);
                    writeLog(actorObject.getName() + " клиент получил свой заказ ");
                } else {
                    writeLog("Клиенту " + actorObject.getName() + " отказано в обсуживании");
                }
            }
        }
    }

    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            Actor actorObject = actor.getActor();

            releaseActors.add(actorObject);
            writeLog(actorObject.getName() + " клиент ушел из очереди ");
        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                writeLog(actor.getActor().getName() + " клиент сделал заказ ");
            }
        }
    }

    private void writeLog(String message) {
        System.out.println(message);
//        this.logger.writeLog(message);
    }
}


