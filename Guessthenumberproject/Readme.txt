# 🎯 Guess the Number Game

## 📌 About the Game
This is a simple number-guessing game where the machine picks a secret number from a predefined set, and the player has to guess it within a limited number of attempts.

## 💡 How to Play
1. The program generates a random number between 1 and 10.
2. You will be prompted to enter your guess.
3. You have up to **3 attempts** to guess the correct number.
4. If you guess correctly within the allowed attempts, you win! 🎉
5. If you exceed the attempt limit, you lose. ❌

## ⚙️ Requirements
- Java Development Kit (JDK) installed
- Any Java-supported IDE or terminal

## ▶️ Running the Game
1. Save the file as `Guess.java`.
2. Open a terminal or command prompt in the same directory.
3. Compile the program using:
   ```sh
   javac Guess.java
   ```
4. Run the program using:
   ```sh
   java Guess
   ```

## 🛠️ Issues & Fixes
🚨 **Potential Logical Issue**: The game allows only **3 attempts**, but the `life` variable starts at `1`, which might not align with typical game expectations where attempts decrease from a maximum number.

✅ **Suggested Fix**: Instead of increasing `life`, start with `life = 3` and decrement it after each incorrect guess:
```java
int life = 3;
while (guess_number != secret_number && life > 0) {
    life--;
    if (life == 0) {
        break;
    }
    System.out.print("Try again: ");
    guess_number = sc.nextInt();
}
```
This ensures the game gives exactly **3 chances** before displaying a loss message.

## ✉️ Feedback
If you enjoyed the game or have suggestions, feel free to contribute or raise an issue!
Happy coding! 😊

