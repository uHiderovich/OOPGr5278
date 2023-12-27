import Classes.*;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {

        Market magnit = new Market();

        Actor client1 = new OrdinaryClient("Борис");
        Actor client2 = new OrdinaryClient("Ольга");
        Actor client3 = new SpecialClient("Киркоров", 1);
        iActorBehaviour client4 = new TaxInspector();
        Actor client5 = new PromotionalClient("Иван", "NY");
        Actor client6 = new PromotionalClient("Елена", "NY");
        Actor client7 = new PromotionalClient("Рэмбо", "NY");

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.acceptToMarket(client6);
        magnit.acceptToMarket(client7);

        magnit.update();
    }
}
