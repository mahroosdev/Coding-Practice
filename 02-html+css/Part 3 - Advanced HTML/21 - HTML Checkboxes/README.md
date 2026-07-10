# 21 - HTML Checkboxes

## Introduction

In the previous lesson, you learned how to use radio buttons to let users select one option.

Sometimes, users need to choose more than one option. HTML provides **checkboxes** for this purpose.

---

## What is a Checkbox?

A checkbox allows users to select one or more options from a list.

Unlike radio buttons, selecting one checkbox does not affect the others.

---

## Syntax

```html
<input type="checkbox">
```

---

## Example

```html
<input type="checkbox" id="reading" name="hobby" value="Reading">
<label for="reading">Reading</label>

<br>

<input type="checkbox" id="coding" name="hobby" value="Coding">
<label for="coding">Coding</label>

<br>

<input type="checkbox" id="gaming" name="hobby" value="Gaming">
<label for="gaming">Gaming</label>
```

---

## Understanding the Code

### `type="checkbox"`

Creates a checkbox.

### `id`

Gives the checkbox a unique name so it can be connected to a label.

### `name`

Identifies the group of checkboxes.

### `value`

Stores the value of the selected checkbox.

### `<label>`

Displays text next to the checkbox.

---

## Output

The webpage displays three checkboxes:

* Reading
* Coding
* Gaming

You can select one, two, or all three options.

---

## Practice

Create a list of your favorite fruits using checkboxes.

For example:

* Apple
* Orange
* Mango
* Banana

Select different combinations and observe that multiple options can be selected at the same time.

---

## What You Learned

After completing this lesson, you should know:

* `type="checkbox"` creates a checkbox.
* Checkboxes allow users to select multiple options.
* Each checkbox can have its own label.
* Checkboxes are useful when users can choose more than one answer.
