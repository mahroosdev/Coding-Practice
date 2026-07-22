// Parameter example

function greetUser(name) {
    return "Hello, " + name + "!";
}

const parameterMessage = greetUser("Mahroos");

document.getElementById("parameter-output").textContent =
    parameterMessage;


// Arguments

const firstGreeting = greetUser("Mahroos");
const secondGreeting = greetUser("Student");
const thirdGreeting = greetUser("Developer");

document.getElementById("argument-output").textContent =
    firstGreeting + "\n" +
    secondGreeting + "\n" +
    thirdGreeting;


// Multiple parameters

function addNumbers(firstNumber, secondNumber) {
    return firstNumber + secondNumber;
}

const firstTotal = addNumbers(10, 5);
const secondTotal = addNumbers(20, 15);

document.getElementById("multiple-parameter-output").textContent =
    "10 + 5 = " + firstTotal + "\n" +
    "20 + 15 = " + secondTotal;


// Return value

function multiplyNumbers(firstNumber, secondNumber) {
    return firstNumber * secondNumber;
}

const multiplicationResult =
    multiplyNumbers(6, 4);

document.getElementById("return-output").textContent =
    "6 × 4 = " + multiplicationResult;


// Store returned result

const storedTotal = addNumbers(50, 25);

document.getElementById("stored-return-output").textContent =
    "Returned value: " + storedTotal + "\n" +
    "The result was stored inside storedTotal.";


// String return value

function createFullName(firstName, lastName) {
    return firstName + " " + lastName;
}

const fullName =
    createFullName("Mahroos", "Mahthie");

document.getElementById("name-output").textContent =
    "Full name: " + fullName;


// Boolean return value

function isAdult(age) {
    return age >= 18;
}

const firstAgeResult = isAdult(20);
const secondAgeResult = isAdult(16);

document.getElementById("boolean-output").textContent =
    "Age 20 is adult: " + firstAgeResult + "\n" +
    "Age 16 is adult: " + secondAgeResult;


// Area function

function calculateArea(width, height) {
    return width * height;
}

const areaResult =
    calculateArea(8, 5);


// Example cards

document.getElementById("greeting-card-output").textContent =
    greetUser("Mahroos");

document.getElementById("addition-card-output").textContent =
    addNumbers(12, 8);

document.getElementById("area-card-output").textContent =
    areaResult;


console.log("Full name:", fullName);
console.log("Addition:", storedTotal);
console.log("Area:", areaResult);