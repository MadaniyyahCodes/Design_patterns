public class BlackFridayDiscount implements DiscountStrategy {
    @Override
    public double apply(double total, java.util.List<Item> items) {
        return total * 0.50; // 50% off
    }
}
