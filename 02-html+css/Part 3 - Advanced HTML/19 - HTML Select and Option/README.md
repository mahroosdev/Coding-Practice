# 19 - HTML Select and Option

## Introduction

Sometimes, you want users to choose one item from a list instead of typing the information.

HTML provides the `<select>` element to create a drop-down list, and the `<option>` element to add the available choices.

---

## What is a Select Element?

The `<select>` element creates a drop-down list.

Users can click the list and choose one option.

---

## What is an Option?

The `<option>` element defines each item inside the drop-down list.

Every choice is placed between opening and closing `<option>` tags.

---

## Syntax

```html
<select>

    <option>Option 1</option>

    <option>Option 2</option>

    <option>Option 3</option>

</select>
```

---

## Example

```html
<label for="country">Select Your Country:</label>

<br><br>

<select id="country" name="country">

    <option>Sri Lanka</option>

    <option>India</option>

    <option>Japan</option>

    <option>Australia</option>

</select>
```

---

## Understanding the Code

* `<select>` creates the drop-down list.
* `<option>` adds an item to the list.
* Users can choose one option from the available choices.

---

## Output

The webpage displays:

* A label saying **Select Your Country**
* A drop-down list containing:

  * Sri Lanka
  * India
  * Japan
  * Australia

When you click the drop-down, you can select one country.

---

## Practice

Create a drop-down list for your favorite programming language.

Add the following options:

* HTML
* CSS
* JavaScript
* Python

Open the webpage and try selecting different options.

---

## What You Learned

After completing this lesson, you should know:

* The `<select>` element creates a drop-down list.
* The `<option>` element adds items to the list.
* Users can choose one option from the available choices.
* Drop-down lists are useful when there are multiple options to choose from.
