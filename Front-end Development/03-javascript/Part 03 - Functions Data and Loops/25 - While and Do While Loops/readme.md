# 25 - While and Do While Loops

## Introduction

In this lesson, I am learning how `while` and `do while` loops repeat code.

---

## While Loop

A while loop checks its condition before running.

```javascript
let number = 1;

while (number <= 5) {
    console.log(number);
    number++;
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

The counter must be created before the loop and updated inside it.

---

## Do While Loop

A do while loop runs before checking the condition.

```javascript
let number = 1;

do {
    console.log(number);
    number++;
} while (number <= 5);
```

---

## Main Difference

A while loop may run zero times.

A do while loop runs at least once.

```javascript
let number = 10;

do {
    console.log(number);
} while (number < 5);
```

The value `10` still appears once.

---

## Practice Tasks

1. Display numbers from 1 to 10 using `while`.
2. Create a countdown from 5 to 1.
3. Display every item inside an array.
4. Create a do while loop that runs once.

---

## Common Beginner Mistakes

Do not forget to update the counter:

```javascript
let number = 1;

while (number <= 5) {
    console.log(number);
    number++;
}
```

The do while condition ends with a semicolon:

```javascript
} while (number <= 5);
```

---

## What I Learned

- How a while loop works.
- How a do while loop works.
- Where loop counters are created and updated.
- Why a do while loop runs at least once.
- How to avoid infinite loops.

This lesson completes **Part 03 - Functions Data and Loops**.

The next lesson is **26 - Introduction to the DOM**.