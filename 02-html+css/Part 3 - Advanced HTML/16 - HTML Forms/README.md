# 16 - HTML Forms

## Introduction

Forms allow users to enter information on a webpage.

You have probably used forms when signing up for a website, logging in, searching for something, or sending a message.

In HTML, forms are created using the `<form>` tag.

---

## What is an HTML Form?

An HTML form is used to collect information from users.

The information can then be sent to a server for processing.

---

## The `<form>` Tag

The `<form>` tag creates a form.

Everything that belongs to the form is placed between the opening and closing `<form>` tags.

### Syntax

```html
<form>

</form>
```

---

## The `<label>` Tag

The `<label>` tag displays a text label for an input field.

Example:

```html
<label for="name">Name:</label>
```

---

## The `<input>` Tag

The `<input>` tag creates an input field where users can enter information.

Example:

```html
<input type="text">
```

---

## Example

```html
<form>

    <label for="name">Name:</label>
    <br>
    <input type="text" id="name" name="name">

    <br><br>

    <label for="email">Email:</label>
    <br>
    <input type="email" id="email" name="email">

    <br><br>

    <input type="submit" value="Submit">

</form>
```

---

## Output

The webpage displays:

* A Name field
* An Email field
* A Submit button

Users can type information into the fields before clicking **Submit**.

---

## Practice

Create a form with:

* A Name field
* An Email field
* A Submit button

Try typing your own information into the fields.

---

## What You Learned

After completing this lesson, you should know:

* The `<form>` tag creates a form.
* The `<label>` tag adds a label to an input field.
* The `<input>` tag creates a field where users can enter data.
* The `type` attribute changes the behavior of an input field.
