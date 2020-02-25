import java.util.Random;

public class Exercise1 {

    public static void main(String[] args) {

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(6);
        int randomNumber2 = randomGenerator.nextInt(6);
        int randomNumber3 = randomGenerator.nextInt(6);

        System.out.println(randomNumber);
        System.out.println(randomNumber2);
        System.out.println(randomNumber3);
        System.out.println("Three Random Numbers = " + randomNumber + ";" + randomNumber2 + ";" + randomNumber3 + ";");
        }
    }
