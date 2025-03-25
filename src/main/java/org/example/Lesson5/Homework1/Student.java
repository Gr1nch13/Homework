package org.example.Lesson5.Homework1;

import java.util.ArrayList;

public class Student {
    int age;
    String name;
    ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        this.grades = new ArrayList<>();
    }
    public void addGrade(int book) {

        grades.add(book);
    }

    public double getAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum/grades.size();
    }

    public String getName() {
        return name;
    }
}
