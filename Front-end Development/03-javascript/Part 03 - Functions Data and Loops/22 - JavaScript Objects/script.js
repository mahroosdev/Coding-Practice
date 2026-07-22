// Object introduction

const student = {
    name: "Mahroos",
    role: "Software Engineer",
    isLearning: true
};

document.getElementById("introduction-output").textContent =
    "Name: " + student.name + "\n" +
    "Role: " + student.role + "\n" +
    "Learning: " + student.isLearning;


// Object properties

document.getElementById("name-property-output").textContent =
    student.name;

document.getElementById("role-property-output").textContent =
    student.role;

document.getElementById("learning-property-output").textContent =
    student.isLearning;


// Dot notation

const course = {
    title: "JavaScript",
    lesson: 22,
    completed: false
};

document.getElementById("dot-output").textContent =
    "Title: " + course.title + "\n" +
    "Lesson: " + course.lesson + "\n" +
    "Completed: " + course.completed;


// Bracket notation

const project = {
    name: "Coding Practice",
    category: "Education",
    "project status": "In Progress"
};

document.getElementById("bracket-output").textContent =
    'project["name"]: ' + project["name"] + "\n" +
    'project["category"]: ' + project["category"] + "\n" +
    'project["project status"]: ' +
    project["project status"];


// Changing a property

const user = {
    name: "Mahroos",
    status: "Offline"
};

const originalStatus = user.status;

user.status = "Online";

document.getElementById("change-output").textContent =
    "Original status: " + originalStatus + "\n" +
    "Updated status: " + user.status;


// Adding a property

const profile = {
    name: "Mahroos",
    role: "Software Engineer"
};

profile.country = "Sri Lanka";
profile.currentLocation = "Kuwait";

document.getElementById("add-output").textContent =
    "Name: " + profile.name + "\n" +
    "Role: " + profile.role + "\n" +
    "Country: " + profile.country + "\n" +
    "Current location: " + profile.currentLocation;


// Deleting a property

const product = {
    name: "Laptop",
    price: 500,
    temporaryCode: "ABC123"
};

const originalProduct =
    JSON.stringify(product);

delete product.temporaryCode;

document.getElementById("delete-output").textContent =
    "Before: " + originalProduct + "\n" +
    "After: " + JSON.stringify(product);


// Object method

const developer = {
    name: "Mahroos",
    skill: "JavaScript",

    introduce: function () {
        return "Hello, I am " +
            this.name +
            " and I am learning " +
            this.skill +
            ".";
    }
};

document.getElementById("method-output").textContent =
    developer.introduce();


console.log("Student:", student);
console.log("Course:", course);
console.log("Profile:", profile);
console.log("Developer:", developer);