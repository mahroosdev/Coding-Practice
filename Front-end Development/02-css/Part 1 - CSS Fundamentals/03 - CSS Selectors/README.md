# 03 - CSS Selectors

## Introduction

In the previous lesson, I learned the basic CSS syntax.

In this lesson, I am learning how CSS selectors are used to choose HTML elements.

A selector tells the browser which HTML element should receive the CSS style.

---

## What is a CSS Selector?

A CSS selector is used to select an HTML element.

Example:

```css
h1 {
    color: darkblue;
}
```

In this example, `h1` is the selector.

It selects the `<h1>` element from the HTML file.

---

## Element Selector

The element selector selects HTML elements using their tag name.

Example:

```css
p {
    font-size: 18px;
}
```

This selects every `<p>` element on the webpage.

HTML example:

```html
<p>This is a paragraph.</p>
```

---

## Class Selector

A class selector selects elements that have a specific class name.

In HTML, a class is added using the `class` attribute.

Example:

```html
<p class="highlight">
    This is a highlighted paragraph.
</p>
```

In CSS, the class name begins with a full stop (`.`).

```css
.highlight {
    background-color: lightyellow;
}
```

Multiple HTML elements can use the same class name.

---

## ID Selector

An ID selector selects one HTML element with a specific ID.

In HTML, an ID is added using the `id` attribute.

Example:

```html
<p id="special-text">
    This is special text.
</p>
```

In CSS, the ID name begins with a hash symbol (`#`).

```css
#special-text {
    color: darkred;
}
```

An ID should normally be used only once on the same webpage.

---

## Selectors Used in This Lesson

### Element Selector

```css
h1 {
    color: darkblue;
}
```

### Class Selector

```css
.highlight {
    background-color: lightyellow;
}
```

### ID Selector

```css
#special-text {
    color: darkred;
}
```

---

## Complete CSS Example

```css
body {
    background-color: lightgray;
}

h1 {
    color: darkblue;
}

p {
    font-size: 18px;
}

.sub-heading {
    color: darkgreen;
}

.highlight {
    background-color: lightyellow;
}

#special-text {
    color: darkred;
}
```

---

## Output

When the webpage is opened in the browser:

- The page background appears light gray.
- The main heading appears dark blue.
- The second heading appears dark green.
- Every paragraph uses a font size of 18 pixels.
- The paragraph with the `highlight` class has a light-yellow background.
- The paragraph with the `special-text` ID appears dark red.

---

## Practice

Add another paragraph to `index.html`.

```html
<p class="highlight">
    This is another highlighted paragraph.
</p>
```

Because it uses the same class name, it will receive the same background color.

You can also try changing the selector values inside `style.css`.

---

## What I Learned

In this lesson, I learned:

- CSS selectors choose HTML elements.
- An element selector uses the HTML tag name.
- A class selector begins with a full stop.
- An ID selector begins with a hash symbol.
- Multiple elements can share the same class.
- An ID should normally be unique on a webpage.