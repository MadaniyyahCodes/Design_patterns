public class WelcomeDiscount implements DiscountStrategy {
    @Override
    public double apply(double total, java.util.List<Item> items) {
        return total * 0.90; // 10% off
    }
}
