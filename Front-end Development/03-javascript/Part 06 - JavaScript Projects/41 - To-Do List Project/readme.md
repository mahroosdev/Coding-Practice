# 41 - To-Do List Project

## Project Overview

This is a complete JavaScript task-management project.

The user can:

- Add tasks
- Select task priority
- Complete tasks
- Edit tasks
- Delete tasks
- Search tasks
- Filter tasks
- Clear completed tasks
- Save tasks in local storage

## Task Object

Each task is stored as an object:

```javascript
const task = {
    id: "unique-id",
    name: "Complete JavaScript lesson",
    priority: "high",
    completed: false,
    createdAt: "date and time"
};
```

All task objects are stored inside an array:

```javascript
let tasks = [];
```

## Saving Tasks

```javascript
localStorage.setItem(
    storageKey,
    JSON.stringify(tasks)
);
```

## Filtering Tasks

```javascript
const visibleTasks =
    tasks.filter(function (task) {
        return task.name
            .toLowerCase()
            .includes(searchValue);
    });
```

## Concepts Used

- Arrays and objects
- Functions
- Forms and validation
- DOM element creation
- Events
- Search and filtering
- Local storage
- JSON
- Task statistics

## Possible Improvements

1. Replace `prompt()` with an edit form.
2. Add task due dates.
3. Add drag-and-drop sorting.
4. Add separate task categories.
5. Add light and dark themes.

## What I Built

I built a complete to-do list application that stores and manages tasks inside the browser.

The next project is **42 - Expense Tracker Project**.