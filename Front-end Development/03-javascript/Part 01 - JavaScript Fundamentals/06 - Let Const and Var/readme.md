# 06 - Let, Const and Var

## Introduction

In the previous lesson, I learned what JavaScript variables are and how they store values.

In this lesson, I am learning the three keywords used to create JavaScript variables:

- `let`
- `const`
- `var`

These keywords have some important differences.

---

## Folder Structure

```text
06 - Let Const and Var/
│
├── index.html
├── style.css
├── script.js
└── README.md
```

---

## JavaScript Variable Keywords

JavaScript has three main keywords for creating variables.

```javascript
let learningStatus = "In Progress";

const courseName = "JavaScript";

var studentLevel = "Beginner";
```

The value stored by a variable can depend on which keyword is used.

For modern JavaScript:

- Use `const` when a variable should not be reassigned.
- Use `let` when a variable needs to receive a new value.
- Avoid `var` when writing new code.

---

## The `let` Keyword

The `let` keyword creates a variable that can receive a new value later.

```javascript
let learningStatus = "Starting";
```

The value can be changed:

```javascript
learningStatus = "In Progress";
```

The variable now stores:

```text
In Progress
```

The `let` keyword is useful when a value needs to change while the program is running.

Examples include:

- A score
- A counter
- A game status
- A login status
- A changing message

---

## Updating a `let` Variable

Create the variable:

```javascript
let learningStatus = "Starting";
```

Update the variable:

```javascript
learningStatus = "In Progress";
```

Do not write `let` again when updating the existing variable.

Correct:

```javascript
let learningStatus = "Starting";

learningStatus = "In Progress";
```

The final value is:

```text
In Progress
```

---

## The `const` Keyword

The `const` keyword creates a variable that cannot be reassigned.

```javascript
const courseName = "JavaScript";
```

The following reassignment is not allowed:

```javascript
courseName = "Python";
```

This produces an error because a `const` variable cannot receive a completely new value.

Use `const` when the variable should continue referring to the same value.

Examples include:

- A course name
- A birth date
- A website title
- A fixed tax rate
- A configuration value

---

## A `const` Variable Needs a Value

A `const` variable must receive a value when it is created.

Incorrect:

```javascript
const courseName;
```

Correct:

```javascript
const courseName = "JavaScript";
```

JavaScript needs to know the value when the `const` variable is declared.

---

## The `var` Keyword

The `var` keyword is an older way to create JavaScript variables.

```javascript
var studentLevel = "Beginner";
```

A `var` variable can receive a new value.

```javascript
studentLevel = "Improving";
```

The final value is:

```text
Improving
```

Although `var` still works, modern JavaScript normally uses `let` and `const`.

You may still see `var` inside older JavaScript projects and tutorials.

---

## Why is `var` Usually Avoided?

The `var` keyword has older rules that can make code harder to understand.

For example, `var` allows the same variable name to be declared again.

```javascript
var studentLevel = "Beginner";

var studentLevel = "Improving";
```

JavaScript allows this, but it can cause confusion.

`let` does not allow the same variable to be declared again in the same area.

```javascript
let learningStatus = "Starting";

let learningStatus = "In Progress";
```

This causes an error.

For beginner projects, use `let` and `const` instead of `var`.

---

## Reassignment and Redeclaration

Reassignment means giving an existing variable a new value.

```javascript
let score = 10;

score = 20;
```

Redeclaration means creating another variable using the same name.

```javascript
let score = 10;

let score = 20;
```

The second example is not allowed with `let` in the same area.

### Simple Difference

```text
Reassignment  = Change the stored value
Redeclaration = Create the same variable again
```

---

## Comparing `let`, `const`, and `var`

| Keyword | Can Be Reassigned? | Can Be Redeclared in the Same Area? | Modern Use |
|---|---:|---:|---|
| `let` | Yes | No | Recommended |
| `const` | No | No | Recommended |
| `var` | Yes | Yes | Usually avoided |

---

## Which Keyword Should I Use?

A simple beginner rule is:

### Use `const` First

Use `const` when the variable does not need reassignment.

```javascript
const courseName = "JavaScript";
```

### Use `let` When the Value Changes

Use `let` when the variable needs a new value later.

```javascript
let learningStatus = "Starting";

learningStatus = "In Progress";
```

### Recognize `var`

Understand `var` because it may appear in older code.

```javascript
var studentLevel = "Beginner";
```

Avoid using it for new JavaScript code unless there is a specific reason.

---

## Block Scope

Variables created with `let` and `const` use block scope.

A block is an area surrounded by curly braces.

```javascript
{
    let message = "Hello";
    const course = "JavaScript";
}
```

The variables belong to that block.

Variables created using `var` follow different scope rules.

Scope will become easier to understand after learning conditions, functions, and loops. For now, remember that `let` and `const` are safer choices for modern JavaScript.

