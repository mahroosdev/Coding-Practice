const themeButton =
    document.getElementById("theme-button");

const currentTheme =
    document.getElementById("current-theme");

let darkThemeIsActive = false;


// Update the page theme

function updateTheme() {
    document.body.classList.toggle(
        "dark-theme",
        darkThemeIsActive
    );

    if (darkThemeIsActive) {
        currentTheme.textContent =
            "Dark Theme";

        themeButton.textContent =
            "Switch to Light Theme";
    } else {
        currentTheme.textContent =
            "Light Theme";

        themeButton.textContent =
            "Switch to Dark Theme";
    }

    themeButton.setAttribute(
        "aria-pressed",
        darkThemeIsActive
    );
}


// Change the theme

themeButton.addEventListener("click", function () {
    darkThemeIsActive =
        !darkThemeIsActive;

    updateTheme();
});


// Show the default theme

updateTheme();