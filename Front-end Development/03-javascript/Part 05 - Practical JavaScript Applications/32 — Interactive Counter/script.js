const counterValue =
    document.getElementById("counter-value");

const counterDisplay =
    document.querySelector(".counter-display");

const counterStatus =
    document.getElementById("counter-status");

const decreaseButton =
    document.getElementById("decrease-button");

const resetButton =
    document.getElementById("reset-button");

const increaseButton =
    document.getElementById("increase-button");


const minimumValue = 0;
const maximumValue = 10;

let counter = 0;


// Update everything shown on the page

function updateCounter() {
    counterValue.textContent = counter;

    decreaseButton.disabled =
        counter === minimumValue;

    increaseButton.disabled =
        counter === maximumValue;

    counterDisplay.classList.toggle(
        "limit-reached",
        counter === minimumValue ||
        counter === maximumValue
    );

    if (counter === minimumValue) {
        counterStatus.textContent =
            "The counter is at its minimum value.";
    } else if (counter === maximumValue) {
        counterStatus.textContent =
            "The counter reached its maximum value.";
    } else {
        counterStatus.textContent =
            "The counter is between 0 and 10.";
    }
}


// Increase the counter

increaseButton.addEventListener("click", function () {
    if (counter < maximumValue) {
        counter++;
        updateCounter();
    }
});


// Decrease the counter

decreaseButton.addEventListener("click", function () {
    if (counter > minimumValue) {
        counter--;
        updateCounter();
    }
});


// Reset the counter

resetButton.addEventListener("click", function () {
    counter = minimumValue;
    updateCounter();
});


// Show the initial state

updateCounter();