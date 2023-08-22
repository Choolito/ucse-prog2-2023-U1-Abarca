package Envios;

public class ShippingStrategyAir implements ShippingStrategy{
    @Override
    public double calculateCost(double productCost) {
        //de ejemplo, el costo del envio es un 22% del costo del producto
        return productCost * 0.22;
    }
}
