package MedioPago;

public class PaymentManager {
    public void processPayment(double amount, String provider)
    {
        PaymentGateway paymentGateway;
        PaymentProcessor paymentProcessor;

        if (provider.equalsIgnoreCase("PayPal")) {
            paymentGateway = new PaymentGatewayPaypal();
            paymentProcessor = new PaymentProcessorPaypal(paymentGateway);
        } else if (provider.equalsIgnoreCase("MercadoPago")) {
            paymentGateway = new PaymentGatewayMercadoPago();
            paymentProcessor = new PaymentProcessorMercadoPago(paymentGateway);
        } else {
            throw new IllegalArgumentException("Invalid payment provider.");
        }
        paymentProcessor.processPayment(amount);
    }
}
