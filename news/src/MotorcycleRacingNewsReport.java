public class MotorcycleRacingNewsReport extends NewsReport {
    private String team;

    public MotorcycleRacingNewsReport(String headline, String team) {
        super(headline);
        this.team = team;
    }

    public void computeNewsReportPrice() {
        int price = 100;
        if (this.team.equals("honda") || this.team.equals("yamaha")) { price += 50; }
        this.price = price;
    }

    public void computeNewsReportScore() {
        int score = 3;
        if (this.team.equals("honda") || this.team.equals("yamaha")) { score += 3; }
        this.score = score;
    }

    public static NewsReport createNewsReport() {
        System.out.println("Enter headline: ");
        String headline = input.nextLine();
        System.out.println("Enter team: ");
        String team = input.nextLine().toLowerCase();
        NewsReport report = new MotorcycleRacingNewsReport(headline, team);
        NewsReport.newsList.add(report);
        return report;
    }
}
