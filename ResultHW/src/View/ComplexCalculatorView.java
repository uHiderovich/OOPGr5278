package View;

import java.util.Scanner;

public class ComplexCalculatorView implements IView {
    Scanner scanner;

    public ComplexCalculatorView() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void printDescription() {
        System.out.println("Программа для работы с комплексными числами");
        System.out.println("Необходимо ввести оператор (+, *, /) и четыре числа, по два числа для каждого комплексного числа");
    }

    @Override
    public float printInputNumber() {
        return Float.parseFloat(prompt("Введите число: "));
    }

    @Override
    public String prompt(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    @Override
    public String printSelectOperator() {
        return prompt("Введите оператор (+, *, /): ");
    }

    @Override
    public void printResult(String result) {
        System.out.println("Результат вычисления: " + result);
    }

    @Override
    public void showErrorMessage() {
        System.out.println("Такого оператора нет!");
    }
}
