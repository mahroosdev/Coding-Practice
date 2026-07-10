# 22 - HTML Buttons

## Introduction

Buttons allow users to perform actions on a webpage.

For example, a button can submit a form, reset a form, or perform another action.

HTML provides different types of buttons.

---

## Submit Button

A submit button sends the form data when the form is submitted.

### Syntax

```html
<input type="submit" value="Submit">
```

The `value` attribute defines the text displayed on the button.

---

## Reset Button

A reset button clears all the information entered into the form.

### Syntax

```html
<input type="reset" value="Reset">
```

Clicking this button returns the form fields to their original values.

---

## Button Element

The `<button>` element creates a clickable button.

### Syntax

```html
<button type="button">Click Me</button>
```

The text between the opening and closing tags appears on the button.

---

## Example

```html
<form>

    <label for="fullname">Full Name:</label>
    <br>
    <input type="text" id="fullname" name="fullname">

    <br><br>

    <input type="submit" value="Submit">

    <input type="reset" value="Reset">

    <button type="button">Click Me</button>

</form>
```

---

## Output

The webpage displays:

* A text input field
* A **Submit** button
* A **Reset** button
* A **Click Me** button

Try typing something into the text field.

* Click **Submit** to submit the form.
* Click **Reset** to clear the text field.
* Click **Click Me** to see a normal button. It doesn't perform any action yet because no JavaScript has been added.

---

## Practice

Create a simple form that contains:

* A Name input field
* A Submit button
* A Reset button
* A Button element with the text **Save**

Open the page and try each button to see how it behaves.

---

## What You Learned

After completing this lesson, you should know:

* `type="submit"` creates a submit button.
* `type="reset"` creates a reset button.
* The `<button>` element creates a clickable button.
* Different button types perform different actions.
