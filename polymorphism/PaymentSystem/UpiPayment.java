package PaymentSystem;
// * this is implemention class/application of payment api
public class UpiPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
