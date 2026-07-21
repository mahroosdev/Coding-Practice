# 16 - JavaScript Else If Statements

## Introduction

In the previous lesson, I learned how `if else` chooses between two actions.

In this lesson, I am learning how `else if` checks several conditions.

---

## Syntax

```javascript
if (conditionOne) {
    // First result
} else if (conditionTwo) {
    // Second result
} else {
    // Final result
}
```

JavaScript checks conditions from top to bottom and stops after the first true condition.

---

## Grade Example

```javascript
const score = 82;
let grade;

if (score >= 90) {
    grade = "A";
} else if (score >= 75) {
    grade = "B";
} else if (score >= 50) {
    grade = "C";
} else {
    grade = "Failed";
}
```

Result:

```text
B
```

---

## Temperature Example

```javascript
const temperature = 28;

if (temperature >= 35) {
    console.log("Very hot");
} else if (temperature >= 25) {
    console.log("Warm");
} else if (temperature >= 15) {
    console.log("Cool");
} else {
    console.log("Cold");
}
```

Output:

```text
Warm
```

---

## Condition Order

Write higher score conditions first:

```javascript
if (score >= 90) {
    // A
} else if (score >= 75) {
    // B
}
```

JavaScript stops after finding the first true condition.

---

## Practice Tasks

### Practice 1

Create grade ranges for A, B, C, and Failed.

### Practice 2

Display a message for morning, afternoon, and evening hours.

### Practice 3

Create age groups for child, teenager, adult, and senior.

---

## Common Beginner Mistakes

Incorrect order:

```javascript
if (score >= 50) {
    console.log("Passed");
} else if (score >= 90) {
    console.log("Grade A");
}
```

A score of 95 matches the first condition, so the Grade A block never runs.

Better:

```javascript
if (score >= 90) {
    console.log("Grade A");
} else if (score >= 50) {
    console.log("Passed");
}
```

---

## What I Learned

- How to check several conditions.
- How JavaScript checks conditions from top to bottom.
- Why condition order matters.
- How to create score, age, temperature, and role checks.

The next lesson is **17 - Switch Statements**.