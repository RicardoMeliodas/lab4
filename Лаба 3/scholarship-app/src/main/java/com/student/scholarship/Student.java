package com.student.scholarship;

/**
 * Абстрактный класс, представляющий сущность студента.
 * Является суперклассом для различных форм обучения.
 */
public abstract class Student {
    private String name;
    private SessionResult sessionResult;

    /**
     * Конструктор для инициализации базовых полей студента.
     *
     * @param name          ФИО студента
     * @param sessionResult результаты сессии (композиция)
     */
    public Student(String name, SessionResult sessionResult) {
        this.name = name;
        this.sessionResult = sessionResult;
    }

    /**
     * Возвращает имя студента.
     *
     * @return ФИО студента
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает результаты сессии студента.
     *
     * @return объект результатов сессии
     */
    public SessionResult getSessionResult() {
        return sessionResult;
    }

    /**
     * Абстрактный метод для расчета размера стипендии.
     * Должен быть реализован в классах-наследниках.
     *
     * @return тип или описание стипендии в виде строки
     */
    public abstract String calculateScholarship();

    /**
     * Абстрактный метод для проверки, обучается ли студент на платной основе.
     *
     * @return true, если студент платник, иначе false
     */
    public abstract boolean isPaidForm();
}