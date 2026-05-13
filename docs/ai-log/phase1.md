Phase 1 AI Log

 What I asked Claude
"What design problems do you see in this code? What patterns could fix them?"

What Claude answered (summary)
- Identified OCP violation in calculateTotal()
- Suggested Strategy Pattern for discount abstraction
- Pointed out BUY_2_GET_1 was incorrectly implemented
- Suggested Decorator for combining discounts later

 What I implemented
Applied Strategy Pattern with a DiscountStrategy interface and 5 concrete
discount classes. ShoppingCart now receives a DiscountStrategy object instead
of a String.

Differences from AI suggestion
I implemented BUY_2_GET_1 correctly (cheapest item free) instead of the
flat $10 dummy rule from the original code.
