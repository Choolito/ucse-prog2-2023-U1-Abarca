package Envios;

public class ShippingCalculator {
    private double productCost;
    private ShippingStrategy shippingStrategy;
    public ShippingCalculator(double productCost, ShippingStrategy shippingStrategy) {
        this.productCost = productCost;
        this.shippingStrategy = shippingStrategy;
    }
    public double calculateCost() {
        return shippingStrategy.calculateCost(productCost);
    }
}
