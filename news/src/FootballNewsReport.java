public class FootballNewsReport extends NewsReport {
    private String competition;
    private String club;
    private String player;

    public FootballNewsReport(String headline, String club, String player, String competition) {
        super(headline);
        this.club = club;
        this.player = player;
        this.competition = competition;
    }

    @Override
    public void computeNewsReportPrice() {
        int price = 300;
        if (this.competition.equals("champions league")) { price += 100; }
        if (this.club.equals("barça") || this.club.equals("madrid")) { price += 100; }
        if (this.player.equals("ferran torres") || this.player.equals("benzema")) { price += 100; }
        this.price = price;
    }

    @Override
    public void computeNewsReportScore() {
        int score = 5;
        if (this.competition.equals("champions league")) {
            score += 3;
        } else if (this.competition.equals("la liga")) {
            score += 2;
        }
        if (this.club.equals("barça") || this.club.equals("madrid")) { score += 1; }
        if (this.player.equals("ferran torres") || this.player.equals("benzema")) { score += 1; }
        this.score = score;
    }

    public static NewsReport createNewsReport() {
        System.out.println("Enter headline: ");
        String headline = input.nextLine();
        System.out.println("Enter club: ");
        String club = input.nextLine().toLowerCase();
        System.out.println("Enter player: ");
        String player = input.nextLine().toLowerCase();
        System.out.println("Enter competition: ");
        String competition = input.nextLine().toLowerCase();
        NewsReport report = new FootballNewsReport(headline, club, player, competition);
        NewsReport.newsList.add(report);
        return report;
    }

}
