public class Car {
    private static final String BRAND = "Audi";
    private static String model;
    private final int POWER;

    public Car(int power) {
        this.POWER = power;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

    public static String getModel() {
        return model;
    }

    public int getPOWER() {
        return POWER;
    }

    public static void brake() {
        System.out.println("The car is braking");
    }

    public void accelerate() {
        System.out.println("The car is accelerating");
    }
}