---

## JavaScript Used in This Lesson

```javascript
// let can receive a new value
let learningStatus = "Starting";

learningStatus = "In Progress";

// const cannot be reassigned
const courseName = "JavaScript";

// var can receive a new value
var studentLevel = "Beginner";

studentLevel = "Improving";

// Display the values on the webpage
document.getElementById("let-output").textContent = learningStatus;

document.getElementById("const-output").textContent = courseName;

document.getElementById("var-output").textContent = studentLevel;

// Display the values in the browser console
console.log(learningStatus);

console.log(courseName);

console.log(studentLevel);
```

---

## Expected Output

When the webpage is opened:

- The page background appears light gray.
- The header and footer appear dark blue.
- Four white content sections appear.
- Three cards display the `let`, `const`, and `var` results.
- A comparison table explains the keywords.
- The `var` information card has a light-yellow background.

The variable cards display:

```text
Let Variable: In Progress
Const Variable: JavaScript
Var Variable: Improving
```

The browser console displays:

```text
In Progress
JavaScript
Improving
```

---

## Practice Examples

### Practice 1: Create a `let` Variable

Create a score variable:

```javascript
let score = 10;
```

Change its value:

```javascript
score = 20;
```

Display it:

```javascript
console.log(score);
```

Expected output:

```text
20
```

---

### Practice 2: Create a `const` Variable

Create a variable for your name:

```javascript
const studentName = "Mahroos";
```

Display it:

```javascript
console.log(studentName);
```

---

### Practice 3: Test `const` Reassignment

Create a constant:

```javascript
const languageName = "JavaScript";
```

Try to change it:

```javascript
languageName = "Python";
```

Open the browser console.

JavaScript displays an error because a `const` variable cannot be reassigned.

Remove the incorrect line after testing.

---

### Practice 4: Update a `let` Variable

```javascript
let projectStatus = "Not Started";

projectStatus = "In Progress";

projectStatus = "Completed";

console.log(projectStatus);
```

Expected output:

```text
Completed
```

The latest assigned value is stored.

---

### Practice 5: Recognize Older `var` Code

```javascript
var cityName = "Kuwait";

cityName = "Colombo";

console.log(cityName);
```

The code works, but modern JavaScript would normally use `let` because the value changes.

```javascript
let cityName = "Kuwait";

cityName = "Colombo";
```

---

## Common Beginner Mistakes

### Reassigning a `const` Variable

Incorrect:

```javascript
const courseName = "JavaScript";

courseName = "Python";
```

Use `let` if the value needs to change:

```javascript
let courseName = "JavaScript";

courseName = "Python";
```

---

### Creating `const` Without a Value

Incorrect:

```javascript
const courseName;
```

Correct:

```javascript
const courseName = "JavaScript";
```

---

### Writing `let` Again When Updating

Incorrect:

```javascript
let status = "Starting";

let status = "Completed";
```

Correct:

```javascript
let status = "Starting";

status = "Completed";
```

---

### Using `var` for Every Variable

Avoid:

```javascript
var studentName = "Mahroos";

var courseName = "JavaScript";
```

Prefer:

```javascript
const studentName = "Mahroos";

const courseName = "JavaScript";
```

---

### Thinking `const` Means the Value Must Be Uppercase

This is valid:

```javascript
const courseName = "JavaScript";
```

A `const` variable does not need an uppercase name.

Uppercase names may be used for special fixed values in some projects, but they are not required for every `const`.

---

## Important Notes

- `let`, `const`, and `var` create variables.
- A `let` variable can be reassigned.
- A `const` variable cannot be reassigned.
- A `const` variable must receive a value immediately.
- `var` is an older JavaScript keyword.
- Modern JavaScript normally uses `const` and `let`.
- Start with `const` when a value will not be reassigned.
- Use `let` when a value needs to change.
- Avoid redeclaring the same variable.
- JavaScript is case-sensitive.
- Use meaningful variable names.
- More detailed scope behaviour will be easier to understand in later lessons.

---

## Easy Way to Remember

Use this simple rule:

```text
const = Keep the same assignment
let   = Let the value change
var   = Older variable keyword
```

Recommended order:

```text
1. Try const
2. Use let if reassignment is needed
3. Avoid var for new code
```

---

## What I Learned

In this lesson, I learned:

- The difference between `let`, `const`, and `var`.
- How to create variables using each keyword.
- That a `let` variable can be reassigned.
- That a `const` variable cannot be reassigned.
- That `const` needs a value when it is declared.
- That `var` is an older JavaScript keyword.
- The difference between reassignment and redeclaration.
- Why `let` and `const` are recommended.
- The basic meaning of block scope.
- How to choose the correct keyword.

The next lesson is 07 - JavaScript Data Types.