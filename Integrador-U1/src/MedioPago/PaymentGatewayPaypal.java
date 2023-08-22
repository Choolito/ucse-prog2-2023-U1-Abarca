package MedioPago;

public class PaymentGatewayPaypal implements PaymentGateway{
    public void authorize(){
        System.out.println("Autorizando pago con Paypal");
    }
    public void capture(){
        System.out.println("Capturando pago con Paypal");
    }
}
