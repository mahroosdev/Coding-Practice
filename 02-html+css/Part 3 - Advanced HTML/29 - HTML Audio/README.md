# 29 - HTML Audio

## Introduction

HTML allows you to add audio directly to a webpage.

You can play music, voice recordings, podcasts, and other audio files without using additional software.

---

## What is the `<audio>` Element?

The `<audio>` element is used to embed audio into a webpage.

Users can play, pause, and control the audio using the browser's built-in audio player.

---

## Syntax

```html
<audio>

</audio>
```

---

## The `<source>` Element

The `<source>` element specifies the location of the audio file.

Example:

```html
<source src="audio/sample-audio.mp3" type="audio/mpeg">
```

### `src`

The `src` attribute specifies the path to the audio file.

### `type`

The `type` attribute tells the browser the format of the audio file.

For MP3 files, use:

```html
type="audio/mpeg"
```

---

## The `controls` Attribute

The `controls` attribute displays the browser's audio controls.

Example:

```html
<audio controls>
```

Without the `controls` attribute, users cannot easily play or pause the audio.

---

## Complete Example

```html
<audio controls>

    <source src="audio/sample-audio.mp3" type="audio/mpeg">

    Your browser does not support the audio element.

</audio>
```

---

## File Structure

```text
29-HTML-Audio/
│
├── index.html
├── audio/
│   └── sample-audio.mp3
```

---

## Output

The webpage displays:

- A heading
- A short description
- An audio player with play, pause, volume, and progress controls

---

## Practice

1. Create an `audio` folder.
2. Add an MP3 file named `sample-audio.mp3`.
3. Display the audio using the `<audio>` element.
4. Open the webpage and click the play button.

---

## What You Learned

After completing this lesson, you should know:

- The `<audio>` element embeds audio into a webpage.
- The `<source>` element specifies the audio file.
- The `controls` attribute displays audio controls.
- The `src` attribute points to the location of the audio file.
