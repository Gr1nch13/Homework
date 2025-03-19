package org.example.Homework3;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        // Инициализируем студентов с именами и оценками
        students[0] = new Student("Sanya", new int[]{3, 3, 5, 5, 5});
        students[1]  = new Student("Artem", new int[]{3, 3, 4, 5, 5});
        students[2]  = new Student("Slava", new int[]{5, 5, 5, 5, 5});

        Student best = students[0];
        for (Student student : students) {
            if (student.calculateAverage() > best.calculateAverage()) {
                best = student;
            }
        }

        System.out.println("Лучший студент: " + best.name() + " со средним баллом: " + best.calculateAverage());
        // А ЗДЕСЬ ДОЛЖНО БЫТЬ ОБЪЯВЛЕНИЕ МАССИВА КОТОРРЫЙ И СОДЕРЖИТ НАШИХ СТУДЕНТОВ
//        System.out.println(sanya.name);
//        for(int i : sanya.grades) {
//            System.out.print(i + ", ");
//        }
    }
}
