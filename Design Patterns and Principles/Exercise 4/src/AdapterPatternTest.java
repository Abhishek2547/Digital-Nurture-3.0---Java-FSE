public class AdapterPatternTest {
    public static void main(String[] args) {
        // Using PayPal through adapter
        PayPal payPal = new PayPal();
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPal);
        payPalAdapter.processPayment(100.0);

        // Using Stripe through adapter
        Stripe stripe = new Stripe();
        PaymentProcessor stripeAdapter = new StripeAdapter(stripe);
        stripeAdapter.processPayment(200.0);
    }
}
