# 30 - CSS Media Queries

## Introduction

In the previous lesson, I learned how CSS animations change element styles automatically.

In this lesson, I am learning how CSS media queries change a webpage based on the screen size.

Media queries help webpages work better on:

- Desktop computers
- Laptops
- Tablets
- Mobile phones

---

## What is a Media Query?

A media query applies CSS only when a specific condition is true.

Basic syntax:

```css
@media screen and (max-width: 768px) {
    selector {
        property: value;
    }
}
```

The styles inside the media query are applied when the browser width is `768px` or smaller.

---

## Normal CSS Styles

CSS written outside a media query is applied normally.

Example:

```css
.card-container {
    display: flex;
    gap: 20px;
}

.card {
    width: 33%;
}
```

On a larger screen:

- The cards appear beside each other.
- Each card uses approximately one-third of the available width.

---

## Media Query Syntax

```css
@media screen and (max-width: 768px) {
    .card {
        width: 100%;
    }
}
```

This media query contains:

```text
@media
```

Starts the media query.

```text
screen
```

Targets screen-based devices.

```text
and
```

Connects the media type and condition.

```text
(max-width: 768px)
```

Applies the styles when the screen width is `768px` or smaller.

---

## Maximum Width

The `max-width` condition applies styles when the browser width is equal to or smaller than a specified value.

Example:

```css
@media screen and (max-width: 768px) {
    body {
        background-color: lightyellow;
    }
}
```

This background color is used when the browser width is `768px` or smaller.

---

## Minimum Width

The `min-width` condition applies styles when the browser width is equal to or larger than a specified value.

Example:

```css
@media screen and (min-width: 1000px) {
    body {
        font-size: 18px;
    }
}
```

This font size is used when the browser width is `1000px` or larger.

---

## Changing the Card Layout

On larger screens, the card container uses a row layout.

```css
.card-container {
    display: flex;
    gap: 20px;
}
```

The cards use:

```css
.card {
    width: 33%;
}
```

This places the cards beside each other.

---

## Tablet Media Query

The first media query is:

```css
@media screen and (max-width: 768px) {
    header {
        background-color: darkgreen;
    }

    .card-container {
        flex-direction: column;
    }

    .card {
        width: 100%;
    }
}
```

When the browser width becomes `768px` or smaller:

- The header changes from dark blue to dark green.
- The cards change from a row to a column.
- Each card uses the full available width.

---

## Changing Flex Direction

The normal layout uses the default Flexbox row direction.

```css
.card-container {
    display: flex;
}
```

Inside the media query, the direction changes:

```css
.card-container {
    flex-direction: column;
}
```

This places the cards from top to bottom.

---

## Mobile Media Query

The second media query is:

```css
@media screen and (max-width: 480px) {
    header {
        padding: 15px;
    }

    header h1 {
        font-size: 24px;
    }

    main {
        padding: 10px;
    }

    section {
        padding: 10px;
    }
}
```

When the browser width becomes `480px` or smaller:

- The header padding becomes smaller.
- The main heading becomes smaller.
- The page spacing becomes smaller.
- The section padding becomes smaller.

These changes help the content fit on a small screen.

---

## Breakpoints

A breakpoint is a screen width where the design changes.

This lesson uses two breakpoints:

```text
768px
480px
```

### 768px Breakpoint

```css
@media screen and (max-width: 768px)
```

This is used for smaller screens such as tablets and mobile devices.

### 480px Breakpoint

```css
@media screen and (max-width: 480px)
```

This is used for narrow mobile screens.

Breakpoints should be selected based on where the webpage layout needs to change.

---

## Viewport Meta Tag

The HTML document contains:

```html
<meta name="viewport" content="width=device-width, initial-scale=1.0">
```

This is important for responsive webpages.

It tells the browser to use the actual width of the device.

Without this meta tag, a mobile browser may not display media query changes correctly.

---

## Media Query Order

Media queries are usually placed after the normal CSS styles.

Example:

```css
.card {
    width: 33%;
}

@media screen and (max-width: 768px) {
    .card {
        width: 100%;
    }
}
```

The normal width is `33%`.

When the media query condition becomes true, it changes to `100%`.

---

## Multiple Media Queries

A stylesheet can contain more than one media query.

Example:

```css
@media screen and (max-width: 768px) {
    .card {
        width: 100%;
    }
}

@media screen and (max-width: 480px) {
    h1 {
        font-size: 24px;
    }
}
```

Each media query can control different screen sizes.

---

## CSS Used in This Lesson

```css
body {
    margin: 0;
    background-color: lightgray;
    font-family: Arial, sans-serif;
}

header {
    background-color: darkblue;
    color: white;
    padding: 30px;
    text-align: center;
}

main {
    padding: 20px;
}

section {
    background-color: white;
    border: 2px solid darkblue;
    padding: 20px;
}

.card-container {
    display: flex;
    gap: 20px;
}

.card {
    width: 33%;
    background-color: lightblue;
    border: 2px solid darkblue;
    padding: 20px;
    box-sizing: border-box;
}

.card h3 {
    color: darkblue;
}

@media screen and (max-width: 768px) {
    header {
        background-color: darkgreen;
    }

    .card-container {
        flex-direction: column;
    }

    .card {
        width: 100%;
    }
}

@media screen and (max-width: 480px) {
    header {
        padding: 15px;
    }

    header h1 {
        font-size: 24px;
    }

    main {
        padding: 10px;
    }

    section {
        padding: 10px;
    }
}
```

---

## Output

On a large screen:

- The header has a dark-blue background.
- The three cards appear beside each other.
- Each card uses approximately one-third of the available width.

At `768px` or smaller:

- The header becomes dark green.
- The cards appear one below another.
- Each card uses the full width.

At `480px` or smaller:

- The heading becomes smaller.
- The padding around the page becomes smaller.
- The content fits better on narrow screens.

---

## How to Test the Media Queries

Open the webpage in a browser.

Then reduce the width of the browser window.

Observe the changes when the width passes:

```text
768px
480px
```

You can also use the browser developer tools to test different device sizes.

---

## Practice

Change the tablet breakpoint:

```css
@media screen and (max-width: 900px) {
    .card-container {
        flex-direction: column;
    }
}
```

Change the mobile heading size:

```css
@media screen and (max-width: 480px) {
    header h1 {
        font-size: 20px;
    }
}
```

Change the card background on smaller screens:

```css
@media screen and (max-width: 768px) {
    .card {
        background-color: lightyellow;
    }
}
```

Hide the header paragraph on narrow screens:

```css
@media screen and (max-width: 480px) {
    header p {
        display: none;
    }
}
```

Save the file and resize the browser after each change.

---

## Important Note

A media query should be added when the layout no longer looks comfortable at a particular screen width.

Do not choose breakpoints only because they match a specific device name.

Choose them based on where the webpage content needs adjustment.

---

## Easy Way to Remember

```text
@media
```

Starts a media query.

```text
max-width
```

Applies styles at or below a specific width.

```text
min-width
```

Applies styles at or above a specific width.

```text
breakpoint
```

The width where the layout changes.

```text
viewport meta tag
```

Helps responsive layouts work correctly on mobile devices.

---

## What I Learned

In this lesson, I learned:

- Media queries apply CSS based on screen conditions.
- `max-width` targets screens at or below a specified width.
- `min-width` targets screens at or above a specified width.
- Breakpoints control where the layout changes.
- Flexbox direction can change inside a media query.
- Element widths, font sizes, and spacing can change on smaller screens.
- The viewport meta tag is important for mobile layouts.
- Media queries help webpages work on different screen sizes.