# Task 1 - Pure vs Impure

### 1.1 addToCart
Only return one value: Yes
Result only depending on passed paremeters: No
Does not change existing values:No
Pure or Impure: Impure because it changes the existing cart list. The result also depends on the previous state of the cart.

### 1.2 add
Only return one value: Yes
Result only depending on passed paremeters: Yes
Does not change existing values:Yes
Pure or Impure: Pure because it only uses the parameters and returns the sum.

### 1.3 firstCharacter
Only return one value: Yes
Result only depending on passed paremeters: Yes
Does not change existing values:Yes
Pure or Impure: Pure because it only uses the given string and returns the first character.

### 1.4 multiplyWithRandom
Only return one value: Yes
Result only depending on passed paremeters: No
Does not change existing values:Yes
Pure or Impure: Impure because the result depends on a random number, not only on the parameter.

### 1.5 divideNumbers
Only return one value: Yes
Result only depending on passed paremeters: Yes
Does not change existing values: Yes
Pure or Impure: Pure because it only uses the dividend and divisor and returns the result.

### 1.6 printAndReturnString
Only return one value: Yes
Result only depending on passed paremeters: Yes
Does not change existing values:No
Pure or Impure: Impure because it prints to the console. Printing is a side effect.

# Task 2 - Rewriting impure functions

## 1.1 Pure version
Instead of changing an existing cart, the function returns a new cart with the added item.

## 1.4 Pure version
Instead of generating the random number inside the function, the random value is passed as a parameter.

## 1.6 Pure version
Instead of printing inside the function, the function only returns the string. Printing can happen outside the function.