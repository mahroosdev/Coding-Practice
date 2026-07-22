# 23 - Introduction to Loops

## Introduction

In this lesson, I am learning how loops repeat JavaScript code.

A loop prevents the need to write the same statement many times.

---

## Basic Example

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

## Main Loop Parts

A basic loop contains:

```javascript
let number = 1;
```

Starting value.

```javascript
number <= 5;
```

Condition that controls the loop.

```javascript
number++;
```

Update after each repetition.

---

## Main Loop Types

JavaScript includes:

- `for`
- `while`
- `do while`

A `for` loop is useful when the number of repetitions is known.

A `while` loop continues while its condition is true.

A `do while` loop runs at least once.

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

## Infinite Loops

A loop must reach a stopping condition.

Incorrect:

```javascript
let number = 1;

while (number <= 5) {
    console.log(number);
}
```

The number never changes.

It needs an update:

```javascript
number++;
```

---

## Practice Tasks

1. Display numbers from 1 to 5.
2. Repeat a message three times.
3. Display every value in an array.
4. Identify the start, condition, and update parts.

---

## What I Learned

- What a loop is.
- Why loops reduce repeated code.
- The main parts of a loop.
- The main JavaScript loop types.
- How loops can read array values.
- Why stopping conditions are important.

The next lesson is **24 - For Loop**.