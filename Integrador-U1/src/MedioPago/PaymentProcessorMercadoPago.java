package MedioPago;

public class PaymentProcessorMercadoPago extends PaymentProcessor {
    public PaymentProcessorMercadoPago(PaymentGateway paymentGateway){
        super(paymentGateway);
    }
    public void processPayment(double amount){
        paymentGateway.authorize();
        System.out.println("Procesando pago con MercadoPago con monto de "+amount);
        paymentGateway.capture();
    }
    public void refundPayment(double amount){
        System.out.println("Devolviendo pago con MercadoPago con monto de "+amount);
    }
}

