# 14 - HTML Tables

## Introduction

Tables are used to display information in rows and columns.

They are useful for organizing data such as student records, product lists, employee details, and schedules.

---

## What is an HTML Table?

An HTML table is created using the `<table>` tag.

A table is made up of:

* Rows
* Columns
* Headers
* Data

---

## Table Tags

### `<table>`

Creates the table.

### `<tr>`

Creates a table row.

### `<th>`

Creates a table header.

Header cells are usually displayed in bold.

### `<td>`

Creates a table data cell.

This is where the actual information is placed.

---

## Example

```html
<table border="1">

    <tr>
        <th>Name</th>
        <th>Age</th>
        <th>Country</th>
    </tr>

    <tr>
        <td>John</td>
        <td>22</td>
        <td>USA</td>
    </tr>

</table>
```

---

## Understanding the Example

* `<table>` creates the table.
* `<tr>` creates a new row.
* `<th>` creates the headings.
* `<td>` adds the table data.

The `border="1"` attribute adds a simple border around the table so it's easier to see.

> **Note:** The `border` attribute is used here only to help beginners see the table structure. In modern websites, table borders are usually added with CSS, which you'll learn later.

---

## Output

The browser displays a table like this:

| Name  | Age | Country |
| ----- | --- | ------- |
| John  | 22  | USA     |
| Sarah | 24  | Canada  |
| Ali   | 21  | UAE     |

---

## Practice

Create a table with the following information:

| Name | Favorite Subject | Grade |
| ---- | ---------------- | ----- |
| Alex | Mathematics      | A     |
| Emma | Science          | B+    |
| Noah | English          | A-    |

---

## What You Learned

After completing this lesson, you should know:

* The `<table>` tag creates a table.
* The `<tr>` tag creates a row.
* The `<th>` tag creates table headers.
* The `<td>` tag creates table data cells.
* Tables are used to organize information into rows and columns.
