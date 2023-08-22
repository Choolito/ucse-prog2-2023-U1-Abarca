package Productos;

public class ProductFactoryVehicle extends ProductFactory{
    @Override
    public Product createProduct() {
        return new ProductVehicle();
    }
}
