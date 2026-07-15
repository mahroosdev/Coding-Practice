# 08 - CSS Padding

## Introduction

In the previous lesson, I learned how margins create space outside an HTML element.

In this lesson, I am learning how padding creates space inside an element.

Padding adds space between the content and the border.

---

## What is Padding?

Padding is the space inside an HTML element.

It creates distance between the content and the element's border.

Example:

```css
section {
    padding: 20px;
}
```

This adds `20px` of space inside the section.

---

## Padding Property

The `padding` property adds the same amount of space on all four sides.

Example:

```css
.small-padding {
    padding: 10px;
}
```

This adds `10px` of padding to:

- Top
- Right
- Bottom
- Left

---

## Small Padding

```css
.small-padding {
    padding: 10px;
}
```

This section has a small amount of space between its content and border.

---

## Large Padding

```css
.large-padding {
    padding: 40px;
}
```

This section has more space inside its border.

A larger padding value creates more space around the content.

---

## Individual Padding Properties

CSS allows each side to have a different padding value.

The individual padding properties are:

```text
padding-top
padding-right
padding-bottom
padding-left
```

Example:

```css
.different-padding {
    padding-top: 20px;
    padding-right: 40px;
    padding-bottom: 60px;
    padding-left: 80px;
}
```

This applies:

- `20px` at the top
- `40px` on the right
- `60px` at the bottom
- `80px` on the left

---

## Padding Shorthand

Padding can also be written in one line.

```css
padding: 20px 40px 60px 80px;
```

The values are applied in this order:

```text
Top
Right
Bottom
Left
```

Example:

```css
.different-padding {
    padding: 20px 40px 60px 80px;
}
```

This gives the same result as writing each property separately.

---

## Two Padding Values

When two values are used:

```css
padding: 20px 40px;
```

The first value controls:

```text
Top and Bottom
```

The second value controls:

```text
Left and Right
```

---

## One Padding Value

When one value is used:

```css
padding: 20px;
```

The same padding is applied to all four sides.

---

## Margin and Padding Difference

Margin creates space outside the border.

```text
Margin → Outside the border
```

Padding creates space inside the border.

```text
Padding → Inside the border
```

A simple way to remember this is:

```text
Content
↓
Padding
↓
Border
↓
Margin
```

---

## CSS Used in This Lesson

```css
body {
    background-color: lightgray;
}

h1 {
    color: darkblue;
}

section {
    background-color: white;
    border: 2px solid darkblue;
    margin-bottom: 20px;
}

.small-padding {
    padding: 10px;
}

.large-padding {
    padding: 40px;
}

.different-padding {
    padding-top: 20px;
    padding-right: 40px;
    padding-bottom: 60px;
    padding-left: 80px;
}
```

---

## Output

When the webpage is opened in the browser:

- The page background appears light gray.
- Every section has a white background and a dark-blue border.
- The first section has a small amount of padding.
- The second section has more padding.
- The final section uses different padding values on each side.

---

## Practice

Try changing the small padding:

```css
.small-padding {
    padding: 20px;
}
```

Try changing the large padding:

```css
.large-padding {
    padding: 60px;
}
```

Try using padding shorthand:

```css
.different-padding {
    padding: 10px 30px 50px 70px;
}
```

Save the file and refresh the browser to compare the spacing.

---

## What I Learned

In this lesson, I learned:

- Padding creates space inside an HTML element.
- Padding appears between the content and the border.
- The `padding` property applies space to all four sides.
- CSS provides separate padding properties for each side.
- Padding shorthand can use one, two, or four values.
- Margin and padding create space in different areas.
