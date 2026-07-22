# 24 - JavaScript For Loop

## Introduction

In this lesson, I am learning how a `for` loop repeats code a known number of times.

---

## Syntax

```javascript
for (startingValue; condition; update) {
    // Repeated code
}
```

Example:

```javascript
for (let number = 1; number <= 5; number++) {
    console.log(number);
}
```

Output:

```text
1
2
3
4
5
```

---

## Loop Parts

```javascript
let number = 1
```

Creates the starting value.

```javascript
number <= 5
```

Controls whether the loop continues.

```javascript
number++
```

Increases the number after every repetition.

---

## Looping Through an Array

```javascript
const languages = [
    "HTML",
    "CSS",
    "JavaScript"
];

for (
    let index = 0;
    index < languages.length;
    index++
) {
    console.log(languages[index]);
}
```

---

## Practice Tasks

1. Display numbers from 1 to 10.
2. Display numbers from 10 to 1.
3. Display even numbers from 0 to 20.
4. Display every item inside an array.

---

## Common Beginner Mistakes

The condition must eventually become false.

Incorrect:

```javascript
for (let number = 1; number <= 5;) {
    console.log(number);
}
```

The counter is not updated.

Correct:

```javascript
for (let number = 1; number <= 5; number++) {
    console.log(number);
}
```

---

## What I Learned

- How to create a for loop.
- How the starting value works.
- How the loop condition works.
- How to increase and decrease counters.
- How to loop through an array.
- How to calculate totals using a loop.

The next lesson is **25 - While and Do While Loops**.
