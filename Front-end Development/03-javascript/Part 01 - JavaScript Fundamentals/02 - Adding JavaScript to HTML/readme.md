# 02 - Adding JavaScript to HTML

## Introduction

In the previous lesson, I learned what JavaScript is and how to display messages in the browser console.

In this lesson, I am learning how JavaScript can be added to an HTML webpage.

There are three main ways to add JavaScript:

1. Inline JavaScript
2. Internal JavaScript
3. External JavaScript

---

## Folder Structure

```text
02 - Adding JavaScript to HTML/
│
├── index.html
├── style.css
├── script.js
└── README.md
```

---

## Why Connect JavaScript to HTML?

HTML creates the webpage structure.

JavaScript adds behaviour to that structure.

For example, JavaScript can respond when a user clicks a button.

The browser must know where the JavaScript code is located before it can run the code.

---

## Method 1: Inline JavaScript

Inline JavaScript is written directly inside an HTML element.

Example:

```html
<button onclick="alert('Hello from inline JavaScript!')">
    Try Inline JavaScript
</button>
```

When the button is selected, the browser displays a message box.

The JavaScript code is:

```javascript
alert("Hello from inline JavaScript!");
```

In this example, the code is placed inside the `onclick` attribute.

### Advantages

- Quick to write
- Useful for very small examples
- Easy to test simple code

### Disadvantages

- Mixes HTML and JavaScript
- Can make HTML difficult to read
- Difficult to maintain in larger projects
- Repeated code may appear in many HTML elements

Inline JavaScript should normally be avoided in larger projects.

---

## The `alert()` Method

The inline example uses:

```javascript
alert("Hello!");
```

The `alert()` method displays a small message box in the browser.

The user must close the message box before continuing to use the webpage.

Example:

```javascript
alert("Welcome to my website!");
```

Alerts can be useful for small learning examples, but too many alerts can interrupt the user.

---

## Method 2: Internal JavaScript

Internal JavaScript is written inside a `<script>` element in the HTML file.

Example:

```html
<script>
    console.log("Hello from internal JavaScript!");
</script>
```

The `<script>` element tells the browser that the content inside it is JavaScript.

In this lesson, the internal JavaScript is placed near the end of `index.html`.

```html
    <script>
        console.log("Hello from internal JavaScript!");
    </script>

</body>
```

### Advantages

- Useful for small webpages
- No separate JavaScript file is required
- Keeps JavaScript together inside one script section

### Disadvantages

- JavaScript is mixed with HTML
- The HTML file can become long
- The same code is difficult to reuse on other pages

---

## Method 3: External JavaScript

External JavaScript is written inside a separate `.js` file.

This lesson uses:

```text
script.js
```

The file is connected to HTML with:

```html
<script src="script.js"></script>
```

The `src` attribute contains the location of the JavaScript file.

```html
src="script.js"
```

Because `index.html` and `script.js` are inside the same folder, only the filename is needed.

### `script.js`

```javascript
console.log("Hello from external JavaScript!");

console.log("The external JavaScript file is connected correctly.");

console.log("External JavaScript keeps the project organized.");
```

### Advantages

- Keeps HTML and JavaScript separate
- Makes files easier to read
- Makes JavaScript easier to maintain
- Allows the same file to be used on multiple webpages
- Recommended for most projects

### Disadvantage

- The file path must be correct
- The JavaScript file must be saved separately

External JavaScript is the method that will be used in most lessons in this course.

---

## Placing the Script Element

In this lesson, the script elements are placed before the closing `</body>` tag.

```html
    <script>
        console.log("Hello from internal JavaScript!");
    </script>

    <script src="script.js"></script>

</body>
```

Placing the scripts near the end allows the browser to read the visible HTML content before running the JavaScript.

For now, this is the method we will use.

---

## Script Order

The browser reads the script elements from top to bottom.

In this lesson, the internal script appears first:

```html
<script>
    console.log("Hello from internal JavaScript!");
</script>
```

The external script appears second:

```html
<script src="script.js"></script>
```

The browser console therefore displays the internal message before the external messages.

Expected order:

```text
Hello from internal JavaScript!
Hello from external JavaScript!
The external JavaScript file is connected correctly.
External JavaScript keeps the project organized.
```

---

## Relative File Path

The external JavaScript connection uses:

```html
<script src="script.js"></script>
```

This works because both files are in the same folder.

```text
02 - Adding JavaScript to HTML/
│
├── index.html
└── script.js
```

If the JavaScript file were inside a folder named `js`, the path would be:

```html
<script src="js/script.js"></script>
```

For this course, the JavaScript file remains in the same lesson folder as the HTML file.

