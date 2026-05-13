public class Over100Discount implements DiscountStrategy {
    @Override
    public double apply(double total, java.util.List<Item> items) {
        if (total > 100) {
            return total - 20; // flat $20 off
        }
        return total;
    }
}
