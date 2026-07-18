# 05 - JavaScript Variables

## Introduction

In the previous lesson, I learned about JavaScript statements and comments.

In this lesson, I am learning about JavaScript variables.

Variables are used to store values that a JavaScript program needs.

---

## Folder Structure

```text
05 - JavaScript Variables/
│
├── index.html
├── style.css
├── script.js
└── README.md
```

---

## What is a Variable?

A variable is a named container used to store a value.

Example:

```javascript
let studentName = "Mahroos";
```

This statement creates a variable named `studentName`.

The variable stores the value:

```text
Mahroos
```

The value can later be used by writing the variable name.

```javascript
console.log(studentName);
```

Console output:

```text
Mahroos
```

---

## Parts of a Variable

Look at this example:

```javascript
let courseName = "JavaScript";
```

It contains four main parts.

### `let`

```javascript
let
```

The `let` keyword is used to create a variable.

The different variable keywords will be explained in the next lesson.

### Variable Name

```javascript
courseName
```

This is the name of the variable.

The name is used when accessing the stored value.

### Assignment Operator

```javascript
=
```

The equals symbol assigns a value to the variable.

It places the value on the right side inside the variable on the left side.

### Variable Value

```javascript
"JavaScript"
```

This is the value stored inside the variable.

### Semicolon

```javascript
;
```

The semicolon marks the end of the JavaScript statement.

---

## Creating a Variable

Creating a variable is also called declaring a variable.

```javascript
let studentName;
```

This creates the variable, but it does not give the variable a value yet.

A value can be assigned later.

```javascript
studentName = "Mahroos";
```

A variable can also be declared and given a value in one statement.

```javascript
let studentName = "Mahroos";
```

This is the method used in most examples in this lesson.

---

## Using a Variable

After creating a variable, its value can be used by writing the variable name.

```javascript
let courseName = "JavaScript";

console.log(courseName);
```

Do not place the variable name inside quotation marks.

Correct:

```javascript
console.log(courseName);
```

Output:

```text
JavaScript
```

If quotation marks are added:

```javascript
console.log("courseName");
```

the console displays:

```text
courseName
```

This displays the text itself instead of the stored variable value.

---

## Changing a Variable Value

A variable created with `let` can receive a new value.

```javascript
let learningStatus = "Starting";

learningStatus = "In Progress";
```

The first value is:

```text
Starting
```

The new value is:

```text
In Progress
```

After the update, the variable stores the latest value.

```javascript
console.log(learningStatus);
```

Output:

```text
In Progress
```

The `let` keyword is not written again when changing the existing variable.

Correct:

```javascript
let learningStatus = "Starting";

learningStatus = "In Progress";
```

---

## Text and Number Values

This lesson stores both text and numbers.

### Text Value

```javascript
let studentName = "Mahroos";
```

Text is placed inside quotation marks.

### Number Value

```javascript
let lessonNumber = 5;
```

Numbers do not need quotation marks.

JavaScript data types will be explained in a later lesson.

---

## Displaying Variables in the Console

A variable can be displayed using `console.log()`.

```javascript
let courseName = "JavaScript";

console.log(courseName);
```

Expected output:

```text
JavaScript
```

The JavaScript in this lesson displays four variable values.

```javascript
console.log(studentName);

console.log(courseName);

console.log(lessonNumber);

console.log(learningStatus);
```

---

## Displaying Variables on the Webpage

A variable value can also be added to an HTML element.

HTML:

```html
<p id="student-name">Waiting for JavaScript...</p>
```

JavaScript:

```javascript
document.getElementById("student-name").textContent = studentName;
```

The paragraph changes from:

```text
Waiting for JavaScript...
```

to:

```text
Mahroos
```

Selecting and changing HTML elements will be covered in detail during the DOM lessons.

---

## Variable Naming Rules

JavaScript variable names must follow some rules.

### A Variable Name Can Use Letters

```javascript
let name;
```

### A Variable Name Can Use Numbers

A number can appear after the first character.

```javascript
let student1;
```

A variable name should not begin with a number.

Incorrect:

```javascript
let 1student;
```

### A Variable Name Can Use an Underscore

```javascript
let student_name;
```

### A Variable Name Can Use a Dollar Sign

```javascript
let $price;
```

This is valid, but simple beginner variable names normally use letters and camel case.

### Spaces Are Not Allowed

Incorrect:

```javascript
let student name;
```

Correct:

```javascript
let studentName;
```

### Reserved JavaScript Words Cannot Be Used

Incorrect:

```javascript
let let;
```

Words that have a special purpose in JavaScript should not be used as variable names.

---

## Camel Case Variable Names

Camel case is a common way to write JavaScript variable names containing multiple words.

Example:

```javascript
let studentName;
```

The first word begins with a lowercase letter.

The next word begins with an uppercase letter.

More examples:

```javascript
let courseName;

let lessonNumber;

let learningStatus;
```

Camel case makes variable names easier to read.

---

## Meaningful Variable Names

A variable name should describe the value it stores.

Good:

```javascript
let studentName = "Mahroos";
```

Less clear:

