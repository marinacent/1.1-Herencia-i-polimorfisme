public class StringInstrument extends Instrument {

    static {
        System.out.println("Class 'StringInstrument' loaded");
    }

    StringInstrument(String name, double price) {
        super(name, price);
    }

    public void play() {
        System.out.println("A string instrument is playing");
    }
}
