public class NewsReport {
    // un titular, un text, una puntuació i un preu
    private String headline;
    private String text;
    private int score;
    private int price;

    NewsReport(String headline) {
        this.headline = headline;
        this.text = "";
    }
}
