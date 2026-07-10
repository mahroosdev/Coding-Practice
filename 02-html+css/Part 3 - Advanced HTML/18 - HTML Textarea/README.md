# 18 - HTML Textarea

## Introduction

In the previous lessons, you learned how to create input fields using the `<input>` tag.

Sometimes, users need to enter more than one line of text. For this purpose, HTML provides the `<textarea>` element.

---

## What is a Textarea?

A textarea is used to create a multi-line text input.

It allows users to type longer messages, comments, descriptions, or feedback.

---

## Syntax

```html
<textarea></textarea>
```

Unlike the `<input>` element, the `<textarea>` element has both an opening tag and a closing tag.

---

## Example

```html
<textarea rows="5" cols="30"></textarea>
```

---

## Understanding the Attributes

### `rows`

The `rows` attribute specifies how many lines of text are visible.

Example:

```html
<textarea rows="5"></textarea>
```

---

### `cols`

The `cols` attribute specifies the width of the textarea.

Example:

```html
<textarea cols="30"></textarea>
```

---

## Complete Example

```html
<label for="message">Message:</label>

<br><br>

<textarea id="message" name="message" rows="5" cols="30"></textarea>
```

---

## Output

The webpage displays:

* A label with the text **Message**
* A large text box where users can type multiple lines of text

---

## Practice

Create a form that contains:

* A Name input field
* An Email input field
* A Message textarea

Type several lines of text into the textarea and notice that it allows multiple lines, unlike a normal text input.

---

## What You Learned

After completing this lesson, you should know:

* The `<textarea>` element creates a multi-line text box.
* `<textarea>` is used for longer text such as messages and comments.
* The `rows` attribute controls the visible height.
* The `cols` attribute controls the visible width.
* `<textarea>` uses both an opening tag and a closing tag.
