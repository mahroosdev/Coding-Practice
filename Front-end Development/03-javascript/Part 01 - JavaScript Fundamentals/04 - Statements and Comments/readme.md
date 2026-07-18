# 04 - JavaScript Statements and Comments

## Introduction

In the previous lesson, I learned how JavaScript displays output on a webpage, in the browser console, and inside an alert box.

In this lesson, I am learning about JavaScript statements and comments.

Statements give instructions to the browser.

Comments help explain the code and are ignored by JavaScript.

---

## Folder Structure

```text
04 - JavaScript Statements and Comments/
│
├── index.html
├── style.css
├── script.js
└── README.md
```

---

## What is a JavaScript Statement?

A JavaScript statement is an instruction that tells the browser to perform an action.

Example:

```javascript
console.log("Hello from JavaScript.");
```

This statement tells the browser to display a message in the console.

Another example is:

```javascript
document.getElementById("lesson-output").textContent =
    "The JavaScript statements ran successfully.";
```

This statement changes the text inside an HTML element.

---

## Statement Order

JavaScript normally reads and runs statements from top to bottom.

Example:

```javascript
console.log("First message");

console.log("Second message");

console.log("Third message");
```

The console output is:

```text
First message
Second message
Third message
```

Changing the order of the statements can change the order of the output.

---

## Semicolons

A semicolon can be added at the end of a JavaScript statement.

```javascript
console.log("Hello");
```

The semicolon is:

```javascript
;
```

It marks the end of the statement.

JavaScript can sometimes work without semicolons:

```javascript
console.log("Hello")
```

However, this course uses semicolons to make the end of each statement clear and keep the code consistent.

---

## Statements Across Multiple Lines

A long statement can be written across multiple lines.

```javascript
document.getElementById("lesson-output").textContent =
    "The JavaScript statements ran successfully.";
```

This is still one JavaScript statement.

The code is moved onto another line to make it easier to read.

---

## What is a JavaScript Comment?

A comment is text written inside the code to explain something.

JavaScript ignores comments when running the program.

Comments are useful for:

- Explaining what code does
- Leaving notes
- Organizing code
- Making code easier to understand
- Temporarily preventing a line from running

There are two main types of JavaScript comments:

1. Single-line comments
2. Multi-line comments

---

## Single-Line Comments

A single-line comment begins with two forward slashes.

```javascript
// This is a single-line comment
```

Everything after `//` on the same line is ignored by JavaScript.

Example:

```javascript
// Display a welcome message
console.log("Welcome to my webpage.");
```

The first line explains the code.

The second line runs normally.

---

## Comment After a Statement

A single-line comment can also appear after a statement.

```javascript
console.log("Hello"); // Display a message
```

The statement runs, but the comment is ignored.

For beginner code, comments are often easier to read when they are written on a separate line.

```javascript
// Display a message
console.log("Hello");
```

---

## Multi-Line Comments

A multi-line comment begins with:

```javascript
/*
```

and ends with:

```javascript
*/
```

Example:

```javascript
/*
    This is a multi-line comment.
    It can continue across several lines.
*/
```

Everything between `/*` and `*/` is ignored by JavaScript.

Multi-line comments are useful when a longer explanation is needed.

---

## Comments Do Not Create Output

This comment does not appear in the console:

```javascript
// This is a comment
```

This statement does appear in the console:

```javascript
console.log("This is output");
```

Comments are only visible inside the source code.

---

## Temporarily Disabling Code

A comment can temporarily stop a JavaScript statement from running.

Normal statement:

```javascript
console.log("This message will appear.");
```

Commented statement:

```javascript
// console.log("This message will not appear.");
```

JavaScript ignores the commented line.

This can be useful when testing code.

Remember to remove the comment symbols if the statement should run again.

---

## Comments Used in This Lesson

### Single-Line Comment

```javascript
// This is a single-line comment
```

### Multi-Line Comment

```javascript
/*
    This is a multi-line comment.
    JavaScript ignores all the text inside this comment.
*/
```

### Comment Explaining a Statement

```javascript
// This statement changes the text on the webpage
document.getElementById("lesson-output").textContent =
    "The JavaScript statements ran successfully.";
```

---

## JavaScript Used in This Lesson

