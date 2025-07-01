public class F1NewsReport extends NewsReport {
    private String constructor;

    public F1NewsReport(String headline, String constructor) {
        super(headline);
        this.constructor = constructor;
    }

    public void computeNewsReportPrice() {
        int price = 100;
        if (this.constructor.equals("ferrari") || this.constructor.equals("mercedes")) { price += 50; }
        this.price = price;
    }

}
