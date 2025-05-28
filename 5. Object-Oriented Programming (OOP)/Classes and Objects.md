# 🚀 Object-Oriented Programming (OOP) in Kotlin

## 🧱 What is a Class?

A **class** is a blueprint for creating objects. It can contain:

* **Properties** (variables)
* **Functions** (methods)

## 📦 What is an Object?

An **object** is an instance of a class — a real version created from that blueprint.

---

## ✅ Example: Basic Class and Object

```kotlin
class Person {
    // Property
    var name: String = "No name"

    // Method
    fun sayHello() {
        println("Hello, my name is $name")
    }
}

fun main() {
    // Creating an object of the class
    val person1 = Person()
    person1.name = "Samir"
    person1.sayHello()   // Output: Hello, my name is Samir
}
```

### 🧠 Explanation:

* `class Person`: Defines a class called `Person`
* `var name: String`: Property of the class
* `fun sayHello()`: Method that prints a message
* `val person1 = Person()`: Creates an object
* `person1.name = "Samir"`: Sets the property value
* `person1.sayHello()`: Calls the method

---

