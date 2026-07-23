# 39 - Timers and Digital Clock

## Introduction

In this lesson, I built:

- A digital clock
- A stopwatch
- A delayed message

## Repeating Code

```javascript
setInterval(function () {
    console.log("Runs every second");
}, 1000);
```

`1000` milliseconds equals one second.

## Stopping an Interval

```javascript
const timer =
    setInterval(updateTimer, 1000);

clearInterval(timer);
```

## Delayed Code

```javascript
setTimeout(function () {
    console.log("Runs after 3 seconds");
}, 3000);
```

## Current Date and Time

```javascript
const currentDate =
    new Date();

console.log(currentDate.getHours());
console.log(currentDate.getMinutes());
console.log(currentDate.getSeconds());
```

## Concepts Used

- `setInterval()`
- `clearInterval()`
- `setTimeout()`
- Date object
- Functions
- DOM updates
- Start, pause, and reset controls

## Practice Tasks

1. Create a countdown timer.
2. Display time using a 12-hour format.
3. Add milliseconds to the stopwatch.
4. Add a cancel button for the delayed message.

## What I Learned

I learned how JavaScript can run code repeatedly or after a delay.

This lesson completes **Part 05 - Practical JavaScript Applications**.

The next section is:

```text
Part 06 - JavaScript Projects
```