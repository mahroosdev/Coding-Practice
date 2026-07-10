# HTML Page Navigation

## Introduction

This lesson explains how to connect multiple HTML pages together using hyperlinks.

Instead of creating a single webpage, many websites contain several pages such as a Home page, About page, Contact page, and Services page. HTML links allow users to move between these pages.

---

## Folder Structure

```text
33 - HTML Page Navigation
│
├── index.html
├── about.html
├── contact.html
└── README.md
```

---

## What You Will Learn

- Create multiple HTML pages.
- Connect pages using the `<a>` element.
- Build a simple navigation menu.
- Move between pages using relative file paths.

---

## Example Navigation

```html
<nav>

    <a href="index.html">Home</a> |

    <a href="about.html">About</a> |

    <a href="contact.html">Contact</a>

</nav>
```

---

## Output

```text
Home | About | Contact
```

Clicking each link opens another HTML page in the same folder.

---

## Key Points

- Keep all linked files in the correct folder.
- Use relative paths when linking pages in the same project.
- Use the same navigation menu on every page for a consistent user experience.

---

## Summary

This lesson introduced basic website navigation by connecting multiple HTML pages. Understanding page navigation is an important step before building complete multi-page websites.
