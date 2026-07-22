// Loop introduction

let introductionNumbers = "";

for (let number = 1; number <= 5; number++) {
    introductionNumbers += number + "\n";
}

document.getElementById("introduction-output").textContent =
    introductionNumbers;


// Repeated code without a loop

let repeatedMessages = "";

repeatedMessages += "JavaScript message 1\n";
repeatedMessages += "JavaScript message 2\n";
repeatedMessages += "JavaScript message 3\n";

document.getElementById("repeated-output").textContent =
    repeatedMessages;


// Repeated code with a loop

let loopMessages = "";

for (let count = 1; count <= 3; count++) {
    loopMessages +=
        "JavaScript message " + count + "\n";
}

document.getElementById("loop-output").textContent =
    loopMessages;


// Looping through an array

const languages = [
    "HTML",
    "CSS",
    "JavaScript",
    "React"
];

let languageList = "";

for (let index = 0; index < languages.length; index++) {
    languageList +=
        "Index " + index + ": " +
        languages[index] + "\n";
}

document.getElementById("array-loop-output").textContent =
    languageList;


console.log("Introduction numbers:");
console.log(introductionNumbers);

console.log("Loop messages:");
console.log(loopMessages);

console.log("Languages:");
console.log(languageList);