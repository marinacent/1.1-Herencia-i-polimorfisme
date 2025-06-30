public class PercussionInstrument extends Instrument {

    PercussionInstrument(String name, double price) {
        super(name, price);
    }

    public void play() {
        System.out.println("Està sonant un instrument de percussió");
    }
}
