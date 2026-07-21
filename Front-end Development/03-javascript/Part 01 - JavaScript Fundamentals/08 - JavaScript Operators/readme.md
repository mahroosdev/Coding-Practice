# 08 - JavaScript Operators

## Introduction

In the previous lesson, I learned about JavaScript data types.

In this lesson, I am learning about JavaScript operators.

Operators are symbols that tell JavaScript to perform an action.

For example:

```javascript
const total = 10 + 5;
```

The plus symbol is an operator.

It tells JavaScript to add the two numbers.

---

## Folder Structure

```text
08 - JavaScript Operators/
│
├── index.html
├── style.css
├── script.js
└── README.md
```

---

## What Is an Operator?

An operator is a symbol used to perform an action on one or more values.

Example:

```javascript
const result = 20 + 10;
```

In this example:

```text
20 and 10 = Values
+         = Operator
result    = Variable
```

JavaScript calculates the result and stores it inside the variable.

```text
20 + 10 = 30
```

---

## Operators Used in This Lesson

This lesson introduces:

1. Arithmetic operators
2. Assignment operators
3. Comparison operators
4. Logical operators
5. Increment and decrement operators
6. String concatenation

---

# 1. Arithmetic Operators

Arithmetic operators perform mathematical calculations.

The main arithmetic operators are:

| Operator | Name | Example |
|---|---|---|
| `+` | Addition | `10 + 5` |
| `-` | Subtraction | `10 - 5` |
| `*` | Multiplication | `10 * 5` |
| `/` | Division | `10 / 5` |
| `%` | Remainder | `10 % 5` |
| `**` | Exponentiation | `10 ** 2` |

---

## Addition Operator

The addition operator uses the plus symbol:

```javascript
+
```

Example:

```javascript
const result = 12 + 4;

console.log(result);
```

Output:

```text
16
```

---

## Subtraction Operator

The subtraction operator uses the minus symbol:

```javascript
-
```

Example:

```javascript
const result = 12 - 4;

console.log(result);
```

Output:

```text
8
```

---

## Multiplication Operator

The multiplication operator uses an asterisk:

```javascript
*
```

Example:

```javascript
const result = 12 * 4;

console.log(result);
```

Output:

```text
48
```

JavaScript does not use the `×` symbol inside the code.

Use:

```javascript
*
```

---

## Division Operator

The division operator uses a forward slash:

```javascript
/
```

Example:

```javascript
const result = 12 / 4;

console.log(result);
```

Output:

```text
3
```

JavaScript does not use the `÷` symbol inside the code.

Use:

```javascript
/
```

---

## Remainder Operator

The remainder operator uses the percentage symbol:

```javascript
%
```

It returns the amount left after division.

Example:

```javascript
const result = 10 % 3;

console.log(result);
```

Output:

```text
1
```

This happens because:

```text
10 ÷ 3 = 3 with 1 remaining
```

Another example:

```javascript
console.log(12 % 4);
```

Output:

```text
0
```

There is no remainder because 12 can be divided evenly by 4.

---

## Exponentiation Operator

The exponentiation operator uses two asterisks:

```javascript
**
```

It raises a number to a power.

Example:

```javascript
const result = 5 ** 2;

console.log(result);
```

Output:

```text
25
```

This means:

```text
5 × 5 = 25
```

Another example:

```javascript
console.log(2 ** 3);
```

Output:

```text
8
```

This means:

```text
2 × 2 × 2 = 8
```

---

# 2. Assignment Operators

Assignment operators assign or update values inside variables.

---

## Basic Assignment Operator

The basic assignment operator is:

```javascript
=
```

Example:

```javascript
let score = 10;
```

This assigns the value `10` to the variable named `score`.

The assignment operator does not mean that two values are equal.

It means:

```text
Store the value on the right inside the variable on the left.
```

---

## Addition Assignment Operator

The addition assignment operator is:

```javascript
+=
```

Example:

```javascript
let score = 10;

score += 5;

console.log(score);
```

Output:

```text
15
```

This is a shorter way to write:

```javascript
score = score + 5;
```

---

## Subtraction Assignment Operator

The subtraction assignment operator is:

```javascript
-=
```

Example:

```javascript
let score = 10;

score -= 3;

console.log(score);
```

Output:

```text
7
```

This is the same as:

```javascript
score = score - 3;
```

---

## Multiplication Assignment Operator

The multiplication assignment operator is:

```javascript
*=
```

Example:

```javascript
let score = 10;

score *= 2;

console.log(score);
```

Output:

```text
20
```

This is the same as:

```javascript
score = score * 2;
```

---

