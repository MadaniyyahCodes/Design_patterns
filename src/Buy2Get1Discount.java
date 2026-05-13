public class Buy2Get1Discount implements DiscountStrategy {
    @Override
    public double apply(double total, java.util.List<Item> items) {
        if (items.size() >= 2) {
            // Find the cheapest item and make it free
            double cheapest = items.stream()
                .mapToDouble(Item::getPrice)
                .min()
                .orElse(0);
            return total - cheapest;
        }
        return total;
    }
}
