# 09 - JavaScript Expressions and Statements

## Introduction

In the previous lesson, I learned about JavaScript operators.

In this lesson, I am learning about JavaScript expressions and statements.

Expressions and statements are two important parts of JavaScript code.

An expression produces a value.

A statement is a complete instruction.

Example:

```javascript
const total = 10 + 5;
```

In this code:

```javascript
10 + 5
```

is an expression.

The complete line:

```javascript
const total = 10 + 5;
```

is a statement.

---

## Folder Structure

```text
09 - JavaScript Expressions and Statements/
│
├── index.html
├── style.css
├── script.js
└── README.md
```

---

# What Is an Expression?

An expression is JavaScript code that produces a value.

Example:

```javascript
10 + 5
```

This expression produces:

```text
15
```

Another example:

```javascript
20 > 18
```

This expression produces:

```text
true
```

Expressions can produce different data types.

They can produce:

- Strings
- Numbers
- Booleans
- Other JavaScript values

---

## Number Expression

A number expression produces a number.

Example:

```javascript
20 + 10
```

Result:

```text
30
```

Another example:

```javascript
10 * 5
```

Result:

```text
50
```

---

## String Expression

A string expression produces text.

Example:

```javascript
"Java" + "Script"
```

Result:

```text
JavaScript
```

The plus operator joins the two strings.

Another example:

```javascript
"Hello, " + "Mahroos"
```

Result:

```text
Hello, Mahroos
```

---

## Comparison Expression

A comparison expression produces a boolean value.

Example:

```javascript
20 > 18
```

Result:

```text
true
```

Another example:

```javascript
10 === "10"
```

Result:

```text
false
```

The values use different data types.

---

## Logical Expression

A logical expression also produces a value.

Example:

```javascript
true && false
```

Result:

```text
false
```

Another example:

```javascript
true || false
```

Result:

```text
true
```

---

## Variable Expression

A variable can be used inside an expression.

Example:

```javascript
const firstNumber = 10;
const secondNumber = 5;

const result = firstNumber + secondNumber;
```

The expression is:

```javascript
firstNumber + secondNumber
```

It produces:

```text
15
```

---

# What Is a Statement?

A statement is a complete instruction that tells JavaScript to perform an action.

Example:

```javascript
const courseName = "JavaScript";
```

This statement tells JavaScript to:

1. Create a variable named `courseName`.
2. Store the string `"JavaScript"` inside it.

Statements often end with a semicolon.

```javascript
;
```

---

# Variable Declaration Statements

A variable declaration statement creates a variable.

Example using `const`:

```javascript
const studentName = "Mahroos";
```

Example using `let`:

```javascript
let lessonNumber = 9;
```

The entire line is a statement.

The assigned values are expressions.

---

## Declaration Without a Value

A variable can be declared without immediately receiving a value.

```javascript
let nextLesson;
```

This is still a statement.

The variable initially contains:

```text
undefined
```

A value can be assigned later:

```javascript
nextLesson = "JavaScript Comments";
```

---

# Assignment Statements

An assignment statement gives a value to an existing variable.

Example:

```javascript
let lessonNumber = 8;

lessonNumber = 9;
```

The first statement creates the variable.

```javascript
let lessonNumber = 8;
```

The second statement changes its value.

```javascript
lessonNumber = 9;
```

---

## Assignment with an Expression

An assignment can contain an expression.

```javascript
let score = 10;

score = score + 5;
```

The expression is:

```javascript
score + 5
```

The assignment statement is:

```javascript
score = score + 5;
```

The new value becomes:

```text
15
```

---

# Method Call Statements

A method call can be used as a complete statement.

Example:

```javascript
console.log("Hello");
```

This statement tells JavaScript to display a message in the browser console.

Another example:

```javascript
document.getElementById("output").textContent = "Hello";
```

This statement changes the content of an HTML element.

---

# Expressions Inside Statements

Expressions are commonly used inside statements.

Example:

```javascript
const finalScore = 50 + 25;
```

The expression is:

```javascript
50 + 25
```

It produces:

```text
75
```

The complete statement is:

```javascript
const finalScore = 50 + 25;
```

It stores the result inside `finalScore`.

---

## Another Example

```javascript
const firstName = "Mahroos";
const lastName = "Mahthie";

const fullName = firstName + " " + lastName;
```

The expression is:

```javascript
firstName + " " + lastName
```

It produces:

```text
Mahroos Mahthie
```

The statement stores the produced value inside `fullName`.

---

# Expression Statements

An expression can sometimes be written as a complete statement.

Example:

```javascript
counter++;
```

The expression increases the variable by one.

Because it is written as a complete instruction, it is also an expression statement.

Another example:

```javascript
score += 5;
```

This updates the value stored inside `score`.

---

# JavaScript Execution Order

JavaScript normally runs statements from top to bottom.

Example:

```javascript
const firstNumber = 10;
const secondNumber = 5;
const answer = firstNumber + secondNumber;

console.log(answer);
```

JavaScript runs the statements in this order:

### Step 1

```javascript
const firstNumber = 10;
```

The variable `firstNumber` stores `10`.

