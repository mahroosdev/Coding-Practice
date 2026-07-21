// ========================================
// Number Introduction
// ========================================

const lessonNumber = 11;

console.log("Number introduction:");
console.log(lessonNumber);
console.log(typeof lessonNumber);

document.getElementById("introduction-output").textContent =
    "Value: " + lessonNumber + "\n" +
    "Data type: " + typeof lessonNumber;


// ========================================
// Whole and Decimal Numbers
// ========================================

const wholeNumber = 25;
const decimalNumber = 25.75;

console.log("Whole and decimal numbers:");
console.log(wholeNumber);
console.log(decimalNumber);

document.getElementById("whole-number-output").textContent =
    "Value: " + wholeNumber + "\n" +
    "Type: " + typeof wholeNumber;

document.getElementById("decimal-number-output").textContent =
    "Value: " + decimalNumber + "\n" +
    "Type: " + typeof decimalNumber;


// ========================================
// Positive, Negative, and Zero
// ========================================

const positiveNumber = 50;
const negativeNumber = -20;
const zeroNumber = 0;

console.log("Positive, negative, and zero:");
console.log(positiveNumber);
console.log(negativeNumber);
console.log(zeroNumber);

document.getElementById("positive-output").textContent =
    "Value: " + positiveNumber;

document.getElementById("negative-output").textContent =
    "Value: " + negativeNumber;

document.getElementById("zero-output").textContent =
    "Value: " + zeroNumber;


// ========================================
// Number Calculations
// ========================================

const firstNumber = 20;
const secondNumber = 5;

const additionResult =
    firstNumber + secondNumber;

const subtractionResult =
    firstNumber - secondNumber;

const multiplicationResult =
    firstNumber * secondNumber;

const divisionResult =
    firstNumber / secondNumber;

const remainderResult =
    firstNumber % 6;

const exponentResult =
    secondNumber ** 2;

console.log("Number calculations:");
console.log(additionResult);
console.log(subtractionResult);
console.log(multiplicationResult);
console.log(divisionResult);
console.log(remainderResult);
console.log(exponentResult);

document.getElementById("addition-output").textContent =
    "Result: " + additionResult;

document.getElementById("subtraction-output").textContent =
    "Result: " + subtractionResult;

document.getElementById("multiplication-output").textContent =
    "Result: " + multiplicationResult;

document.getElementById("division-output").textContent =
    "Result: " + divisionResult;

document.getElementById("remainder-output").textContent =
    "Result: " + remainderResult;

document.getElementById("exponent-output").textContent =
    "Result: " + exponentResult;


// ========================================
// Numbers and Numeric Strings
// ========================================

const numberValue = 100;
const numericString = "100";

const numberAddition = numberValue + 50;
const stringJoining = numericString + 50;

console.log("Numbers and numeric strings:");
console.log(numberValue);
console.log(numericString);
console.log(numberAddition);
console.log(stringJoining);

document.getElementById("number-type-output").textContent =
    "Value: " + numberValue + "\n" +
    "Type: " + typeof numberValue;

document.getElementById("numeric-string-output").textContent =
    'Value: "' + numericString + '"\n' +
    "Type: " + typeof numericString;

document.getElementById("number-string-calculation-output").textContent =
    "100 + 50 = " + numberAddition + "\n" +
    '"100" + 50 = ' + stringJoining;


// ========================================
// Number()
// ========================================

const convertedWholeNumber =
    Number("250");

const convertedDecimalNumber =
    Number("25.75");

const convertedBooleanTrue =
    Number(true);

const convertedBooleanFalse =
    Number(false);

const convertedEmptyString =
    Number("");

console.log("Number conversions:");
console.log(convertedWholeNumber);
console.log(convertedDecimalNumber);
console.log(convertedBooleanTrue);
console.log(convertedBooleanFalse);
console.log(convertedEmptyString);

document.getElementById("number-conversion-output").textContent =
    'Number("250"): ' + convertedWholeNumber + "\n" +
    'Number("25.75"): ' + convertedDecimalNumber + "\n" +
    "Number(true): " + convertedBooleanTrue + "\n" +
    "Number(false): " + convertedBooleanFalse + "\n" +
    'Number(""): ' + convertedEmptyString;


// ========================================
// parseInt()
// ========================================

