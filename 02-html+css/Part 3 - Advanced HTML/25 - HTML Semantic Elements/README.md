# 25 - HTML Semantic Elements

## Introduction

As webpages become larger, it is helpful to organize different parts of the page.

HTML provides **semantic elements** that describe the purpose of each section. These elements make the code easier to read and understand.

---

## What are Semantic Elements?

Semantic elements clearly describe the role of the content they contain.

For example, instead of using a generic element for everything, HTML provides elements for headers, navigation menus, the main content, and footers.

---

## Common Semantic Elements

### `<header>`

Represents the top section of a webpage or a section.

Example:

```html id="p1j5qz"
<header>
    <h1>My Website</h1>
</header>
```

---

### `<nav>`

Contains navigation links.

Example:

```html id="r7t2nw"
<nav>
    <a href="#">Home</a>
    <a href="#">About</a>
    <a href="#">Contact</a>
</nav>
```

---

### `<main>`

Contains the main content of the webpage.

Example:

```html id="j6n4my"
<main>
    <p>Main content goes here.</p>
</main>
```

---

### `<section>`

Groups related content together.

Example:

```html id="x4v8ka"
<section>
    <h2>About Me</h2>
    <p>This section contains information about me.</p>
</section>
```

---

### `<footer>`

Represents the bottom section of a webpage.

Example:

```html id="m8c3yt"
<footer>
    <p>&copy; 2026 My Website</p>
</footer>
```

---

## Complete Example

```html id="t5p9wr"
<header>
    <h1>My Website</h1>
</header>

<nav>
    <a href="#">Home</a> |
    <a href="#">About</a> |
    <a href="#">Contact</a>
</nav>

<main>
    <section>
        <h2>About Me</h2>
        <p>I am learning HTML.</p>
    </section>
</main>

<footer>
    <p>&copy; 2026 My Website</p>
</footer>
```

---

## Output

The webpage displays:

* A website title at the top
* Navigation links
* A main content section
* A footer at the bottom

The appearance is simple because no CSS has been added yet, but the HTML structure is clear and meaningful.

---

## Practice

Create a webpage using the following semantic elements:

* `<header>`
* `<nav>`
* `<main>`
* `<section>`
* `<footer>`

Add your own heading, navigation links, and a short paragraph inside the section.

---

## What You Learned

After completing this lesson, you should know:

* Semantic elements describe the purpose of different parts of a webpage.
* `<header>` represents the top section.
* `<nav>` contains navigation links.
* `<main>` contains the primary content.
* `<section>` groups related content.
* `<footer>` represents the bottom section of the page.
