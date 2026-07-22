// Introduction to the DOM

const introductionMessage =
    "DOM means Document Object Model.\n" +
    "The browser converts HTML into JavaScript objects.";

document.getElementById("introduction-output").textContent =
    introductionMessage;


// The document object

const documentInformation =
    "Object name: document\n" +
    "Object type: " + typeof document + "\n" +
    "Represents the current webpage: true";

document.getElementById("document-output").textContent =
    documentInformation;


// Document information

const documentTitle = document.title;
const documentAddress = document.URL;
const documentLanguage =
    document.documentElement.lang;

document.getElementById("information-output").textContent =
    "Document title: " + documentTitle + "\n" +
    "Document language: " + documentLanguage + "\n" +
    "Document address: " + documentAddress;


// Head and body

const headTagName = document.head.tagName;
const bodyTagName = document.body.tagName;
const rootTagName =
    document.documentElement.tagName;

document.getElementById("page-parts-output").textContent =
    "Root element: " + rootTagName + "\n" +
    "Head element: " + headTagName + "\n" +
    "Body element: " + bodyTagName;


// DOM element information

const pageHeader =
    document.querySelector("header");

const headerTagName =
    pageHeader.tagName;

const headerChildCount =
    pageHeader.children.length;

const bodyChildCount =
    document.body.children.length;

document.getElementById("element-output").textContent =
    "Selected element: " + headerTagName + "\n" +
    "Header child elements: " + headerChildCount + "\n" +
    "Body child elements: " + bodyChildCount;


console.log("Document object:");
console.log(document);

console.log("Document title:");
console.log(document.title);

console.log("Document head:");
console.log(document.head);

console.log("Document body:");
console.log(document.body);