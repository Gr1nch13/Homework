package org.example.Lesson4.Homework3;

public class Student {

    String name;
    int[] grades;

    Student(String name, int[] grades){
        this.grades = grades;
        this.name = name;
    }
    public double calculateAverage(){
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }
    public String name() {
        return name;
    }
}
