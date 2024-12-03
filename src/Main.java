import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int number = (int) (Math.random() * 100);
        int guess;

        System.out.println("Guess a number between 1 and 100");
        guess = keyboard.nextInt();

        while (number != guess) {
            if(guess > number) {
                System.out.println("Too High! Guess Again");
            }
            else {
                System.out.println("Too Low! Guess Again");
            }

            guess = keyboard.nextInt();
        }

        System.out.println("You Got It!");
    }
}