// ========================================
// Logical Operator Introduction
// ========================================

const introductionResult = true && false;

console.log("Logical operator introduction:");
console.log(introductionResult);
console.log(typeof introductionResult);

document.getElementById("introduction-output").textContent =
    "true && false: " + introductionResult + "\n" +
    "Result type: " + typeof introductionResult;


// ========================================
// Logical AND
// ========================================

const isLoggedIn = true;
const hasPermission = false;

const andResult =
    isLoggedIn && hasPermission;

console.log("Logical AND:");
console.log(andResult);

document.getElementById("and-output").textContent =
    "Logged in: " + isLoggedIn + "\n" +
    "Has permission: " + hasPermission + "\n" +
    "Can continue: " + andResult;


// AND result cards

document.getElementById("and-card-one").textContent =
    true && true;

document.getElementById("and-card-two").textContent =
    true && false;

document.getElementById("and-card-three").textContent =
    false && true;

document.getElementById("and-card-four").textContent =
    false && false;


// ========================================
// Logical OR
// ========================================

const isAdmin = false;
const isCreator = true;

const orResult =
    isAdmin || isCreator;

console.log("Logical OR:");
console.log(orResult);

document.getElementById("or-output").textContent =
    "Is administrator: " + isAdmin + "\n" +
    "Is creator: " + isCreator + "\n" +
    "Has access: " + orResult;


// OR result cards

document.getElementById("or-card-one").textContent =
    true || true;

document.getElementById("or-card-two").textContent =
    true || false;

document.getElementById("or-card-three").textContent =
    false || true;

document.getElementById("or-card-four").textContent =
    false || false;


// ========================================
// Logical NOT
// ========================================

const isOffline = false;

const isOnline =
    !isOffline;

const reversedTrue =
    !true;

const reversedFalse =
    !false;

console.log("Logical NOT:");
console.log(isOnline);
console.log(reversedTrue);
console.log(reversedFalse);

document.getElementById("not-output").textContent =
    "isOffline: " + isOffline + "\n" +
    "!isOffline: " + isOnline + "\n" +
    "!true: " + reversedTrue + "\n" +
    "!false: " + reversedFalse;


// ========================================
// Combining Comparisons
// ========================================

const userAge = 25;

const meetsMinimumAge =
    userAge >= 18;

const meetsMaximumAge =
    userAge <= 60;

const ageIsAllowed =
    meetsMinimumAge && meetsMaximumAge;

console.log("Combined comparisons:");
console.log(meetsMinimumAge);
console.log(meetsMaximumAge);
console.log(ageIsAllowed);

document.getElementById("comparison-output").textContent =
    "User age: " + userAge + "\n" +
    "Age is at least 18: " + meetsMinimumAge + "\n" +
    "Age is at most 60: " + meetsMaximumAge + "\n" +
    "Age is allowed: " + ageIsAllowed;


// ========================================
// Login Example
// ========================================

const hasEmail = true;
const hasPassword = true;

const loginDetailsComplete =
    hasEmail && hasPassword;

console.log("Login example:");
console.log(loginDetailsComplete);

document.getElementById("login-output").textContent =
    "Email entered: " + hasEmail + "\n" +
    "Password entered: " + hasPassword + "\n" +
    "Login details complete: " +
    loginDetailsComplete;


// ========================================
// Access Example
// ========================================

const userIsAdmin = false;
const userIsCreator = true;

const userHasAccess =
    userIsAdmin || userIsCreator;

console.log("Access example:");
console.log(userHasAccess);

document.getElementById("access-output").textContent =
    "Administrator: " + userIsAdmin + "\n" +
    "Creator: " + userIsCreator + "\n" +
    "Access allowed: " + userHasAccess;