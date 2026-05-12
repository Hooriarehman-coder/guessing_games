# Number Guessing Game

This is a simple Java number guessing game.

## Files

- `Main.java` — application entry point
- `RandomNumberGenerator.java` — generates a random number from 1 to 20
- `GuessHandler.java` — reads user guesses from the console
- `GameLogic.java` — compares guesses to the random number and prints feedback

## How to compile

Open a terminal in the `java` folder and run:

```bash
javac Main.java RandomNumberGenerator.java GuessHandler.java GameLogic.java
```

## How to run

```bash
java Main
```

## How it works

1. The program generates a random number between 1 and 20.
2. It prompts the user to enter guesses.
3. It tells the user if the guess is too high, too low, or correct.
4. The game ends when the correct number is guessed.

## Notes

- Use `Ctrl+C` to exit if you want to stop before guessing correctly.
- This project follows Java naming conventions with PascalCase class names and camelCase methods.