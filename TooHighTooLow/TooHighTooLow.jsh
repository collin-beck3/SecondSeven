// a simple high low number guessing game for JShell
//
import java.util.Random;
import java.util.Scanner;

class TooHighTooLow {
    private int number;
    private int guesses;
    private static final int MAX_GUESSES = 6;

    public TooHighTooLow() {
        // setup number to be a random number from 1 to 100
        Random random = new Random();
        this.number = random.nextInt(100) + 1;
        this.guesses = 0;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

         { 
            Random random = new Random();
            this.number = random.nextInt(100) + 1;
            this.guesses += 1;
            System.out.println("Welcome to the Too High Too Low Game!");
            System.out.println("I have selected a random number between 1 and 100. Can you guess it? You have " + MAX_GUESSES + " attempts to guess the number.");
        

        while (true) {
            // Get a number guess from the user (between 1 and 100)
            System.out.print("Enter your guess (1-100): ");
             int guess = scanner.nextInt();
             System.out.println("You guessed: " + guess);
             System.out.println("Number of guesses: " + (guesses));
            // System.out.println("The number is: " + number);

             // Increment the number of guesses
             guesses++;

             // Check if the guess is correct
             if (guess == number) {
                 System.out.println("Congratulations! You've guessed the number in " + (MAX_GUESSES - guesses) + " guesses!");
                 scanner.close();
                 break;
             } else if (guess < number) {
                 System.out.println("Too low!");
             } else {
                 System.out.println("Too high!");
             }

             // Check if the player has made too many guesses
             if (guesses > MAX_GUESSES) {
                 System.out.println("Sorry, you've run out of guesses. The number was: " + number);
                 scanner.close();
                 break;
             }

            System.out.println(); // Print a blank line for better readability
        }
    }
}


    public static void main(String[] args) {
        TooHighTooLow game = new TooHighTooLow();
        game.play();
    }
}

// Run the game
//TooHighTooLow.main(null);
