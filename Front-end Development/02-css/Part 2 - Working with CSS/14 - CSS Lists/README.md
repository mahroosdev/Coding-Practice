# 14 - CSS Lists

## Introduction

In the previous lesson, I learned how to style HTML links.

In this lesson, I am learning how to change the appearance of ordered and unordered lists using CSS.

CSS can change list markers, remove markers, add spacing, and style individual list items.

---

## HTML Lists

HTML provides two common list types.

### Unordered List

An unordered list uses bullet points.

```html
<ul>
    <li>HTML</li>
    <li>CSS</li>
    <li>JavaScript</li>
</ul>
```

### Ordered List

An ordered list uses numbers or other ordered markers.

```html
<ol>
    <li>Open the code editor</li>
    <li>Create the HTML file</li>
    <li>Create the CSS file</li>
</ol>
```

---

## List Style Type

The `list-style-type` property changes the marker used by a list.

Example:

```css
.unordered-list {
    list-style-type: square;
}
```

This changes the unordered list marker from a normal circle to a square.

---

## Unordered List Markers

Common values for unordered lists include:

```text
disc
circle
square
none
```

Example:

```css
.unordered-list {
    list-style-type: square;
}
```

---

## Ordered List Markers

Ordered lists can use different types of numbers or letters.

Common values include:

```text
decimal
lower-alpha
upper-alpha
lower-roman
upper-roman
```

Example:

```css
.ordered-list {
    list-style-type: upper-roman;
}
```

This displays the list using Roman numerals.

Example output:

```text
I. Open the code editor
II. Create the HTML file
III. Create the CSS file
IV. Open the webpage
```

---

## Removing List Markers

The value `none` removes the marker from a list.

```css
.no-marker-list {
    list-style-type: none;
}
```

The list may still have space on the left because browsers add default padding.

To remove that space:

```css
.no-marker-list {
    list-style-type: none;
    padding-left: 0;
}
```

---

## Styling the List Background

A list can have its own background color and padding.

```css
.styled-list {
    list-style-type: circle;
    background-color: lightyellow;
    padding: 20px 20px 20px 40px;
}
```

This adds:

- Circle markers
- A light-yellow background
- Space inside the list

The larger left padding gives enough room for the list markers.

---

## Styling List Items

Individual list items can be selected using `li`.

Example:

```css
.styled-list li {
    color: darkgreen;
    margin-bottom: 10px;
}
```

This changes the text color and adds space below each item.

---

## Descendant Selector

This selector:

```css
.styled-list li
```

selects every `<li>` element inside an element with the class `styled-list`.

It does not change list items in the other lists.

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

.unordered-list {
    list-style-type: square;
}

.ordered-list {
    list-style-type: upper-roman;
}

.no-marker-list {
    list-style-type: none;
    padding-left: 0;
}

.styled-list {
    list-style-type: circle;
    background-color: lightyellow;
    padding: 20px 20px 20px 40px;
}

.styled-list li {
    color: darkgreen;
    margin-bottom: 10px;
}
```

---

## Output

When the webpage is opened in the browser:

- The first unordered list uses square markers.
- The ordered list uses Roman numerals.
- The third list does not display markers.
- The final list has a light-yellow background.
- The final list items appear dark green with space between them.

---

## Practice

Try changing the unordered list marker:

```css
.unordered-list {
    list-style-type: circle;
}
```

Try changing the ordered list marker:

```css
.ordered-list {
    list-style-type: upper-alpha;
}
```

Try removing the markers:

```css
.styled-list {
    list-style-type: none;
}
```

Try changing the list-item spacing:

```css
.styled-list li {
    margin-bottom: 20px;
}
```

Save the file and refresh the browser after each change.

---

## What I Learned

In this lesson, I learned:

- The `list-style-type` property changes list markers.
- Unordered lists can use disc, circle, square, or no marker.
- Ordered lists can use numbers, letters, or Roman numerals.
- The value `none` removes list markers.
- `padding-left` controls the space on the left side of a list.
- List items can be styled using the `li` selector.
- A descendant selector can style list items inside one specific list.