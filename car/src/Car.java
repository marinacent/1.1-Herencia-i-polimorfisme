public class Car {
    private static final String brand = "Audi";
    private static String model;
    private final int power;

    public Car(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public static String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }
}
