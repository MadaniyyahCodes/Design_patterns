public interface DiscountStrategy {
    double apply(double total, java.util.List<Item> items);
}
