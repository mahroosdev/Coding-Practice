# 01 - Basic HTML Structure

## Introduction

Before learning HTML tags like headings, paragraphs, images, or links, it's important to understand the basic structure of an HTML document.

Every HTML page follows this structure. Once you understand it, learning the rest of HTML becomes much easier.

---

## Basic HTML Structure

```html
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Basic HTML Structure</title>
</head>

<body>

    <h1>Welcome to HTML</h1>

    <p>This is my first HTML page.</p>

</body>

</html>
```

---

## Explanation

### `<!DOCTYPE html>`

This tells the browser that the document is written using HTML5.

It should always be the first line in every HTML file.

---

### `<html>`

The `<html>` element is the root of the webpage.

Everything you write for the webpage goes inside this tag.

The `lang="en"` attribute tells the browser that the page is written in English.

---

### `<head>`

The `<head>` section contains information about the webpage that isn't displayed on the page itself.

This is where you usually add:

* The page title
* Meta tags
* CSS files
* JavaScript files

---

### `<meta charset="UTF-8">`

This sets the character encoding to UTF-8.

It allows the webpage to display letters, numbers, symbols, and many languages correctly.

---

### `<meta name="viewport">`

This helps the webpage display properly on phones, tablets, and desktops by making it responsive.

---

### `<title>`

The title appears on the browser tab.

```html
<title>Basic HTML Structure</title>
```

If you change the title, you'll notice the text on the browser tab changes as well.

---

### `<body>`

The `<body>` contains everything that is visible on the webpage.

For example:

* Headings
* Paragraphs
* Images
* Links
* Tables
* Forms

If you want something to appear on the webpage, it belongs inside the `<body>` tag.

---

## Output

When you run the example, you'll see:

```
Welcome to HTML

This is my first HTML page.
```

---

## Try It Yourself

Create another HTML file and practice by changing:

* The page title
* The heading
* The paragraph

Save the file and refresh your browser to see the changes.

---

## What You Learned

After completing this lesson, you should understand:

* The basic structure of an HTML document
* What each main HTML tag does
* The purpose of the `<head>` and `<body>` sections
* Why the `<!DOCTYPE html>` declaration is important
* How the browser reads an HTML page

This structure will be used in every HTML page you create, so it's worth taking a little time to get comfortable with it before moving on to the next lesson.
