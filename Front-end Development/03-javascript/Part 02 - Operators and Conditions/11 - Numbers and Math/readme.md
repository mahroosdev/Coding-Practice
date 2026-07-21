# 11 - JavaScript Numbers

## Introduction

In the previous lesson, I learned about JavaScript string methods.

This lesson begins:

```text
Part 02 - Operators and Conditions
```

In this lesson, I am learning how JavaScript stores, calculates, converts, and formats number values.

---

## Folder Structure

```text
11 - Numbers/
│
├── index.html
├── style.css
├── script.js
└── README.md
```

---

## Creating Numbers

JavaScript uses the `number` data type for whole numbers and decimal numbers.

```javascript
const lessonNumber = 11;
const productPrice = 19.99;
const temperature = -5;
const startingScore = 0;
```

Check the data type:

```javascript
console.log(typeof lessonNumber);
```

Output:

```text
number
```

Numbers must be written without quotation marks.

```javascript
const score = 100;   // Number
const scoreText = "100"; // String
```

---

## Calculations with Numbers

JavaScript numbers can use arithmetic operators.

```javascript
const firstNumber = 20;
const secondNumber = 5;

console.log(firstNumber + secondNumber);
console.log(firstNumber - secondNumber);
console.log(firstNumber * secondNumber);
console.log(firstNumber / secondNumber);
console.log(firstNumber % 6);
console.log(secondNumber ** 2);
```

Output:

```text
25
15
100
4
2
25
```

---

## Numbers and Numeric Strings

A number inside quotation marks is a string.

```javascript
console.log(100 + 50);
console.log("100" + 50);
```

Output:

```text
150
10050
```

The plus operator performs addition with numbers but joins values when a string is involved.

---

## Converting Values to Numbers

### `Number()`

The `Number()` function converts a complete value into a number.

```javascript
const price = Number("25.75");

console.log(price);
console.log(typeof price);
```

Output:

```text
25.75
number
```

### `parseInt()`

The `parseInt()` function returns a whole number.

```javascript
console.log(parseInt("45.75"));
```

Output:

```text
45
```

### `parseFloat()`

The `parseFloat()` function returns a decimal number.

```javascript
console.log(parseFloat("45.75"));
```

Output:

```text
45.75
```

---

## NaN

`NaN` means **Not a Number**.

It appears when JavaScript cannot create a valid number.

```javascript
const result = Number("JavaScript");

console.log(result);
console.log(Number.isNaN(result));
```

Output:

```text
NaN
true
```

Use `Number.isNaN()` to check whether a result is `NaN`.

---

## Infinity

Dividing a non-zero number by zero produces `Infinity`.

```javascript
console.log(10 / 0);
console.log(-10 / 0);
```

Output:

```text
Infinity
-Infinity
```

Important calculations should check that the divisor is not zero.

---

## Formatting Decimal Numbers

The `toFixed()` method formats a number using a selected number of decimal places.

```javascript
const productPrice = 19.9876;

const formattedPrice = productPrice.toFixed(2);

console.log(formattedPrice);
console.log(typeof formattedPrice);
```

Output:

```text
19.99
string
```

`toFixed()` returns a string.

---

## Converting a Number to a String

The `toString()` method converts a number into text.

```javascript
const lessonNumber = 11;

const lessonText = lessonNumber.toString();

console.log(typeof lessonNumber);
console.log(typeof lessonText);
```

Output:

```text
number
string
```

---

## Decimal Precision

Some decimal calculations may not produce an exact-looking result.

```javascript
const result = 0.1 + 0.2;

console.log(result);
```

Output:

```text
0.30000000000000004
```

For simple display output:

```javascript
console.log(result.toFixed(2));
```

Output:

```text
0.30
```

---

## Practice Tasks

### Practice 1: Perform Calculations

```javascript
const firstNumber = 30;
const secondNumber = 6;

console.log(firstNumber + secondNumber);
console.log(firstNumber - secondNumber);
console.log(firstNumber * secondNumber);
console.log(firstNumber / secondNumber);
```

### Practice 2: Convert a Numeric String

```javascript
const priceText = "29.99";

const price = Number(priceText);

console.log(price);
console.log(typeof price);
```

### Practice 3: Format a Price

```javascript
const price = 49.9876;

console.log(price.toFixed(2));
```

---

## Common Beginner Mistakes

### Writing a Number Inside Quotation Marks

```javascript
const score = "100";
```

This creates a string.

Correct number:

```javascript
const score = 100;
```

### Expecting Addition from a Numeric String

```javascript
console.log("100" + 50);
```

Output:

```text
10050
```

Convert it first:

```javascript
console.log(Number("100") + 50);
```

### Expecting `parseInt()` to Round

```javascript
console.log(parseInt("19.99"));
```

Output:

```text
19
```

`parseInt()` removes the decimal section. It does not round the number.

### Forgetting That `toFixed()` Returns a String

```javascript
const result = 19.99.toFixed(2);

console.log(typeof result);
```

Output:

```text
string
```

---

## What I Learned

In this lesson, I learned:

- How JavaScript stores whole and decimal numbers.
- The difference between numbers and numeric strings.
- How to perform arithmetic calculations.
- How to convert values using `Number()`.
- How `parseInt()` and `parseFloat()` work.
- What `NaN` and `Infinity` mean.
- How to check a value using `Number.isNaN()`.
- How to format numbers using `toFixed()`.
- How to convert numbers using `toString()`.
- Why some decimal calculations have precision differences.

The next lesson is **12 - Comparison Operators**.