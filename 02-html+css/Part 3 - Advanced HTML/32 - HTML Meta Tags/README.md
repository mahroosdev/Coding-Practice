# 32 - HTML Meta Tags

## Introduction

Meta tags provide information about a webpage.

They are placed inside the `<head>` section and are not displayed on the webpage itself.

Browsers, search engines, and other tools use meta tags to understand information about the page.

---

## What are Meta Tags?

Meta tags describe information about a webpage.

They can specify:

- The character encoding
- The page description
- Keywords
- The author
- How the page should appear on different devices

---

## The `<meta>` Element

The `<meta>` element is used to define metadata.

Example:

```html
<meta charset="UTF-8">
```

---

## Common Meta Tags

### Character Encoding

```html
<meta charset="UTF-8">
```

Specifies the character encoding used by the webpage.

---

### Viewport

```html
<meta name="viewport" content="width=device-width, initial-scale=1.0">
```

Makes the webpage display properly on different screen sizes.

---

### Description

```html
<meta name="description" content="Learn HTML Meta Tags">
```

Provides a short description of the webpage.

---

### Keywords

```html
<meta name="keywords" content="HTML, Meta Tags, Web Development">
```

Lists keywords related to the webpage.

---

### Author

```html
<meta name="author" content="Your Name">
```

Specifies the author of the webpage.

---

## Complete Example

```html
<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<meta name="description" content="Learn HTML Meta Tags">

<meta name="keywords" content="HTML, Meta Tags, Web Development">

<meta name="author" content="Your Name">
```

---

## Output

Meta tags are not visible on the webpage.

They work behind the scenes by providing information about the webpage.

---

## Practice

Create a webpage that includes:

- UTF-8 character encoding
- Viewport meta tag
- Description
- Keywords
- Author

Open the webpage and verify that it works normally.

---

## What You Learned

After completing this lesson, you should know:

- Meta tags provide information about a webpage.
- Meta tags are placed inside the `<head>` element.
- The `charset` meta tag defines character encoding.
- The `viewport` meta tag helps webpages display correctly on different devices.
- The `description`, `keywords`, and `author` meta tags describe the webpage.
