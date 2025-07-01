import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("Pick an option:");
            System.out.println("1  Add writer");
            System.out.println("8  Exit");

            while (!input.hasNextInt()) {
                System.out.println("Please type a number:");
                input.next();
            }

            option = input.nextInt();

        } while (option != 8);
    }
}
