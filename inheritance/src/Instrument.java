public abstract class Instrument {
    private String name;
    private double price;
    private static int numberOfInstruments = 0;

    static {
        System.out.println("Class 'Instrument' loaded");
    }

    Instrument(String name, double price) {
        this.name = name;
        this.price = price;
        numberOfInstruments++;
    }

    abstract void play();

    public static int getNumberOfInstruments() {
        return numberOfInstruments;
    }
}



