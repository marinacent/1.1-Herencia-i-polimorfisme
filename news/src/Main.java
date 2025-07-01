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
            System.out.println("4 Delete news report");
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
                    NewsReport report = null;
                    System.out.println("Select news report type: " +
                            "1  Football\n" +
                            "2  Basketball\n" +
                            "3  Tennis\n" +
                            "4  F1\n" +
                            "5  Motorcycle racing");

                    while (!input.hasNextInt()) {
                        System.out.println("Please type a number:");
                        input.next();
                    }

                    int newsType = input.nextInt();

                    switch (newsType) {
                        case 1:
                            report = FootballNewsReport.createNewsReport();
                            break;
                        case 2:
                            report = BasketballNewsReport.createNewsReport();
                            break;
                        case 3:
                            report = TennisNewsReport.createNewsReport();
                            break;
                        case 4:
                            report = F1NewsReport.createNewsReport();
                            break;
                        case 5:
                            report = MotorcycleRacingNewsReport.createNewsReport();
                            break;
                        default:
                            System.out.println("Invalid number");
                    }
                    if (report != null) {
                        Writer.addNewsReport(report);
                    }
                case 4:
                    Writer.deleteNewsReport();

            }
        } while (option != 8);
    }

}
