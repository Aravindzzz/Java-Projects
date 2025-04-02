import java.util.*;

public class Guess {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Random rand = new Random();
        int machine_guess = rand.nextInt(arr.length);
        int secret_number = arr[machine_guess];

        System.out.println("Welcome to our Guess the Number Game !!!");
        int life = 15;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int guess_number = sc.nextInt();
        while (guess_number != secret_number) {
            if (life >= 3) {
                break;
            } else {
                System.out.print("Try again: ");
                life++;
                guess_number = sc.nextInt();
            }

        }
        if (life >= 3) {
            System.out.println("you have lost");
        } else {

            System.out.println("You have won ;)");
        }
    }

}
