// While loop introduction

let introductionNumber = 1;
let introductionResult = "";

while (introductionNumber <= 5) {
    introductionResult +=
        introductionNumber + "\n";

    introductionNumber++;
}

document.getElementById(
    "while-introduction-output"
).textContent = introductionResult;


// Counting with while

let countNumber = 1;
let countResult = "";

while (countNumber <= 5) {
    countResult +=
        "Current number: " + countNumber + "\n";

    countNumber++;
}

document.getElementById("while-count-output").textContent =
    countResult;


// Countdown

let countdownNumber = 5;
let countdownResult = "";

while (countdownNumber >= 1) {
    countdownResult +=
        "Countdown: " + countdownNumber + "\n";

    countdownNumber--;
}

countdownResult += "Finished!";

document.getElementById("countdown-output").textContent =
    countdownResult;


// Looping through an array

const languages = [
    "HTML",
    "CSS",
    "JavaScript",
    "React"
];

let arrayIndex = 0;
let arrayResult = "";

while (arrayIndex < languages.length) {
    arrayResult +=
        "Index " + arrayIndex + ": " +
        languages[arrayIndex] + "\n";

    arrayIndex++;
}

document.getElementById("array-output").textContent =
    arrayResult;


// Do while loop

let doWhileNumber = 1;
let doWhileResult = "";

do {
    doWhileResult +=
        "Current number: " + doWhileNumber + "\n";

    doWhileNumber++;
} while (doWhileNumber <= 5);

document.getElementById("do-while-output").textContent =
    doWhileResult;


// Runs at least once

let startingNumber = 10;
let onceResult = "";

do {
    onceResult +=
        "The code ran with value: " +
        startingNumber;
} while (startingNumber < 5);

document.getElementById("once-output").textContent =
    onceResult;


console.log("While count:");
console.log(countResult);

console.log("Countdown:");
console.log(countdownResult);

console.log("Array loop:");
console.log(arrayResult);

console.log("Do while:");
console.log(doWhileResult);