package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    public static void main(String[] args) {
        Book theMaid = new Book(51800,"978-0-593-35617-3","The Maid",false,"");
        Book theGuestList = new Book(51699,"978-0-06-286894-7","The Guest List",false,"");
        Book theSilentPatient = new Book(51799,"978-1-250-30170-3","The Silent Patient",false,"");
        Book dontLetThemIn = new Book(52999,"978-1-6680-3387-6","Don't Let Them In", false,"");
        Book theOnlyOneLeft = new Book(51801, "978-0-593-18324-3","The Only One Left",false,"");
        Book theHunter = new Book(51900, "978-0-593-49345-8","The Hunter",false,"");
        Book aFlickerInTheDark = new Book(51792,"978-1-250-80374-9","A Flicker in the Dark",false,"");
        Book onlyIfYoureLucky = new Book(51920,"978-1-250-88795-5","Only If You're Lucky",false,"");
        Book whatHaveYouDone = new Book(5300,"978-0-593-48996-3","What Have You Done",false,"");
        Book daughterOfMine = new Book(52899,"978-1-6680-1044-0","Daughter of Mine",false,"");
        Book youLikeItDarker = new Book(5301,"978-1-6680-3771-3","You Like It Darker",false,"");
        Book theOrphanageByTheLake = new Book(51795,"978-1-4642-4636-4","The Orphanage By the Lake",false,"");
        Book patientTwelve = new Book(9000,"978-1-78799-821-6","Patient Twelve",false,"");
        Book petiteAnglaise = new Book(52493,"978-0-385-52280-9","Petite Anglaise", false,"");
        Book safeEnough = new Book(52893, "978-1-61316-566-9","Safe Enough",false,"");
        Book sisters = new Book(50892,"978-0-545-74951-0","Sisters",false,"");
        Book diaryOfAWimpyKid = new Book(51295,"978-0-810-99313-6","Diary of a Wimpy Kid",false,"");
        Book theWeddingPlannersDaughter = new Book(50399,"978-1-416-91854-7", "The Wedding Planner's Daughter",false, "");
        Book kidnapped = new Book(50499,"978-0-4398-4777-3", "Kidnapped",false,"");
        Book numberTheStars = new Book(22753,"978-0-4402-2753-3","Number the Stars",false,"");
        Book theHungerGames = new Book(50899,"978-0-439-02352-8","The Hunger Games",false,"");
        Book ofMiceAndMen = new Book(51100,"978-0-14-017739-8","Of Mice and Men",false,"");
        Book andThenThereWereNone = new Book(51395,"978-312-33087-3","And Then There Were None",false,"");

        Book[] books = {theMaid,theGuestList,theSilentPatient,dontLetThemIn,theOnlyOneLeft,theHunter,aFlickerInTheDark,onlyIfYoureLucky,whatHaveYouDone,daughterOfMine,youLikeItDarker,theOrphanageByTheLake,patientTwelve,petiteAnglaise,safeEnough,sisters,diaryOfAWimpyKid,theWeddingPlannersDaughter,kidnapped,numberTheStars,theHungerGames,ofMiceAndMen,andThenThereWereNone};
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to Java Library! What would you like to do?");
    System.out.println("Please choose from the following options:\n\t\t[1] Browse available books\n\t\t[2] Show checked out books\n\t\t[3] Exit");
    int choice = scanner.nextInt();
    scanner.nextLine();
    if (choice == 1){
        for (int i = 0; i < books.length; i++) {
            if (books[i].isCheckedOut() == false){
                System.out.println(books[i].getTitle());
            }
        }
    }
    }
}
