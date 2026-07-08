package polymorphism;

public class vechilemain {
    public static void main(String[] args) {
        bike B1 = new bike(2021, "Red", 150000.00);
        bike B2 = new bike(2022, "Black", 180000.00);
        car C1 = new car("Toyota", "Blue", 2500000.00, "Automatic");
        car C2 = new car("Honda", "White", 2200000.00, "Manual");

        vechile[] vehicles = { B1, B2, C1, C2 };
        for (vechile v : vehicles) {
            if (v instanceof bike) {
                ((bike) v).displayDetails();
            } else if (v instanceof car) {
                ((car) v).displayDetails();
            }
            System.out.println("---------------------");
        }
    }
}
