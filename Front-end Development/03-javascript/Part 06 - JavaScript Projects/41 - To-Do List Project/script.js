const taskForm =
    document.getElementById("task-form");

const taskInput =
    document.getElementById("task-input");

const prioritySelect =
    document.getElementById("priority-select");

const taskError =
    document.getElementById("task-error");

const searchInput =
    document.getElementById("search-input");

const statusFilter =
    document.getElementById("status-filter");

const priorityFilter =
    document.getElementById("priority-filter");

const taskList =
    document.getElementById("task-list");

const emptyMessage =
    document.getElementById("empty-message");

const taskSummary =
    document.getElementById("task-summary");

const totalCount =
    document.getElementById("total-count");

const activeCount =
    document.getElementById("active-count");

const completedCount =
    document.getElementById("completed-count");

const visibleCount =
    document.getElementById("visible-count");

const clearCompletedButton =
    document.getElementById("clear-completed-button");

const clearAllButton =
    document.getElementById("clear-all-button");


const storageKey = "javascriptTodoListProject";

let tasks = [];


// Create a unique task ID

function createTaskId() {
    return Date.now().toString() +
        Math.random().toString(16).slice(2);
}


// Save tasks

function saveTasks() {
    localStorage.setItem(
        storageKey,
        JSON.stringify(tasks)
    );
}


// Load saved tasks

function loadTasks() {
    const savedTasks =
        localStorage.getItem(storageKey);

    if (savedTasks === null) {
        tasks = [];
        return;
    }

    try {
        const parsedTasks =
            JSON.parse(savedTasks);

        tasks =
            Array.isArray(parsedTasks)
                ? parsedTasks
                : [];
    } catch (error) {
        tasks = [];

        console.error(
            "Could not load saved tasks:",
            error
        );
    }
}


// Add a new task

function addTask(taskName, priority) {
    const newTask = {
        id: createTaskId(),
        name: taskName,
        priority: priority,
        completed: false,
        createdAt: new Date().toLocaleString()
    };

    tasks.unshift(newTask);

    saveTasks();
    renderTasks();
}


// Find a task using its ID

function findTask(taskId) {
    return tasks.find(function (task) {
        return task.id === taskId;
    });
}


// Toggle task completion

function toggleTask(taskId) {
    const selectedTask =
        findTask(taskId);

    if (!selectedTask) {
        return;
    }

    selectedTask.completed =
        !selectedTask.completed;

    saveTasks();
    renderTasks();
}


// Edit a task

function editTask(taskId) {
    const selectedTask =
        findTask(taskId);

    if (!selectedTask) {
        return;
    }

    const updatedName =
        prompt(
            "Edit the task name:",
            selectedTask.name
        );

    if (updatedName === null) {
        return;
    }

    const cleanedName =
        updatedName.trim();

    if (cleanedName === "") {
        alert("The task name cannot be empty.");
        return;
    }

    selectedTask.name =
        cleanedName;

    saveTasks();
    renderTasks();
}


// Delete a task

function deleteTask(taskId) {
    tasks = tasks.filter(function (task) {
        return task.id !== taskId;
    });

    saveTasks();
    renderTasks();
}


// Get tasks matching the selected filters

function getFilteredTasks() {
    const searchValue =
        searchInput.value
            .trim()
            .toLowerCase();

    const selectedStatus =
        statusFilter.value;

    const selectedPriority =
        priorityFilter.value;

    return tasks.filter(function (task) {
        const matchesSearch =
            task.name
                .toLowerCase()
                .includes(searchValue);

        const matchesStatus =
            selectedStatus === "all" ||
            (
                selectedStatus === "active" &&
                !task.completed
            ) ||
            (
                selectedStatus === "completed" &&
                task.completed
            );

        const matchesPriority =
            selectedPriority === "all" ||
            task.priority === selectedPriority;

        return (
            matchesSearch &&
            matchesStatus &&
            matchesPriority
        );
    });
}


// Create a small task label

function createTaskLabel(text, className) {
    const label =
        document.createElement("span");

    label.className =
        "task-label " + className;

    label.textContent = text;

    return label;
}


// Create one task element

