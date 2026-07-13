# 01 - CSS Introduction

## Introduction

In the HTML chapter, I learned how to create and structure webpages.

HTML controls the content of a webpage, but the page still looks plain. CSS is used to improve the appearance of the webpage.

CSS can change things such as colors, spacing, fonts, borders, backgrounds, and page layouts.

---

## What is CSS?

CSS stands for **Cascading Style Sheets**.

It is used to style HTML elements.

For example, CSS can change:

- Text colors
- Background colors
- Font sizes
- Spacing
- Borders
- Page layouts

---

## HTML Without CSS

HTML creates the content of the webpage.

```html
<h1>CSS Introduction</h1>

<p>This is a paragraph.</p>
```

Without CSS, the browser displays the content using its default styles.

---

## Connecting CSS to HTML

The CSS file is connected to the HTML file using the `<link>` element.

```html
<link rel="stylesheet" href="style.css">
```

This line is placed inside the `<head>` section.

### `rel="stylesheet"`

This tells the browser that the linked file is a stylesheet.

### `href="style.css"`

This tells the browser where the CSS file is located.

Because `index.html` and `style.css` are in the same folder, the file path is:

```text
style.css
```

---

## CSS Example

```css
body {
    background-color: lightgray;
}

h1 {
    color: darkblue;
}

p {
    color: black;
}
```

This CSS changes the background and text colors of the webpage.

---

## File Structure

```text
01 - CSS Introduction/
│
├── index.html
├── style.css
└── README.md
```

---

## Output

When the webpage is opened in the browser:

- The page background appears light gray.
- The main heading appears dark blue.
- The paragraphs appear black.

---

## Practice

Try changing the following values inside `style.css`:

```css
background-color: lightgray;
color: darkblue;
color: black;
```

For example:

```css
body {
    background-color: lightblue;
}

h1 {
    color: green;
}

p {
    color: brown;
}
```

Save the file and refresh the browser to see the changes.

---

## What I Learned

In this lesson, I learned:

- CSS is used to style HTML webpages.
- HTML and CSS are written in separate files.
- The `<link>` element connects CSS to HTML.
- The CSS file can change colors and backgrounds.
- Changes made in `style.css` appear after refreshing the browser. 