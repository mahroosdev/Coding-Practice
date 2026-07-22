# 18 - JavaScript Functions

## Introduction

In this lesson, I am learning how functions group reusable JavaScript code.

---

## Function Syntax

```javascript
function functionName() {
    // Code
}
```

A function must be called before its code runs.

```javascript
functionName();
```

---

## Example

```javascript
function greetStudent() {
    console.log("Welcome to JavaScript!");
}

greetStudent();
```

Output:

```text
Welcome to JavaScript!
```

---

## Reusing a Function

```javascript
function showMessage() {
    console.log("Function called");
}

showMessage();
showMessage();
```

The same function can run several times.

---

## Practice Tasks

1. Create a function that displays your name.
2. Create a function that displays course details.
3. Create a function that adds two fixed numbers.

---

## Common Beginner Mistakes

Declaring a function without calling it:

```javascript
function showMessage() {
    console.log("Hello");
}
```

Run it using:

```javascript
showMessage();
```

Function names are case-sensitive.

---

## What I Learned

- How to declare a function.
- How to call a function.
- How functions group related code.
- How to reuse the same function.

The next lesson is **19 - Function Parameters and Return Values**.
