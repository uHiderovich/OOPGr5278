package Controller.Interfaces;

import Controller.ViewException;

public interface iGetController {
    /**
     * Установка текущего отображения
     * @param language
     * @throws ViewException
     */
    public void setView(String language) throws ViewException;
    /**
     * Добавление нового типа отображения
     * @param language
     * @param view
     */
    public void addView(String language, iGetView view);
    /**
     * Лобавление нового типа модели
     * @param model
     */
    public void addModel(iGetModel model);
    /**
     * Выбор языка
     * @throws ViewException
     */
    public void selectLanguage() throws ViewException;
    /**
     * Обновление контроллера
     * @param Request
     */
    public void update(String Request);
    /**
     * Запуск контроллера
     */
    public void run();
}
