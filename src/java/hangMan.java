import java.util.Scanner;

public class hangMan {

    static Scanner scan = new Scanner(System.in);
    static String[] words = {"Bob", "Vectrex", "Luke", "Iron", "Rhododendron", "Stearman", "Eagle", "Taco", "Pizza", "Capacitor", "Scion", "Blaze", "Galaga", "Boeing", "Konami"};
    static String userInput = "";
    static int wordUse = 0;
    static int tries = 0;


    static void setInput()
    {
        System.out.println("\n Guess a letter: ");
        userInput = scan.nextLine();
    }

    static String getInput()
    {
        return userInput;
    }

    static void playGame()
    {
        wordUse = (int)(Math.random() * (15 - 1) - 1);
        boolean done = false;
        while(!done)
        {
            System.out.println("H A N G M A N \n" + "\n" + "+----------+ \n" + "           | \n" + "           | \n" + "           | \n" + "            === \n" + "     Missed letters: \n");
            for (int i = 0; i < words[wordUse].length(); i++)
            {
                System.out.print("_ ");
            }

            setInput();

        }
    }

    public static void main(String[] args)
    {
        playGame();
    }
}

