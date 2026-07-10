# 24 - HTML IDs

## Introduction

In the previous lesson, you learned about the `class` attribute.

HTML also provides the `id` attribute, which is used to give an element a unique name.

Unlike classes, an ID should only be used once on a webpage.

---

## What is an ID?

An ID is a unique name assigned to a single HTML element.

Each ID should only appear once in the same HTML document.

---

## Syntax

```html
<tag id="unique-name"></tag>
```

Example:

```html
<h1 id="main-heading">Welcome</h1>
```

---

## Example

```html
<h2 id="main-heading">Welcome to My Website</h2>

<p id="first-paragraph">
    This paragraph has its own unique ID.
</p>
```

---

## Understanding the Code

### `id`

The `id` attribute gives an element a unique name.

Example:

```html
id="main-heading"
```

Unlike a class, the same ID should not be used on multiple elements in the same page.

IDs are commonly used with CSS, JavaScript, and page navigation.

---

## Class vs ID

| Class                        | ID                                 |
| ---------------------------- | ---------------------------------- |
| Can be used on many elements | Should be used on only one element |
| Uses the `class` attribute   | Uses the `id` attribute            |

---

## Output

The webpage displays:

* A heading
* Two paragraphs

The page looks the same as before because IDs do not change the appearance of a webpage by themselves.

---

## Practice

Create a webpage with:

* A heading that has the ID `page-title`
* A paragraph that has the ID `about-text`

Open the page in your browser and observe that adding IDs does not change the appearance.

---

## What You Learned

After completing this lesson, you should know:

* The `id` attribute gives an element a unique name.
* An ID should only be used once on a webpage.
* IDs do not change the appearance of a webpage.
* IDs are commonly used with CSS, JavaScript, and page navigation.
