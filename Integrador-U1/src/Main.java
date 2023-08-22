import Envios.*;
import MedioPago.PaymentManager;
import Productos.Product;
import Productos.ProductSelector;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        ProductSelector productSelector = new ProductSelector();
        Product producto = productSelector.selectProduct("Electronica");
        System.out.println(producto.getProductType());

        double amount = 1000;
        String paymentMethod = "Paypal";
        PaymentManager paymentManager = new PaymentManager();
        paymentManager.processPayment(amount, paymentMethod);

        double productCost = 4000;
        String chosenShippingMethod = "Air";
        ShippingStrategy shippingStrategy;
        switch (chosenShippingMethod) {
            case "Air":
                shippingStrategy = new ShippingStrategyAir();
                break;
            case "Truck":
                shippingStrategy = new ShippingStrategyTruck();
                break;
            case "Boat":
                shippingStrategy = new ShippingStrategyBoat();
                break;
            default:throw new IllegalArgumentException("Invalid shipping method.");
        }
        ShippingCalculator shippingCalculator = new ShippingCalculator(productCost, shippingStrategy);
        double shippingCost = shippingCalculator.calculateCost();
        System.out.println("El envio cuesta "+shippingCost);
    }
}