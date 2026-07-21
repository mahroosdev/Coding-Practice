# 10 - JavaScript String Methods

## Introduction

In the previous lesson, I learned about JavaScript string fundamentals.

I learned how to:

- Create strings
- Join strings
- Use template literals
- Count characters
- Access characters using indexes
- Compare strings
- Create empty strings

In this lesson, I am learning about JavaScript string methods.

A string method is a built-in action that JavaScript can perform on a string.

Example:

```javascript
const language = "javascript";

const result =
    language.toUpperCase();

console.log(result);
```

Output:

```text
JAVASCRIPT
```

---

## Folder Structure

```text
10 - JavaScript String Methods/
│
├── index.html
├── style.css
├── script.js
└── README.md
```

---

# What Is a String Method?

A string method performs an action using a string.

Example:

```javascript
const text = "JavaScript";

const result =
    text.toUpperCase();
```

The method is:

```javascript
toUpperCase()
```

It creates a new uppercase string.

---

## Method Syntax

A string method is written after the string or variable.

```javascript
string.methodName()
```

Example:

```javascript
courseName.toUpperCase()
```

The dot connects the string to the method.

```javascript
.
```

Most string methods use parentheses:

```javascript
()
```

Some methods also receive values inside the parentheses.

Example:

```javascript
message.includes("JavaScript")
```

The searched text is placed inside the parentheses.

---

# Strings Are Not Changed Directly

Most string methods return a new string.

Example:

```javascript
const language = "javascript";

const uppercaseLanguage =
    language.toUpperCase();
```

The original value remains:

```text
javascript
```

The new value is:

```text
JAVASCRIPT
```

Example:

```javascript
console.log(language);
console.log(uppercaseLanguage);
```

Output:

```text
javascript
JAVASCRIPT
```

---

# 1. toUpperCase()

The `toUpperCase()` method converts letters to uppercase.

```javascript
const text =
    "javascript fundamentals";

const result =
    text.toUpperCase();

console.log(result);
```

Output:

```text
JAVASCRIPT FUNDAMENTALS
```

---

## Store the Result

The result should be stored when it will be used later.

```javascript
const originalText = "hello";

const uppercaseText =
    originalText.toUpperCase();

console.log(uppercaseText);
```

Output:

```text
HELLO
```

---

## Original String Remains the Same

```javascript
const text = "javascript";

text.toUpperCase();

console.log(text);
```

Output:

```text
javascript
```

The method result was not stored.

Correct:

```javascript
const result =
    text.toUpperCase();

console.log(result);
```

---

# 2. toLowerCase()

The `toLowerCase()` method converts letters to lowercase.

```javascript
const role =
    "SOFTWARE ENGINEER";

const result =
    role.toLowerCase();

console.log(result);
```

Output:

```text
software engineer
```

---

## Comparing Text with Lowercase

Changing both values to lowercase can help when comparing user-entered text.

```javascript
const firstValue = "JavaScript";
const secondValue = "javascript";

const result =
    firstValue.toLowerCase() ===
    secondValue.toLowerCase();

console.log(result);
```

Output:

```text
true
```

Without lowercase conversion:

```javascript
"JavaScript" === "javascript"
```

Result:

```text
false
```

---

# 3. trim()

The `trim()` method removes spaces from the beginning and end of a string.

```javascript
const text =
    "   JavaScript Course   ";

const result =
    text.trim();

console.log(result);
```

Output:

```text
JavaScript Course
```

---

## Spaces Inside the String Remain

```javascript
const fullName =
    "   Mahroos Mahthie   ";

const cleanName =
    fullName.trim();

console.log(cleanName);
```

Output:

```text
Mahroos Mahthie
```

The space between the first and last name remains.

Only outer spaces are removed.

---

## Compare the Lengths

```javascript
const text =
    "   JavaScript   ";

const cleanText =
    text.trim();

console.log(text.length);
console.log(cleanText.length);
```

The trimmed text has fewer characters.

---

## Why trim() Is Useful

Text entered by a user may contain unnecessary spaces.

```javascript
const username =
    "   mahroos   ";

const cleanUsername =
    username.trim();
```

