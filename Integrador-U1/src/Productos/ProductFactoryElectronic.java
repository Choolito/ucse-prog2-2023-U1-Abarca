package Productos;

public class ProductFactoryElectronic extends ProductFactory{
    @Override
    public Product createProduct() {
        return new ProductElectronic();
    }
}
