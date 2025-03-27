package org.example.Lesson5.Homework5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Тестирование программного обеспечения. Базовый курс", "Игнатьев", 1869);
        Book book2 = new Book("Тестирование Дот Ком", "Роман Савин", 2007);

        library.addBook("978-5-507-45425-9", book1);
        library.addBook("978-5-4485-4551-1", book2);

        library.addBook("978-5-507-45425-9", new Book("Тестирование", "ISTQB", 2005));

        ArrayList<Book> tolstoyBooks = library.findBooksByAuthor("Игнатьев");
        for (Book book : tolstoyBooks) {
            System.out.println(book.title);
        }

        library.removeBook("978-5-507-45425-0");
        library.removeBook("978-5-507-45425-9");
    }
}
