# 26 - Introduction to the DOM

## Introduction

This lesson begins:

```text
Part 04 - DOM Events and Forms
```

In this lesson, I am learning how JavaScript represents an HTML webpage using the DOM.

DOM means:

```text
Document Object Model
```

---

## The Document Object

The browser provides the `document` object.

```javascript
console.log(document);
```

It represents the current webpage.

JavaScript can use it to read and change HTML elements.

---

## The DOM Tree

HTML elements are organised like a tree.

```text
document
└── html
    ├── head
    └── body
        ├── header
        ├── main
        └── footer
```

Elements can have parent, child, and sibling relationships.

---

## Reading Document Information

```javascript
console.log(document.title);
console.log(document.head);
console.log(document.body);
```

`document.title` returns the page title.

`document.head` represents the head element.

`document.body` represents the body element.

---

## Why the DOM Is Useful

JavaScript can use the DOM to:

- Select HTML elements
- Read and change text
- Change styles
- Create and remove elements
- Respond to user actions
- Read form values

---

## Practice Tasks

1. Display `document.title` in the console.
2. Display `document.head`.
3. Display `document.body`.
4. Draw a simple DOM tree for an HTML page.

---

## What I Learned

- What DOM means.
- How the browser represents HTML.
- What the document object is.
- How DOM elements form a tree.
- What parent, child, and sibling relationships mean.
- Why JavaScript uses the DOM.

The next lesson is **27 - Selecting HTML Elements**.