public class Telephone {
    private String brand;
    private String model;

    Telephone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void call(String telephoneNumber) {
        System.out.println("Calling " + telephoneNumber);
    }
}
