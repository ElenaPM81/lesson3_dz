package ru.gb.lesson3;

public class Payroll {
    public static void main(String[] args) {

        Employee[] employees = {
                new Freelancer("Егор", "дизайнер",23, 500),
                new Freelancer("Виктор", "разработчик",34, 550),
                new Freelancer("Николай", "тестировщик",26, 450),
                new Worker("Сергей", " руководитель отдела",33, 3000, 24),
                new Worker("Иван","бухгалтер", 27, 1750, 26),
                new Worker("Кирилл","менеджер", 42, 2500, 24)};

        for (Employee employee : employees) {
            System.out.println( employee.getFoolHoursSalary() + employee.getFoolSalary());

        }

    }
}