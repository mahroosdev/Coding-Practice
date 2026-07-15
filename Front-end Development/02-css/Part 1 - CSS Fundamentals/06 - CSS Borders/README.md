# 06 - CSS Borders

## Introduction

In the previous lesson, I learned how to add background colors and background images.

In this lesson, I am learning how to add borders around HTML elements.

Borders can help separate content and make different sections easier to identify.

---

## What is a CSS Border?

A border is a line displayed around an HTML element.

CSS can control:

- Border width
- Border style
- Border color
- Rounded corners

---

## Border Property

The `border` property can define the width, style, and color of a border in one line.

Example:

```css
.solid-border {
    border: 3px solid darkblue;
}
```

In this example:

- `3px` is the border width.
- `solid` is the border style.
- `darkblue` is the border color.

---

## Solid Border

A solid border creates one continuous line.

```css
.solid-border {
    border: 3px solid darkblue;
}
```

---

## Dashed Border

A dashed border displays short lines around the element.

```css
.dashed-border {
    border: 3px dashed darkgreen;
}
```

---

## Dotted Border

A dotted border displays small dots around the element.

```css
.dotted-border {
    border: 3px dotted darkred;
}
```

---

## Border Width

The border width controls how thick the border appears.

Example:

```css
border: 3px solid darkblue;
```

In this example, the border width is `3px`.

A larger value creates a thicker border.

```css
border: 6px solid darkblue;
```

---

## Border Style

The border style controls the appearance of the border.

Common border styles include:

```text
solid
dashed
dotted
double
none
```

Example:

```css
border: 3px double black;
```

---

## Border Color

The border color controls the color of the border.

Example:

```css
border: 3px solid purple;
```

In this example, the border color is purple.

---

## Rounded Corners

The `border-radius` property creates rounded corners.

Example:

```css
.rounded-border {
    border: 3px solid purple;
    border-radius: 15px;
}
```

A larger `border-radius` value creates more rounded corners.

---

## Shared Section Styles

The same styles can be applied to every `<section>` element.

```css
section {
    background-color: white;
    margin-bottom: 20px;
    padding: 15px;
}
```

These properties make each section easier to view.

The `margin-bottom` and `padding` properties will be explained in upcoming lessons.

---

## CSS Used in This Lesson

```css
body {
    background-color: lightgray;
}

h1 {
    color: darkblue;
}

section {
    background-color: white;
    margin-bottom: 20px;
    padding: 15px;
}

.solid-border {
    border: 3px solid darkblue;
}

.dashed-border {
    border: 3px dashed darkgreen;
}

.dotted-border {
    border: 3px dotted darkred;
}

.rounded-border {
    border: 3px solid purple;
    border-radius: 15px;
}
```

---

## Output

When the webpage is opened in the browser:

- The page background appears light gray.
- Each section has a white background.
- The first section has a solid border.
- The second section has a dashed border.
- The third section has a dotted border.
- The final section has a solid border with rounded corners.

---

## Practice

Try changing the border width:

```css
.solid-border {
    border: 6px solid darkblue;
}
```

Try changing the border style:

```css
.dashed-border {
    border: 3px double darkgreen;
}
```

Try changing the rounded corners:

```css
.rounded-border {
    border-radius: 30px;
}
```

Save the file and refresh the browser to view the changes.

---

## What I Learned

In this lesson, I learned:

- The `border` property adds a border around an element.
- A border can have a width, style, and color.
- Common border styles include solid, dashed, and dotted.
- The `border-radius` property creates rounded corners.
- Different CSS classes can give elements different border styles.
