public class F1NewsReport extends NewsReport {
    private String constructor;

    public F1NewsReport(String headline, String constructor) {
        super(headline);
        this.constructor = constructor;
    }

    public void computeNewsReportPrice() {
        int price = 100;
        if (this.constructor.equals("ferrari") || this.constructor.equals("mercedes")) { price += 50; }
        this.price = price;
    }

    public void computeNewsReportScore() {
        int score = 4;
        if (this.constructor.equals("ferrari") || this.constructor.equals("mercedes")) { score += 2; }
        this.score = score;
    }

    public static NewsReport createNewsReport() {
        System.out.println("Enter headline: ");
        String headline = input.nextLine();
        System.out.println("Enter constructor: ");
        String constructor = input.nextLine().toLowerCase();
        NewsReport report = new F1NewsReport(headline, constructor);
        NewsReport.newsList.add(report);
        return report;
    }

}
