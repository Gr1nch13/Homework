package org.example.Homework1;

public class Student {
    String name;
    int numArray = 5;
    int[] grades = new int[numArray];
    public void printInfo(){
        System.out.println("Имя: " + this.name);
        System.out.print("Оценки: ");
        for(int i : this.grades) {
            System.out.print(i + ", ");
        }
    }

}
