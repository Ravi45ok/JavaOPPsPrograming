package polymorphism;

public class bike extends vechile {
    int model;
    String color;
    double price;
    public bike(int model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("Bike Model: " + model);
        System.out.println("Bike Color: " + color);
        System.out.println("Bike Price: " + price);
    }
}
