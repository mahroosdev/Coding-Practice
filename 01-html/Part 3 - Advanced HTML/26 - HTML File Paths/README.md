# 26 - HTML File Paths

## Introduction

Webpages often use files such as images, videos, audio files, and other HTML pages.

To use these files, HTML needs to know where they are located. This location is called a **file path**.

---

## What is a File Path?

A file path tells the browser where to find a file.

The file can be:

* An image
* An audio file
* A video
* Another HTML page
* Any other file used by the webpage

---

## Example

```html
<img src="images/sample-image.jpg" alt="Sample Image">
```

In this example:

* `images` is the folder.
* `sample-image.jpg` is the image file.
* Together, they form the file path:

```text
images/sample-image.jpg
```

---

## File Structure

```text
26-HTML-File-Paths/
│
├── index.html
├── images/
│   └── sample-image.jpg
```

Since the `images` folder is in the same folder as `index.html`, the file path is:

```text
images/sample-image.jpg
```

---

## Another Example

If another HTML page is in the same folder:

```text
26-HTML-File-Paths/
│
├── index.html
├── about.html
```

You can create a link like this:

```html
<a href="about.html">About</a>
```

---

## Why are File Paths Important?

File paths allow your webpage to find and display files correctly.

If the path is incorrect, the browser cannot find the file.

For example:

* An image will not be displayed.
* A video will not play.
* A link may open an error page.

---

## Practice

1. Create an `images` folder.
2. Add an image named `sample-image.jpg`.
3. Display the image using:

```html
<img src="images/sample-image.jpg" alt="Sample Image">
```

1. Try changing the file name or folder name and refresh the browser. Notice that the image no longer appears because the file path is incorrect.

---

## What You Learned

After completing this lesson, you should know:

* A file path tells the browser where to find a file.
* Images, videos, audio files, and web pages all use file paths.
* The `src` and `href` attributes commonly use file paths.
* An incorrect file path prevents the browser from locating the file.
