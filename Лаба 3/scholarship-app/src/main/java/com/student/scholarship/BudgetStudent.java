package com.student.scholarship;

/**
 * Класс, представляющий студента бюджетной формы обучения.
 */
public class BudgetStudent extends Student {

    /**
     * Конструктор для создания студента-бюджетника.
     *
     * @param name          ФИО студента
     * @param sessionResult результаты сессии
     */
    public BudgetStudent(String name, SessionResult sessionResult) {
        super(name, sessionResult);
    }

    /**
     * Рассчитывает стипендию на основе критериев успеваемости и сроков сдачи сессии.
     *
     * @return строка с описанием размера стипендии
     */
    @Override
    public String calculateScholarship() {
        SessionResult result = getSessionResult();
        
        // Только студенты, сдавшие сессию в срок, получают стипендию
        if (!result.isPassedOnTime()) {
            return "Не получает (сессия сдана не в срок)";
        }

        double grade = result.getAverageGrade();

        if (grade < 5.0) {
            return "Не получает (средний балл меньше 5)";
        } else if (grade >= 6.0 && grade < 7.0) {
            return "Минимальная стипендия";
        } else if (grade >= 6.0 && grade < 8.0) { 
            // Реализация условия "от 6 до 8" согласно заданию варианта
            return "Увеличенная на 25%";
        } else if (grade >= 8.0 && grade <= 10.0) {
            return "Увеличенная на 50%";
        } else {
            return "Не получает (не попадает в стандартные критерии)";
        }
    }

    @Override
    public boolean isPaidForm() {
        return false;
    }
}