# 23 - HTML Classes

## Introduction

As your webpages become larger, you may want to group similar elements together.

HTML provides the `class` attribute for this purpose.

Although classes are commonly used with CSS and JavaScript, they can be added to HTML elements even before learning those technologies.

---

## What is a Class?

A class is a name that can be assigned to one or more HTML elements.

Multiple elements can share the same class name.

---

## Syntax

```html
<tag class="class-name"></tag>
```

Example:

```html
<p class="text">This is a paragraph.</p>
```

---

## Example

```html
<h2 class="heading">Welcome to My Website</h2>

<p class="text">
    HTML classes help group elements together.
</p>

<p class="text">
    Multiple elements can use the same class name.
</p>
```

---

## Understanding the Code

### `class`

The `class` attribute gives an element a name.

Example:

```html
class="text"
```

In this example, both paragraphs belong to the same class named `text`.

Classes make it easier to work with multiple elements later when using CSS or JavaScript.

---

## Output

The webpage displays:

* A heading
* Two paragraphs

The page looks the same as before because no CSS has been added yet.

The class names are stored in the HTML and will become useful in later lessons.

---

## Practice

Create a webpage with:

* One heading using the class `title`
* Two paragraphs using the class `content`

Open the webpage in your browser.

Notice that adding classes does not change the appearance of the page by itself.

---

## What You Learned

After completing this lesson, you should know:

* The `class` attribute assigns a name to an HTML element.
* Multiple elements can use the same class name.
* Classes do not change the appearance of a webpage by themselves.
* Classes are commonly used with CSS and JavaScript.
