package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {

        // Викликаємо статичний метод Calculate з класу Exercise
        // для отримання кількості щасливих квитків.
        // Метод Calculate тепер не приймає параметрів.
        int numberOfHappyTickets = Exercise.Calculate();

        // Коригуємо рядок виводу відповідно до специфіки завдання "Щасливі квитки".
        System.out.println("--- Результат виконання практичної роботи ---");
        System.out.println("Завдання: Підрахувати кількість щасливих трамвайних квитків.");
        System.out.println("Діапазон номерів квитків: від 000000 до 999999.");
        System.out.println(); // Пустий рядок для кращого форматування

        System.out.println("Загальна кількість щасливих квитків: " + numberOfHappyTickets);

        // Додатково можна вказати очікуване значення для самоперевірки
        // System.out.println("(Очікуване значення: 55252)");
        System.out.println("---------------------------------------------");
    }
}