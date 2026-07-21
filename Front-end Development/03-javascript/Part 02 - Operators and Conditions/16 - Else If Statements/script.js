// Else if introduction

const value = 15;
let introductionMessage;

if (value > 20) {
    introductionMessage = "The value is greater than 20.";
} else if (value > 10) {
    introductionMessage = "The value is greater than 10.";
} else {
    introductionMessage = "The value is 10 or less.";
}

document.getElementById("introduction-output").textContent =
    "Value: " + value + "\n" +
    introductionMessage;


// Score grade

const studentScore = 82;
let grade;

if (studentScore >= 90) {
    grade = "Grade A";
} else if (studentScore >= 75) {
    grade = "Grade B";
} else if (studentScore >= 50) {
    grade = "Grade C";
} else {
    grade = "Failed";
}

document.getElementById("grade-output").textContent =
    "Student score: " + studentScore + "\n" +
    "Result: " + grade;


// Temperature check

const temperature = 28;
let temperatureMessage;

if (temperature >= 35) {
    temperatureMessage = "The weather is very hot.";
} else if (temperature >= 25) {
    temperatureMessage = "The weather is warm.";
} else if (temperature >= 15) {
    temperatureMessage = "The weather is cool.";
} else {
    temperatureMessage = "The weather is cold.";
}

document.getElementById("temperature-output").textContent =
    "Temperature: " + temperature + "°C\n" +
    temperatureMessage;


// Age group

const age = 24;
let ageGroup;

if (age < 13) {
    ageGroup = "Child";
} else if (age < 18) {
    ageGroup = "Teenager";
} else if (age < 60) {
    ageGroup = "Adult";
} else {
    ageGroup = "Senior";
}

document.getElementById("age-output").textContent =
    "Age: " + age + "\n" +
    "Age group: " + ageGroup;


// Traffic light

const trafficLight = "yellow";
let trafficMessage;

if (trafficLight === "green") {
    trafficMessage = "Go";
} else if (trafficLight === "yellow") {
    trafficMessage = "Prepare to stop";
} else if (trafficLight === "red") {
    trafficMessage = "Stop";
} else {
    trafficMessage = "Unknown traffic-light value";
}

document.getElementById("traffic-output").textContent =
    "Traffic light: " + trafficLight + "\n" +
    "Instruction: " + trafficMessage;


// User role

const userRole = "developer";
let roleMessage;

if (userRole === "admin") {
    roleMessage = "Administrator access granted.";
} else if (userRole === "developer") {
    roleMessage = "Developer workspace opened.";
} else if (userRole === "user") {
    roleMessage = "Public user page opened.";
} else {
    roleMessage = "Unknown user role.";
}

document.getElementById("role-output").textContent =
    "User role: " + userRole + "\n" +
    roleMessage;


console.log("Grade:", grade);
console.log("Temperature:", temperatureMessage);
console.log("Age group:", ageGroup);
console.log("Traffic:", trafficMessage);
console.log("Role:", roleMessage);