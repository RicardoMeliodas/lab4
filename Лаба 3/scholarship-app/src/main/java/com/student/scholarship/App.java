package com.student.scholarship;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new BudgetStudent("Герман И. П.", new SessionResult(7.5, true)));
        students.add(new BudgetStudent("Николай П. П.", new SessionResult(6.8, true)));
        students.add(new BudgetStudent("Сидоров С. С.", new SessionResult(7.2, true)));
        students.add(new BudgetStudent("Кузнецов А. В.", new SessionResult(6.5, true)));
        students.add(new BudgetStudent("Попов Д. М.", new SessionResult(7.9, true)));
        students.add(new BudgetStudent("Васильев В. А.", new SessionResult(7.0, true)));
        students.add(new BudgetStudent("Соколов Е. С.", new SessionResult(6.9, true)));
        students.add(new BudgetStudent("Михайлов Н. А.", new SessionResult(7.4, true)));
        students.add(new BudgetStudent("Владимир В. П.", new SessionResult(7.1, true)));
        students.add(new BudgetStudent("Федоров И. С.", new SessionResult(7.7, true)));

        students.add(new BudgetStudent("Смирнов А. А.", new SessionResult(4.5, true)));
        students.add(new BudgetStudent("Волков О. Л.", new SessionResult(9.2, true)));
        students.add(new BudgetStudent("Морозов В. Г.", new SessionResult(7.5, false)));
        
        students.add(new PaidStudent("Павлов Р. Т.", new SessionResult(8.5, true)));
        students.add(new PaidStudent("Козлов М. С.", new SessionResult(6.0, true)));

        System.out.println("=== СПИСОК СТУДЕНТОВ, ОБУЧАЮЩИХСЯ НА ПЛАТНОЙ ОСНОВЕ ===");
        for (Student student : students) {
            if (student.isPaidForm()) {
                System.out.println("- " + student.getName() + " (Средний балл: " + student.getSessionResult().getAverageGrade() + ")");
            }
        }

        System.out.println("\n=== РАСЧЕТ СРЕДНЕГО БАЛЛА ПО ВСЕМ СТУДЕНТАМ ===");
        double totalGradeSum = 0;
        for (Student student : students) {
            totalGradeSum += student.getSessionResult().getAverageGrade();
        }
        double averageTotalGrade = totalGradeSum / students.size();
        System.out.printf("Средний балл по итогам сессии среди всех %d студентов: %.2f\n", students.size(), averageTotalGrade);

        System.out.println("\n=== ДЕМОНСТРАЦИЯ РАСЧЕТА СТИПЕНДИЙ ДЛЯ ВСЕХ ===");
        for (Student student : students) {
            System.out.println(student.getName() + " -> " + student.calculateScholarship());
        }
    }
}