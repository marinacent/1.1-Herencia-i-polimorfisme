public class Main {

    public static void main(String[] args) {
        Car myCar = new Car("A4", 5000);
        Car yourCar = new Car("A3", 4000);

        System.out.println("Final --> unique for each instance");
        System.out.println("My car: " + myCar.getPower());
        System.out.println("Your car: " + yourCar.getPower());

        System.out.println("\nStatic --> shared by all instances");
        System.out.println("My car: " + myCar.getModel());
        System.out.println("Your car: " + yourCar.getModel());
        System.out.println("All cars: " + Car.getModel());
    }
}
