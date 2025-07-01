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

    public void computeNewsReportScore() {
        int score = 4;
        if (this.competition.equals("euroleague")) {
            score += 3;
        } else if (this.competition.equals("acb")) {
            score += 2;
        }
        if (this.club.equals("barça") || this.club.equals("madrid")) { score += 1; }
        this.score = score;
    }

    public static BasketballNewsReport createNewsReport() {
        System.out.println("Enter headline: ");
        String headline = input.nextLine();
        System.out.println("Enter club: ");
        String club = input.nextLine().toLowerCase();
        System.out.println("Enter competition: ");
        String competition = input.nextLine().toLowerCase();
        return new BasketballNewsReport(headline, competition, club);
    }
}
