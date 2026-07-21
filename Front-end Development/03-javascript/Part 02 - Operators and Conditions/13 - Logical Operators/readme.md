# 13 - JavaScript Logical Operators

## Introduction

In the previous lesson, I learned about comparison operators.

In this lesson, I am learning how logical operators combine and reverse boolean values.

The three main logical operators are:

| Operator | Name |
|---|---|
| `&&` | AND |
| `||` | OR |
| `!` | NOT |

---

## Folder Structure

```text
13 - Logical Operators/
│
├── index.html
├── style.css
├── script.js
└── README.md
```

---

## Logical AND

The AND operator uses:

```javascript
&&
```

It returns `true` only when both conditions are true.

```javascript
const isLoggedIn = true;
const hasPermission = true;

console.log(
    isLoggedIn && hasPermission
);
```

Output:

```text
true
```

When one condition is false:

```javascript
console.log(true && false);
```

Output:

```text
false
```

---

## Logical OR

The OR operator uses:

```javascript
||
```

It returns `true` when at least one condition is true.

```javascript
const isAdmin = false;
const isCreator = true;

console.log(
    isAdmin || isCreator
);
```

Output:

```text
true
```

Both conditions must be false for OR to return false.

```javascript
console.log(false || false);
```

Output:

```text
false
```

---

## Logical NOT

The NOT operator uses:

```javascript
!
```

It reverses a boolean value.

```javascript
console.log(!true);
console.log(!false);
```

Output:

```text
false
true
```

Example using a variable:

```javascript
const isOffline = false;

const isOnline = !isOffline;

console.log(isOnline);
```

Output:

```text
true
```

---

## Combining Comparisons

Logical operators can combine comparison results.

```javascript
const userAge = 25;

const ageIsAllowed =
    userAge >= 18 &&
    userAge <= 60;

console.log(ageIsAllowed);
```

Output:

```text
true
```

Both comparisons must return true.

---

## Practical Examples

### Login Check

```javascript
const hasEmail = true;
const hasPassword = true;

const canLogin =
    hasEmail && hasPassword;

console.log(canLogin);
```

### Access Check

```javascript
const isAdmin = false;
const isCreator = true;

const hasAccess =
    isAdmin || isCreator;

console.log(hasAccess);
```

---

## Practice Tasks

### Practice 1: Test AND

```javascript
const completedCourse = true;
const completedProject = false;

console.log(
    completedCourse && completedProject
);
```

### Practice 2: Test OR

```javascript
const hasEmail = false;
const hasPhone = true;

console.log(
    hasEmail || hasPhone
);
```

### Practice 3: Test NOT

```javascript
const isDisabled = false;

console.log(!isDisabled);
```

---

## Common Beginner Mistakes

### Using One Ampersand

Incorrect:

```javascript
true & false
```

Correct:

```javascript
true && false
```

### Using One Vertical Bar

Incorrect:

```javascript
true | false
```

Correct:

```javascript
true || false
```

### Confusing AND and OR

AND requires both conditions:

```javascript
true && true
```

OR requires at least one condition:

```javascript
true || false
```

---

## What I Learned

In this lesson, I learned:

- How logical operators work.
- How the AND operator combines conditions.
- How the OR operator checks multiple possibilities.
- How the NOT operator reverses a boolean.
- How logical operators combine comparisons.
- How to create simple login and access checks.

The next lesson is **14 - If Statements**.