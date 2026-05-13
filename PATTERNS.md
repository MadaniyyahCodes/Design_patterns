# Design Patterns Used

## Phase 1 — Creational
`src/IDiscountStrategy.java` and all classes that implement it.

`ShoppingCart.calculateTotal()` had hardcoded if-else blocks for every
discount type. Adding a new discount required modifying the cart class
directly, violating the Open/Closed Principle.

- Adding a new discount = adding a new class, nothing else
- ShoppingCart no longer knows or cares which discount is applied
- Each discount can be tested independently
## Phase 2 — Structural

## Phase 3 — Behavioral
