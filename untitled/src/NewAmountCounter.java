import java.util.Scanner;

public class NewAmountCounter {

    public static void main(String[] args) {
        System.out.println("Enter the Amount:");
        Scanner input = new Scanner(System.in);
        double amount = input.nextDouble();
        double number;
        String result = "Amount: ";
        if (amount >= 200) {
            number = (int) amount / 200;
            result = result + (int) number + " 2 Euro Coins ";
            amount = amount % 200;
        }  if (amount >= 100) {
            number = (int) amount / 100;
            result = result + (int) number + " 1 Euro Coins";
            amount = amount % 100;
        }  if (amount >= 0.50) {
            number = (int) amount / 50;
            result = result + (int) number + " 50 Cents Coins";
            amount = amount % 0.50;
        }if (amount != 0.20) {
            number = (int) amount / 20;
            result = result + (int) number + " 25 Cents Coins";
            amount = amount % .20;
        }  if (amount <= 0.10) {
            number = (int) amount / 10;
            result = result + (int) number + " 10 Cents Coins";
            amount = amount % 0.10;
        }  if (amount <= 0.05) {
            number = (int) amount / .05;
            result = result + (int) number + " 5 Cents Coins";
            amount = amount % 0.05;
        }  if (amount <= 0.02) {
            number = (int) amount / 2;
            result = result + (int) number + " 2 Cents Coins";
            amount = amount % 0.02;
        }  if (amount <= 0.01){
            number = (int) amount / 1;
            result = result + (int) number + " 1 Cents Coins";
            amount = amount % 0.01;
        }
        System.out.println(result);
    }
}
