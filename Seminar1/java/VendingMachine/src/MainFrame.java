import Domain.Product;
import Services.VendingMachine;
import Services.CoinsValueException;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.*;

public class MainFrame extends JFrame {
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);

    private JLabel actionText;
    private JTextField inputCoins;
    private Product selectedProduct = null;
    private JButton selectedProductButton = null;

    private VendingMachine vm;

    public MainFrame(VendingMachine vm) {
        this.vm = vm;
    }

    public void initialize() {
        JPanel listPanel = createListPanel();
        JPanel actionPanel = createActionPanel();
        JPanel mainPanel = createMainPanel();

        mainPanel.add(listPanel, BorderLayout.CENTER);
        mainPanel.add(actionPanel, BorderLayout.SOUTH);

        add(mainPanel);

        setTitle("VendingMachines");
        setSize(700, 600);
        setMaximumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void updateDisplay() {
        actionText.setText(vm.getDisp().getMessage());
    }

    private JPanel createMainPanel() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        return mainPanel;
    }

    private JPanel createListPanel() {
        List<Product> assort = vm.getAssort();

        JPanel listPanel = new JPanel();
        listPanel.setLayout(new GridLayout(assort.size() / 2, 2, 5, 5));
        listPanel.setBackground(new Color(128, 128, 255));

        for (Product product : assort) {
            listPanel.add(createProductButton(product));
        }

        return listPanel;
    }

    private JButton createProductButton(Product product) {
        JButton productButton = new JButton(product.toString());
        productButton.setFont(mainFont);
        productButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedProduct = product;

                if (selectedProductButton != null) {
                    selectedProductButton.setEnabled(true);
                }

                productButton.setEnabled(false);
                selectedProductButton = productButton;
                vm.getDisp().setMessage("Давайте ваши деньги:)");
                updateDisplay();
            }
        });

        return productButton;
    }

    private JPanel createActionPanel() {
        JPanel actionPanel = new JPanel();
        actionPanel.setLayout(new GridLayout(3, 1, 5, 5));
        actionPanel.setBackground(new Color(128, 128, 255));

        actionText = new JLabel("Выбирете товар");
        actionText.setFont(mainFont);

        inputCoins = new JTextField();
        inputCoins.setFont(mainFont);

        actionPanel.add(actionText);
        actionPanel.add(inputCoins);
        actionPanel.add(createBuyProductButton());

        return actionPanel;
    }

    private JButton createBuyProductButton() {
        JButton buyProductButton = new JButton("Купить!");
        buyProductButton.setFont(mainFont);

        buyProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (selectedProduct == null) {
                    vm.getDisp().setMessage("Сначала выбирете товар!");
                } else {
                    int valueCoins = 0;

                    try {
                        valueCoins = Integer.parseInt(inputCoins.getText());
                    } catch (NumberFormatException | NullPointerException valueCoinsError) {
                        vm.getDisp().setMessage("Не корректная сумма денег!");
                    }

                    try {
                        Product product = vm.buyProduct(selectedProduct.getId(), valueCoins);
                        StringBuilder resultString = new StringBuilder("Вы купили " + product.getName() + " за " + product.getPrice() + "Руб. Молодец!");
                        int diff = valueCoins - product.getPrice();

                        if (diff > 0) {
                            resultString.append(" Ваша сдача: " + diff + "Руб.");
                        }

                        vm.getDisp().setMessage(resultString.toString());
                        inputCoins.setText("");
                        selectedProduct = null;
                        selectedProductButton = null;
                    } catch (CoinsValueException buyProductError) {
                        vm.getDisp().setMessage(buyProductError.getMessage());
                    }
                }

                updateDisplay();
            }
        });

        return buyProductButton;
    }
}
