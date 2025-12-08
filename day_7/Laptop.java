public class Laptop {
    String brand;
    double price;

    
    public Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", 799.99);
        System.out.println("Brand: " + laptop.brand);
        System.out.println("Price: " + laptop.price);
    }
}