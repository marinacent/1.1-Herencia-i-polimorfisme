public class WindInstrument extends Instrument{

    WindInstrument(String name, double price) {
        super(name, price);
    }

    public void play() {
        System.out.println("Està sonant un instrument de vent");
    }

}
