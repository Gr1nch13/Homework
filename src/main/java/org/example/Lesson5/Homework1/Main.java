package org.example.Lesson5.Homework1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student artem = new Student("Artem", 27);
        Student alexandr = new Student("Alexandr", 26);
        Student maxim = new Student("Maxim", 30);

        artem.addGrade(5);
        artem.addGrade(5);
        artem.addGrade(5);

        alexandr.addGrade(4);
        alexandr.addGrade(5);
        alexandr.addGrade(3);

        maxim.addGrade(4);
        maxim.addGrade(4);
        maxim.addGrade(4);

        students.add(artem);
        students.add(alexandr);
        students.add(maxim);

        for (Student student : students){
            System.out.println(student.getName() + " : " + student.getAverageGrade());
        }
    }
}
