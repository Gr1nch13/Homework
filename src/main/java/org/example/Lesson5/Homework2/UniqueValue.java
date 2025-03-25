package org.example.Lesson5.Homework2;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueValue extends ContainsDigits{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> uniqueValue = new HashSet<>();
        System.out.println("Введите строку:");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            uniqueValue.add(input);
        }
        System.out.println("Уникальных строк: " + uniqueValue.size());

        System.out.println("Строки у которых больше 5 символов содержащие цифры: ");
        for (String str : uniqueValue){
            if (str.length()>5 && containsDigits(str)){
                System.out.println(str);
            }
        }
    }
}
