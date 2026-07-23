# 33 - Theme Switcher

## Introduction

In this lesson, I built a light and dark theme switcher.

The theme changes when the user clicks a button.

## Theme State

```javascript
let darkThemeIsActive = false;
```

The boolean stores the current theme state.

## Toggling the Theme

```javascript
document.body.classList.toggle(
    "dark-theme",
    darkThemeIsActive
);
```

The button changes the boolean:

```javascript
darkThemeIsActive =
    !darkThemeIsActive;
```

## Concepts Used

- Boolean state
- Functions
- Click events
- CSS classes
- `classList.toggle()`
- Updating button text
- CSS custom properties

The selected theme remains active until the page is refreshed.

## Practice Tasks

1. Change the dark-theme colours.
2. Add a third theme.
3. Change the button text or icon.
4. Display the selected theme in another element.

## What I Learned

I learned how JavaScript and CSS classes can change the design of an entire webpage.

The next lesson is **34 - Show and Hide Content**.