Result:

```text
mahroos
```

---

# 4. replace()

The `replace()` method replaces matching text.

Syntax:

```javascript
string.replace("old text", "new text")
```

Example:

```javascript
const message =
    "I am learning HTML.";

const updatedMessage =
    message.replace(
        "HTML",
        "JavaScript"
    );

console.log(updatedMessage);
```

Output:

```text
I am learning JavaScript.
```

---

## Original String Remains Unchanged

```javascript
console.log(message);
```

Output:

```text
I am learning HTML.
```

The result must be stored in another variable.

---

## replace() Is Case-Sensitive

```javascript
const message =
    "I am learning JavaScript.";

const result =
    message.replace(
        "javascript",
        "Python"
    );

console.log(result);
```

Output:

```text
I am learning JavaScript.
```

No replacement occurs because:

```text
JavaScript
```

and:

```text
javascript
```

are different.

---

## Replacing the First Match

Basic `replace()` replaces the first matching value.

```javascript
const text =
    "JavaScript is useful. JavaScript is popular.";

const result =
    text.replace(
        "JavaScript",
        "JS"
    );
```

Output:

```text
JS is useful. JavaScript is popular.
```

Replacing every match will be introduced later with more advanced JavaScript patterns.

---

# 5. charAt()

The `charAt()` method returns a character at a selected index.

```javascript
const language =
    "JavaScript";

const firstCharacter =
    language.charAt(0);

console.log(firstCharacter);
```

Output:

```text
J
```

---

## Read Another Character

```javascript
console.log(
    language.charAt(4)
);
```

Output:

```text
S
```

Remember that string indexes begin at zero.

---

## Missing Index

```javascript
console.log(
    language.charAt(20)
);
```

Output:

```text

```

`charAt()` returns an empty string when the index does not exist.

This is different from bracket notation.

```javascript
language[20]
```

returns:

```text
undefined
```

---

## charAt() Compared with Brackets

Both can read characters.

```javascript
language.charAt(0)
```

```javascript
language[0]
```

Both return:

```text
J
```

---

# 6. slice()

The `slice()` method extracts part of a string.

Syntax:

```javascript
string.slice(startIndex, endIndex)
```

Example:

```javascript
const language =
    "JavaScript";

const result =
    language.slice(0, 4);

console.log(result);
```

Output:

```text
Java
```

---

## End Index Is Not Included

```javascript
language.slice(0, 4)
```

Includes:

```text
Index 0
Index 1
Index 2
Index 3
```

Index `4` is not included.

---

## Omit the End Index

```javascript
const result =
    language.slice(4);

console.log(result);
```

Output:

```text
Script
```

JavaScript extracts from index `4` until the end.

---

## Negative Index

`slice()` can use negative indexes.

```javascript
const result =
    language.slice(-6);

console.log(result);
```

Output:

```text
Script
```

A negative index counts backward from the end.

---

# 7. substring()

The `substring()` method also extracts part of a string.

Syntax:

```javascript
string.substring(startIndex, endIndex)
```

Example:

```javascript
const language =
    "JavaScript";

const result =
    language.substring(0, 4);

console.log(result);
```

Output:

```text
Java
```

---

## Extract the Second Part

```javascript
const result =
    language.substring(4, 10);

console.log(result);
```

Output:

```text
Script
```

---

## slice() and substring()

For positive indexes, both methods often produce the same result.

```javascript
language.slice(0, 4)
```

```javascript
language.substring(0, 4)
```

Both produce:

```text
Java
```

A simple beginner rule:

- Use `slice()` when negative indexes may be useful.
- Use `substring()` when using normal positive indexes.

---

## Negative Values Differ

`substring()` does not use negative indexes like `slice()`.

```javascript
language.substring(-6)
```

JavaScript treats the negative value as zero.

For extracting from the end, use:

```javascript
language.slice(-6)
```

---

# 8. includes()

The `includes()` method checks whether selected text exists inside a string.

It returns a boolean:

```text
true
false
```

Example:

```javascript
const message =
    "I am learning JavaScript.";

const result =
    message.includes("JavaScript");

console.log(result);
```