### Step 2

```javascript
const secondNumber = 5;
```

The variable `secondNumber` stores `5`.

### Step 3

```javascript
const answer = firstNumber + secondNumber;
```

JavaScript adds the two numbers and stores `15`.

### Step 4

```javascript
console.log(answer);
```

The console displays:

```text
15
```

---

## Order Matters

Statements must appear in a logical order.

Correct:

```javascript
const courseName = "JavaScript";

console.log(courseName);
```

Incorrect order:

```javascript
console.log(courseName);

const courseName = "JavaScript";
```

The variable is used before it is created.

This can produce an error.

For beginner projects, create variables before using them.

---

# Semicolons

A semicolon can mark the end of a JavaScript statement.

Example:

```javascript
const language = "JavaScript";
```

The semicolon is:

```javascript
;
```

JavaScript can sometimes insert semicolons automatically.

This may also work:

```javascript
const language = "JavaScript"
```

However, this course uses semicolons to make statement endings clear and consistent.

Recommended:

```javascript
const studentName = "Mahroos";
const lessonNumber = 9;
console.log(studentName);
```

---

## One Statement Per Line

Writing one statement per line makes code easier to read.

Recommended:

```javascript
const firstName = "Mahroos";
const lastName = "Mahthie";
const fullName = firstName + " " + lastName;
```

Avoid writing everything on one line:

```javascript
const firstName = "Mahroos"; const lastName = "Mahthie"; const fullName = firstName + " " + lastName;
```

Both versions may work, but the first version is easier to read and maintain.

---

# Whitespace in JavaScript

Whitespace includes:

- Spaces
- Empty lines
- Indentation
- Line breaks

JavaScript usually ignores extra whitespace between parts of a statement.

These examples work similarly:

```javascript
const total = 10 + 5;
```

```javascript
const total=10+5;
```

The first version is easier to read.

Use spaces around operators:

```javascript
const total = 10 + 5;
```

Avoid:

```javascript
const total=10+5;
```

---

## Empty Lines

Empty lines can separate related parts of a program.

Example:

```javascript
const firstName = "Mahroos";
const lastName = "Mahthie";

const fullName = firstName + " " + lastName;

console.log(fullName);
```

The empty lines make the code easier to understand.

---

# Multiple Statements

A JavaScript program usually contains many statements.

Example:

```javascript
const studentName = "Mahroos";
const lessonNumber = 9;
const isLearning = true;
const lessonTitle = "Expressions and Statements";

const learningMessage =
    studentName + " is learning Lesson " + lessonNumber + ".";

console.log(studentName);
console.log(lessonNumber);
console.log(isLearning);
console.log(lessonTitle);
console.log(learningMessage);
```

Each complete instruction is a statement.

Some statements contain expressions.

---

# Breaking a Long Statement

A long statement can be divided across multiple lines.

Example:

```javascript
const learningMessage =
    studentName + " is learning Lesson " + lessonNumber + ".";
```

This is still one statement.

It ends at the semicolon.

Breaking long code across lines can improve readability.

---

# Statement Blocks

A block groups statements inside curly braces.

Example:

```javascript
{
    const message = "Inside the block";

    console.log(message);
}
```

The block begins with:

```javascript
{
```

The block ends with:

```javascript
}
```

Blocks will become more important when learning:

- Conditions
- Loops
- Functions

For now, remember that a block groups related statements.

---

# Expressions Versus Statements

## Expression

```javascript
10 + 5
```

This produces a value:

```text
15
```

## Statement

```javascript
const total = 10 + 5;
```

This performs a complete instruction.

It creates a variable and stores the value.

---

## Another Comparison

Expression:

```javascript
firstName + " " + lastName
```

Statement:

```javascript
const fullName = firstName + " " + lastName;
```

The expression creates a full-name value.

The statement stores that value inside a variable.

---

# JavaScript Used in This Lesson

## Arithmetic Expression

```javascript
const arithmeticExpression = 20 + 10;
```

## String Expression

```javascript
const stringExpression = "Java" + "Script";
```

## Comparison Expression

```javascript
const comparisonExpression = 20 > 18;
```

## Logical Expression

```javascript
const logicalExpression = true && false;
```

## Declaration Statement

```javascript
const courseName = "JavaScript";
```

## Assignment Statement

```javascript
let lessonNumber = 8;

lessonNumber = 9;
```

## Console Statement

```javascript
console.log(courseName);
```

---

# Expected Webpage Output

When the webpage opens:

- A dark-blue header is displayed.
- White lesson sections appear on a light-gray background.
- Expression results appear inside dark output boxes.
- Cards display arithmetic, string, comparison, and logical expressions.
- Statement examples explain declarations, assignments, and console output.
- An example separates an expression from its complete statement.
- JavaScript execution order is shown step by step.
- Semicolon examples compare recommended and possible styles.
- A table summarizes expressions and statements.
- The layout adjusts for smaller screens.

The expression cards display:

```text
Result: 30
Result: JavaScript
Result: true
Result: false
```

---

# Practice Examples

## Practice 1: Create a Number Expression

Add:

