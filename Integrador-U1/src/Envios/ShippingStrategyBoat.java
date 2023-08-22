package Envios;

public class ShippingStrategyBoat implements ShippingStrategy {
    public double calculateCost(double productCost) {
        //de ejemplo, el costo del envio es un 18% del costo del producto
        return productCost * 0.18;
    }
}
