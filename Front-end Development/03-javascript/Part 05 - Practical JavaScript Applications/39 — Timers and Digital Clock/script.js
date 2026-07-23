const clockDisplay =
    document.getElementById("clock-display");

const dateDisplay =
    document.getElementById("date-display");

const stopwatchDisplay =
    document.getElementById("stopwatch-display");

const stopwatchStatus =
    document.getElementById("stopwatch-status");

const startButton =
    document.getElementById("start-button");

const pauseButton =
    document.getElementById("pause-button");

const resetButton =
    document.getElementById("reset-button");

const delayButton =
    document.getElementById("delay-button");

const delayMessage =
    document.getElementById("delay-message");


let stopwatchSeconds = 0;
let stopwatchInterval = null;


// Add a leading zero

function formatNumber(number) {
    return String(number).padStart(2, "0");
}


// Update digital clock

function updateDigitalClock() {
    const currentDate =
        new Date();

    const hours =
        formatNumber(currentDate.getHours());

    const minutes =
        formatNumber(currentDate.getMinutes());

    const seconds =
        formatNumber(currentDate.getSeconds());

    clockDisplay.textContent =
        hours + ":" + minutes + ":" + seconds;

    dateDisplay.textContent =
        currentDate.toLocaleDateString(
            undefined,
            {
                weekday: "long",
                year: "numeric",
                month: "long",
                day: "numeric"
            }
        );
}


// Update stopwatch display

function updateStopwatchDisplay() {
    const hours =
        Math.floor(stopwatchSeconds / 3600);

    const minutes =
        Math.floor(
            (stopwatchSeconds % 3600) / 60
        );

    const seconds =
        stopwatchSeconds % 60;

    stopwatchDisplay.textContent =
        formatNumber(hours) + ":" +
        formatNumber(minutes) + ":" +
        formatNumber(seconds);
}


// Start stopwatch

startButton.addEventListener("click", function () {
    if (stopwatchInterval !== null) {
        return;
    }

    stopwatchInterval =
        setInterval(function () {
            stopwatchSeconds++;

            updateStopwatchDisplay();
        }, 1000);

    stopwatchStatus.textContent =
        "The stopwatch is running.";

    startButton.disabled = true;
    pauseButton.disabled = false;
});


// Pause stopwatch

pauseButton.addEventListener("click", function () {
    clearInterval(stopwatchInterval);

    stopwatchInterval = null;

    stopwatchStatus.textContent =
        "The stopwatch is paused.";

    startButton.disabled = false;
    pauseButton.disabled = true;
});


// Reset stopwatch

resetButton.addEventListener("click", function () {
    clearInterval(stopwatchInterval);

    stopwatchInterval = null;
    stopwatchSeconds = 0;

    updateStopwatchDisplay();

    stopwatchStatus.textContent =
        "The stopwatch was reset.";

    startButton.disabled = false;
    pauseButton.disabled = true;
});


// Delayed message

delayButton.addEventListener("click", function () {
    delayMessage.textContent =
        "The message will appear in 3 seconds...";

    delayButton.disabled = true;

    setTimeout(function () {
        delayMessage.textContent =
            "The delayed message appeared successfully.";

        delayButton.disabled = false;
    }, 3000);
});


// Initial page state

updateDigitalClock();
updateStopwatchDisplay();

pauseButton.disabled = true;


// Update the clock every second

setInterval(updateDigitalClock, 1000);