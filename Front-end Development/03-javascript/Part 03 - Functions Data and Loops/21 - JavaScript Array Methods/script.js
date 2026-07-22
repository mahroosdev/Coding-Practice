// Array method introduction

const introductionLanguages = [
    "HTML",
    "CSS",
    "JavaScript"
];

introductionLanguages.push("React");

document.getElementById("introduction-output").textContent =
    "Updated array: " + introductionLanguages;


// push()

const pushLanguages = [
    "HTML",
    "CSS"
];

const pushLength =
    pushLanguages.push("JavaScript");

document.getElementById("push-output").textContent =
    "Updated array: " + pushLanguages + "\n" +
    "New array length: " + pushLength;


// pop()

const popProjects = [
    "Calculator",
    "Dice Game",
    "Simon Game"
];

const removedProject =
    popProjects.pop();

document.getElementById("pop-output").textContent =
    "Removed item: " + removedProject + "\n" +
    "Updated array: " + popProjects;


// unshift()

const unshiftTopics = [
    "CSS",
    "JavaScript"
];

const unshiftLength =
    unshiftTopics.unshift("HTML");

document.getElementById("unshift-output").textContent =
    "Updated array: " + unshiftTopics + "\n" +
    "New array length: " + unshiftLength;


// shift()

const shiftFrameworks = [
    "Bootstrap",
    "Tailwind CSS",
    "React"
];

const removedFramework =
    shiftFrameworks.shift();

document.getElementById("shift-output").textContent =
    "Removed item: " + removedFramework + "\n" +
    "Updated array: " + shiftFrameworks;


// indexOf()

const indexLanguages = [
    "HTML",
    "CSS",
    "JavaScript",
    "React"
];

const javaScriptIndex =
    indexLanguages.indexOf("JavaScript");

const pythonIndex =
    indexLanguages.indexOf("Python");

document.getElementById("index-output").textContent =
    "JavaScript index: " + javaScriptIndex + "\n" +
    "Python index: " + pythonIndex;


// includes()

const includedSkills = [
    "HTML",
    "CSS",
    "JavaScript"
];

const hasJavaScript =
    includedSkills.includes("JavaScript");

const hasPython =
    includedSkills.includes("Python");

document.getElementById("includes-output").textContent =
    "Contains JavaScript: " + hasJavaScript + "\n" +
    "Contains Python: " + hasPython;


// join()

const joinedTechnologies = [
    "HTML",
    "CSS",
    "JavaScript"
];

const joinedText =
    joinedTechnologies.join(" | ");

document.getElementById("join-output").textContent =
    "Array: " + joinedTechnologies + "\n" +
    "Joined string: " + joinedText;


// splice()

const spliceLanguages = [
    "HTML",
    "CSS",
    "JavaScript",
    "React"
];

const removedItems =
    spliceLanguages.splice(1, 1, "Tailwind CSS");

document.getElementById("splice-output").textContent =
    "Removed item: " + removedItems + "\n" +
    "Updated array: " + spliceLanguages;


console.log("push:", pushLanguages);
console.log("pop:", popProjects);
console.log("unshift:", unshiftTopics);
console.log("shift:", shiftFrameworks);
console.log("splice:", spliceLanguages);