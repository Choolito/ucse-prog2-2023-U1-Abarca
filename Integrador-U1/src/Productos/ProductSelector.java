package Productos;

public class ProductSelector {
    public Product selectProduct(String category) {
        ProductFactory factory = null;
        switch (category){
            case "Electronica": factory = new ProductFactoryElectronic();
                break;
            case "Vehiculos": factory = new ProductFactoryVehicle();
                break;
            case "Ropa": factory =  new ProductFactoryClothing();
                break;
            default: throw new IllegalArgumentException("Invalid category.");
        }
        return factory.createProduct();
    }


}
