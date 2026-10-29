package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    public static void main(String[] args) {
        Book theMaid = new Book(51800, "978-0-593-35617-3", "The Maid");
        Book theGuestList = new Book(51699, "978-0-06-286894-7", "The Guest List");
        Book theSilentPatient = new Book(51799, "978-1-250-30170-3", "The Silent Patient");
        Book dontLetThemIn = new Book(52999, "978-1-6680-3387-6", "Don't Let Them In");
        Book theOnlyOneLeft = new Book(51801, "978-0-593-18324-3", "The Only One Left");
        Book theHunter = new Book(51900, "978-0-593-49345-8", "The Hunter");
        Book aFlickerInTheDark = new Book(51792, "978-1-250-80374-9", "A Flicker in the Dark");
        Book onlyIfYoureLucky = new Book(51920, "978-1-250-88795-5", "Only If You're Lucky");
        Book whatHaveYouDone = new Book(5300, "978-0-593-48996-3", "What Have You Done");
        Book daughterOfMine = new Book(52899, "978-1-6680-1044-0", "Daughter of Mine");
        Book youLikeItDarker = new Book(5301, "978-1-6680-3771-3", "You Like It Darker");
        Book theOrphanageByTheLake = new Book(51795, "978-1-4642-4636-4", "The Orphanage By the Lake");
        Book patientTwelve = new Book(9000, "978-1-78799-821-6", "Patient Twelve");
        Book petiteAnglaise = new Book(52493, "978-0-385-52280-9", "Petite Anglaise");
        Book safeEnough = new Book(52893, "978-1-61316-566-9", "Safe Enough");
        Book sisters = new Book(50892, "978-0-545-74951-0", "Sisters");
        Book diaryOfAWimpyKid = new Book(51295, "978-0-810-99313-6", "Diary of a Wimpy Kid");
        Book theWeddingPlannersDaughter = new Book(50399, "978-1-416-91854-7", "The Wedding Planner's Daughter");
        Book kidnapped = new Book(50499, "978-0-4398-4777-3", "Kidnapped");
        Book numberTheStars = new Book(22753, "978-0-4402-2753-3", "Number the Stars");
        Book theHungerGames = new Book(50899, "978-0-439-02352-8", "The Hunger Games");
        Book ofMiceAndMen = new Book(51100, "978-0-14-017739-8", "Of Mice and Men");
        Book andThenThereWereNone = new Book(51395, "978-312-33087-3", "And Then There Were None");

        Book[] books = {theMaid, theGuestList, theSilentPatient, dontLetThemIn, theOnlyOneLeft, theHunter, aFlickerInTheDark, onlyIfYoureLucky, whatHaveYouDone, daughterOfMine, youLikeItDarker, theOrphanageByTheLake, patientTwelve, petiteAnglaise, safeEnough, sisters, diaryOfAWimpyKid, theWeddingPlannersDaughter, kidnapped, numberTheStars, theHungerGames, ofMiceAndMen, andThenThereWereNone};
        Scanner scanner = new Scanner(System.in);


        boolean running = true;
        while (running) {
            System.out.println("Welcome to Java Library! What would you like to do?");
            System.out.println("Please choose from the following options:\n\t[1] Browse available books\n\t[2] Show checked out books\n\t[3] Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    listAvailableBooks(books, scanner);
                }
                case 2 -> {
                    listCheckedOutBooks(books, scanner);
                }
                case 3 -> {
                    System.out.println("See you next time!");
                    running = false;
                }
                default -> System.out.println("Invalid Choice! Please enter 1, 2, or 3.\n");
            }
        }


    }

    public static void listAvailableBooks(Book[] books, Scanner scanner) {
        System.out.println("Available books:\n");
        for (int i = 0; i < books.length; i++) {
            if (books[i].isCheckedOut() == false) {
                System.out.println(books[i].getTitle() + "\n\tID :" + books[i].getId() + "\n\tISBN" + books[i].getIsbn());
            }
        }
        System.out.println("Would you like to check one out? Please enter (Y/N).");
        boolean validChoice = false;

        while (!validChoice) {
            String answer = scanner.nextLine().trim();

            if (answer.equalsIgnoreCase("Y")) {
                validChoice = true;

                System.out.println("Please enter your name.");
                String name = scanner.nextLine().trim();

                boolean found = false;
                while (found == false) {
                    System.out.println("Please enter the title of the book you'd like to check out.");
                    String bookTitle = scanner.nextLine().trim();

                    boolean titleExists = false;

                    for (int i = 0; i < books.length; i++) {
                        if (bookTitle.equalsIgnoreCase(books[i].getTitle())) {
                            titleExists = true;
                            if (books[i].isCheckedOut) {
                                System.out.println("Sorry, that book is currently checked out to " + books[i].checkedOutTo + ". Please choose another book or try again later.\n");
                            } else {
                                String borrowedBook = books[i].getTitle();
                                books[i].checkOut(name);
                                System.out.println("You have checked out " + borrowedBook + ". Have a good day!\n");
                                found = true;
                            }
                            break;
                        }
                    }
                    if (titleExists == false) {
                        System.out.println("Sorry, I couldn't find that title! Please enter a title from our available books.\n");
                    }
                }
            } else if (answer.equalsIgnoreCase("N")) {
                validChoice = true;
                System.out.println("Thank you for browsing, we hope to see you again soon!\n");
            } else {
                System.out.println("Please enter Y or N.\n");
            }
        }
    }

    public static void listCheckedOutBooks(Book[] books, Scanner scanner) {
        boolean anyCheckedOut = false;

        for (Book book : books) {
            if (book.isCheckedOut()) {
                if (anyCheckedOut == false) {
                    System.out.println("Here are the books that are currently checked out:\n");
                    anyCheckedOut = true;
                }
                System.out.println(book.getTitle() + " is checked out to " + book.getCheckedOutTo());
            }
        }
        if (anyCheckedOut == false){
            System.out.println("All titles are available at this time. Why not check one out?\n");
            return;
        }
        System.out.println("Press C to check a book in or X to go back.");
        String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("C")) {
                boolean match = false;

                while (match == false) {
                    System.out.println("Please enter the ID of the book you're checking in.");
                    int checkingIn = scanner.nextInt();
                    for (int i = 0; i < books.length; i++) {
                        if (books[i].getId() == checkingIn && books[i].isCheckedOut()) {
                            match = true;
                            books[i].isCheckedOut = false;
                            books[i].checkedOutTo = " ";
                            System.out.println("Thank you, have a great day!\n");
                            break;
                        }
                    }
                    if (match == false){
                        System.out.println("Invalid ID number, please try again.\n");
                    }
                }
            }
            else if (input.equalsIgnoreCase("X")) {
                System.out.println("Returning home...\n");
            }
            else {
                System.out.println("Please enter C or X\n");
            }
    }
}