```javascript
let x = "Mahroos";
```

Meaningful names make the code easier to understand.

Other good examples:

```javascript
let courseName = "JavaScript";

let lessonNumber = 5;

let learningStatus = "In Progress";
```

---

## JavaScript is Case-Sensitive

Variable names are case-sensitive.

These are treated as different names:

```javascript
studentName
studentname
StudentName
```

If the variable was created as:

```javascript
let studentName = "Mahroos";
```

it should be used with the same uppercase and lowercase letters.

Correct:

```javascript
console.log(studentName);
```

Incorrect:

```javascript
console.log(StudentName);
```

---

## JavaScript Used in This Lesson

```javascript
// Create variables and store values
let studentName = "Mahroos";

let courseName = "JavaScript";

let lessonNumber = 5;

let learningStatus = "Starting";

// Change the value stored in a variable
learningStatus = "In Progress";

// Display variable values on the webpage
document.getElementById("student-name").textContent = studentName;

document.getElementById("course-name").textContent = courseName;

document.getElementById("lesson-number").textContent = lessonNumber;

document.getElementById("learning-status").textContent = learningStatus;

// Display variable values in the browser console
console.log(studentName);

console.log(courseName);

console.log(lessonNumber);

console.log(learningStatus);
```

---

## Expected Output

When the webpage is opened:

- The page background appears light gray.
- The header and footer appear dark blue.
- Four white content sections appear.
- The variable cards display values added by JavaScript.
- The reason cards explain why variables are useful.
- The console example has a dark background.

The variable cards display:

```text
Student Name: Mahroos
Course Name: JavaScript
Lesson Number: 5
Learning Status: In Progress
```

The browser console displays:

```text
Mahroos
JavaScript
5
In Progress
```

---

## Practice Examples

### Practice 1: Change the Student Name

Change:

```javascript
let studentName = "Mahroos";
```

To your preferred name:

```javascript
let studentName = "Your Name";
```

Save the file and refresh the browser.

---

### Practice 2: Change the Course Name

Change:

```javascript
let courseName = "JavaScript";
```

To:

```javascript
let courseName = "Web Development";
```

---

### Practice 3: Create a New Variable

Create a variable for your role.

```javascript
let studentRole = "Junior Software Engineer";
```

Display it in the console:

```javascript
console.log(studentRole);
```

---

### Practice 4: Change a Variable Value

Create a variable:

```javascript
let projectStatus = "Not Started";
```

Change its value:

```javascript
projectStatus = "Completed";
```

Display the final value:

```javascript
console.log(projectStatus);
```

Expected output:

```text
Completed
```

---

### Practice 5: Test Quotation Marks

Compare:

```javascript
console.log(courseName);
```

and:

```javascript
console.log("courseName");
```

The first statement displays the stored value.

The second statement displays the word `courseName`.

---

## Common Beginner Mistakes

### Using Spaces in a Variable Name

Incorrect:

```javascript
let student name = "Mahroos";
```

Correct:

```javascript
let studentName = "Mahroos";
```

---

### Starting with a Number

Incorrect:

```javascript
let 1lesson = "JavaScript";
```

Correct:

```javascript
let lesson1 = "JavaScript";
```

---

### Using the Wrong Capital Letters

Created variable:

```javascript
let courseName = "JavaScript";
```

Incorrect:

```javascript
console.log(CourseName);
```

Correct:

```javascript
console.log(courseName);
```

---

### Adding Quotation Marks Around a Variable Name

Incorrect when trying to access the stored value:

```javascript
console.log("studentName");
```

Correct:

```javascript
console.log(studentName);
```

---

### Forgetting to Assign a Value

This variable has no assigned value:

```javascript
let studentName;
```

If it is displayed immediately:

```javascript
console.log(studentName);
```

the console displays:

```text
undefined
```

This means a value has not been assigned yet.

---

## Important Notes

- A variable is a named container for a value.
- The `let` keyword can create a variable.
- The equals symbol assigns a value.
- Text values use quotation marks.
- Number values do not need quotation marks.
- A variable value can be accessed using its name.
- A `let` variable can receive a new value.
- Do not write `let` again when updating an existing variable.
- Variable names cannot contain spaces.
- Variable names should be meaningful.
- Camel case is commonly used for JavaScript variable names.
- JavaScript variable names are case-sensitive.
- The different variable keywords will be covered in the next lesson.

---

## Easy Way to Remember

Think of a variable as a labelled box.

```text
Label: studentName
Value: Mahroos
```

JavaScript:

```javascript
let studentName = "Mahroos";
```

Remember the pattern:

```javascript
let variableName = value;
```

---

## What I Learned

In this lesson, I learned:

- What a JavaScript variable is.
- Why variables are useful.
- How to create a variable using `let`.
- How to assign a value to a variable.
- How to access a stored value.
- How to change a variable value.
- How to display variables in the console.
- How to display variables on a webpage.
- The basic rules for naming variables.
- How to use camel case.
- Why meaningful variable names are important.
- That JavaScript variable names are case-sensitive.

The next lesson is 06 - Let, Const and Var.
