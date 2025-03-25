package org.example.Lesson4.Homework2;

import java.util.ArrayList;

public class Library {

    ArrayList<String> books = new ArrayList<>();
    public void addBook(String book) {
        books.add(book);
    }
    public void removeBook(String book) {
        books.remove(book);
    }

    public void displayBooks() {
        System.out.println("Доступные книги:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }
}