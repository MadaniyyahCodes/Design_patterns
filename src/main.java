public class main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("Wireless Mouse", 150.0, 1));
        cart.addItem(new Item("Mechanical Keyboard", 350.0, 1));

        System.out.println("No discount: $" + cart.calculateTotal(new NoDiscount()));
        System.out.println("WELCOME10: $" + cart.calculateTotal(new WelcomeDiscount()));
        System.out.println("BLACKFRIDAY: $" + cart.calculateTotal(new BlackFridayDiscount()));
        System.out.println("OVER100: $" + cart.calculateTotal(new Over100Discount()));
        System.out.println("BUY2GET1: $" + cart.calculateTotal(new Buy2Get1Discount()));
    }
}
