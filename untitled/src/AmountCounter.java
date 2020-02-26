import java.util.Scanner;

public class AmountCounter {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int amount;
        System.out.println("Please enter amount: ");

        amount = keyboard.nextInt();
        int twoEuro = amount / 2;
        int oneEuro = amount / 1;
        int fiftyCents = (int) (amount / 0.50);
        int twentyCents = (int) (amount / 0.20);
        int tenCents = (int) (amount / 0.10);
        int fiveCents = (int) (amount / 0.05);
        int twoCents = (int) (amount / 0.02);
        int oneCents = (int) (amount / 0.01);


        System.out.println(twoEuro + " = 2 Euro coins");
        System.out.println(oneEuro + " = 1 Euro coins");
        System.out.println(fiftyCents + " = 0.50 cent coins");
        System.out.println(twentyCents + " = 0.20 cent coins");
        System.out.println(tenCents + " = 0.10 cent coins");
        System.out.println(fiveCents + " = 0.05 cent coins");
        System.out.println(twoCents + " = 0.02 cent coins");
        System.out.println(oneCents + " = 0.01 cent coins");
        keyboard.close();
    }
}