## Division Assignment Operator

The division assignment operator is:

```javascript
/=
```

Example:

```javascript
let score = 20;

score /= 4;

console.log(score);
```

Output:

```text
5
```

This is the same as:

```javascript
score = score / 4;
```

---

## Assignment Operator Summary

| Operator | Example | Longer Version |
|---|---|---|
| `=` | `score = 10` | Assigns `10` |
| `+=` | `score += 5` | `score = score + 5` |
| `-=` | `score -= 5` | `score = score - 5` |
| `*=` | `score *= 5` | `score = score * 5` |
| `/=` | `score /= 5` | `score = score / 5` |

---

# 3. Comparison Operators

Comparison operators compare two values.

The result of a comparison is always a boolean:

```text
true
false
```

Example:

```javascript
const result = 20 > 18;

console.log(result);
```

Output:

```text
true
```

---

## Greater Than Operator

The greater than operator is:

```javascript
>
```

Example:

```javascript
console.log(20 > 18);
```

Output:

```text
true
```

---

## Less Than Operator

The less than operator is:

```javascript
<
```

Example:

```javascript
console.log(20 < 18);
```

Output:

```text
false
```

---

## Greater Than or Equal Operator

The greater than or equal operator is:

```javascript
>=
```

Example:

```javascript
console.log(20 >= 20);
```

Output:

```text
true
```

This operator checks whether the first value is greater than or equal to the second value.

---

## Less Than or Equal Operator

The less than or equal operator is:

```javascript
<=
```

Example:

```javascript
console.log(15 <= 20);
```

Output:

```text
true
```

---

## Strict Equality Operator

The strict equality operator uses three equal signs:

```javascript
===
```

It checks both:

1. The value
2. The data type

Example:

```javascript
console.log(10 === 10);
```

Output:

```text
true
```

Another example:

```javascript
console.log(10 === "10");
```

Output:

```text
false
```

The first value is a number.

The second value is a string.

Their values look similar, but their data types are different.

For most JavaScript comparisons, strict equality is recommended.

---

## Strict Inequality Operator

The strict inequality operator is:

```javascript
!==
```

It checks whether the values or their data types are different.

Example:

```javascript
console.log(10 !== 5);
```

Output:

```text
true
```

Another example:

```javascript
console.log(10 !== 10);
```

Output:

```text
false
```

---

## Loose Equality Operator

JavaScript also has a loose equality operator:

```javascript
==
```

Example:

```javascript
console.log(10 == "10");
```

Output:

```text
true
```

This happens because loose equality may convert the values before comparing them.

Strict equality does not perform this automatic conversion.

```javascript
console.log(10 === "10");
```

Output:

```text
false
```

For beginner projects, prefer:

```javascript
===
```

Avoid using loose equality unless there is a clear reason.

---

## Comparison Operator Summary

| Operator | Meaning |
|---|---|
| `>` | Greater than |
| `<` | Less than |
| `>=` | Greater than or equal |
| `<=` | Less than or equal |
| `===` | Strictly equal |
| `!==` | Strictly not equal |

---

# 4. Logical Operators

Logical operators work with boolean values.

The main logical operators are:

| Operator | Name |
|---|---|
| `&&` | AND |
| `||` | OR |
| `!` | NOT |

---

## AND Operator

The AND operator uses:

```javascript
&&
```

It returns `true` only when both conditions are true.

Example:

```javascript
const isLoggedIn = true;
const hasPermission = true;

console.log(isLoggedIn && hasPermission);
```

Output:

```text
true
```

Another example:

```javascript
const isLoggedIn = true;
const hasPermission = false;

console.log(isLoggedIn && hasPermission);
```

Output:

```text
false
```

Both conditions must be true.

---

## OR Operator

The OR operator uses:

```javascript
||
```

It returns `true` when at least one condition is true.

Example:

```javascript
const isAdmin = false;
const isCreator = true;

console.log(isAdmin || isCreator);
```

Output:

```text
true
```

Only one condition needs to be true.

---

## NOT Operator

The NOT operator uses:

```javascript
!
```

It reverses a boolean value.

Example:

```javascript
console.log(!true);
```

Output:

```text
false
```

Another example:

```javascript
console.log(!false);
```

Output:

```text
true
```

Example using a variable:

```javascript
const isOffline = false;

console.log(!isOffline);
```

Output:

```text
true
```

---

## Logical Operator Summary

```text
true && true   = true
true && false  = false

true || false  = true
false || false = false

!true          = false
!false         = true
```

---

# 5. Increment and Decrement Operators

Increment and decrement operators change a number by one.

---

## Increment Operator

