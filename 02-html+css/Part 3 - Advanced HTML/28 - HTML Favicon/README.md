# 28 - HTML Favicon

## Introduction

A favicon is the small icon displayed in a browser tab next to the webpage title.

It helps users identify a website when multiple tabs are open.

---

## What is a Favicon?

A favicon is a small image that represents a website.

Browsers display the favicon in places such as:

* Browser tabs
* Bookmarks
* Browser history

---

## The `<link>` Tag

The `<link>` tag is used to connect external resources to an HTML document.

To add a favicon, place the following line inside the `<head>` section.

### Syntax

```html
<link rel="icon" type="image/x-icon" href="favicon.ico">
```

---

## Understanding the Code

### `rel="icon"`

Tells the browser that the linked file is the website's favicon.

### `type="image/x-icon"`

Specifies the file type.

### `href="favicon.ico"`

Provides the file path to the favicon.

---

## Example

```html
<head>

    <title>My Website</title>

    <link rel="icon" type="image/x-icon" href="favicon.ico">

</head>
```

---

## File Structure

```text
28-HTML-Favicon/
│
├── index.html
├── favicon.ico
```

Because the favicon is in the same folder as `index.html`, the file path is simply:

```text
favicon.ico
```

---

## Output

After opening the webpage in your browser:

* The page displays the heading **HTML Favicon**.
* A small icon appears next to the page title in the browser tab.

---

## Practice

1. Create a folder named `28-HTML-Favicon`.
2. Add an image file named `favicon.ico`.
3. Add the following code inside the `<head>` section:

```html
<link rel="icon" type="image/x-icon" href="favicon.ico">
```

1. Save the file and refresh the browser.

If the favicon does not appear immediately, try a hard refresh (`Ctrl + F5`) because browsers often cache favicons.

---

## What You Learned

After completing this lesson, you should know:

* A favicon is the small icon shown in a browser tab.
* The `<link>` tag is used to add a favicon.
* The favicon is usually added inside the `<head>` section.
* The `href` attribute specifies the location of the favicon file.
