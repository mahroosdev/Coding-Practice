# 19 - Function Parameters and Return Values

## Introduction

In this lesson, I am learning how functions receive values and return results.

---

## Parameters and Arguments

A parameter receives a value:

```javascript
function greetUser(name) {
    console.log("Hello " + name);
}
```

An argument is passed during the function call:

```javascript
greetUser("Mahroos");
```

---

## Multiple Parameters

```javascript
function addNumbers(firstNumber, secondNumber) {
    return firstNumber + secondNumber;
}
```

Call the function:

```javascript
const total = addNumbers(10, 5);
```

Result:

```text
15
```

---

## Return Values

The `return` keyword sends a value back from a function.

```javascript
function multiplyNumbers(a, b) {
    return a * b;
}

const result = multiplyNumbers(4, 5);
```

---

## Practice Tasks

1. Create a function that returns a full name.
2. Create a function that returns the area of a rectangle.
3. Create a function that checks whether an age is at least 18.

---

## Common Beginner Mistakes

Use commas between parameters:

```javascript
function addNumbers(a, b)
```

Remember to store or use the returned value:

```javascript
const result = addNumbers(10, 5);
```

Code after `return` inside the same block does not run.

---

## What I Learned

- What parameters are.
- What arguments are.
- How to pass several values.
- How to return a result.
- How to store returned values.

The next lesson is **20 - JavaScript Arrays**.
