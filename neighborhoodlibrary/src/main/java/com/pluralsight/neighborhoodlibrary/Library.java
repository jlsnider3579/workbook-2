package com.pluralsight.neighborhoodlibrary;

import java.util.Scanner;

public class Library {
    private static Book[] books = new Book[20];

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);


        // Adding 20 books with id, isbn, title, and checkedOut status
        books[0] = new Book(1, "978-0439139601", "Harry Potter and the Goblet of Fire");
        books[1] = new Book(2, "978-0451524935", "1984");
        books[2] = new Book(3, "978-0743273565", "The Great Gatsby");
        books[3] = new Book(4, "978-0316769488", "The Catcher in the Rye");
        books[4] = new Book(5, "978-1503280786", "Moby-Dick");
        books[5] = new Book(6, "978-0061120084", "To Kill a Mockingbird");
        books[6] = new Book(7, "978-0307277671", "The Road");
        books[7] = new Book(8, "978-0525555379", "Where the Crawdads Sing");
        books[8] = new Book(9, "978-1501173219", "The Nightingale");
        books[9] = new Book(10, "978-1982134488", "The Silent Patient");
        books[10] = new Book(11, "978-0385484513", "The Alchemist");
        books[11] = new Book(12, "978-0385751537", "The Book Thief");
        books[12] = new Book(13, "978-0143127741", "Educated");
        books[13] = new Book(14, "978-0590353427", "Harry Potter and the Sorcerer's Stone");
        books[14] = new Book(15, "978-0439136358", "Harry Potter and the Prisoner of Azkaban");
        books[15] = new Book(16, "978-0316029186", "The Lost Symbol");
        books[16] = new Book(17, "978-0307387899", "The Brief Wondrous Life of Oscar Wao");
        books[17] = new Book(18, "978-0743272451", "Of Mice and Men");
        books[18] = new Book(19, "978-0553382563", "The Road Less Traveled");
        books[19] = new Book(20, "978-0446310789", "To Kill a Mockingbird");

        System.out.println("Welcome!");

        String prompt = ("""
                
                What can I do for you?
                
                Chose (1) to view available books?
                
                Chose (2) to view checked out books?
                
                Chose (3) to exit
                
                """);

        boolean mainLoop = true;
        while (mainLoop) {
            System.out.println(prompt);
            int choice = myScanner.nextInt();
            myScanner.nextLine();

            switch (choice) {
                case 1:
                    avBooks();
                    break;
                case 2:
                    checkedOutBooks();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    mainLoop = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");


            }


        }
    }

    private static void checkedOutBooks() {
        System.out.println("Checked Out Books:");
        for (Book book : books) {
            if (book.isCheckedOut()) {
                System.out.println(book);
            }
        }
    }
    private static void avBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (!book.isCheckedOut()) {
                System.out.println(book);
            }
        }
    }
}

        