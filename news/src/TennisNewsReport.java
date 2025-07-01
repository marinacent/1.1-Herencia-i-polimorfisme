public class TennisNewsReport extends NewsReport {
    // competició(String) parlen i de quins tenistes(String)
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
}
