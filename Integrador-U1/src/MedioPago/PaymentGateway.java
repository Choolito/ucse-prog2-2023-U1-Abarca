package MedioPago;

public interface PaymentGateway {
    public void authorize();
    public void capture();
}
