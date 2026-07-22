// Array introduction

const languages = [
    "HTML",
    "CSS",
    "JavaScript"
];

document.getElementById("introduction-output").textContent =
    "Array values: " + languages;


// Creating an array

const projects = [
    "Calculator",
    "Dice Game",
    "Simon Game"
];

document.getElementById("creation-output").textContent =
    "Projects: " + projects + "\n" +
    "Number of projects: " + projects.length;


// Array indexes

document.getElementById("index-output").textContent =
    "Index 0: " + languages[0] + "\n" +
    "Index 1: " + languages[1] + "\n" +
    "Index 2: " + languages[2];


// Reading values

const firstLanguage = languages[0];
const secondLanguage = languages[1];
const thirdLanguage = languages[2];

document.getElementById("reading-output").textContent =
    "First language: " + firstLanguage + "\n" +
    "Second language: " + secondLanguage + "\n" +
    "Third language: " + thirdLanguage;


// Changing a value

const frameworks = [
    "Bootstrap",
    "CSS",
    "React"
];

const originalSecondValue = frameworks[1];

frameworks[1] = "Tailwind CSS";

document.getElementById("change-output").textContent =
    "Original second item: " + originalSecondValue + "\n" +
    "Updated second item: " + frameworks[1] + "\n" +
    "Updated array: " + frameworks;


// Array length

const courseTopics = [
    "Functions",
    "Arrays",
    "Objects",
    "Loops"
];

document.getElementById("length-output").textContent =
    "Topics: " + courseTopics + "\n" +
    "Number of topics: " + courseTopics.length;


// First and last items

const firstTopic = courseTopics[0];

const lastTopic =
    courseTopics[courseTopics.length - 1];

document.getElementById("first-last-output").textContent =
    "First topic: " + firstTopic + "\n" +
    "Last topic: " + lastTopic;


// Different array examples

const stringArray = [
    "HTML",
    "CSS",
    "JavaScript"
];

const numberArray = [
    10,
    20,
    30
];

const booleanArray = [
    true,
    false,
    true
];

document.getElementById("string-array-output").textContent =
    stringArray;

document.getElementById("number-array-output").textContent =
    numberArray;

document.getElementById("boolean-array-output").textContent =
    booleanArray;


console.log("Languages:", languages);
console.log("Projects:", projects);
console.log("Frameworks:", frameworks);
console.log("Topics:", courseTopics);