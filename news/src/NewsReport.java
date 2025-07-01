public abstract class NewsReport {
    // un titular, un text, una puntuació i un preu
    private String headline;
    private String text;
    protected int score;
    protected int price;

    NewsReport(String headline) {
        this.headline = headline;
        this.text = "";
    }

    public abstract void computeNewsReportPrice();

    public abstract void computeNewsReportScore();
}
