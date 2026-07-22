// For loop introduction

let introductionNumbers = "";

for (let number = 1; number <= 5; number++) {
    introductionNumbers += number + "\n";
}

document.getElementById("introduction-output").textContent =
    introductionNumbers;


// Counting upward

let upwardResult = "";

for (let number = 1; number <= 5; number++) {
    upwardResult +=
        "Current number: " + number + "\n";
}

document.getElementById("count-up-output").textContent =
    upwardResult;


// Counting downward

let downwardResult = "";

for (let number = 5; number >= 1; number--) {
    downwardResult +=
        "Countdown: " + number + "\n";
}

document.getElementById("count-down-output").textContent =
    downwardResult;


// Increasing by two

let stepResult = "";

for (let number = 0; number <= 10; number += 2) {
    stepResult += number + "\n";
}

document.getElementById("step-output").textContent =
    stepResult;


// Looping through an array

const languages = [
    "HTML",
    "CSS",
    "JavaScript",
    "React"
];

let languageResult = "";

for (let index = 0; index < languages.length; index++) {
    languageResult +=
        "Index " + index + ": " +
        languages[index] + "\n";
}

document.getElementById("array-output").textContent =
    languageResult;


// Adding numbers

let total = 0;
let totalSteps = "";

for (let number = 1; number <= 5; number++) {
    total += number;

    totalSteps +=
        "Added " + number +
        " — Current total: " + total + "\n";
}

document.getElementById("total-output").textContent =
    totalSteps +
    "Final total: " + total;


console.log("Counting upward:");
console.log(upwardResult);

console.log("Counting downward:");
console.log(downwardResult);

console.log("Array values:");
console.log(languageResult);

console.log("Final total:", total);