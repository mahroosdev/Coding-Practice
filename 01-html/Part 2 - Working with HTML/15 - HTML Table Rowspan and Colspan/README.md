# 15 - HTML Table Rowspan and Colspan

## Introduction

In the previous lesson, you learned how to create a basic HTML table.

Sometimes, you may want one cell to cover multiple rows or multiple columns. HTML provides the `rowspan` and `colspan` attributes for this purpose.

---

## What is `colspan`?

The `colspan` attribute allows a table cell to span across multiple columns.

### Syntax

```html
<th colspan="2">Student Information</th>
```

In this example, the heading stretches across **two columns**.

---

## Example

```html
<table border="1">

    <tr>
        <th colspan="2">Student Information</th>
    </tr>

    <tr>
        <th>Name</th>
        <th>Age</th>
    </tr>

    <tr>
        <td>John</td>
        <td>20</td>
    </tr>

</table>
```

---

## What is `rowspan`?

The `rowspan` attribute allows a table cell to span across multiple rows.

### Syntax

```html
<td rowspan="2">Sarah</td>
```

In this example, the name **Sarah** covers two rows.

---

## Example

```html
<table border="1">

    <tr>
        <th>Name</th>
        <th>Subject</th>
    </tr>

    <tr>
        <td rowspan="2">Sarah</td>
        <td>Mathematics</td>
    </tr>

    <tr>
        <td>Science</td>
    </tr>

</table>
```

---

## Output

The webpage displays:

* A table with a header that spans two columns.
* A table where one name spans two rows.

---

## Practice

Create two tables.

### Table 1

Use `colspan` to create a heading that spans **three columns**.

### Table 2

Use `rowspan` to make one student's name cover **two rows** while listing two different subjects.

---

## What You Learned

After completing this lesson, you should know:

* What the `colspan` attribute does.
* What the `rowspan` attribute does.
* How to merge table columns.
* How to merge table rows.