The increment operator is:

```javascript
++
```

It increases a number by one.

Example:

```javascript
let counter = 5;

counter++;

console.log(counter);
```

Output:

```text
6
```

This is similar to:

```javascript
counter = counter + 1;
```

---

## Decrement Operator

The decrement operator is:

```javascript
--
```

It decreases a number by one.

Example:

```javascript
let counter = 5;

counter--;

console.log(counter);
```

Output:

```text
4
```

This is similar to:

```javascript
counter = counter - 1;
```

---

## Important Const Rule

Increment and decrement normally require a variable that can change.

Correct:

```javascript
let counter = 5;

counter++;
```

Incorrect:

```javascript
const counter = 5;

counter++;
```

A variable created with `const` cannot be reassigned.

Use `let` when the number must change.

---

# 6. String Concatenation

The plus operator can perform addition or join strings.

Joining strings together is called concatenation.

Example:

```javascript
const firstName = "Mahroos";
const lastName = "Mahthie";

const fullName = firstName + " " + lastName;

console.log(fullName);
```

Output:

```text
Mahroos Mahthie
```

The empty space inside:

```javascript
" "
```

adds a space between the two names.

---

## Joining a Message

```javascript
const courseName = "JavaScript";

const message = "I am learning " + courseName + ".";

console.log(message);
```

Output:

```text
I am learning JavaScript.
```

---

## Addition Versus Concatenation

When both values are numbers, the plus operator adds them.

```javascript
console.log(10 + 5);
```

Output:

```text
15
```

When one or both values are strings, the plus operator can join them.

```javascript
console.log("10" + 5);
```

Output:

```text
105
```

JavaScript treats the result as text.

Another example:

```javascript
console.log(10 + "5");
```

Output:

```text
105
```

Quotation marks affect how the plus operator behaves.

---

# Operator Precedence

Operator precedence controls which calculation JavaScript performs first.

Example:

```javascript
const result = 10 + 5 * 2;

console.log(result);
```

Output:

```text
20
```

Multiplication happens before addition:

```text
5 × 2 = 10
10 + 10 = 20
```

Use parentheses when a calculation should happen first.

```javascript
const result = (10 + 5) * 2;

console.log(result);
```

Output:

```text
30
```

The calculation inside the parentheses happens first:

```text
10 + 5 = 15
15 × 2 = 30
```

Parentheses make calculations easier to understand.

---

# JavaScript Used in This Lesson

## Arithmetic Operators

```javascript
const additionResult = 12 + 4;
const subtractionResult = 12 - 4;
const multiplicationResult = 12 * 4;
const divisionResult = 12 / 4;
const remainderResult = 12 % 4;
const exponentResult = 12 ** 2;
```

## Assignment Operators

```javascript
let score = 10;

score += 5;
score -= 3;
score *= 2;
score /= 4;
```

## Comparison Operators

```javascript
const isGreater = 20 > 18;
const isLess = 20 < 18;
const isEqual = 20 === 18;
const isNotEqual = 20 !== 18;
```

## Logical Operators

```javascript
const isLoggedIn = true;
const hasPermission = false;

const andResult = isLoggedIn && hasPermission;
const orResult = isLoggedIn || hasPermission;
const notResult = !isLoggedIn;
```

## Increment and Decrement

```javascript
let counter = 5;

counter++;
counter--;
```

## String Concatenation

```javascript
const firstName = "Mahroos";
const lastName = "Mahthie";

const fullName = firstName + " " + lastName;
```

---

# Expected Webpage Output

When the webpage opens:

- A dark-blue header appears.
- White lesson sections appear on a light-gray background.
- Arithmetic results appear inside dark output boxes.
- Assignment changes appear step by step.
- Comparison results display `true` or `false`.
- Logical operator results appear.
- Increment and decrement results appear.
- String concatenation displays a full name and message.
- Arithmetic examples appear inside responsive cards.
- A table summarizes the operator categories.

The arithmetic section displays:

```text
12 + 4 = 16
12 - 4 = 8
12 × 4 = 48
12 ÷ 4 = 3
12 % 4 = 0
12² = 144
```

---

# Practice Examples

## Practice 1: Change the Numbers

Change:

```javascript
const firstNumber = 12;
const secondNumber = 4;
```

To:

```javascript
const firstNumber = 20;
const secondNumber = 5;
```

Save the file and refresh the webpage.

Observe how all arithmetic results change.

---

## Practice 2: Test the Remainder Operator

Add:

```javascript
const remainder = 17 % 5;

console.log(remainder);
```

Expected output:

```text
2
```

---

## Practice 3: Update a Score

Add:

