public class NoDiscount implements DiscountStrategy {
    @Override
    public double apply(double total, java.util.List<Item> items) {
        return total;
    }
}
