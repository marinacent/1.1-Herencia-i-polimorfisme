public class Main {

    public static void main(String[] args) {
        Car myCar = new Car(5000);
        Car yourCar = new Car(4000);
        Car.setModel("A3");

//        System.out.println("Final --> unique for each instance");
        System.out.println("My car: " + myCar.getPower());
        System.out.println("Your car: " + yourCar.getPower());

//        System.out.println("\nStatic --> shared by all instances");
        System.out.println("All cars: " + Car.getModel());
        Car.setModel("A5");
        System.out.println("All cars: " + Car.getModel());

        Car.brake();
        myCar.accelerate();
    }
}
