package PaymentSystem;
// clint will give instruction here
public class ClientMainClass{
    public static void main(String[] args) {
        Payment payment = new UpiPayment();  // decided at runtime

        PaymentService service = new PaymentService();
        service.processPayment(payment, 500);

    }
}
