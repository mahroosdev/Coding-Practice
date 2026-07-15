# 09 - CSS Width and Height

## Introduction

In the previous lessons, I learned how to add margins and padding around HTML elements.

In this lesson, I am learning how to control the width and height of an element using CSS.

---

## Width

The `width` property controls how wide an element appears.

Example:

```css
.small-box {
    width: 250px;
}
```

This makes the element 250 pixels wide.

---

## Height

The `height` property controls how tall an element appears.

Example:

```css
.small-box {
    height: 120px;
}
```

This makes the element 120 pixels tall.

---

## Using Width and Height Together

The `width` and `height` properties can be used together.

Example:

```css
.small-box {
    width: 250px;
    height: 120px;
}
```

This creates an element that is:

- 250 pixels wide
- 120 pixels tall

---

## Pixel Values

Pixels are written using `px`.

Example:

```css
.large-box {
    width: 500px;
    height: 180px;
}
```

Pixel values give an element a fixed size.

The element stays the same size even when the browser window changes.

---

## Percentage Width

A percentage value makes the element's width depend on its parent element.

Example:

```css
.percentage-box {
    width: 70%;
}
```

This makes the box use 70% of the available width.

When the browser window changes size, the box width also changes.

---

## Width Comparison

### Fixed Width

```css
width: 500px;
```

The width stays at 500 pixels.

### Percentage Width

```css
width: 70%;
```

The width changes depending on the available space.

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
    border: 2px solid darkblue;
    margin-bottom: 20px;
    padding: 15px;
}

.small-box {
    width: 250px;
    height: 120px;
}

.large-box {
    width: 500px;
    height: 180px;
}

.percentage-box {
    width: 70%;
    height: 120px;
}
```

---

## Output

When the webpage is opened in the browser:

- The first box appears small.
- The second box appears wider and taller.
- The third box uses 70% of the available page width.
- Every section has a white background, border, margin, and padding.

---

## Practice

Try increasing the size of the small box:

```css
.small-box {
    width: 350px;
    height: 150px;
}
```

Try changing the percentage width:

```css
.percentage-box {
    width: 90%;
}
```

Save the file and refresh the browser to see the changes.

---

## Important Note

A fixed height can sometimes cause content to overflow if there is too much text.

For beginner practice, fixed heights help show how the property works. In real projects, height is often allowed to adjust automatically based on the content.

---

## What I Learned

In this lesson, I learned:

- The `width` property controls an element's width.
- The `height` property controls an element's height.
- Pixel values create fixed sizes.
- Percentage values depend on the available space.
- Width and height can be used together.