import java.util.Scanner;

public class GuessHandler {
    int getGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number from (1-20): ");
        int guess = scanner.nextInt();
        scanner.close();
        return guess;
    }
}
}
 
