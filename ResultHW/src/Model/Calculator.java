package Model;

import Model.Interfaces.ICalculator;
import Model.Interfaces.INumber;

public class Calculator<T extends INumber<T>> implements ICalculator<T> {
    @Override
    public T add(T number1, T number2) {
        return number1.add(number2);
    }

    @Override
    public T multiply(T number1, T number2) {
        return number1.multiply(number2);
    }

    @Override
    public T divide(T number1, T number2) {
        return number1.divide(number2);
    }
}
