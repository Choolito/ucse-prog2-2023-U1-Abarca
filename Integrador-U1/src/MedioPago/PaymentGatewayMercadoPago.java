package MedioPago;

public class PaymentGatewayMercadoPago implements PaymentGateway{
    public void authorize(){
        System.out.println("Autorizando pago con MercadoPago");
    }
    public void capture(){
        System.out.println("Capturando pago con MercadoPago");
    }
}
