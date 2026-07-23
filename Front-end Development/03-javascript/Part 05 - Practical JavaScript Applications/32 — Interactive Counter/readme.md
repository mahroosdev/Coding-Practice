# 32 - Interactive Counter

## Introduction

This lesson begins:

```text
Part 05 - Practical JavaScript Applications
```

In this lesson, I built an interactive counter.

The user can:

- Increase the counter
- Decrease the counter
- Reset the counter
- Count between 0 and 10

## Main JavaScript

```javascript
let counter = 0;

function updateCounter() {
    counterValue.textContent = counter;
}
```

Increase:

```javascript
counter++;
updateCounter();
```

Decrease:

```javascript
counter--;
updateCounter();
```

Reset:

```javascript
counter = 0;
updateCounter();
```

## Concepts Used

- Variables
- Functions
- Conditions
- Click events
- DOM updates
- Disabled buttons

## Practice Tasks

1. Change the maximum value to 20.
2. Make the counter increase by 2.
3. Display a different message for values above 5.

## What I Learned

I learned how to combine JavaScript fundamentals to create a working interactive feature.

The next lesson is **33 - Theme Switcher**.