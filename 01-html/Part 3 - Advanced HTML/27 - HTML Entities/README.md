# 27 - HTML Entities

## Introduction

Sometimes, you need to display characters that have a special meaning in HTML or symbols that are not available directly on the keyboard.

HTML provides **entities** to display these characters correctly.

---

## What is an HTML Entity?

An HTML entity is a special code that represents a character or symbol.

Entities begin with an ampersand (`&`) and end with a semicolon (`;`).

Example:

```html
&copy;
```

The browser displays:

```text
©
```

---

## Common HTML Entities

### Copyright Symbol

```html
&copy;
```

Output:

```text
©
```

---

### Registered Trademark

```html
&reg;
```

Output:

```text
®
```

---

### Trademark

```html
&trade;
```

Output:

```text
™
```

---

### Less Than

```html
&lt;
```

Output:

```text
<
```

---

### Greater Than

```html
&gt;
```

Output:

```text
>
```

---

### Ampersand

```html
&amp;
```

Output:

```text
&
```

---

### Non-Breaking Space

```html
&nbsp;
```

Example:

```html
HTML&nbsp;Entities
```

Output:

```text
HTML Entities
```

The browser keeps the words together by inserting a non-breaking space.

---

## Complete Example

```html
<p>Copyright Symbol: &copy;</p>

<p>Registered Trademark: &reg;</p>

<p>Trademark Symbol: &trade;</p>

<p>Less Than: &lt;</p>

<p>Greater Than: &gt;</p>

<p>Ampersand: &amp;</p>

<p>Non-Breaking Space: HTML&nbsp;Entities</p>
```

---

## Practice

Create a webpage that displays:

* A copyright symbol.
* A trademark symbol.
* A registered trademark symbol.
* A less than sign.
* A greater than sign.
* An ampersand.
* A sentence using a non-breaking space.

Open the page in your browser and observe how each entity is displayed.

---

## What You Learned

After completing this lesson, you should know:

* HTML entities display special characters and symbols.
* Every entity starts with `&` and ends with `;`.
* Entities are useful when a character has a special meaning in HTML.
* Common entities include `&copy;`, `&reg;`, `&trade;`, `&lt;`, `&gt;`, `&amp;`, and `&nbsp;`.