```javascript
const practiceResult = 25 + 15;

console.log(practiceResult);
```

Expected output:

```text
40
```

The expression is:

```javascript
25 + 15
```

---

## Practice 2: Create a String Expression

Add:

```javascript
const greeting = "Hello, " + "JavaScript";

console.log(greeting);
```

Expected output:

```text
Hello, JavaScript
```

---

## Practice 3: Create a Comparison Expression

Add:

```javascript
const ageCheck = 20 >= 18;

console.log(ageCheck);
```

Expected output:

```text
true
```

---

## Practice 4: Create a Declaration Statement

Add:

```javascript
const projectName = "Coding Practice";

console.log(projectName);
```

The first line creates the variable.

The second line displays its value.

---

## Practice 5: Create an Assignment Statement

Add:

```javascript
let completedLessons = 8;

completedLessons = 9;

console.log(completedLessons);
```

Expected output:

```text
9
```

---

## Practice 6: Use an Expression Inside a Statement

Add:

```javascript
const price = 20;
const quantity = 3;

const totalPrice = price * quantity;

console.log(totalPrice);
```

Expected output:

```text
60
```

The expression is:

```javascript
price * quantity
```

The complete statement is:

```javascript
const totalPrice = price * quantity;
```

---

## Practice 7: Test Execution Order

Add:

```javascript
const firstValue = 5;
const secondValue = 10;
const combinedValue = firstValue + secondValue;

console.log(combinedValue);
```

Expected output:

```text
15
```

Move the `console.log()` statement above the variable declarations and observe the error.

Change the order back after testing.

---

## Practice 8: Join a Long Message

Add:

```javascript
const student = "Mahroos";
const subject = "JavaScript";

const message =
    student + " is currently learning " + subject + ".";

console.log(message);
```

Expected output:

```text
Mahroos is currently learning JavaScript.
```

---

# Common Beginner Mistakes

## Thinking Every Line Is an Expression

This is an expression:

```javascript
10 + 5
```

This is a statement:

```javascript
const result = 10 + 5;
```

The statement contains an expression.

---

## Forgetting to Store an Expression Result

This expression produces a result:

```javascript
10 + 5;
```

However, the result is not stored.

Store it inside a variable:

```javascript
const result = 10 + 5;
```

---

## Using a Variable Before Declaring It

Incorrect:

```javascript
console.log(studentName);

const studentName = "Mahroos";
```

Correct:

```javascript
const studentName = "Mahroos";

console.log(studentName);
```

---

## Forgetting the Assignment Operator

Incorrect:

```javascript
const total 10 + 5;
```

Correct:

```javascript
const total = 10 + 5;
```

The assignment operator stores the expression result inside the variable.

---

## Using `const` When the Value Must Change

Incorrect:

```javascript
const score = 10;

score = 20;
```

Correct:

```javascript
let score = 10;

score = 20;
```

Use `let` when a value must be reassigned.

---

## Writing Several Statements Without Clear Spacing

Difficult to read:

```javascript
const firstName="Mahroos";const lastName="Mahthie";console.log(firstName+lastName);
```

Better:

```javascript
const firstName = "Mahroos";
const lastName = "Mahthie";

console.log(firstName + " " + lastName);
```

---

## Forgetting Quotation Marks Around Strings

Incorrect:

```javascript
const language = JavaScript;
```

Correct:

```javascript
const language = "JavaScript";
```

---

## Forgetting to Connect `script.js`

Make sure the HTML contains:

```html
<script src="script.js"></script>
```

Place it before the closing `</body>` tag.

---

# Important Notes

- An expression produces a value.
- A statement performs a complete instruction.
- Statements can contain expressions.
- Arithmetic expressions produce numbers.
- String expressions produce text.
- Comparison expressions usually produce booleans.
- Variable declarations are statements.
- Assignments are statements.
- `console.log()` can be used as a statement.
- JavaScript normally runs statements from top to bottom.
- Code order matters.
- A semicolon can mark the end of a statement.
- This course uses semicolons consistently.
- Write one statement per line when possible.
- Spaces and empty lines improve readability.
- A block groups statements inside curly braces.
- Create variables before using them.

---

# Easy Way to Remember

```text
Expression = Produces a value
Statement  = Performs an instruction
```

Example:

```javascript
10 + 5
```

Produces:

```text
15
```

Complete statement:

```javascript
const total = 10 + 5;
```

Remember:

```text
Expression goes inside the statement.
Statement performs the full action.
```

---

# What I Learned

In this lesson, I learned:

- What a JavaScript expression is.
- What a JavaScript statement is.
- The difference between expressions and statements.
- How arithmetic expressions produce numbers.
- How string expressions produce text.
- How comparison expressions produce boolean values.
- How logical expressions work.
- How expressions are used inside statements.
- What a variable declaration statement is.
- What an assignment statement is.
- How method calls can be used as statements.
- How JavaScript executes statements from top to bottom.
- Why statement order matters.
- How semicolons mark statement endings.
- Why one statement per line is easier to read.
- How whitespace improves code readability.
- How blocks group related statements.

The next lesson is **10 - JavaScript Comments**.