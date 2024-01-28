package Model.Interfaces;

public interface INumber<T> {
    /**
     * Сложение с другим числом
     * @param number Число
     * @return
     */
    public T add(T number);
    /**
     * Умножение на другое число
     * @param number Число
     * @return
     */
    public T multiply(T number);
    /**
     * Деление на другое число
     * @param number Число
     * @return
     */
    public T divide(T number);
}
