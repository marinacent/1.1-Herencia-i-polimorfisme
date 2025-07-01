public class BasketballNewsReport extends NewsReport {
    private String competition;
    private String club;

    public BasketballNewsReport(String headline, String competition, String club) {
        super(headline);
        this.competition = competition;
        this.club = club;
    }

    public void computeNewsReportPrice() {
        int price = 250;
        if (this.competition.equals("euroleague")) { price += 75; }
        if (this.club.equals("barça") || this.club.equals("madrid")) { price += 75; }
        this.price = price;
    }
}