function createTaskElement(task) {
    const taskItem =
        document.createElement("li");

    const checkbox =
        document.createElement("input");

    const taskContent =
        document.createElement("div");

    const taskName =
        document.createElement("span");

    const taskDetails =
        document.createElement("div");

    const taskActions =
        document.createElement("div");

    const editButton =
        document.createElement("button");

    const deleteButton =
        document.createElement("button");


    taskItem.className =
        "task-item priority-" +
        task.priority;

    taskItem.dataset.id =
        task.id;

    if (task.completed) {
        taskItem.classList.add("completed");
    }


    checkbox.type = "checkbox";
    checkbox.className = "task-checkbox";
    checkbox.checked = task.completed;

    checkbox.setAttribute(
        "aria-label",
        "Mark task as completed"
    );


    taskContent.className =
        "task-content";

    taskName.className =
        "task-name";

    taskName.textContent =
        task.name;


    taskDetails.className =
        "task-details";

    const priorityLabel =
        createTaskLabel(
            task.priority.charAt(0).toUpperCase() +
            task.priority.slice(1) +
            " Priority",
            "priority-label-" + task.priority
        );

    const dateLabel =
        createTaskLabel(
            task.createdAt,
            "date-label"
        );

    taskDetails.append(
        priorityLabel,
        dateLabel
    );

    taskContent.append(
        taskName,
        taskDetails
    );


    taskActions.className =
        "task-actions";

    editButton.type = "button";
    editButton.className =
        "task-button edit-button";
    editButton.textContent =
        "Edit";

    deleteButton.type = "button";
    deleteButton.className =
        "task-button delete-button";
    deleteButton.textContent =
        "Delete";

    taskActions.append(
        editButton,
        deleteButton
    );


    checkbox.addEventListener(
        "change",
        function () {
            toggleTask(task.id);
        }
    );

    editButton.addEventListener(
        "click",
        function () {
            editTask(task.id);
        }
    );

    deleteButton.addEventListener(
        "click",
        function () {
            deleteTask(task.id);
        }
    );


    taskItem.append(
        checkbox,
        taskContent,
        taskActions
    );

    return taskItem;
}


// Update statistics

function updateStatistics(filteredTasks) {
    const completedTasks =
        tasks.filter(function (task) {
            return task.completed;
        });

    const activeTasks =
        tasks.filter(function (task) {
            return !task.completed;
        });

    totalCount.textContent =
        tasks.length;

    activeCount.textContent =
        activeTasks.length;

    completedCount.textContent =
        completedTasks.length;

    visibleCount.textContent =
        filteredTasks.length;

    clearCompletedButton.disabled =
        completedTasks.length === 0;

    clearAllButton.disabled =
        tasks.length === 0;


    if (tasks.length === 0) {
        taskSummary.textContent =
            "No tasks have been added.";
    } else {
        taskSummary.textContent =
            activeTasks.length +
            " active and " +
            completedTasks.length +
            " completed.";
    }
}


// Render all visible tasks

function renderTasks() {
    taskList.innerHTML = "";

    const filteredTasks =
        getFilteredTasks();

    filteredTasks.forEach(function (task) {
        taskList.append(
            createTaskElement(task)
        );
    });

    emptyMessage.classList.toggle(
        "hidden",
        filteredTasks.length !== 0
    );

    updateStatistics(filteredTasks);
}


// Submit a new task

taskForm.addEventListener(
    "submit",
    function (event) {
        event.preventDefault();

        const taskName =
            taskInput.value.trim();

        const selectedPriority =
            prioritySelect.value;

        if (taskName === "") {
            taskError.textContent =
                "Enter a task before adding it.";

            taskInput.focus();

            return;
        }

        const duplicateTask =
            tasks.some(function (task) {
                return (
                    task.name.toLowerCase() ===
                    taskName.toLowerCase()
                );
            });

        if (duplicateTask) {
            taskError.textContent =
                "This task already exists.";

            taskInput.focus();

            return;
        }

        taskError.textContent = "";

        addTask(
            taskName,
            selectedPriority
        );

        taskForm.reset();

        prioritySelect.value =
            "medium";

        taskInput.focus();
    }
);


// Update search and filters

searchInput.addEventListener(
    "input",
    renderTasks
);

statusFilter.addEventListener(
    "change",
    renderTasks
);

priorityFilter.addEventListener(
    "change",
    renderTasks
);


// Clear completed tasks

clearCompletedButton.addEventListener(
    "click",
    function () {
        tasks = tasks.filter(function (task) {
            return !task.completed;
        });

        saveTasks();
        renderTasks();
    }
);


// Clear all tasks

clearAllButton.addEventListener(
    "click",
    function () {
        if (tasks.length === 0) {
            return;
        }

        const shouldClearTasks =
            confirm(
                "Are you sure you want to remove every task?"
            );

        if (!shouldClearTasks) {
            return;
        }

        tasks = [];

        saveTasks();
        renderTasks();
    }
);


// Start the application

loadTasks();
renderTasks();