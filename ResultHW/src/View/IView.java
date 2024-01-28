package View;

public interface IView {
    /**
     * Вывести описание программы
     */
    void printDescription();

    /**
     * Ввести число
     * @return Возвращает введенное число
     */
    float printInputNumber();

    /**
     * Вывести сообщение и получить ответ
     * @param message Сообщение
     * @return Ответ
     */
    String prompt(String message);

    /**
     * Вывести сообщение о выборе математической операции
     * @return Ответ
     */
    String printSelectOperator();

    /**
     * Вывести сообщение о результате математической операции
     */
    void printResult(String result);

    /**
     * Вывести сообщение об ошибке
     */
    void showErrorMessage();
}
