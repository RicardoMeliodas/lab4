package com.student.scholarship;

/**
 * Класс, представляющий студента платной формы обучения.
 */
public class PaidStudent extends Student {

    /**
     * Конструктор для создания студента-платника.
     *
     * @param name          ФИО студента
     * @param sessionResult результаты сессии
     */
    public PaidStudent(String name, SessionResult sessionResult) {
        super(name, sessionResult);
    }

    /**
     * Студенты платной формы обучения не получают стипендию.
     *
     * @return строка с уведомлением об отсутствии стипендии
     */
    @Override
    public String calculateScholarship() {
        return "Не получает (платная форма обучения)";
    }

    @Override
    public boolean isPaidForm() {
        return true;
    }
}
