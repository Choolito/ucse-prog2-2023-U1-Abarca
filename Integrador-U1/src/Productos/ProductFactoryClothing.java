package Productos;

public class ProductFactoryClothing extends ProductFactory{
    @Override
    public Product createProduct() {
        return new ProductClothing();
    }
}
