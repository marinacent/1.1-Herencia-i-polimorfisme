import java.util.ArrayList;
import java.util.Scanner;

public class Writer {
    private String name;
    private final String dni;
    private static int salary = 1500;
    public ArrayList<NewsReport> writerNews;
    private static final ArrayList<Writer> writerList = new ArrayList<>();
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
        Writer.writerList.add(writer);
        System.out.println("New writer created. Name: "
                + writer.getName() + ". DNI: " + writer.getDni());
    }

    private static Writer findWriter() {
        System.out.println("Enter writer's DNI: ");
        String dni = input.nextLine();
        for (Writer writer : writerList) {
            if (writer.dni.equals(dni)) {
                return writer;
            }
        }
        return null;
    }


    public static void deleteWriter() {
        Writer writer = findWriter();
        if (writer != null) {
            System.out.println("Deleting writer with name " + writer.name + " and DNI " + writer.dni);
            writerList.remove(writer);
        } else {
            System.out.println("Writer not found");
        }
    }

    public static void addNewsReport(NewsReport report) {
        Writer writer = findWriter();
        if (writer != null) {
            writer.writerNews.add(report);
            System.out.println("News report added to writer " + writer.name);
        } else {
            System.out.println("DNI not found");
        }
    }

    public static void deleteNewsReport() {
        System.out.println("Enter report headline: ");
        String headline = input.nextLine();
        Writer writer = findWriter();
        if (writer != null) {
            boolean reportRemoved = writer.writerNews.removeIf(report ->
                    report.headline.equals(headline)
            );
            if(reportRemoved) {
                System.out.println("News report deleted: " + headline);
            } else {
                System.out.println("News report not found");
            }
        } else {
            System.out.println("DNI not found");
        }
    }

    public static void showReports() {
        Writer writer = findWriter();
        if (writer != null) {
            for (NewsReport report : writer.writerNews) {
                System.out.println(report.headline);
            }
        } else {
            System.out.println("DNI not found");
        }
    }
}
