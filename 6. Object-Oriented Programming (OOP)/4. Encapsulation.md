# 🔐 Encapsulation & Access Modifiers in Kotlin

Welcome to **Day X of Kotlin OOP Learning**!  
This file explains the concept of **Encapsulation** and **Access Modifiers** with clear examples and real-life analogies.

---

## 📦 What is Encapsulation?

> **Encapsulation** is the OOP concept of hiding the internal state of an object and allowing access only through public methods.

### 🧠 Think of it like:
A **capsule medicine** – the outside is accessible, but you can't see or change what's inside.

---

## ✅ Why Use Encapsulation?

- Protects internal data (like passwords, balances, etc.)
- Prevents incorrect usage or direct manipulation
- Keeps code **clean**, **secure**, and **easy to maintain**

---

## 🔑 Access Modifiers in Kotlin

| Modifier     | Accessible From                                  |
|--------------|--------------------------------------------------|
| `public`     | Everywhere (default)                             |
| `private`    | Only inside the class                            |
| `protected`  | Inside class and its **subclasses**              |
| `internal`   | Anywhere within the same **module**              |

---

## 🧪 Kotlin Example – Encapsulation in a Bank Account

```kotlin
class BankAccount(private var balance: Double) {

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
        }
    }

    fun checkBalance(): Double {
        return balance
    }
}
