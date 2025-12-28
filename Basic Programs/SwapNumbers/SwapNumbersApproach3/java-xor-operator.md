# Java XOR Operator (`^`)

In Java, **XOR** stands for **exclusive OR**. Java uses the same symbol `^` for:

1. **Boolean XOR** (when both operands are `boolean`)
2. **Bitwise XOR** (when operands are integer types like `int`, `long`, `byte`, `short`, `char`)

---

## 1) Boolean XOR (`boolean ^ boolean`)

For booleans, XOR returns `true` **only when exactly one operand is `true`**.

### Truth table

| A | B | A ^ B |
|---|---|-------|
| false | false | false |
| false | true  | true  |
| true  | false | true  |
| true  | true  | false |

### Example

```java
boolean a = true;
boolean b = false;

System.out.println(a ^ b); // true
System.out.println(a ^ a); // false
```

### Important: `^` is **not** short-circuit
Unlike `||` and `&&`, the `^` operator **always evaluates both sides**.

```java
boolean left()  { System.out.println("left");  return true; }
boolean right() { System.out.println("right"); return false; }

System.out.println(left() ^ right());
// prints:
// left
// right
// true
```

If you need short-circuit behavior, you must structure logic differently (there is no short-circuit XOR operator in Java).

---

## 2) Bitwise XOR (integers)

When used with integer types, `^` performs XOR **bit by bit**:

- If bits are different → result bit is `1`
- If bits are the same → result bit is `0`

### Example with binary

```java
int x = 5;   // 0101 (binary)
int y = 3;   // 0011 (binary)

int z = x ^ y; // 0110 (binary) = 6
System.out.println(z); // 6
```

---

## 3) XOR assignment (`^=`)

`a ^= b;` is shorthand for `a = a ^ b;`

```java
int flags = 0b0101;       // 5
int mask  = 0b0001;       // 1
flags ^= mask;            // toggles the lowest bit
System.out.println(flags); // 0b0100 = 4
```

---

## 4) Common use cases

### A) Toggle a bit (flip on/off)
XOR is very handy for toggling bits:

```java
int value = 0b1000; // 8
int bit   = 0b0010; // toggle bit #2

value ^= bit;       // 0b1010 (10)
value ^= bit;       // back to 0b1000 (8)
```

### B) Check if two booleans are different
`a ^ b` is `true` when `a` and `b` differ:

```java
boolean changed = (oldState ^ newState);
```

### C) “Difference” at bit level
If you XOR the same number twice, it cancels out:

- `x ^ x == 0`
- `x ^ 0 == x`
- `(x ^ y) ^ y == x`

This is used in some algorithms (e.g., finding the unique number in an array where others appear twice):

```java
int[] arr = {2, 7, 2, 5, 5};
int unique = 0;
for (int n : arr) unique ^= n;
System.out.println(unique); // 7
```

---

## 5) Operator precedence tips

`^` has **lower precedence** than `&` but **higher** than `|`.

When mixing multiple bitwise operators, use parentheses for readability:

```java
int result = (a ^ b) & mask;
```

---

## 6) XOR vs OR (`|`) and AND (`&`)

- `a | b` → true if **at least one** is true (or bit is 1)
- `a & b` → true if **both** are true (or both bits are 1)
- `a ^ b` → true if **exactly one** is true (or bits differ)

---

## Quick summary

- **Boolean XOR:** `true` only when operands differ.
- **Bitwise XOR:** compares bits; 1 where bits differ.
- **No short-circuit:** `^` always evaluates both sides.
- Useful for **toggling bits**, **detecting changes**, and **XOR-based algorithms**.
