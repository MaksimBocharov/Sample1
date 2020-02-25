public class Exercise2 {

    public static void main(String[] args) {
        int dice1;
        int dice2;
        int dice3;
        int trying = 0;
        do {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            dice3 = (int) (Math.random() * 6) + 1;
            System.out.println("The first dice comes up " + dice1);
            System.out.println("The second dice comes up " + dice2);
            System.out.println("The third dice comes up " + dice3);
            trying++;
            System.out.println("Your total attempts is " + trying);
            System.out.println("--------------------");
        } while (dice1 != dice2 || dice2 != dice3);
    }
}
