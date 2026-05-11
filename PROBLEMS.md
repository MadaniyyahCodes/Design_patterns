# Problems in Starting Code

## Problem 1 — OCP Violation
`calculateTotal()` must be modified every time a new discount is added.
Adding code to a working method risks breaking existing discounts.

## Problem 2 — Single Responsibility Violation
`ShoppingCart` does two jobs: managing items AND calculating discounts.
These should be separate classes.

## Problem 3 — String-based type control
Discount type is passed as a raw String ("WELCOME10", "BLACKFRIDAY").
A typo causes silent failure — no discount applied, no error thrown.

## Problem 4 — No discount abstraction
Each discount is just an if-else block, not an object.
You can't reuse, test, or swap discounts independently.

## Problem 5 — Impossible to combine discounts
The design can only apply one discount at a time.
There's no way to stack discounts without rewriting the method.


## AI Comparison
What AI found:
- OCP violation (same as my Problem 1)
- SRP violation (same as my Problem 2)
- String type safety issue (same as my Problem 3)
- No discount abstraction (same as my Problem 4)
- Cannot combine discounts (same as my Problem 5)
-  BUY_2_GET_1 logic is actually wrong

What I found that AI also found: All 5 of my problems were confirmed.

Differences:
AI found a 6th problem I didn't notice, the BUY_2_GET_1 rule
subtracts a flat $10 which doesn't correctly implement the rule.

Patterns suggested:
- Strategy Pattern → for discount logic (Phase 1 plan)
- Decorator Pattern → for combining discounts (Phase 2 plan)