```javascript
let practiceScore = 50;

practiceScore += 10;
practiceScore -= 5;

console.log(practiceScore);
```

Expected output:

```text
55
```

---

## Practice 4: Compare Ages

Add:

```javascript
const studentAge = 20;
const minimumAge = 18;

console.log(studentAge >= minimumAge);
```

Expected output:

```text
true
```

---

## Practice 5: Test Strict Equality

Add:

```javascript
const numberValue = 10;
const stringValue = "10";

console.log(numberValue === stringValue);
```

Expected output:

```text
false
```

The values use different data types.

---

## Practice 6: Test Logical AND

Add:

```javascript
const hasEmail = true;
const hasPassword = true;

console.log(hasEmail && hasPassword);
```

Expected output:

```text
true
```

Change one value to `false` and test again.

---

## Practice 7: Increment a Counter

Add:

```javascript
let lessonCount = 8;

lessonCount++;

console.log(lessonCount);
```

Expected output:

```text
9
```

---

## Practice 8: Join Strings

Add:

```javascript
const language = "JavaScript";
const status = "Learning";

const result = status + " " + language;

console.log(result);
```

Expected output:

```text
Learning JavaScript
```

---

# Common Beginner Mistakes

## Using `x` for Multiplication

Incorrect:

```javascript
const result = 10 x 5;
```

Correct:

```javascript
const result = 10 * 5;
```

JavaScript uses an asterisk for multiplication.

---

## Using the Division Symbol

Incorrect:

```javascript
const result = 10 ÷ 5;
```

Correct:

```javascript
const result = 10 / 5;
```

JavaScript uses a forward slash for division.

---

## Confusing Assignment and Equality

Assignment:

```javascript
let score = 10;
```

Comparison:

```javascript
score === 10;
```

The single equal sign assigns a value.

The three equal signs compare values and data types.

---

## Using `const` for a Changing Value

Incorrect:

```javascript
const score = 10;

score += 5;
```

Correct:

```javascript
let score = 10;

score += 5;
```

Use `let` when the value must change.

---

## Forgetting Both AND Symbols

Incorrect:

```javascript
isLoggedIn & hasPermission
```

Correct:

```javascript
isLoggedIn && hasPermission
```

Logical AND uses two ampersand symbols.

---

## Forgetting Both OR Symbols

Incorrect:

```javascript
isAdmin | isCreator
```

Correct:

```javascript
isAdmin || isCreator
```

Logical OR uses two vertical bar symbols.

---

## Confusing Strings and Numbers

```javascript
console.log(10 + 5);
```

Output:

```text
15
```

But:

```javascript
console.log("10" + 5);
```

Output:

```text
105
```

Quotation marks change the value into a string.

---

## Using Loose Equality Without a Reason

Avoid:

```javascript
10 == "10"
```

Prefer:

```javascript
10 === "10"
```

Strict equality checks both value and data type.

---

# Important Notes

- Operators tell JavaScript to perform actions.
- Arithmetic operators perform calculations.
- The `+` operator adds numbers.
- The `-` operator subtracts numbers.
- The `*` operator multiplies numbers.
- The `/` operator divides numbers.
- The `%` operator returns the remainder.
- The `**` operator performs exponentiation.
- Assignment operators update variable values.
- Comparison operators return `true` or `false`.
- Strict equality uses `===`.
- Strict inequality uses `!==`.
- Logical AND uses `&&`.
- Logical OR uses `||`.
- Logical NOT uses `!`.
- Increment uses `++`.
- Decrement uses `--`.
- The plus operator can also join strings.
- Parentheses control calculation order.
- Use `let` when a value must change.

---

# Easy Way to Remember

```text
+   = Add
-   = Subtract
*   = Multiply
/   = Divide
%   = Remainder
**  = Power
```

```text
=   = Assign
=== = Strictly equal
!== = Strictly not equal
```

```text
&& = AND
|| = OR
!  = NOT
```

```text
++ = Increase by one
-- = Decrease by one
```

---

# What I Learned

In this lesson, I learned:

- What a JavaScript operator is.
- How to use arithmetic operators.
- How to add, subtract, multiply, and divide numbers.
- How to calculate a remainder.
- How to use exponentiation.
- How assignment operators update variables.
- How comparison operators return boolean values.
- The difference between assignment and equality.
- Why strict equality is recommended.
- How logical AND, OR, and NOT work.
- How increment and decrement operators work.
- How the plus operator joins strings.
- How strings affect addition.
- How parentheses control calculation order.
- How to display operator results on a webpage.

The next lesson is **09 - JavaScript Expressions and Statements**.