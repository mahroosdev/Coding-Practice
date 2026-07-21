// let can receive a new value
let learningStatus = "Starting";

learningStatus = "In Progress";

// const cannot be reassigned
const courseName = "JavaScript";

// var can receive a new value
var studentLevel = "Beginner";

studentLevel = "Improving";

// Display the values on the webpage
document.getElementById("let-output").textContent = learningStatus;

document.getElementById("const-output").textContent = courseName;

document.getElementById("var-output").textContent = studentLevel;

// Display the values in the browser console
console.log(learningStatus);

console.log(courseName);

console.log(studentLevel);