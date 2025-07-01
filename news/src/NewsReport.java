import java.util.Scanner;

public abstract class NewsReport {
    // un titular, un text, una puntuació i un preu
    public String headline;
    private String text;
    protected int score;
    protected int price;
    protected static Scanner input = new Scanner(System.in);

    NewsReport(String headline) {
        this.headline = headline;
        this.text = "";
    }

    public abstract void computeNewsReportPrice();

    public abstract void computeNewsReportScore();

}
