# 20 - HTML Radio Buttons

## Introduction

Sometimes, users need to choose only one option from a list.

HTML provides **radio buttons** for this purpose.

For example, a user may need to select their gender, payment method, or favorite color.

---

## What is a Radio Button?

A radio button allows the user to select **only one option** from a group.

If another option is selected, the previous one is automatically deselected.

---

## Syntax

```html
<input type="radio">
```

---

## Example

```html
<input type="radio" id="male" name="gender" value="Male">
<label for="male">Male</label>

<input type="radio" id="female" name="gender" value="Female">
<label for="female">Female</label>

<input type="radio" id="other" name="gender" value="Other">
<label for="other">Other</label>
```

---

## Understanding the Code

### `type="radio"`

Creates a radio button.

### `name`

The `name` attribute groups radio buttons together.

Radio buttons with the same `name` allow only one option to be selected.

### `value`

The `value` attribute stores the value of the selected option.

### `label`

The `<label>` tag displays text next to the radio button.

---

## Output

The webpage displays three radio buttons:

* Male
* Female
* Other

Only one option can be selected at a time.

---

## Practice

Create a group of radio buttons for your favorite programming language.

Options:

* HTML
* CSS
* JavaScript

Make sure all radio buttons use the same `name` attribute.

---

## What You Learned

After completing this lesson, you should know:

* `type="radio"` creates a radio button.
* Radio buttons are used when only one option should be selected.
* The `name` attribute groups radio buttons together.
* The `label` tag displays text for each radio button.
