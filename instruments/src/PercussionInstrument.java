public class PercussionInstrument extends Instrument {

    static {
        System.out.println("Class 'PercussionInstrument' loaded");
    }

    PercussionInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A percussion instrument is playing");
    }
}