---

## Comparing the Three Methods

| Method | Location | Best Used For |
|---|---|---|
| Inline | Inside an HTML element | Very small examples |
| Internal | Inside a `<script>` element | Small single webpages |
| External | Inside a separate `.js` file | Most projects |

The recommended method is external JavaScript.

---

## JavaScript Used in This Lesson

### Inline JavaScript

```html
<button onclick="alert('Hello from inline JavaScript!')">
    Try Inline JavaScript
</button>
```

### Internal JavaScript

```html
<script>
    console.log("Hello from internal JavaScript!");
</script>
```

### External JavaScript Connection

```html
<script src="script.js"></script>
```

### External JavaScript Code

```javascript
console.log("Hello from external JavaScript!");
```

---

## Expected Output

When the webpage is opened:

- The page background appears light gray.
- The header and footer appear dark blue.
- Four white content sections are displayed.
- The Inline section contains a button.
- The Internal and External sections contain dark console boxes.
- Three cards compare the different methods.
- The External card has a light-yellow background.

When the inline button is selected:

```text
Hello from inline JavaScript!
```

appears inside a browser alert box.

When the browser console is opened, it displays:

```text
Hello from internal JavaScript!
Hello from external JavaScript!
The external JavaScript file is connected correctly.
External JavaScript keeps the project organized.
```

---

## Practice Examples

### Practice 1: Change the Inline Message

Change:

```html
onclick="alert('Hello from inline JavaScript!')"
```

To:

```html
onclick="alert('I am learning JavaScript!')"
```

Save the file, refresh the page, and select the button.

---

### Practice 2: Add Another Internal Message

Add another message inside the internal script.

```html
<script>
    console.log("Hello from internal JavaScript!");
    console.log("This message is also inside the HTML file.");
</script>
```

---

### Practice 3: Add an External Message

Add the following line to `script.js`:

```javascript
console.log("My external JavaScript practice is complete.");
```

---

### Practice 4: Change the External Filename

Rename:

```text
script.js
```

To:

```text
main.js
```

Then update the HTML:

```html
<script src="main.js"></script>
```

The filename and `src` value must match.

After testing, you can change the filename back to `script.js`.

---

### Practice 5: Test an Incorrect Path

Temporarily change:

```html
<script src="script.js"></script>
```

To:

```html
<script src="scripts.js"></script>
```

Refresh the webpage and check the console.

The external messages will not appear because the filename is incorrect.

Change it back after testing.

---

## Common Beginner Mistakes

### Incorrect Script Filename

Incorrect:

```html
<script src="scripts.js"></script>
```

Actual file:

```text
script.js
```

Correct:

```html
<script src="script.js"></script>
```

---

### Missing Closing Script Tag

Incorrect:

```html
<script src="script.js">
```

Correct:

```html
<script src="script.js"></script>
```

---

### Writing External Code Inside a Script with `src`

Avoid this:

```html
<script src="script.js">
    console.log("Hello");
</script>
```

When using an external file, write the JavaScript inside `script.js`.

```html
<script src="script.js"></script>
```

---

### Placing JavaScript Outside the Script Element

Incorrect:

```html
console.log("Hello");
```

Correct internal JavaScript:

```html
<script>
    console.log("Hello");
</script>
```

---

### Forgetting to Save the File

After changing `script.js`:

1. Save the file.
2. Refresh the browser.
3. Check the console again.

---

## Important Notes

- JavaScript can be added using inline, internal, or external code.
- Inline JavaScript is written inside an HTML element.
- Internal JavaScript is written inside a `<script>` element.
- External JavaScript is written inside a `.js` file.
- External JavaScript is recommended for most projects.
- Use the `src` attribute to connect an external JavaScript file.
- The filename and file path must be correct.
- Script elements are read from top to bottom.
- The browser console can help identify connection errors.
- This course will mainly use external JavaScript.

---

## Easy Way to Remember

Remember the three methods using **I-I-E**:

```text
I = Inline
I = Internal
E = External
```

Remember where each method is written:

```text
Inline   = Inside an HTML element
Internal = Inside the HTML file
External = Inside a separate JavaScript file
```

The recommended connection is:

```html
<script src="script.js"></script>
```

---

## What I Learned

In this lesson, I learned:

- Why JavaScript must be connected to HTML.
- How to add inline JavaScript.
- How to add internal JavaScript.
- How to connect an external JavaScript file.
- What the `<script>` element does.
- What the `src` attribute does.
- How relative JavaScript file paths work.
- Why external JavaScript is recommended.
- How script order affects console output.
- How to identify common JavaScript connection mistakes.

The next lesson is 03 - JavaScript Output.