Output:

```text
true
```

---

## Text Not Found

```javascript
const result =
    message.includes("Python");

console.log(result);
```

Output:

```text
false
```

---

## includes() Is Case-Sensitive

```javascript
message.includes("javascript")
```

Result:

```text
false
```

The string contains:

```text
JavaScript
```

with an uppercase `J`.

---

## Checking a Course Name

```javascript
const courseTitle =
    "JavaScript Fundamentals";

const containsJavaScript =
    courseTitle.includes("JavaScript");

console.log(containsJavaScript);
```

Output:

```text
true
```

---

# 9. startsWith()

The `startsWith()` method checks whether a string begins with selected text.

Example:

```javascript
const message =
    "I am learning JavaScript.";

const result =
    message.startsWith("I am");

console.log(result);
```

Output:

```text
true
```

---

## Incorrect Beginning

```javascript
const result =
    message.startsWith("JavaScript");

console.log(result);
```

Output:

```text
false
```

The string does not begin with `"JavaScript"`.

---

## startsWith() Is Case-Sensitive

```javascript
"JavaScript".startsWith("java")
```

Result:

```text
false
```

---

# 10. endsWith()

The `endsWith()` method checks whether a string ends with selected text.

Example:

```javascript
const message =
    "I am learning JavaScript.";

const result =
    message.endsWith(".");

console.log(result);
```

Output:

```text
true
```

---

## Check the Final Word

```javascript
const language =
    "JavaScript";

console.log(
    language.endsWith("Script")
);
```

Output:

```text
true
```

---

## Incorrect Ending

```javascript
console.log(
    language.endsWith("Java")
);
```

Output:

```text
false
```

---

# 11. indexOf()

The `indexOf()` method finds the position where selected text begins.

Example:

```javascript
const language =
    "JavaScript";

const position =
    language.indexOf("Script");

console.log(position);
```

Output:

```text
4
```

The `"S"` in `"Script"` begins at index `4`.

---

## Find a Word Inside a Sentence

```javascript
const message =
    "I am learning JavaScript.";

const position =
    message.indexOf("JavaScript");

console.log(position);
```

The result is the index where the word begins.

---

## Text Not Found

When the text does not exist, `indexOf()` returns:

```text
-1
```

Example:

```javascript
const position =
    message.indexOf("Python");

console.log(position);
```

Output:

```text
-1
```

---

## Check Whether Text Exists with indexOf()

Older JavaScript code may use:

```javascript
message.indexOf("JavaScript") !== -1
```

Result:

```text
true
```

For a simple existence check, `includes()` is easier to read.

Preferred:

```javascript
message.includes("JavaScript")
```

---

# Methods That Return Strings

These methods return a string:

```text
toUpperCase()
toLowerCase()
trim()
replace()
charAt()
slice()
substring()
```

Example:

```javascript
const result =
    "javascript".toUpperCase();
```

The result is:

```text
JAVASCRIPT
```

---

# Methods That Return Booleans

These methods return `true` or `false`:

```text
includes()
startsWith()
endsWith()
```

Example:

```javascript
const result =
    "JavaScript".includes("Script");
```

Result:

```text
true
```

---

# Method That Returns a Number

`indexOf()` returns a number.

```javascript
const result =
    "JavaScript".indexOf("Script");
```

Result:

```text
4
```

When the text is not found:

```text
-1
```

---

# Method Chaining

Methods can be used one after another.

Example:

```javascript
const username =
    "   MAHROOS   ";

const cleanUsername =
    username.trim().toLowerCase();

console.log(cleanUsername);
```

Output:

```text
mahroos
```

JavaScript runs the methods from left to right:

1. `trim()` removes outer spaces.
2. `toLowerCase()` converts the result to lowercase.

---

## Another Chaining Example

```javascript
const course =
    "   javascript   ";

const result =
    course.trim().toUpperCase();

console.log(result);
```

Output:

```text
JAVASCRIPT
```

Keep method chains short and readable while learning.

---

# Properties Compared with Methods

A property provides information.

Example:

```javascript
text.length
```

A method performs an action.

Examples:

