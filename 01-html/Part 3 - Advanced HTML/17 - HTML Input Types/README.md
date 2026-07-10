# 17 - HTML Input Types

## Introduction

In the previous lesson, you learned how to create a basic HTML form.

The `<input>` tag can be used in different ways by changing its `type` attribute. Each input type is designed for a specific kind of data.

---

## What is an Input Type?

The `type` attribute tells the browser what kind of input field to display.

Example:

```html
<input type="text">
```

Changing the value of the `type` attribute changes how the input field works.

---

## Text Input

The `text` input type is used for entering plain text.

### Example

```html
<input type="text">
```

---

## Email Input

The `email` input type is used for entering an email address.

### Example

```html
<input type="email">
```

---

## Password Input

The `password` input type hides the characters entered by the user.

### Example

```html
<input type="password">
```

---

## Number Input

The `number` input type allows users to enter numbers.

### Example

```html
<input type="number">
```

---

## Example

```html
<form>

    <label for="fullname">Full Name:</label>
    <br>
    <input type="text" id="fullname">

    <br><br>

    <label for="email">Email:</label>
    <br>
    <input type="email" id="email">

    <br><br>

    <label for="password">Password:</label>
    <br>
    <input type="password" id="password">

    <br><br>

    <label for="age">Age:</label>
    <br>
    <input type="number" id="age">

</form>
```

---

## Output

The webpage displays a simple form containing:

* A text field
* An email field
* A password field
* A number field
* A submit button

Each field is designed for a different type of information.

---

## Practice

Create a form with:

* Full Name
* Email
* Password
* Age

After creating the form, type some information into each field and observe how they behave.

---

## What You Learned

After completing this lesson, you should know:

* The `type` attribute changes the behavior of an input field.
* `text` is used for plain text.
* `email` is used for email addresses.
* `password` hides typed characters.
* `number` accepts numeric values.
