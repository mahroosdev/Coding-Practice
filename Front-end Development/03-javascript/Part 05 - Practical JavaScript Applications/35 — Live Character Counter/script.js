const messageInput =
    document.getElementById("message-input");

const characterCounter =
    document.getElementById("character-counter");

const remainingCounter =
    document.getElementById("remaining-counter");

const progressFill =
    document.getElementById("progress-fill");

const statusMessage =
    document.getElementById("status-message");

const clearButton =
    document.getElementById("clear-button");


const maximumCharacters = 150;


// Update all character information

function updateCharacterCounter() {
    const currentLength =
        messageInput.value.length;

    const remainingCharacters =
        maximumCharacters - currentLength;

    const usedPercentage =
        (currentLength / maximumCharacters) * 100;

    characterCounter.textContent =
        currentLength +
        " / " +
        maximumCharacters +
        " characters";

    remainingCounter.textContent =
        remainingCharacters +
        " characters remaining";

    progressFill.style.width =
        usedPercentage + "%";

    progressFill.classList.remove(
        "warning",
        "limit"
    );

    statusMessage.classList.remove(
        "warning-message",
        "limit-message"
    );

    if (currentLength === 0) {
        statusMessage.textContent =
            "Start typing your message.";
    } else if (currentLength === maximumCharacters) {
        progressFill.classList.add("limit");
        statusMessage.classList.add("limit-message");

        statusMessage.textContent =
            "The maximum character limit has been reached.";
    } else if (remainingCharacters <= 20) {
        progressFill.classList.add("warning");
        statusMessage.classList.add("warning-message");

        statusMessage.textContent =
            "You are close to the character limit.";
    } else {
        statusMessage.textContent =
            "Your message is within the allowed limit.";
    }
}


// Update while typing

messageInput.addEventListener(
    "input",
    updateCharacterCounter
);


// Clear the message

clearButton.addEventListener("click", function () {
    messageInput.value = "";

    updateCharacterCounter();

    messageInput.focus();
});


// Show the initial state

updateCharacterCounter();