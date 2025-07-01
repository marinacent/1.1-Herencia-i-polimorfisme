import java.util.ArrayList;
import java.util.Scanner;

public abstract class NewsReport {
    // un titular, un text, una puntuació i un preu
    public String headline;
    private String text;
    protected int score;
    protected int price;
    protected static ArrayList<NewsReport> newsList = new ArrayList<>();
    protected static Scanner input = new Scanner(System.in);

    NewsReport(String headline) {
        this.headline = headline;
        this.text = "";
    }

    public int getScore() {
        return score;
    }

    public int getPrice() {
        return price;
    }

    public abstract void computeNewsReportPrice();

    public abstract void computeNewsReportScore();

    public static NewsReport findNewsReport() {
        System.out.println("Enter news report headline: ");
        String headline = input.nextLine();
        for (NewsReport report : NewsReport.newsList) {
            if (report.headline.equals(headline)) {
                return report;
            }
        }
        return null;
    }

}
