# 28 - CSS Transforms

## Introduction

In the previous lesson, I learned how CSS transitions create smooth changes between CSS property values.

In this lesson, I am learning how CSS transforms move, rotate, resize, and tilt HTML elements.

The `transform` property changes the visual appearance or position of an element without changing the normal page layout around it.

---

## What is a CSS Transform?

The `transform` property applies a visual transformation to an element.

Basic syntax:

```css
selector {
    transform: function(value);
}
```

Example:

```css
.box {
    transform: rotate(20deg);
}
```

This rotates the box by 20 degrees.

---

## Transform Functions

Common transform functions include:

```text
translate()
rotate()
scale()
skew()
```

Each function creates a different visual effect.

---

## Translate

The `translate()` function moves an element from its original position.

Example:

```css
.translate-box:hover {
    transform: translate(80px, 20px);
}
```

The first value controls horizontal movement.

The second value controls vertical movement.

```text
translate(80px, 20px)
```

means:

- Move 80 pixels to the right
- Move 20 pixels downward

---

## Horizontal Translation

The `translateX()` function moves an element horizontally.

```css
.box {
    transform: translateX(50px);
}
```

A positive value moves the element to the right.

```css
transform: translateX(50px);
```

A negative value moves the element to the left.

```css
transform: translateX(-50px);
```

---

## Vertical Translation

The `translateY()` function moves an element vertically.

```css
.box {
    transform: translateY(30px);
}
```

A positive value moves the element downward.

A negative value moves the element upward.

```css
transform: translateY(-30px);
```

---

## Rotate

The `rotate()` function rotates an element.

Example:

```css
.rotate-box:hover {
    transform: rotate(20deg);
}
```

The `deg` unit means degrees.

A positive value rotates the element clockwise.

```css
transform: rotate(20deg);
```

A negative value rotates the element counterclockwise.

```css
transform: rotate(-20deg);
```

---

## Scale

The `scale()` function changes the visual size of an element.

Example:

```css
.scale-box:hover {
    transform: scale(1.3);
}
```

A scale value greater than `1` makes the element larger.

```text
scale(1.3)
```

makes the element 1.3 times its original size.

---

## Scale Values

### Original Size

```css
transform: scale(1);
```

The element keeps its normal size.

### Larger Size

```css
transform: scale(1.5);
```

The element becomes larger.

### Smaller Size

```css
transform: scale(0.7);
```

The element becomes smaller.

---

## Horizontal and Vertical Scaling

The `scaleX()` function changes the horizontal size.

```css
transform: scaleX(1.5);
```

The `scaleY()` function changes the vertical size.

```css
transform: scaleY(1.5);
```

---

## Skew

The `skew()` function tilts an element.

Example:

```css
.skew-box:hover {
    transform: skew(15deg);
}
```

This tilts the box by 15 degrees.

A positive value tilts it in one direction.

A negative value tilts it in the opposite direction.

```css
transform: skew(-15deg);
```

---

## Horizontal and Vertical Skew

The `skewX()` function tilts an element horizontally.

```css
transform: skewX(20deg);
```

The `skewY()` function tilts an element vertically.

```css
transform: skewY(20deg);
```

---

## Multiple Transform Functions

More than one transform function can be applied to the same element.

Example:

```css
.multiple-transform-box:hover {
    transform: translateX(80px) rotate(15deg);
}
```

This element:

- Moves 80 pixels to the right
- Rotates by 15 degrees

The transform functions are separated by spaces.

Do not add commas between them.

Correct:

```css
transform: translateX(80px) rotate(15deg);
```

Incorrect:

```css
transform: translateX(80px), rotate(15deg);
```

---

## Transform Order

The order of transform functions can affect the result.

Example:

```css
transform: translateX(80px) rotate(15deg);
```

may behave differently from:

```css
transform: rotate(15deg) translateX(80px);
```

CSS applies transform functions in the order they are written.

---

## Using Transforms with Hover

In this lesson, transforms are applied using the `:hover` pseudo-class.

Example:

```css
.rotate-box:hover {
    transform: rotate(20deg);
}
```

The transform starts when the mouse moves over the element.

When the mouse moves away, the element returns to its original appearance.

---

## Using Transitions with Transforms

The boxes use a transition to make the transform smoother.

```css
.box {
    transition: transform 0.5s;
}
```

This tells the browser to animate changes to the `transform` property over half a second.

Without the transition, the transform happens immediately.

---

## Shared Box Style

All boxes use the same basic style.

```css
.box {
    width: 150px;
    background-color: lightblue;
    border: 2px solid darkblue;
    padding: 20px;
    text-align: center;
    transition: transform 0.5s;
}
```

This gives each box:

- A width of `150px`
- A light-blue background
- A dark-blue border
- Padding
- Centered text
- A smooth transform transition

---

## Transform Area

Each box is placed inside a larger area.

```css
.transform-area {
    height: 160px;
    border: 2px dashed gray;
    padding: 20px;
}
```

The extra height gives the transformed box enough room to move, rotate, or resize.

---

## CSS Used in This Lesson

```css
body {
    background-color: lightgray;
    font-family: Arial, sans-serif;
}

h1 {
    color: darkblue;
    text-align: center;
}

section {
    background-color: white;
    border: 2px solid darkblue;
    margin-bottom: 20px;
    padding: 20px;
}

.transform-area {
    height: 160px;
    border: 2px dashed gray;
    padding: 20px;
}

.box {
    width: 150px;
    background-color: lightblue;
    border: 2px solid darkblue;
    padding: 20px;
    text-align: center;
    transition: transform 0.5s;
}

.translate-box:hover {
    transform: translate(80px, 20px);
}

.rotate-box:hover {
    transform: rotate(20deg);
}

.scale-box:hover {
    transform: scale(1.3);
}

.skew-box:hover {
    transform: skew(15deg);
}

.multiple-transform-box:hover {
    transform: translateX(80px) rotate(15deg);
}
```

---

## Output

When the webpage is opened in the browser:

- The translate box moves right and downward.
- The rotate box turns clockwise.
- The scale box becomes larger.
- The skew box becomes tilted.
- The final box moves and rotates at the same time.
- All changes happen smoothly because a transition is applied.

---

## Practice

Move the translate box to the left:

```css
.translate-box:hover {
    transform: translateX(-50px);
}
```

Rotate the box in the opposite direction:

```css
.rotate-box:hover {
    transform: rotate(-30deg);
}
```

Make the scale box smaller:

```css
.scale-box:hover {
    transform: scale(0.7);
}
```

Increase the skew value:

```css
.skew-box:hover {
    transform: skew(30deg);
}
```

Apply three transforms together:

```css
.multiple-transform-box:hover {
    transform: translateX(80px) rotate(20deg) scale(1.2);
}
```

Save the file and refresh the browser after each change.

---

## Important Note

A transformed element may visually overlap nearby content.

The transform changes how the element appears, but the original layout space normally remains unchanged.

For example:

```css
transform: translateX(100px);
```

moves the element visually, but its original page space is still reserved.

---

## Easy Way to Remember

```text
translate()
```

Moves an element.

```text
rotate()
```

Rotates an element.

```text
scale()
```

Changes the element's size.

```text
skew()
```

Tilts an element.

```text
transform
```

Applies one or more transform functions.

---

## What I Learned

In this lesson, I learned:

- The `transform` property changes an element visually.
- `translate()` moves an element.
- `rotate()` rotates an element.
- `scale()` changes an element's size.
- `skew()` tilts an element.
- Multiple transform functions can be combined.
- Transform function order can affect the result.
- Transitions can make transforms smoother.
- A transformed element normally keeps its original layout space.