```javascript
// This is a single-line comment

console.log("The first statement is running.");

console.log("The second statement is running.");

/*
    This is a multi-line comment.
    JavaScript ignores all the text inside this comment.
*/

console.log("The third statement is running.");

// This statement changes the text on the webpage
document.getElementById("lesson-output").textContent =
    "The JavaScript statements ran successfully.";
```

JavaScript runs the statements but ignores the comments.

---

## Expected Output

When the webpage is opened:

- The page background appears light gray.
- The header and footer appear dark blue.
- Four white content sections appear.
- Code examples have a dark background.
- The lesson output changes from:

```text
Waiting for JavaScript...
```

to:

```text
The JavaScript statements ran successfully.
```

The browser console displays:

```text
The first statement is running.
The second statement is running.
The third statement is running.
```

The comments do not appear in the console.

---

## Practice Examples

### Practice 1: Add a Statement

Add this statement to `script.js`:

```javascript
console.log("I added a new JavaScript statement.");
```

Save the file, refresh the browser, and check the console.

---

### Practice 2: Add a Single-Line Comment

Add a comment above the new statement.

```javascript
// Display my practice message
console.log("I added a new JavaScript statement.");
```

---

### Practice 3: Add a Multi-Line Comment

Add this comment:

```javascript
/*
    I am learning JavaScript.
    This is my statements and comments lesson.
*/
```

Refresh the page and confirm that the comment does not appear in the console.

---

### Practice 4: Disable a Statement

Change:

```javascript
console.log("The second statement is running.");
```

To:

```javascript
// console.log("The second statement is running.");
```

Refresh the browser.

The second message should no longer appear in the console.

---

### Practice 5: Change the Statement Order

Move:

```javascript
console.log("The third statement is running.");
```

above the first statement.

Refresh the page and check how the output order changes.

---

## Common Beginner Mistakes

### Using One Forward Slash

Incorrect:

```javascript
/ This is a comment
```

Correct:

```javascript
// This is a comment
```

A single-line comment needs two forward slashes.

---

### Forgetting to Close a Multi-Line Comment

Incorrect:

```javascript
/*
    This comment is not closed.
```

Correct:

```javascript
/*
    This comment is closed.
*/
```

---

### Using HTML Comments in JavaScript

HTML comment:

```html
<!-- This is an HTML comment -->
```

JavaScript single-line comment:

```javascript
// This is a JavaScript comment
```

JavaScript multi-line comment:

```javascript
/* This is a JavaScript comment */
```

Use JavaScript comment symbols inside `script.js`.

---

### Commenting Out Required Code

If a statement begins with `//`, it will not run.

```javascript
// console.log("Hello");
```

Remove the two forward slashes to run it again.

```javascript
console.log("Hello");
```

---

### Writing Too Many Comments

Comments should explain useful information.

Avoid comments that only repeat the code.

Unnecessary:

```javascript
// Display Hello
console.log("Hello");
```

More useful:

```javascript
// Check whether the JavaScript file loaded
console.log("JavaScript file loaded successfully.");
```

---

## Important Notes

- A statement is an instruction for JavaScript.
- JavaScript normally runs statements from top to bottom.
- A semicolon marks the end of a statement.
- This course uses semicolons for consistency.
- A single-line comment begins with `//`.
- A multi-line comment begins with `/*` and ends with `*/`.
- JavaScript ignores comments.
- Comments do not appear on the webpage or in the console.
- Comments should explain useful information.
- Comments can temporarily prevent code from running.
- Avoid adding unnecessary comments to every line.

---

## Easy Way to Remember

Remember:

```text
Statement = An instruction that runs
Comment   = A note that does not run
```

Single-line comment:

```javascript
// One line
```

Multi-line comment:

```javascript
/*
    Multiple lines
*/
```

---

## What I Learned

In this lesson, I learned:

- What a JavaScript statement is.
- How JavaScript runs statements from top to bottom.
- Why semicolons are used.
- How a statement can continue onto another line.
- What JavaScript comments are.
- How to write single-line comments.
- How to write multi-line comments.
- Why JavaScript ignores comments.
- How to use comments to explain code.
- How to temporarily disable a statement.
- How to avoid common comment mistakes.

The next lesson is 05 - JavaScript Variables.
