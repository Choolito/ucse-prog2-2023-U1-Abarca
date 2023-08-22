package MedioPago;

public class PaymentProcessorPaypal extends PaymentProcessor{
    public PaymentProcessorPaypal(PaymentGateway paymentGateway){
        super(paymentGateway);
    }
    public void processPayment(double amount){
        paymentGateway.authorize();
        System.out.println("Procesando pago con Paypal con monto de "+amount);
        paymentGateway.capture();
    }
    public void refundPayment(double amount){
        System.out.println("Reembolsando pago con Paypal con monto de "+amount);
    }
}
