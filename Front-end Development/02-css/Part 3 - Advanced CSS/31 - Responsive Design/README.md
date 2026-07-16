# 31 - CSS Responsive Design

## Introduction

In the previous lesson, I learned how to use CSS media queries.

In this lesson, I am learning how different CSS concepts can work together to create a responsive webpage.

Responsive design helps a webpage look good on different devices, such as:

- Mobile phones
- Tablets
- Laptops
- Desktop computers

---

## What is Responsive Design?

Responsive design means creating a webpage that adjusts to different screen sizes.

A responsive webpage should be easy to read and use on both large and small screens.

Responsive design can include:

- Flexible widths
- Flexbox
- CSS Grid
- Responsive images
- Media queries
- Mobile-friendly spacing
- Mobile-friendly text sizes

---

## Viewport Meta Tag

The viewport meta tag is added inside the `<head>` section of the HTML file.

```html
<meta name="viewport" content="width=device-width, initial-scale=1.0">
```

It helps the browser display the webpage correctly on mobile devices.

### `width=device-width`

This makes the page width match the width of the device.

### `initial-scale=1.0`

This sets the normal zoom level when the page first opens.

Without the viewport meta tag, the webpage may appear very small on a mobile screen.

---

## Flexible Width

The main container uses a percentage width.

```css
.container {
    width: 90%;
    max-width: 1000px;
    margin: auto;
}
```

### `width: 90%`

The container uses 90% of the available screen width.

Because it uses a percentage, the container can become smaller when the screen size becomes smaller.

### `max-width: 1000px`

This prevents the container from becoming too wide on large screens.

### `margin: auto`

This places the container in the center of the webpage.

---

## Responsive Flexbox Layout

The introduction section uses Flexbox.

```css
.intro-section {
    display: flex;
    align-items: center;
    gap: 30px;
}
```

The text and image appear next to each other on a larger screen.

The text and image both use:

```css
flex: 1;
```

This gives them equal space inside the Flexbox container.

On smaller screens, the layout changes using a media query.

```css
@media screen and (max-width: 768px) {
    .intro-section {
        flex-direction: column;
    }
}
```

The text and image then appear one below the other.

---

## Responsive Grid Layout

The feature cards use CSS Grid.

```css
.feature-container {
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    gap: 20px;
}
```

On a large screen, the cards appear in three columns.

On a tablet-sized screen, the layout changes to two columns.

```css
@media screen and (max-width: 768px) {
    .feature-container {
        grid-template-columns: 1fr 1fr;
    }
}
```

On a mobile screen, the layout changes to one column.

```css
@media screen and (max-width: 500px) {
    .feature-container {
        grid-template-columns: 1fr;
    }
}
```

---

## Responsive Image

The image uses the following CSS:

```css
.intro-image img {
    display: block;
    width: 100%;
    max-width: 100%;
    height: auto;
}
```

### `width: 100%`

The image uses the full width of its container.

### `max-width: 100%`

The image cannot become wider than its container.

### `height: auto`

The browser automatically changes the image height while keeping the correct image shape.

This prevents the image from becoming stretched.

---

## Mobile-Friendly Spacing

The sections use less spacing on mobile screens.

```css
@media screen and (max-width: 500px) {
    .intro-section,
    .features-section,
    .information-section {
        margin: 20px 0;
        padding: 20px;
    }
}
```

Smaller spacing gives the content more room on a mobile screen.

---

## Mobile-Friendly Text

The heading sizes become smaller on mobile screens.

```css
@media screen and (max-width: 500px) {
    header h1 {
        font-size: 26px;
    }

    .intro-content h2,
    .features-section h2,
    .information-content h2 {
        font-size: 22px;
    }
}
```

This helps the headings fit better on small screens.

---

## Important Properties

### `box-sizing`

```css
* {
    box-sizing: border-box;
}
```

This includes an element's padding and border inside its total width.

### `max-width`

```css
max-width: 1000px;
```

This sets the largest width an element can use.

### `display: flex`

```css
display: flex;
```

This creates a flexible layout.

### `flex-direction`

