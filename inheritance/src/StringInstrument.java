public class StringInstrument extends Instrument {

    StringInstrument(String name, double price) {
        super(name, price);
    }

    public void play() {
        System.out.println("Està sonant un instrument de corda");
    }
}
