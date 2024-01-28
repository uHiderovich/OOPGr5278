import Controller.ComplexCalculatorController;
import Controller.Interfaces.ICalculatorController;
import Model.ComplexCalculator;
import View.ComplexCalculatorView;
import View.IView;

public class Main {
    public static void main(String[] args) {
        IView view = new ComplexCalculatorView();
        ComplexCalculator calculator = new ComplexCalculator();
        ICalculatorController calculatorController = new ComplexCalculatorController(view, calculator);

        calculatorController.start();
    }
}
