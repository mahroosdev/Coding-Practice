# 20 - JavaScript Arrays

## Introduction

In this lesson, I am learning how arrays store several values inside one variable.

---

## Creating an Array

```javascript
const languages = [
    "HTML",
    "CSS",
    "JavaScript"
];
```

Array values are written inside square brackets and separated by commas.

---

## Accessing Items

Array indexes begin at zero.

```javascript
console.log(languages[0]);
console.log(languages[1]);
```

Output:

```text
HTML
CSS
```

---

## Changing an Item

```javascript
languages[1] = "Tailwind CSS";
```

This replaces the item at index `1`.

---

## Array Length

```javascript
console.log(languages.length);
```

The `length` property returns the number of items.

Read the last item:

```javascript
const lastItem =
    languages[languages.length - 1];
```

---

## Practice Tasks

1. Create an array containing three project names.
2. Display the first and second items.
3. Change one item and display the updated array.
4. Display the number of items.

---

## Common Beginner Mistakes

Array indexes start at zero:

```text
First item = Index 0
```

Use square brackets:

```javascript
languages[0]
```

Do not confuse array square brackets with function parentheses.

---

## What I Learned

- How to create an array.
- How array indexes work.
- How to access array items.
- How to change an item.
- How to check array length.
- How to read the first and last items.

The next lesson is **21 - JavaScript Array Methods**.