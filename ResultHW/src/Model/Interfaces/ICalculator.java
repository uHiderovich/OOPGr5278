package Model.Interfaces;

public interface ICalculator<T> {
    /**
     * Сложение чисел
     * @param number1 Число 1
     * @param number2 Число 2
     * @return
     */
    public T add(T number1, T number2);

    /**
     * Умножение чисел
     * @param number1 Число 1
     * @param number2 Число 2
     * @return
     */
    public T multiply(T number1, T number2);

    /**
     * Деление чисел
     * @param number1 Число 1
     * @param number2 Число 2
     * @return
     */
    public T divide(T number1, T number2);
}
