# 15 - CSS Tables

## Introduction

In the previous lesson, I learned how to style ordered and unordered lists.

In this lesson, I am learning how to improve the appearance of HTML tables using CSS.

CSS can add borders, spacing, background colors, row effects, and better alignment to a table.

---

## Basic HTML Table

An HTML table is created using the following elements:

- `<table>` creates the table.
- `<tr>` creates a table row.
- `<th>` creates a table heading.
- `<td>` creates a table data cell.

Example:

```html
<table>

    <tr>
        <th>Name</th>
        <th>Course</th>
        <th>Status</th>
    </tr>

    <tr>
        <td>Alex</td>
        <td>HTML</td>
        <td>Completed</td>
    </tr>

</table>
```

---

## Table Width

The `width` property controls how wide the table appears.

```css
table {
    width: 100%;
}
```

This makes the table use all available width inside its parent element.

---

## Table Borders

Borders can be added to table headings and data cells.

```css
th,
td {
    border: 1px solid black;
}
```

This adds a one-pixel solid black border around each cell.

---

## Border Collapse

By default, table cells may display separate borders.

The `border-collapse` property joins them together.

```css
table {
    border-collapse: collapse;
}
```

The value `collapse` creates one clean border between cells.

---

## Cell Padding

The `padding` property adds space inside table cells.

```css
th,
td {
    padding: 12px;
}
```

This creates space between the cell content and its border.

---

## Text Alignment

The `text-align` property controls the horizontal position of text inside table cells.

```css
th,
td {
    text-align: left;
}
```

The text is placed on the left side of each cell.

Other possible values include:

```text
center
right
```

---

## Table Heading Style

The table headings can have their own background and text colors.

```css
th {
    color: white;
    background-color: darkblue;
}
```

This gives the heading row:

- White text
- A dark-blue background

---

## Alternating Row Colors

The `:nth-child()` selector can select rows based on their position.

```css
tr:nth-child(even) {
    background-color: lightgray;
}
```

This gives every even table row a light-gray background.

It helps users read table data more easily.

---

## Table Row Hover Effect

The `:hover` selector changes a row when the mouse moves over it.

```css
tr:hover {
    background-color: lightyellow;
}
```

When the mouse moves over a row, its background becomes light yellow.

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
    margin: 20px;
    padding: 20px;
}

table {
    width: 100%;
    border-collapse: collapse;
}

th {
    color: white;
    background-color: darkblue;
}

th,
td {
    border: 1px solid black;
    padding: 12px;
    text-align: left;
}

tr:nth-child(even) {
    background-color: lightgray;
}

tr:hover {
    background-color: lightyellow;
}
```

---

## Output

When the webpage is opened in the browser:

- The table uses the full available width.
- The borders appear as one clean grid.
- The heading row has a dark-blue background.
- The heading text appears white.
- Every second row has a light-gray background.
- A row changes to light yellow when the mouse moves over it.

---

## Practice

Try centering the table text:

```css
th,
td {
    text-align: center;
}
```

Try increasing the cell padding:

```css
th,
td {
    padding: 20px;
}
```

Try changing the heading color:

```css
th {
    background-color: darkgreen;
}
```

Try changing the hover background:

```css
tr:hover {
    background-color: lightblue;
}
```

Save the file and refresh the browser after each change.

---

## What I Learned

In this lesson, I learned:

- CSS can improve the appearance of HTML tables.
- The `width` property controls table width.
- The `border-collapse` property joins table borders.
- The `padding` property adds space inside table cells.
- The `text-align` property controls text alignment.
- The `:nth-child()` selector can style alternating rows.
- The `:hover` selector can add an interactive row effect.