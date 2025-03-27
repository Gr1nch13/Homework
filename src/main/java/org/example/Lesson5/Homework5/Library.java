package org.example.Lesson5.Homework5;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    HashMap <String, Book>books = new HashMap<>();

    public Library(){
        this.books = books;
    }

    public void addBook(String isbn, Book book) {
        if (books.containsKey(isbn)) {
            System.out.println("В библиотеке уже содержится книга с ISBN: " + isbn);
        }else {
            books.put(isbn, book);
        }
    }

    public void removeBook(String isbn) {
        if (books.containsKey(isbn)) {
            books.remove(isbn);
        }else {
            System.out.println("Книги с ISBN: " + isbn + " не существует в библиотеке");
        }
    }

    public ArrayList <Book> findBooksByAuthor(String author) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.author.equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

}
