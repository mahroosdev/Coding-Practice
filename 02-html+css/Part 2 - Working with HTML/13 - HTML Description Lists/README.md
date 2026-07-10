# 13 - HTML Description Lists

## Introduction

In the previous lesson, you learned about unordered lists and ordered lists.

HTML also provides **description lists**, which are useful for displaying a term and its description.

---

## What is a Description List?

A description list is used to display a list of terms with their descriptions.

It uses three HTML tags:

* `<dl>` - Creates the description list.
* `<dt>` - Defines the term.
* `<dd>` - Defines the description.

---

## Syntax

```html
<dl>
    <dt>Term</dt>
    <dd>Description</dd>
</dl>
```

---

## Example

```html
<dl>
    <dt>HTML</dt>
    <dd>Used to create the structure of a webpage.</dd>

    <dt>CSS</dt>
    <dd>Used to style a webpage.</dd>

    <dt>JavaScript</dt>
    <dd>Used to make a webpage interactive.</dd>
</dl>
```

---

## Output

The browser displays a list of terms followed by their descriptions.

Example:

```text
HTML
    Used to create the structure of a webpage.

CSS
    Used to style a webpage.

JavaScript
    Used to make a webpage interactive.
```

---

## Practice

Create a description list using the following information:

| Term | Description                             |
| ---- | --------------------------------------- |
| CPU  | Processes instructions in a computer.   |
| RAM  | Stores data while programs are running. |
| SSD  | Stores files and applications.          |

---

## What You Learned

After completing this lesson, you should know:

* The `<dl>` tag creates a description list.
* The `<dt>` tag defines a term.
* The `<dd>` tag defines the description of the term.
* Description lists are useful for showing terms with explanations.
