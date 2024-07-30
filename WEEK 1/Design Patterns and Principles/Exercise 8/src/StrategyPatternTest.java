public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "John Doe");
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com");

        PaymentContext paymentContext = new PaymentContext(creditCardPayment);
        paymentContext.executePayment(100.0);

        paymentContext = new PaymentContext(payPalPayment);
        paymentContext.executePayment(200.0);
    }
}