```css
flex-direction: column;
```

This places Flexbox items one below the other.

### `display: grid`

```css
display: grid;
```

This creates a Grid layout.

### `grid-template-columns`

```css
grid-template-columns: repeat(3, 1fr);
```

This creates three equal columns.

### `gap`

```css
gap: 20px;
```

This adds space between Flexbox or Grid items.

### `height: auto`

```css
height: auto;
```

This allows an image to keep its correct shape while resizing.

---

## CSS Used in This Lesson

### Flexible Container

```css
.container {
    width: 90%;
    max-width: 1000px;
    margin: auto;
}
```

### Flexbox Layout

```css
.intro-section {
    display: flex;
    align-items: center;
    gap: 30px;
}
```

### Grid Layout

```css
.feature-container {
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    gap: 20px;
}
```

### Responsive Image

```css
.intro-image img {
    width: 100%;
    max-width: 100%;
    height: auto;
}
```

### Tablet Media Query

```css
@media screen and (max-width: 768px) {
    .intro-section {
        flex-direction: column;
    }

    .feature-container {
        grid-template-columns: 1fr 1fr;
    }
}
```

### Mobile Media Query

```css
@media screen and (max-width: 500px) {
    .feature-container {
        grid-template-columns: 1fr;
    }
}
```

---

## Expected Output

When the webpage is opened on a large screen:

- The page background appears light gray.
- The content sections have a white background.
- The headings and borders appear dark blue.
- The introduction text and image appear next to each other.
- The feature cards appear in three columns.
- The information and tips sections appear next to each other.

On a tablet-sized screen:

- The introduction text and image appear one below the other.
- The feature cards appear in two columns.
- The information and tips sections appear one below the other.

On a mobile screen:

- The feature cards appear in one column.
- The headings become smaller.
- The sections use less spacing.
- The button uses the full available width.
- The webpage remains easy to read.

---

## Practice Examples

### Practice 1: Change the Container Width

Change the container width from `90%` to `85%`.

```css
.container {
    width: 85%;
}
```

Check the space on the left and right sides of the page.

### Practice 2: Change the Breakpoint

Change the tablet breakpoint from `768px` to `800px`.

```css
@media screen and (max-width: 800px) {
    .intro-section {
        flex-direction: column;
    }
}
```

Resize the browser and check when the layout changes.

### Practice 3: Add Another Feature Card

Add another card inside the feature container.

```html
<div class="feature-card">
    <h3>Mobile Spacing</h3>

    <p>
        Mobile spacing gives the content more room on smaller screens.
    </p>
</div>
```

### Practice 4: Change the Mobile Font Size

Add the following CSS inside the mobile media query:

```css
body {
    font-size: 15px;
}
```

Check how the paragraph text changes on a small screen.

### Practice 5: Test Different Screen Sizes

Resize the browser and test the webpage at:

- More than 768 pixels
- Between 500 and 768 pixels
- Less than 500 pixels

---

## Important Notes

- Always add the viewport meta tag to a responsive webpage.
- Use percentage widths when content needs to adjust with the screen.
- Use `max-width` to stop content from becoming too wide.
- Use `width: 100%` and `height: auto` for responsive images.
- Flexbox is useful for simple rows and columns.
- Grid is useful for card layouts.
- Media queries can change the layout for smaller screens.
- Test the webpage using different browser widths.
- Responsive design is not only about making text smaller.
- The content should also rearrange so it remains easy to use.

---

## Easy Way to Remember

Remember responsive design using the word **FIRM**:

- **F** – Flexible widths
- **I** – Images that resize
- **R** – Rearrange the layout
- **M** – Media queries

---

## What I Learned

In this lesson, I learned:

- What responsive web design means.
- Why the viewport meta tag is important.
- How to use a flexible container.
- How to create a responsive Flexbox layout.
- How to create a responsive Grid layout.
- How to make an image responsive.
- How to change spacing on smaller screens.
- How to change text sizes on mobile screens.
- How to combine media queries with Flexbox and Grid.
- How to test a webpage on different screen sizes.

The next lesson is 32 - CSS Variables.