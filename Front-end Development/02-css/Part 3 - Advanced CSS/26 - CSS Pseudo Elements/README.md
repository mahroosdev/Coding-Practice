# 26 - CSS Pseudo-Elements

## Introduction

In the previous lesson, I learned how pseudo-classes select elements based on their state or position.

In this lesson, I am learning how CSS pseudo-elements style a specific part of an HTML element.

Pseudo-elements can be used to:

- Add content before an element
- Add content after an element
- Style the first letter
- Style the first line
- Change selected text colors

---

## What is a Pseudo-Element?

A pseudo-element selects and styles a specific part of an HTML element.

Basic syntax:

```css
selector::pseudo-element {
    property: value;
}
```

Example:

```css
p::first-letter {
    color: red;
}
```

This changes only the first letter of the paragraph.

---

## Double Colon Syntax

Pseudo-elements normally use two colons:

```text
::
```

Example:

```css
p::before
```

In this selector:

- `p` selects the paragraph.
- `::` introduces the pseudo-element.
- `before` selects the area before the paragraph content.

---

## Pseudo-Class and Pseudo-Element Difference

### Pseudo-Class

A pseudo-class selects an element based on its state.

```css
button:hover {
    background-color: green;
}
```

The `:hover` pseudo-class applies when the mouse is over the button.

Pseudo-classes normally use one colon:

```text
:
```

### Pseudo-Element

A pseudo-element styles a specific part of an element.

```css
p::first-letter {
    color: red;
}
```

Pseudo-elements normally use two colons:

```text
::
```

---

## Before Pseudo-Element

The `::before` pseudo-element adds content before an element's existing content.

Example:

```css
.before-text::before {
    content: "Start: ";
    color: darkred;
    font-weight: bold;
}
```

HTML:

```html
<p class="before-text">
    This paragraph has content added before it.
</p>
```

The browser displays:

```text
Start: This paragraph has content added before it.
```

---

## The Content Property

The `content` property is used with `::before` and `::after`.

Example:

```css
.before-text::before {
    content: "Start: ";
}
```

Without the `content` property, the `::before` and `::after` pseudo-elements normally do not display generated text.

---

## After Pseudo-Element

The `::after` pseudo-element adds content after an element's existing content.

Example:

```css
.after-text::after {
    content: " End.";
    color: darkgreen;
    font-weight: bold;
}
```

HTML:

```html
<p class="after-text">
    This paragraph has content added after it.
</p>
```

The browser displays:

```text
This paragraph has content added after it. End.
```

---

## First Letter Pseudo-Element

The `::first-letter` pseudo-element styles the first letter of a block of text.

Example:

```css
.first-letter-text::first-letter {
    color: darkred;
    font-size: 40px;
    font-weight: bold;
}
```

This makes the first letter:

- Dark red
- Larger
- Bold

Only the first letter receives these styles.

---

## First Line Pseudo-Element

The `::first-line` pseudo-element styles the first displayed line of text.

Example:

```css
.first-line-text::first-line {
    color: darkblue;
    font-weight: bold;
}
```

Only the first visible line receives the style.

The first line may change when:

- The browser width changes
- The font size changes
- The element width changes

---

## Selection Pseudo-Element

The `::selection` pseudo-element styles text selected by the user.

Example:

```css
.selection-text::selection {
    background-color: darkblue;
    color: white;
}
```

When the user selects the text:

- The selection background becomes dark blue.
- The selected text becomes white.

---

## Common Pseudo-Elements

Some common pseudo-elements include:

```text
::before
::after
::first-letter
::first-line
::selection
```

---

## Before and After Comparison

### Before

```css
.element::before {
    content: "Before ";
}
```

Adds generated content before the existing content.

### After

```css
.element::after {
    content: " After";
}
```

Adds generated content after the existing content.

---

## CSS Used in This Lesson

```css
body {
    background-color: lightgray;
    font-family: Arial, sans-serif;
}

h1 {
    color: darkblue;
    text-align: center;
}

section {
    background-color: white;
    border: 2px solid darkblue;
    margin-bottom: 20px;
    padding: 20px;
}

.before-text::before {
    content: "Start: ";
    color: darkred;
    font-weight: bold;
}

.after-text::after {
    content: " End.";
    color: darkgreen;
    font-weight: bold;
}

.first-letter-text::first-letter {
    color: darkred;
    font-size: 40px;
    font-weight: bold;
}

.first-line-text::first-line {
    color: darkblue;
    font-weight: bold;
}

.selection-text::selection {
    background-color: darkblue;
    color: white;
}
```

---

## Output

When the webpage is opened in the browser:

- The first paragraph displays `Start:` before its normal text.
- The second paragraph displays `End.` after its normal text.
- The first letter of the third paragraph appears larger and dark red.
- The first line of the fourth paragraph appears dark blue and bold.
- Selected text in the final paragraph has a dark-blue background and white text.

---

## Practice

Change the content added before the paragraph:

```css
.before-text::before {
    content: "Important: ";
}
```

Add a symbol after the second paragraph:

```css
.after-text::after {
    content: " ✓";
}
```

Change the first-letter color:

```css
.first-letter-text::first-letter {
    color: darkgreen;
}
```

Increase the first-letter size:

```css
.first-letter-text::first-letter {
    font-size: 60px;
}
```

Change the selection colors:

```css
.selection-text::selection {
    background-color: darkgreen;
    color: white;
}
```

Save the file and refresh the browser after each change.

---

## Important Note

Content added using `::before` and `::after` is created by CSS.

It does not appear as normal text inside the HTML file.

Important information should still be written in the HTML because generated CSS content may not always be suitable for accessibility or essential page content.

---

## Easy Way to Remember

```text
::before
```

Adds or styles content before an element.

```text
::after
```

Adds or styles content after an element.

```text
::first-letter
```

Styles the first letter.

```text
::first-line
```

Styles the first displayed line.

```text
::selection
```

Styles text selected by the user.

---

## What I Learned

In this lesson, I learned:

- Pseudo-elements style a specific part of an element.
- Pseudo-elements normally use two colons.
- `::before` adds content before an element.
- `::after` adds content after an element.
- The `content` property is used with `::before` and `::after`.
- `::first-letter` styles the first letter.
- `::first-line` styles the first displayed line.
- `::selection` styles selected text.