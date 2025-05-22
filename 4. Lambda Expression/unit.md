# 📘 Kotlin: `Unit` (No Return Value)

In Kotlin, `Unit` is the equivalent of `void` in Java. It is used to define a function that **does not return any value**.

---

## ✅ What is `Unit`?

- It means "no meaningful value is returned".
- It's used when your function just **performs an action** (like printing or saving data).
- Functions that return `Unit` are often used for **side effects**.

---

## 🧪 Example

```kotlin
fun sayHello(): Unit {
    println("Hello!")
}
