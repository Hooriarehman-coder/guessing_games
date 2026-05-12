import java.util.Scanner;

public class GameLogic {
    void checkGuess(int targetNumber) {
        System.out.println("Random number: " + targetNumber);
        Scanner scanner = new Scanner(System.in);
     
       
        while (true) {
            System.out.println("Enter your guess:");
            int guess = scanner.nextInt();
            
            if (guess == targetNumber) {
                System.out.println("Correct guess!");
                break;
            } else if (guess > targetNumber) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }
        }
        scanner.close();
    }
} 

