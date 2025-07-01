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

    public void computeNewsReportPrice() {
        int price = 300;
        if (this.competition.equals("champions league")) { price += 100; }
        if (this.club.equals("barça") || this.club.equals("madrid")) { price += 100; }
        if (this.player.equals("ferran torres") || this.player.equals("benzema")) { price += 100; }
        this.price = price;
    }
}
