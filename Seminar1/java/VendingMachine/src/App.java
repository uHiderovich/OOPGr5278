import java.util.ArrayList;
import java.util.List;

import Domain.Bottle;
import Domain.Product;
import Domain.HotDrink;
import Services.CoinDispenser;
import Services.Display;
import Services.Holder;
import Services.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {

        Product item1 = new Product(100, 12, "Lays", 1234);
        Product item2 = new Product(120, 14, "Nuts", 1235);
        Product item3 = new Product(90, 16, "Chips", 1236);
        Product item4 = new Product(20, 18, "Milka", 1237);
        Product item5 = new Product(60, 1, "3korochki", 1238);
        Product item6 = new Product(150, 2, "snikers", 1239);
        Product item7 = new Bottle(150, 3, "Cola", 1240, 0.5f);
        Product item8 = new HotDrink(150, 3, "Coffee", 1241, 0.3f, 75.6f);
        Product item9 = new HotDrink(150, 3, "Tea", 1242, 0.2f, 90.5f);
        Product item10 = new HotDrink(150, 3, "Tea", 1243, 0.2f, 91.0f);

        // System.out.println(item7);

        Holder hold = new Holder();
        CoinDispenser coin = new CoinDispenser();
        Display disp = new Display();
        List<Product> listProd = new ArrayList<>();

        listProd.add(item1);
        listProd.add(item2);
        listProd.add(item3);
        listProd.add(item4);
        listProd.add(item5);
        listProd.add(item6);
        listProd.add(item7);
        listProd.add(item8);
        listProd.add(item9);
        listProd.add(item10);

        VendingMachine vm = new VendingMachine(hold, coin, disp, listProd);

        for (Product p : vm.getAssort()) {

            System.out.println(p);
        }

        // MainFrame myFrame = new MainFrame();
        // myFrame.initialize();
    }
}
