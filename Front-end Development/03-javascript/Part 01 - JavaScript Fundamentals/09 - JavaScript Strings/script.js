// An expression produces a value
const expressionResult = 10 + 5;

console.log("Expression result:");
console.log(expressionResult);

document.getElementById("expression-output").textContent =
    "Expression: 10 + 5\n" +
    "Produced value: " + expressionResult;


// A statement performs a complete instruction
const statementResult = 20 + 10;

console.log("Statement result:");
console.log(statementResult);

document.getElementById("statement-output").textContent =
    "Statement: const statementResult = 20 + 10;\n" +
    "Stored value: " + statementResult;


// Different expression examples
const arithmeticExpression = 20 + 10;
const stringExpression = "Java" + "Script";
const comparisonExpression = 20 > 18;
const logicalExpression = true && false;

console.log("Expression Examples");

console.log("Arithmetic:", arithmeticExpression);
console.log("String:", stringExpression);
console.log("Comparison:", comparisonExpression);
console.log("Logical:", logicalExpression);

document.getElementById("arithmetic-expression").textContent =
    "Result: " + arithmeticExpression;

document.getElementById("string-expression").textContent =
    "Result: " + stringExpression;

document.getElementById("comparison-expression").textContent =
    "Result: " + comparisonExpression;

document.getElementById("logical-expression").textContent =
    "Result: " + logicalExpression;


// Statement examples
const courseName = "JavaScript";

let lessonNumber = 8;
lessonNumber = 9;

console.log(courseName);
console.log(lessonNumber);

document.getElementById("statement-example-output").textContent =
    "Variable declaration result: " + courseName + "\n" +
    "Assignment statement result: " + lessonNumber + "\n" +
    "The values were also displayed using console.log().";


// Expression inside a statement
const finalScore = 50 + 25;

console.log("Expression inside a statement:");
console.log(finalScore);

document.getElementById("inside-statement-output").textContent =
    "Expression: 50 + 25\n" +
    "Statement: const finalScore = 50 + 25;\n" +
    "Stored result: " + finalScore;


// JavaScript execution order
const firstNumber = 10;
const secondNumber = 5;
const answer = firstNumber + secondNumber;

console.log("Execution order result:");
console.log(answer);

document.getElementById("order-output").textContent =
    "Step 1: firstNumber stores 10\n" +
    "Step 2: secondNumber stores 5\n" +
    "Step 3: JavaScript adds both values\n" +
    "Step 4: answer stores " + answer;


// Multiple statements
const studentName = "Mahroos";
const currentLesson = 9;
const isLearning = true;
const lessonTitle = "Expressions and Statements";

const learningMessage =
    studentName + " is learning Lesson " + currentLesson + ".";

console.log("Multiple Statements");

console.log(studentName);
console.log(currentLesson);
console.log(isLearning);
console.log(lessonTitle);
console.log(learningMessage);

document.getElementById("multiple-statements-output").textContent =
    "Student: " + studentName + "\n" +
    "Lesson number: " + currentLesson + "\n" +
    "Lesson title: " + lessonTitle + "\n" +
    "Learning status: " + isLearning + "\n" +
    learningMessage;