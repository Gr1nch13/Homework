package org.example.Lesson4.Homework2;

public class Main {
    public static void main(String[] args) {
        Library book = new Library();
        book.addBook("Тестирование программного обеспечения. Базовый курс");
        book.addBook("tестирование dot com");
        book.displayBooks();
        book.removeBook("tестирование dot com");
        book.displayBooks();
    }
}
