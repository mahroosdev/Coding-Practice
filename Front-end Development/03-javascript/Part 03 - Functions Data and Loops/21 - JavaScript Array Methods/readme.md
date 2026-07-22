# 21 - JavaScript Array Methods

## Introduction

In this lesson, I am learning how array methods add, remove, search, and join array items.

---

## Adding Items

Add an item to the end:

```javascript
const languages = ["HTML", "CSS"];

languages.push("JavaScript");
```

Add an item to the beginning:

```javascript
languages.unshift("Bootstrap");
```

---

## Removing Items

Remove the last item:

```javascript
languages.pop();
```

Remove the first item:

```javascript
languages.shift();
```

`pop()` and `shift()` return the removed item.

---

## Searching Arrays

Find an item's index:

```javascript
languages.indexOf("JavaScript");
```

Check whether an item exists:

```javascript
languages.includes("JavaScript");
```

`indexOf()` returns `-1` when the item is not found.

---

## Joining Items

```javascript
const text =
    languages.join(" | ");
```

The result is a string.

---

## Using splice()

```javascript
const languages = [
    "HTML",
    "CSS",
    "JavaScript"
];

languages.splice(1, 1, "Tailwind CSS");
```

This removes one item at index `1` and inserts `"Tailwind CSS"`.

---

## Practice Tasks

1. Add a project to the end of an array.
2. Remove the first array item.
3. Check whether `"JavaScript"` exists.
4. Join array items using commas.

---

## What I Learned

- How to use `push()` and `unshift()`.
- How to use `pop()` and `shift()`.
- How to search using `indexOf()` and `includes()`.
- How to create a string using `join()`.
- How to update an array using `splice()`.

The next lesson is **22 - JavaScript Objects**.