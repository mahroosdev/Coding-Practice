# 31 - HTML Iframes

## Introduction

Sometimes, you may want to display another webpage inside your own webpage.

HTML provides the `<iframe>` element for this purpose.

An iframe creates a window inside a webpage that can display another webpage or online content.

---

## What is an Iframe?

An iframe (Inline Frame) is used to embed another webpage inside the current webpage.

It is commonly used for:

- Maps
- Videos
- Documents
- Other websites

---

## Syntax

```html
<iframe src="page.html"></iframe>
```

---

## The `src` Attribute

The `src` attribute specifies the webpage that will be displayed.

Example:

```html
<iframe src="https://developer.mozilla.org/en-US/"></iframe>
```

---

## The `width` Attribute

The `width` attribute specifies the width of the iframe.

Example:

```html
<iframe width="800"></iframe>
```

---

## The `height` Attribute

The `height` attribute specifies the height of the iframe.

Example:

```html
<iframe height="500"></iframe>
```

---

## The `title` Attribute

The `title` attribute provides a description of the iframe.

Example:

```html
<iframe
    src="https://developer.mozilla.org/en-US/"
    title="MDN Web Docs">
</iframe>
```

Adding a title improves accessibility.

---

## Complete Example

```html
<iframe
    src="https://developer.mozilla.org/en-US/"
    width="800"
    height="500"
    title="MDN Web Docs">
</iframe>
```

---

## Output

The webpage displays:

- A heading
- A short description
- An embedded webpage inside the browser

---

## Practice

Create a webpage that displays an iframe.

Try changing:

- The width
- The height
- The webpage in the `src` attribute

Observe how the iframe changes.

---

## What You Learned

After completing this lesson, you should know:

- The `<iframe>` element embeds another webpage.
- The `src` attribute specifies which webpage to display.
- The `width` attribute sets the iframe width.
- The `height` attribute sets the iframe height.
- The `title` attribute provides a description for the iframe.
