# 13 - CSS Links

## Introduction

In the previous lesson, I learned how to change fonts using CSS.

In this lesson, I am learning how to style HTML links.

Links normally appear blue and underlined. CSS can change their color, remove the underline, add a background, and change how they look when the mouse moves over them.

---

## Basic HTML Link

HTML links are created using the `<a>` element.

Example:

```html
<a href="https://developer.mozilla.org/">
    Visit MDN Web Docs
</a>
```

The `href` attribute contains the address that the link opens.

---

## Changing the Link Color

The `color` property changes the text color of a link.

Example:

```css
.basic-link {
    color: blue;
}
```

The link text appears blue.

---

## Removing the Underline

Links normally have an underline.

The `text-decoration` property can remove it.

Example:

```css
.styled-link {
    text-decoration: none;
}
```

The value `none` removes the underline.

---

## The Hover Effect

The `:hover` selector applies a style when the mouse moves over an element.

Example:

```css
.styled-link:hover {
    color: darkred;
    text-decoration: underline;
}
```

When the mouse moves over the link:

- The text becomes dark red.
- The underline appears.

---

## Styling a Link Like a Button

A normal link can be styled to look like a button.

Example:

```css
.button-link {
    display: inline-block;
    color: white;
    background-color: darkblue;
    text-decoration: none;
    padding: 10px 20px;
    border-radius: 5px;
}
```

This gives the link:

- White text
- A dark-blue background
- Space inside the link
- Rounded corners
- No underline

---

## Display Property

The `display: inline-block` property allows the link to use padding correctly while still staying on the same line.

Example:

```css
.button-link {
    display: inline-block;
}
```

The `display` property will be explained in more detail in a later lesson.

---

## Button Hover Effect

The background color can also change when the mouse moves over the button-style link.

```css
.button-link:hover {
    background-color: darkgreen;
}
```

This changes the background from dark blue to dark green.

---

## Complete Styled Link Example

```css
.styled-link {
    color: darkgreen;
    text-decoration: none;
}

.styled-link:hover {
    color: darkred;
    text-decoration: underline;
}
```

---

## Complete Button Link Example

```css
.button-link {
    display: inline-block;
    color: white;
    background-color: darkblue;
    text-decoration: none;
    padding: 10px 20px;
    border-radius: 5px;
}

.button-link:hover {
    background-color: darkgreen;
}
```

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

.basic-link {
    color: blue;
}

.styled-link {
    color: darkgreen;
    text-decoration: none;
}

.styled-link:hover {
    color: darkred;
    text-decoration: underline;
}

.button-link {
    display: inline-block;
    color: white;
    background-color: darkblue;
    text-decoration: none;
    padding: 10px 20px;
    border-radius: 5px;
}

.button-link:hover {
    background-color: darkgreen;
}
```

---

## Output

When the webpage is opened in the browser:

- The first link appears blue.
- The second link appears dark green without an underline.
- The second link changes color when the mouse moves over it.
- The third link looks like a button.
- The button background changes when the mouse moves over it.

---

## Practice

Try changing the basic link color:

```css
.basic-link {
    color: purple;
}
```

Try changing the hover color:

```css
.styled-link:hover {
    color: orange;
}
```

Try changing the button background:

```css
.button-link {
    background-color: darkred;
}
```

Try making the corners more rounded:

```css
.button-link {
    border-radius: 15px;
}
```

Save the file and refresh the browser after each change.

---

## What I Learned

In this lesson, I learned:

- The `color` property changes link text color.
- The `text-decoration` property removes or adds an underline.
- The `:hover` selector applies styles when the mouse moves over a link.
- Links can be styled to look like buttons.
- Background color, padding, and border radius can improve link appearance.