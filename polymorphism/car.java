package polymorphism;

public class car extends vechile {
    String Brand;
    String Color;
    double Price;
    String Type;
    public car(String Brand, String Color, double Price, String Type) {
        this.Brand = Brand;
        this.Color = Color;
        this.Price = Price;
        this.Type = Type;
    }
    void displayDetails() {
        System.out.println("Car Brand: " + Brand);
        System.out.println("Car Color: " + Color);
        System.out.println("Car Price: " + Price);
        System.out.println("Car Type: " + Type);
    }
}
