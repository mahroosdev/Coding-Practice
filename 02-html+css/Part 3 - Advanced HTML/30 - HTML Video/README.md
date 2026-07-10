# 30 - HTML Video

## Introduction

HTML allows you to display videos directly on a webpage.

You can add tutorials, presentations, advertisements, and many other types of videos without requiring additional software.

---

## What is the `<video>` Element?

The `<video>` element is used to embed a video into a webpage.

Users can watch the video using the browser's built-in video player.

---

## Syntax

```html
<video>

</video>
```

---

## The `<source>` Element

The `<source>` element specifies the location of the video file.

Example:

```html
<source src="video/sample-video.mp4" type="video/mp4">
```

### `src`

The `src` attribute specifies the path to the video file.

### `type`

The `type` attribute tells the browser the format of the video.

For MP4 videos, use:

```html
type="video/mp4"
```

---

## The `controls` Attribute

The `controls` attribute displays the browser's video controls.

Example:

```html
<video controls>
```

The controls allow users to:

- Play the video
- Pause the video
- Adjust the volume
- Enter full-screen mode
- Move to different parts of the video

---

## The `width` Attribute

The `width` attribute sets the width of the video player.

Example:

```html
<video width="500">
```

The browser automatically adjusts the height to keep the correct aspect ratio.

---

## Complete Example

```html
<video width="500" controls>

    <source src="video/sample-video.mp4" type="video/mp4">

    Your browser does not support the video element.

</video>
```

---

## File Structure

```text
30-HTML-Video/
│
├── index.html
├── video/
│   └── sample-video.mp4
```

---

## Output

The webpage displays:

- A heading
- A short description
- A video player with controls

Users can play, pause, seek through the video, adjust the volume, and switch to full-screen mode.

---

## Practice

1. Create a `video` folder.
2. Add an MP4 file named `sample-video.mp4`.
3. Display the video using the `<video>` element.
4. Open the webpage and play the video.

---

## What You Learned

After completing this lesson, you should know:

- The `<video>` element embeds videos into a webpage.
- The `<source>` element specifies the video file.
- The `controls` attribute displays the video controls.
- The `width` attribute changes the width of the video player.
- The `src` attribute points to the location of the video file.
