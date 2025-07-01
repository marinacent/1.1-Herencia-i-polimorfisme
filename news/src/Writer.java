import java.util.ArrayList;
import java.util.Scanner;

public class Writer {
    private String name;
    private final String dni;
    private static int salary = 1500;
    public ArrayList<NewsReport> writerNews;
    private static ArrayList<Writer> writerList;

    // ?????
    private static Scanner input = new Scanner(System.in);

    Writer(String name, String dni) {
        this.name = name;
        this.dni = dni;
        this.writerNews = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDni() {
        return dni;
    }

    public static void createWriter() {
        System.out.println("Enter writer's name:");
        String name = input.nextLine();
        System.out.println("Enter writer's DNI:");
        String dni = input.nextLine();
        Writer writer = new Writer(name, dni);
        if (Writer.writerList != null) {
            Writer.writerList.add(writer);
        } else {
            Writer.writerList = new ArrayList<Writer>();
            writerList.add(writer);
        }
        System.out.println("New writer created. Name: "
                + writer.getName() + ". DNI: " + writer.getDni());
    }


    public static void deleteWriter() {
        System.out.println("Enter writer's DNI: ");
        String dni = input.nextLine();
        for (Writer writer : writerList) {
            if (writer.dni.equals(dni)) {
                System.out.println("Deleting writer with name " + writer.name + " and DNI " + writer.dni);
                writerList.remove(writer);
                break;
            }
        }
    }

    public static void addNewsReport(NewsReport report) {
        System.out.println("Enter writer's DNI: ");
        String dni = input.nextLine();
        for (Writer writer : writerList) {
            if (writer.dni.equals(dni)) {
                writer.writerNews.add(report);
                System.out.println("News report added to writer " + writer.name);
                break;
            }
            System.out.println("DNI not found");
        }
    }

    public static void deleteNewsReport() {
        System.out.println("Enter report headline: ");
        String headline = input.nextLine();
        System.out.println("Enter writer's DNI: ");
        String dni = input.nextLine();
        for (Writer writer : writerList) {
            if (writer.dni.equals(dni)) {
                writer.writerNews.removeIf(report -> report.headline.equals(headline));
            }
        }


    }

    public static void showReports() {
        System.out.println("Enter writer's DNI: ");
        String dni = input.nextLine();
        for (Writer writer : writerList) {
            if (writer.dni.equals(dni)) {
                for (NewsReport report : writer.writerNews) {
                    System.out.println(report.headline);
                }
            }
        }

    }

}

