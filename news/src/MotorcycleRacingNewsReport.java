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
}
