import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        int min = 0;
        int max = 101;
        int yourRandomNumber = (int) (Math.random() * max);
        int answer;
        System.out.println("Choose a number from 1 to 100.");
        do {
            System.out.println("I think it is: " + yourRandomNumber);
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter 1 - if your number is bigger, 2 - if smaller, 0 - if i guessed: ");
            answer = reader.nextInt();

            if (answer == 0) {
                System.out.println("I guessed!");

            } else if (answer == 1) {
                min = yourRandomNumber + 1;
                yourRandomNumber = (int) (Math.random() * (max - min) + min);

            } else if (answer == 2) {
                max = yourRandomNumber;
                yourRandomNumber = (int) (Math.random() * (max - min) + min);

            } else break;
        } while (answer != 0);
    }
}
