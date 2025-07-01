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
}
