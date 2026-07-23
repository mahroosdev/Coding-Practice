# 35 - Live Character Counter

## Introduction

In this lesson, I built a live character counter.

It updates while the user types and limits the message to 150 characters.

## Reading the Character Length

```javascript
const currentLength =
    messageInput.value.length;
```

## Remaining Characters

```javascript
const remaining =
    maximumCharacters - currentLength;
```

## Input Event

```javascript
messageInput.addEventListener(
    "input",
    updateCharacterCounter
);
```

The input event runs whenever the textarea value changes.

## Concepts Used

- Input events
- String length
- Functions
- Conditions
- DOM updates
- Progress bar
- Maximum input length

## Practice Tasks

1. Change the limit to 250 characters.
2. Display a warning when 30 characters remain.
3. Disable another button when the limit is reached.

## What I Learned

I learned how to read text length and update webpage information while the user types.

The next lesson is **36 - Search and Filter**.