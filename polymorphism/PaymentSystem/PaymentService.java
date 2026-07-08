package PaymentSystem;
// * this is the servies layer of a application which can take any kind of payment method
public class PaymentService {

    public void processPayment(Payment payment, double amount) {
        payment.pay(amount);   // polymorphism magic 
    }
}

