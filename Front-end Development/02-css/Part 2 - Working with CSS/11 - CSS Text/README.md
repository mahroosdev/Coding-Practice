# 11 - CSS Text

## Introduction

In the previous lesson, I learned how the CSS box model works.

In this lesson, I am learning how to change the appearance and position of text using CSS.

CSS provides several properties for controlling text alignment, decoration, transformation, and spacing.

---

## Text Alignment

The `text-align` property controls the horizontal position of text.

Common values include:

```text
left
center
right
```

---

## Left Alignment

```css
.left-text {
    text-align: left;
}
```

This places the text on the left side of the element.

---

## Center Alignment

```css
.center-text {
    text-align: center;
}
```

This places the text in the center of the element.

---

## Right Alignment

```css
.right-text {
    text-align: right;
}
```

This places the text on the right side of the element.

---

## Text Decoration

The `text-decoration` property adds or removes lines from text.

Common values include:

```text
underline
line-through
none
```

---

## Underline

```css
.underline-text {
    text-decoration: underline;
}
```

This adds a line below the text.

---

## Line Through

```css
.line-through-text {
    text-decoration: line-through;
}
```

This adds a line through the middle of the text.

---

## No Decoration

```css
.no-decoration {
    text-decoration: none;
}
```

This removes text decoration.

This value is commonly used later when styling links.

---

## Text Transformation

The `text-transform` property changes the capitalization of text.

Common values include:

```text
uppercase
lowercase
capitalize
```

---

## Uppercase

```css
.uppercase-text {
    text-transform: uppercase;
}
```

This changes all letters to uppercase.

---

## Lowercase

```css
.lowercase-text {
    text-transform: lowercase;
}
```

This changes all letters to lowercase.

---

## Capitalize

```css
.capitalize-text {
    text-transform: capitalize;
}
```

This changes the first letter of each word to uppercase.

---

## Letter Spacing

The `letter-spacing` property controls the space between letters.

Example:

```css
.letter-spacing {
    letter-spacing: 3px;
}
```

This adds three pixels of space between each letter.

---

## Word Spacing

The `word-spacing` property controls the space between words.

Example:

```css
.word-spacing {
    word-spacing: 10px;
}
```

This adds more space between each word.

---

## Line Height

The `line-height` property controls the space between lines of text.

Example:

```css
.line-height {
    line-height: 2;
}
```

This makes the space between the lines larger.

A larger line height can make long paragraphs easier to read.

---

## CSS Used in This Lesson

```css
body {
    background-color: lightgray;
}

h1 {
    color: darkblue;
    text-align: center;
}

section {
    background-color: white;
    border: 2px solid darkblue;
    margin-bottom: 20px;
    padding: 15px;
}

.left-text {
    text-align: left;
}

.center-text {
    text-align: center;
}

.right-text {
    text-align: right;
}

.underline-text {
    text-decoration: underline;
}

.line-through-text {
    text-decoration: line-through;
}

.no-decoration {
    text-decoration: none;
}

.uppercase-text {
    text-transform: uppercase;
}

.lowercase-text {
    text-transform: lowercase;
}

.capitalize-text {
    text-transform: capitalize;
}

.letter-spacing {
    letter-spacing: 3px;
}

.word-spacing {
    word-spacing: 10px;
}

.line-height {
    line-height: 2;
}
```

---

## Output

When the webpage is opened in the browser:

- The main heading appears in the center.
- Some paragraphs are aligned left, center, or right.
- One paragraph is underlined.
- One paragraph has a line through it.
- Text appears in uppercase, lowercase, and capitalized forms.
- Letter, word, and line spacing are changed.

---

## Practice

Try changing the text alignment:

```css
.center-text {
    text-align: right;
}
```

Try changing the text decoration:

```css
.underline-text {
    text-decoration: line-through;
}
```

Try increasing the letter spacing:

```css
.letter-spacing {
    letter-spacing: 6px;
}
```

Try changing the line height:

```css
.line-height {
    line-height: 3;
}
```

Save the file and refresh the browser after each change.

---

## What I Learned

In this lesson, I learned:

- The `text-align` property controls text alignment.
- The `text-decoration` property adds or removes lines from text.
- The `text-transform` property changes text capitalization.
- The `letter-spacing` property changes the space between letters.
- The `word-spacing` property changes the space between words.
- The `line-height` property changes the space between lines.