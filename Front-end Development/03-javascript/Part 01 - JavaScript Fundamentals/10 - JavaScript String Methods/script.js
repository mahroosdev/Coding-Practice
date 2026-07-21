 // ========================================
// String Method Introduction
// ========================================

const courseName = "JavaScript";
const uppercaseCourseName = courseName.toUpperCase();

console.log("String method introduction:");
console.log(courseName);
console.log(uppercaseCourseName);

document.getElementById("introduction-output").textContent =
    "Original value: " + courseName + "\n" +
    "Method result: " + uppercaseCourseName;


// ========================================
// toUpperCase()
// ========================================

const lowercaseText = "javascript fundamentals";
const uppercaseText = lowercaseText.toUpperCase();

console.log("toUpperCase():");
console.log(lowercaseText);
console.log(uppercaseText);

document.getElementById("uppercase-output").textContent =
    "Original: " + lowercaseText + "\n" +
    "Uppercase: " + uppercaseText;


// ========================================
// toLowerCase()
// ========================================

const capitalText = "SOFTWARE ENGINEER";
const lowercaseResult = capitalText.toLowerCase();

console.log("toLowerCase():");
console.log(capitalText);
console.log(lowercaseResult);

document.getElementById("lowercase-output").textContent =
    "Original: " + capitalText + "\n" +
    "Lowercase: " + lowercaseResult;


// ========================================
// trim()
// ========================================

const textWithSpaces = "   JavaScript Course   ";
const trimmedText = textWithSpaces.trim();

console.log("trim():");
console.log('"' + textWithSpaces + '"');
console.log('"' + trimmedText + '"');

document.getElementById("trim-output").textContent =
    'Original: "' + textWithSpaces + '"\n' +
    'Trimmed: "' + trimmedText + '"\n' +
    "Original length: " + textWithSpaces.length + "\n" +
    "Trimmed length: " + trimmedText.length;


// ========================================
// replace()
// ========================================

const originalMessage = "I am learning HTML.";
const replacedMessage =
    originalMessage.replace("HTML", "JavaScript");

console.log("replace():");
console.log(originalMessage);
console.log(replacedMessage);

document.getElementById("replace-output").textContent =
    "Original: " + originalMessage + "\n" +
    "Updated: " + replacedMessage;


// ========================================
// charAt()
// ========================================

const firstCharacter = courseName.charAt(0);
const fifthCharacter = courseName.charAt(4);
const missingCharacter = courseName.charAt(20);

console.log("charAt():");
console.log(firstCharacter);
console.log(fifthCharacter);
console.log(missingCharacter);

document.getElementById("char-at-output").textContent =
    "Character at index 0: " + firstCharacter + "\n" +
    "Character at index 4: " + fifthCharacter + "\n" +
    'Character at index 20: "' + missingCharacter + '"';


// ========================================
// slice()
// ========================================

const firstPart = courseName.slice(0, 4);
const secondPart = courseName.slice(4);
const finalPart = courseName.slice(-6);

console.log("slice():");
console.log(firstPart);
console.log(secondPart);
console.log(finalPart);

document.getElementById("slice-output").textContent =
    "slice(0, 4): " + firstPart + "\n" +
    "slice(4): " + secondPart + "\n" +
    "slice(-6): " + finalPart;


// ========================================
// substring()
// ========================================

const substringFirstPart =
    courseName.substring(0, 4);

const substringSecondPart =
    courseName.substring(4, 10);

console.log("substring():");
console.log(substringFirstPart);
console.log(substringSecondPart);

document.getElementById("substring-output").textContent =
    "substring(0, 4): " + substringFirstPart + "\n" +
    "substring(4, 10): " + substringSecondPart;


// ========================================
// includes()
// ========================================

const learningMessage =
    "I am learning JavaScript.";

const includesJavaScript =
    learningMessage.includes("JavaScript");

const includesPython =
    learningMessage.includes("Python");

console.log("includes():");
console.log(includesJavaScript);
console.log(includesPython);

document.getElementById("includes-output").textContent =
    'Contains "JavaScript": ' +
    includesJavaScript + "\n" +
    'Contains "Python": ' +
    includesPython;


// ========================================
// startsWith()
// ========================================

const startsWithIAm =
    learningMessage.startsWith("I am");

const startsWithJavaScript =
    learningMessage.startsWith("JavaScript");

console.log("startsWith():");
console.log(startsWithIAm);
console.log(startsWithJavaScript);

document.getElementById("starts-with-output").textContent =
    'Starts with "I am": ' +
    startsWithIAm + "\n" +
    'Starts with "JavaScript": ' +
    startsWithJavaScript;


// ========================================
// endsWith()
// ========================================

const endsWithPeriod =
    learningMessage.endsWith(".");

const endsWithJavaScript =
    learningMessage.endsWith("JavaScript");

console.log("endsWith():");
console.log(endsWithPeriod);
console.log(endsWithJavaScript);

document.getElementById("ends-with-output").textContent =
    'Ends with ".": ' +
    endsWithPeriod + "\n" +
    'Ends with "JavaScript": ' +
    endsWithJavaScript;


// ========================================
// indexOf()
// ========================================

const javaScriptPosition =
    learningMessage.indexOf("JavaScript");

const learningPosition =
    learningMessage.indexOf("learning");

const missingPosition =
    learningMessage.indexOf("Python");

console.log("indexOf():");
console.log(javaScriptPosition);
console.log(learningPosition);
console.log(missingPosition);

document.getElementById("index-of-output").textContent =
    '"JavaScript" begins at index: ' +
    javaScriptPosition + "\n" +
    '"learning" begins at index: ' +
    learningPosition + "\n" +
    '"Python" begins at index: ' +
    missingPosition;


// ========================================
// Method Demonstration Cards
// ========================================

document.getElementById("uppercase-card-output").textContent =
    "javascript".toUpperCase();

document.getElementById("lowercase-card-output").textContent =
    "JAVASCRIPT".toLowerCase();

document.getElementById("trim-card-output").textContent =
    "   JavaScript   ".trim();

document.getElementById("replace-card-output").textContent =
    "Learn HTML".replace("HTML", "JavaScript");

document.getElementById("includes-card-output").textContent =
    "JavaScript Course".includes("Course");

document.getElementById("index-card-output").textContent =
    "JavaScript".indexOf("Script");