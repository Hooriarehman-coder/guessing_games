public class Main {
    public static void main(String[] args) {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        GameLogic game = new GameLogic();

        int randomNumber = rng.generateNumber();
        
        game.checkGuess(randomNumber);
   
    
}
}

    
