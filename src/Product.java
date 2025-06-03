public class Product {
    private String name;
    private Double total;

    public Product(String name, Double value, int quantity) {
        this.name = name;
        this.total = value * quantity;

    }

    public String getName() {
        return name;
    }

    public Double getTotal() {
        return total;
    }
}
