package Envios;

public class ShippingStrategyTruck implements ShippingStrategy{
    @Override
    public double calculateCost(double productCost) {
        //de ejemplo, el costo del envio es un 9% del costo del producto
        return productCost * 0.09;
    }
}