```javascript
text.toUpperCase()
text.trim()
text.includes("JavaScript")
```

Property:

```javascript
length
```

Method:

```javascript
toUpperCase()
```

Methods normally use parentheses.

Properties normally do not.

---

# JavaScript Used in This Lesson

## Uppercase

```javascript
const uppercaseText =
    text.toUpperCase();
```

## Lowercase

```javascript
const lowercaseText =
    text.toLowerCase();
```

## Trim

```javascript
const cleanText =
    text.trim();
```

## Replace

```javascript
const updatedText =
    text.replace("HTML", "JavaScript");
```

## Character

```javascript
const firstCharacter =
    text.charAt(0);
```

## Slice

```javascript
const firstPart =
    text.slice(0, 4);
```

## Substring

```javascript
const firstPart =
    text.substring(0, 4);
```

## Includes

```javascript
const containsText =
    text.includes("JavaScript");
```

## Starts With

```javascript
const correctBeginning =
    text.startsWith("I am");
```

## Ends With

```javascript
const correctEnding =
    text.endsWith(".");
```

## Index Position

```javascript
const position =
    text.indexOf("JavaScript");
```

---

# Expected Webpage Output

When the webpage opens:

- A dark-blue header appears.
- White sections appear on a light-gray background.
- Uppercase and lowercase conversions are displayed.
- Outer spaces are removed using `trim()`.
- Matching text is replaced using `replace()`.
- Characters are read using `charAt()`.
- Parts of strings are extracted using `slice()` and `substring()`.
- Text existence is checked using `includes()`.
- String beginnings and endings are checked.
- Text positions are found using `indexOf()`.
- Method results appear inside responsive cards.
- A table summarizes all string methods.
- The page adjusts for smaller screens.

---

# Practice Examples

## Practice 1: Convert Text to Uppercase

```javascript
const projectName =
    "coding practice";

const result =
    projectName.toUpperCase();

console.log(result);
```

Expected output:

```text
CODING PRACTICE
```

---

## Practice 2: Convert Text to Lowercase

```javascript
const role =
    "SOFTWARE ENGINEER";

const result =
    role.toLowerCase();

console.log(result);
```

Expected output:

```text
software engineer
```

---

## Practice 3: Remove Spaces

```javascript
const username =
    "   mahroos   ";

const cleanUsername =
    username.trim();

console.log(cleanUsername);
```

Expected output:

```text
mahroos
```

---

## Practice 4: Replace Text

```javascript
const message =
    "I am learning CSS.";

const updatedMessage =
    message.replace(
        "CSS",
        "JavaScript"
    );

console.log(updatedMessage);
```

Expected output:

```text
I am learning JavaScript.
```

---

## Practice 5: Read a Character

```javascript
const language =
    "JavaScript";

console.log(
    language.charAt(4)
);
```

Expected output:

```text
S
```

---

## Practice 6: Extract Text with slice()

```javascript
const language =
    "JavaScript";

console.log(
    language.slice(0, 4)
);

console.log(
    language.slice(4)
);
```

Expected output:

```text
Java
Script
```

---

## Practice 7: Extract Text with substring()

```javascript
const project =
    "CodingPractice";

const result =
    project.substring(0, 6);

console.log(result);
```

Expected output:

```text
Coding
```

---

## Practice 8: Check Included Text

```javascript
const message =
    "JavaScript is interesting.";

console.log(
    message.includes("interesting")
);
```

Expected output:

```text
true
```

---

## Practice 9: Check the Beginning

```javascript
const title =
    "JavaScript Fundamentals";

console.log(
    title.startsWith("JavaScript")
);
```

Expected output:

```text
true
```

---

## Practice 10: Check the Ending

```javascript
const filename =
    "script.js";

console.log(
    filename.endsWith(".js")
);
```

Expected output:

```text
true
```

---

## Practice 11: Find a Position

```javascript
const language =
    "JavaScript";

console.log(
    language.indexOf("Script")
);
```

Expected output:

```text
4
```

---

## Practice 12: Chain Methods

```javascript
const text =
    "   JAVASCRIPT   ";

const result =
    text.trim().toLowerCase();

console.log(result);
```

