import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        ArrayList<Writer> writers = new ArrayList<>();

        do {
            System.out.println("Pick an option:");
            System.out.println("1  Add writer");
            System.out.println("2  Delete writer");
            System.out.println("3  Add news report to writer");
            System.out.println("8  Exit");

            while (!input.hasNextInt()) {
                System.out.println("Please type a number:");
                input.next();
            }

            option = input.nextInt();

            switch (option) {
                case 1:
                    Writer.createWriter();
                    break;
                case 2:
                    Writer.deleteWriter();
                    break;
                case 3:
                    System.out.println("Select news report type: " +
                            "1  Football" +
                            "2  Basketball" +
                            "3  Tennis" +
                            "4  F1" +
                            "5  Motorcycle racing");

                    while (!input.hasNextInt()) {
                        System.out.println("Please type a number:");
                        input.next();
                    }

                    int newsType = input.nextInt();

                    switch (newsType) {
                        case 1:
                            NewsReport report1 = FootballNewsReport.createNewsReport();
                            break;
                        case 2:
                            NewsReport report2 = BasketballNewsReport.createNewsReport();
                            break;
                        case 3:
                            NewsReport report3 = TennisNewsReport.createNewsReport();
                            break;
                        case 4:
                            NewsReport report4 = F1NewsReport.createNewsReport();
                            break;
                        case 5:
                            NewsReport report5 = MotorcycleRacingNewsReport.createNewsReport();
                            break;
                        default:
                            System.out.println("Invalid number");
            }

                    System.out.println("Enter writer's DNI: ");
                    String dni = input.nextLine();
                    f

        } while (option != 8);
    }
}
