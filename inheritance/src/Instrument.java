public abstract class Instrument {
    private String name;
    private double price;

    Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract void play();
}

