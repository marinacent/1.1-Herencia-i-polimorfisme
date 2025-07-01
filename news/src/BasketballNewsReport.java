public class BasketballNewsReport extends NewsReport {
    private String competition;
    private String club;

    public BasketballNewsReport(String headline, String competition, String club) {
        super(headline);
        this.competition = competition;
        this.club = club;
    }
}