const parsedWholeNumber =
    parseInt("45.75");

const parsedTextNumber =
    parseInt("120px");

const parsedNegativeNumber =
    parseInt("-30");

console.log("parseInt():");
console.log(parsedWholeNumber);
console.log(parsedTextNumber);
console.log(parsedNegativeNumber);

document.getElementById("parse-int-output").textContent =
    'parseInt("45.75"): ' + parsedWholeNumber + "\n" +
    'parseInt("120px"): ' + parsedTextNumber + "\n" +
    'parseInt("-30"): ' + parsedNegativeNumber;


// ========================================
// parseFloat()
// ========================================

const parsedDecimalNumber =
    parseFloat("45.75");

const parsedDecimalText =
    parseFloat("19.99USD");

const parsedWholeAsFloat =
    parseFloat("100");

console.log("parseFloat():");
console.log(parsedDecimalNumber);
console.log(parsedDecimalText);
console.log(parsedWholeAsFloat);

document.getElementById("parse-float-output").textContent =
    'parseFloat("45.75"): ' + parsedDecimalNumber + "\n" +
    'parseFloat("19.99USD"): ' + parsedDecimalText + "\n" +
    'parseFloat("100"): ' + parsedWholeAsFloat;


// ========================================
// NaN
// ========================================

const invalidNumber =
    Number("JavaScript");

const invalidCalculation =
    10 * "Hello";

console.log("NaN:");
console.log(invalidNumber);
console.log(invalidCalculation);
console.log(typeof invalidNumber);
console.log(Number.isNaN(invalidNumber));

document.getElementById("nan-output").textContent =
    'Number("JavaScript"): ' + invalidNumber + "\n" +
    '10 * "Hello": ' + invalidCalculation + "\n" +
    "typeof NaN: " + typeof invalidNumber + "\n" +
    "Number.isNaN(result): " +
    Number.isNaN(invalidNumber);


// ========================================
// Infinity
// ========================================

const positiveInfinity =
    10 / 0;

const negativeInfinity =
    -10 / 0;

console.log("Infinity:");
console.log(positiveInfinity);
console.log(negativeInfinity);
console.log(typeof positiveInfinity);

document.getElementById("infinity-output").textContent =
    "10 / 0: " + positiveInfinity + "\n" +
    "-10 / 0: " + negativeInfinity + "\n" +
    "Data type: " + typeof positiveInfinity;


// ========================================
// toFixed()
// ========================================

const productPrice = 19.9876;

const twoDecimalPlaces =
    productPrice.toFixed(2);

const oneDecimalPlace =
    productPrice.toFixed(1);

const noDecimalPlaces =
    productPrice.toFixed(0);

console.log("toFixed():");
console.log(twoDecimalPlaces);
console.log(oneDecimalPlace);
console.log(noDecimalPlaces);
console.log(typeof twoDecimalPlaces);

document.getElementById("fixed-output").textContent =
    "Original number: " + productPrice + "\n" +
    "toFixed(2): " + twoDecimalPlaces + "\n" +
    "toFixed(1): " + oneDecimalPlace + "\n" +
    "toFixed(0): " + noDecimalPlaces + "\n" +
    "toFixed() result type: " +
    typeof twoDecimalPlaces;


// ========================================
// toString()
// ========================================

const completedLessons = 11;
const completedLessonsText =
    completedLessons.toString();

console.log("toString():");
console.log(completedLessons);
console.log(completedLessonsText);
console.log(typeof completedLessons);
console.log(typeof completedLessonsText);

document.getElementById("to-string-output").textContent =
    "Original value: " + completedLessons + "\n" +
    "Original type: " + typeof completedLessons + "\n" +
    "Converted value: " + completedLessonsText + "\n" +
    "Converted type: " + typeof completedLessonsText;


// ========================================
// Decimal Precision
// ========================================

const decimalCalculation =
    0.1 + 0.2;

const formattedDecimal =
    decimalCalculation.toFixed(2);

console.log("Decimal precision:");
console.log(decimalCalculation);
console.log(formattedDecimal);

document.getElementById("precision-output").textContent =
    "0.1 + 0.2 = " + decimalCalculation + "\n" +
    "Formatted with toFixed(2): " +
    formattedDecimal;