public class Smartphone extends Telephone implements Camera, Clock {

    Smartphone(String brand, String model) {
        super(brand, model);
    }

    public void takePicture() {
        System.out.println("Taking a picture");
    }

    public void alarm() {
        System.out.println("The alarm is ringing");
    }
}