Expected output:

```text
javascript
```

---

# Common Beginner Mistakes

## Forgetting Parentheses

Incorrect:

```javascript
text.toUpperCase
```

Correct:

```javascript
text.toUpperCase()
```

The first version refers to the method.

The second version runs it.

---

## Calling length Like a Method

Incorrect:

```javascript
text.length()
```

Correct:

```javascript
text.length
```

`length` is a property, not a method.

---

## Expecting the Original String to Change

```javascript
const text = "javascript";

text.toUpperCase();

console.log(text);
```

Output:

```text
javascript
```

Store the method result:

```javascript
const result =
    text.toUpperCase();
```

---

## Using the Wrong Letter Case

```javascript
"JavaScript".includes("javascript")
```

Result:

```text
false
```

String methods are usually case-sensitive.

---

## Forgetting That slice() Excludes the End Index

```javascript
"JavaScript".slice(0, 4)
```

Output:

```text
Java
```

Index `4` is not included.

---

## Expecting indexOf() to Return false

Incorrect assumption:

```text
Text not found = false
```

Actual result:

```text
Text not found = -1
```

Example:

```javascript
"JavaScript".indexOf("Python")
```

Output:

```text
-1
```

---

## Confusing includes() and indexOf()

`includes()` returns a boolean:

```javascript
"JavaScript".includes("Script")
```

Output:

```text
true
```

`indexOf()` returns a position:

```javascript
"JavaScript".indexOf("Script")
```

Output:

```text
4
```

---

## Expecting trim() to Remove Inner Spaces

```javascript
"Mahroos Mahthie".trim()
```

The space between the names remains.

`trim()` only removes spaces from the beginning and end.

---

## Using replace() with Incorrect Case

```javascript
"JavaScript".replace(
    "javascript",
    "Python"
)
```

No replacement occurs because the text does not match exactly.

---

# Important Notes

- String methods perform actions on strings.
- Methods are connected using a dot.
- Most methods use parentheses.
- Most string methods return new values.
- Original strings usually remain unchanged.
- `toUpperCase()` converts letters to uppercase.
- `toLowerCase()` converts letters to lowercase.
- `trim()` removes spaces from the beginning and end.
- `replace()` replaces matching text.
- `charAt()` reads a character at an index.
- `slice()` extracts part of a string.
- `slice()` can use negative indexes.
- `substring()` extracts text using positive indexes.
- `includes()` returns `true` or `false`.
- `startsWith()` checks the beginning of a string.
- `endsWith()` checks the end of a string.
- `indexOf()` returns a position.
- `indexOf()` returns `-1` when text is not found.
- String methods are case-sensitive.
- Methods can be chained together.
- `length` is a property, not a method.

---

# Easy Way to Remember

Change letter case:

```javascript
text.toUpperCase()
text.toLowerCase()
```

Clean text:

```javascript
text.trim()
```

Replace text:

```javascript
text.replace("old", "new")
```

Read and extract:

```javascript
text.charAt(0)
text.slice(0, 4)
text.substring(0, 4)
```

Check text:

```javascript
text.includes("value")
text.startsWith("value")
text.endsWith("value")
```

Find a position:

```javascript
text.indexOf("value")
```

Remember:

```text
Method = Performs an action
Property = Provides information
```

---

# What I Learned

In this lesson, I learned:

- What a JavaScript string method is.
- How to connect a method to a string.
- Why methods use parentheses.
- How to convert text to uppercase.
- How to convert text to lowercase.
- How to remove outer spaces.
- How to replace matching text.
- How to read a character using `charAt()`.
- How to extract text using `slice()`.
- How negative indexes work with `slice()`.
- How to extract text using `substring()`.
- How to check text using `includes()`.
- How to check the beginning using `startsWith()`.
- How to check the ending using `endsWith()`.
- How to find text positions using `indexOf()`.
- Why `indexOf()` returns `-1`.
- Which methods return strings.
- Which methods return booleans.
- How method chaining works.
- The difference between properties and methods.
- Why original strings usually remain unchanged.

The next lesson is **11 - Numbers** under **Part 02 - Operators and Conditions**.