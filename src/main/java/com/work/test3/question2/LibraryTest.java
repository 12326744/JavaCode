package com.work.test3.question2;

public class LibraryTest {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("ISBN123", "Java Basics", true));
        library.addBook(new Book("ISBN456", "Data Structures", false));

        try {
            library.borrowBook("ISBN123");
            System.out.println("Total Books: " + library.getTotalBooksCount());

            library.borrowBook("ISBN456");
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        try {
            library.borrowBook("ISBN999");
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
