# 🧠 Kotlin Lambda Expressions - A Deep Dive for Android Developers

Lambda Expressions in Kotlin are a concise way to define anonymous functions. They are extremely useful in Android for event handling, list operations, callbacks, and much more.

---

## 📌 What is a Lambda Expression?

A **Lambda Expression** is a short block of code that takes input and returns a result. You can pass it as a parameter to functions or assign it to variables.

### ✅ Syntax:
```kotlin
val lambdaName: (InputType) -> ReturnType = { input -> output }
```
### ✅ Example:
```kotlin
val square: (Int) -> Int = { number -> number * number }
println(square(5))  // Output: 25
```
---
### ✅ 1. Lambda Basics
```kotlin
val greet = { println("Hello, Android!") }
greet()
```
---

### ✅ 2. Lambda with Parameters
```kotlin
val add: (Int, Int) -> Int = { a, b -> a + b }
println(add(10, 20))  // Output: 30
```
---

### ✅ 3. Lambda as Function Argument
```kotlin
fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

val result = operateOnNumbers(4, 2) { x, y -> x * y }
println(result) // Output: 8
```
