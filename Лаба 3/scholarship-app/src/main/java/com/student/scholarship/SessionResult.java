package com.student.scholarship;

/**
 * Класс, представляющий результаты экзаменационной сессии студента.
 * Демонстрирует использование композиции.
 */
public class SessionResult {
    private double averageGrade;
    private boolean passedOnTime;

    /**
     * Конструктор для создания результатов сессии.
     *
     * @param averageGrade средний балл студента
     * @param passedOnTime сдана ли сессия в установленный срок
     */
    public SessionResult(double averageGrade, boolean passedOnTime) {
        this.averageGrade = averageGrade;
        this.passedOnTime = passedOnTime;
    }

    /**
     * Возвращает средний балл студента.
     *
     * @return средний балл
     */
    public double getAverageGrade() {
        return averageGrade;
    }

    /**
     * Проверяет, была ли сессия сдана в срок.
     *
     * @return true, если сдана в срок, иначе false
     */
    public boolean isPassedOnTime() {
        return passedOnTime;
    }
}
