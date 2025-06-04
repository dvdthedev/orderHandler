import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal total;

    public Product(String name, Double value, int quantity) {
        BigDecimal valueConvert = BigDecimal.valueOf((Double) value);
        this.name = name;
        this.total = BigDecimal.valueOf((Double) value).multiply(BigDecimal.valueOf(quantity));

    }

    public String getName() {
        return name;
    }

    public BigDecimal getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", total=" + total +
                '}';
    }
}
