public class WindInstrument extends Instrument{

    static {
        System.out.println("Class 'WindInstrument' loaded");
    }

    WindInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A wind instrument is playing");
    }

}
