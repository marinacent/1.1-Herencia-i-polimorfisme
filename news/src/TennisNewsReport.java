public class TennisNewsReport extends NewsReport {

    private String competition;
    private String player;

    public TennisNewsReport(String headline, String competition, String player) {
        super(headline);
        this.competition = competition;
        this.player = player;
    }

    public void computeNewsReportPrice() {
        int price = 150;
        if (this.player.equals("federer") || this.player.equals("nadal") || this.player.equals("djokovic")) {
            price += 100;
        }
        this.price = price;
    }

    public void computeNewsReportScore() {
        int score = 4;
        if (this.player.equals("federer") || this.player.equals("nadal") || this.player.equals("djokovic")) {
            score += 3;
        }
        this.score = score;
    }

    public static NewsReport createNewsReport() {
        System.out.println("Enter headline: ");
        String headline = input.nextLine();
        System.out.println("Enter player: ");
        String player = input.nextLine().toLowerCase();
        System.out.println("Enter competition: ");
        String competition = input.nextLine().toLowerCase();
        NewsReport report = new TennisNewsReport(headline, competition, player);
        NewsReport.newsList.add(report);
        return report;
    }
}
