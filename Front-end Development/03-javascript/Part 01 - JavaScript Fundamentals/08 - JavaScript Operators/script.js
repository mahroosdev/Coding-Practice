// Values used in arithmetic examples
const firstNumber = 12;
const secondNumber = 4;


// Arithmetic operators
const additionResult = firstNumber + secondNumber;
const subtractionResult = firstNumber - secondNumber;
const multiplicationResult = firstNumber * secondNumber;
const divisionResult = firstNumber / secondNumber;
const remainderResult = firstNumber % secondNumber;
const exponentResult = firstNumber ** 2;

console.log("Arithmetic Operators");

console.log("Addition:", additionResult);
console.log("Subtraction:", subtractionResult);
console.log("Multiplication:", multiplicationResult);
console.log("Division:", divisionResult);
console.log("Remainder:", remainderResult);
console.log("Exponentiation:", exponentResult);

document.getElementById("arithmetic-output").textContent =
    "12 + 4 = " + additionResult + "\n" +
    "12 - 4 = " + subtractionResult + "\n" +
    "12 × 4 = " + multiplicationResult + "\n" +
    "12 ÷ 4 = " + divisionResult + "\n" +
    "12 % 4 = " + remainderResult + "\n" +
    "12² = " + exponentResult;


// Display arithmetic results inside cards
document.getElementById("addition-result").textContent =
    "Result: " + additionResult;

document.getElementById("subtraction-result").textContent =
    "Result: " + subtractionResult;

document.getElementById("multiplication-result").textContent =
    "Result: " + multiplicationResult;

document.getElementById("division-result").textContent =
    "Result: " + divisionResult;

document.getElementById("remainder-result").textContent =
    "Result: " + remainderResult;

document.getElementById("exponent-result").textContent =
    "Result: " + exponentResult;


// Assignment operators
let score = 10;

const startingScore = score;

score += 5;
const scoreAfterAddition = score;

score -= 3;
const scoreAfterSubtraction = score;

score *= 2;
const scoreAfterMultiplication = score;

score /= 4;
const scoreAfterDivision = score;

console.log("Assignment Operators");

console.log("Starting score:", startingScore);
console.log("After += 5:", scoreAfterAddition);
console.log("After -= 3:", scoreAfterSubtraction);
console.log("After *= 2:", scoreAfterMultiplication);
console.log("After /= 4:", scoreAfterDivision);

document.getElementById("assignment-output").textContent =
    "Starting value: " + startingScore + "\n" +
    "After score += 5: " + scoreAfterAddition + "\n" +
    "After score -= 3: " + scoreAfterSubtraction + "\n" +
    "After score *= 2: " + scoreAfterMultiplication + "\n" +
    "After score /= 4: " + scoreAfterDivision;


// Comparison operators
const userAge = 20;
const requiredAge = 18;

const isGreater = userAge > requiredAge;
const isLess = userAge < requiredAge;
const isGreaterOrEqual = userAge >= requiredAge;
const isLessOrEqual = userAge <= requiredAge;
const isStrictlyEqual = userAge === requiredAge;
const isNotEqual = userAge !== requiredAge;

console.log("Comparison Operators");

console.log("20 > 18:", isGreater);
console.log("20 < 18:", isLess);
console.log("20 >= 18:", isGreaterOrEqual);
console.log("20 <= 18:", isLessOrEqual);
console.log("20 === 18:", isStrictlyEqual);
console.log("20 !== 18:", isNotEqual);

document.getElementById("comparison-output").textContent =
    "20 > 18: " + isGreater + "\n" +
    "20 < 18: " + isLess + "\n" +
    "20 >= 18: " + isGreaterOrEqual + "\n" +
    "20 <= 18: " + isLessOrEqual + "\n" +
    "20 === 18: " + isStrictlyEqual + "\n" +
    "20 !== 18: " + isNotEqual;


// Logical operators
const isLoggedIn = true;
const hasPermission = false;

const andResult = isLoggedIn && hasPermission;
const orResult = isLoggedIn || hasPermission;
const notLoggedInResult = !isLoggedIn;
const notPermissionResult = !hasPermission;

console.log("Logical Operators");

console.log("true && false:", andResult);
console.log("true || false:", orResult);
console.log("!true:", notLoggedInResult);
console.log("!false:", notPermissionResult);

document.getElementById("logical-output").textContent =
    "true && false: " + andResult + "\n" +
    "true || false: " + orResult + "\n" +
    "!true: " + notLoggedInResult + "\n" +
    "!false: " + notPermissionResult;


// Increment and decrement operators
let counter = 5;

const originalCounter = counter;

counter++;
const incrementedCounter = counter;

counter--;
const decrementedCounter = counter;

console.log("Increment and Decrement Operators");

console.log("Original counter:", originalCounter);
console.log("After counter++:", incrementedCounter);
console.log("After counter--:", decrementedCounter);

document.getElementById("counter-output").textContent =
    "Original value: " + originalCounter + "\n" +
    "After counter++: " + incrementedCounter + "\n" +
    "After counter--: " + decrementedCounter;


// String concatenation
const firstName = "Mahroos";
const lastName = "Mahthie";
const fullName = firstName + " " + lastName;

const courseName = "JavaScript";
const message = "I am learning " + courseName + ".";

console.log("String Concatenation");

console.log("Full name:", fullName);
console.log(message);

document.getElementById("string-output").textContent =
    "Full name: " + fullName + "\n" +
    message;