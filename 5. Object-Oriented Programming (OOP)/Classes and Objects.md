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

##🔹 What is a Constructor in Kotlin?
A constructor is a special function that is called when you create an object from a class. It initializes the properties (variables) of the class.

There are two types of constructors in Kotlin:

🔸 1. Primary Constructor (Defined in the class header)

```kotlin
class Person(val name: String, val age: Int)

fun main() {
    val p = Person("Samir", 25)
    println(p.name) // Samir
}
```
* val name: String, val age: Int → these are the properties initialized via the primary constructor.
* Person("Samir", 25) → creates the object and automatically assigns the values.

---

##🔸 2. Secondary Constructor (Defined inside the class)
Used when you need more flexibility.

```kotlin
class Person {
    var name: String = ""
    var age: Int = 0

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}
```
