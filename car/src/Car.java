public class Car {
    private static final String BRAND = "Audi";
    private static String model;
    private final int power;

    public Car(int power) {
        this.power = power;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

    public static String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public static void brake() {
        System.out.println("The car is braking");
    }

    public void accelerate() {
        System.out.println("The car is accelerating");
    }
}
