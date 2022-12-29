/*
*   Method Decomposed code of Game recommendations according to user's age and favorite genre
*
* Task:
* 1. Ask user his age and favorite genre.
* 2. Recommend one game using the information, which the user typed
* Pseudocode:
* 1.Main block:
*   1.1. Run input block
*   1.2. Run output block
*   1.3. Ask user if he wants to repeat
*   1.4. If yes, go to (1.1), else end the code
* 2.Input block
*   2.1. Ask user his age
*   2.2. Ask user about his favorite game genre
* 3.Output block
*   3.1. Print user's age
*   3.2. Print user's favorite genre
*   3.3. Print the name of the recommended game according to user's input info
*
* */
import java.util.Scanner;

public class Main
{
    public static String getUserInput(String prompt)
    {
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine().trim().toLowerCase();
    }
    public static void printGame(int age, String genre)
    {
        switch (genre) {
            case ("roguelike") -> {
                if (age <= 6) {
                    System.out.println("Try playing (Soul Knight)");
                } else if (age > 6 && age < 18) {
                    System.out.println("Try playing (Crypt of the Necrodancer)");
                } else {
                    System.out.println("Try playing (The binding of Isaac)");
                }
            }
            case ("rpg") -> {
                if (age <= 6) {
                    System.out.println("Try playing (Legend of Zelda: Link's awakening)");
                } else if (age > 6 && age < 18) {
                    System.out.println("Try playing (Fallout 4)");
                } else {
                    System.out.println("Try playing (The Elder Scrolls V: Skyrim)");
                }
            }
            case ("adventure") -> {
                if (age <= 6) {
                    System.out.println("Try playing (New Super Mario Bros. Deluxe)");
                } else if (age > 6 && age < 18) {
                    System.out.println("Portal 2");
                } else {
                    System.out.println("Assasin's Creed Rogue");
                }
            }
            case ("horror") -> {
                if (age <= 6) {
                    System.out.println("Sorry, you are too young for this category");
                } else if (age > 6 && age < 18) {
                    System.out.println("Try playing (Five Nights at Freddy's)");
                } else {
                    System.out.println("Try playing (Until Dawn)");
                }
            }
            case ("shooter") -> {
                if (age <= 6) {
                    System.out.println("Try playing (Pixel Gun 3D)");
                } else if (age > 6 && age < 18) {
                    System.out.println("Try playing (Overwatch 2)");
                } else {
                    System.out.println("Try playing (Call of Duty: Black Ops 3)");
                }
            }
            default -> System.out.println("Sorry, we don't have this genre");
        }
    }
    public static boolean isContinue()
    {
        String userInput = getUserInput("Do you want to continue? (Y/N)\n");
        return userInput.equalsIgnoreCase("Y");
    }
   public static void main(String[] args)
   {
       System.out.println("Welcome to the GameStop! To know what game is it better for you to play,\nwe need to get some info about you.");
       do {
           int age;
           String genre;
           Scanner keyAge = new Scanner(System.in);
           Scanner keyGenre = new Scanner(System.in);
           System.out.println("Type your age here: (int)");
           age = keyAge.nextInt();
           System.out.println("What is your favorite game genre? (String)");
           genre = keyGenre.nextLine();
           printGame(age, genre);
       }
       while(isContinue());
   }
}