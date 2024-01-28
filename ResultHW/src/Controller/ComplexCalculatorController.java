package Controller;

import Controller.Interfaces.ICalculatorController;
import Model.ComplexNumber;
import Model.Interfaces.ICalculator;
import View.IView;

public class ComplexCalculatorController implements ICalculatorController {
    private IView view;
    private ICalculator<ComplexNumber> calculator;

    public ComplexCalculatorController(IView view, ICalculator<ComplexNumber> calculator) {
        this.view = view;
        this.calculator = calculator;
    }

    @Override
    public void start() {
        view.printDescription();

        String operation = view.printSelectOperator();

        switch (operation) {
            case "+": {
                float numberA1 = view.printInputNumber();
                float numberB1 = view.printInputNumber();
                float numberA2 = view.printInputNumber();
                float numberB2 = view.printInputNumber();

                ComplexNumber result = calculator.add(
                    new ComplexNumber(numberA1, numberB1),
                    new ComplexNumber(numberA2, numberB2)
                );

                view.printResult(result.toString());
                break;
            }
            case "*": {
                float numberA1 = view.printInputNumber();
                float numberB1 = view.printInputNumber();
                float numberA2 = view.printInputNumber();
                float numberB2 = view.printInputNumber();

                ComplexNumber result = calculator.multiply(
                    new ComplexNumber(numberA1, numberB1),
                    new ComplexNumber(numberA2, numberB2)
                );

                view.printResult(result.toString());
                break;
            }
            case "/": {
                float numberA1 = view.printInputNumber();
                float numberB1 = view.printInputNumber();
                float numberA2 = view.printInputNumber();
                float numberB2 = view.printInputNumber();

                ComplexNumber result = calculator.divide(
                    new ComplexNumber(numberA1, numberB1),
                    new ComplexNumber(numberA2, numberB2)
                );

                view.printResult(result.toString());
                break;
            }
            default:
                view.showErrorMessage();
                break;
        }
    }
}
