public class Main {

    public static void main(String[] args) {
        System.out.println("Number of instruments: " + Instrument.getNumberOfInstruments());

        StringInstrument violin = new StringInstrument("violin", 1000.0);
        StringInstrument viola = new StringInstrument("viola", 800.0);

        WindInstrument oboe = new WindInstrument("oboe", 750.0);
        WindInstrument clarinet = new WindInstrument("clarinet", 770.0);

        PercussionInstrument marimba = new PercussionInstrument("marimba", 508.0);
        PercussionInstrument xylophone = new PercussionInstrument("xylophone", 235.0);

        System.out.println("Number of instruments: " + Instrument.getNumberOfInstruments());

        viola.play();
        clarinet.play();
        marimba.play();

    }
}
