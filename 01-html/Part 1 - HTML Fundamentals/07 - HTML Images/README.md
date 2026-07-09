# 07 - HTML Images

## Introduction

Images are an important part of most webpages. They make content more interesting and help users understand information more easily.

In HTML, images are added using the `<img>` tag.

---

## What is the `<img>` Tag?

The `<img>` tag is used to display an image on a webpage.

Unlike many HTML elements, the `<img>` tag does not have a closing tag.

---

## Syntax

```html
<img src="image-name.jpg" alt="Image Description">
```

---

## Understanding the Attributes

### `src`

The `src` (source) attribute tells the browser where the image is located.

Example:

```html
<img src="images/sample-image.jpg" alt="Sample Image">
```

---

### `alt`

The `alt` (alternative text) attribute provides a description of the image.

If the image cannot be displayed, the browser shows the alternative text instead.

It also helps people using screen readers understand what the image represents.

---

## Example

```html
<img src="images/sample-image.jpg" alt="Sample Image">
```

This displays the image stored in the `images` folder.

---

## Output

When you open the webpage, you'll see:

* A heading
* A paragraph
* The image below the paragraph

---

## Practice

1. Create a folder named `images`.
2. Add any picture to the folder.
3. Rename the picture to `sample-image.jpg`.
4. Display the image using the `<img>` tag.
5. Change the `alt` text to describe your image.

---

## What You Learned

After completing this lesson, you should know:

* The `<img>` tag is used to display images.
* The `src` attribute specifies the image location.
* The `alt` attribute provides a description of the image.
* Images can be stored inside a folder and displayed on a webpage.
