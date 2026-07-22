# 22 - JavaScript Objects

## Introduction

In this lesson, I am learning how objects store related information using properties and values.

---

## Creating an Object

```javascript
const student = {
    name: "Mahroos",
    role: "Software Engineer",
    isLearning: true
};
```

Each property contains:

```text
propertyName: value
```

---

## Accessing Properties

Dot notation:

```javascript
student.name
```

Bracket notation:

```javascript
student["role"]
```

Bracket notation is useful for property names containing spaces.

---

## Changing and Adding Properties

Change a property:

```javascript
student.role = "Junior Software Engineer";
```

Add a new property:

```javascript
student.country = "Sri Lanka";
```

---

## Deleting a Property

```javascript
delete student.country;
```

---

## Object Methods

A function inside an object is called a method.

```javascript
const user = {
    name: "Mahroos",

    greet: function () {
        return "Hello " + this.name;
    }
};

console.log(user.greet());
```

---

## Practice Tasks

1. Create an object containing your name, role, and country.
2. Display its properties.
3. Add a new skill property.
4. Change one property.
5. Create a greeting method.

---

## What I Learned

- How to create an object.
- How properties and values work.
- How to use dot and bracket notation.
- How to add, change, and delete properties.
- What an object method is.

The next lesson is **23 - Introduction to Loops**.
