**Nullability in Kotlin**


## ✨ Nullability in Kotlin – Explained

In Kotlin, variables **cannot be null by default**. You must explicitly declare that a variable can be null using `?`.

---

### 🔹 1. Non-nullable Variable (default)

```kotlin
var name: String = "Samir"
name = null  // ❌ Error: Null can’t be assigned
```

---

### 🔹 2. Nullable Variable (`?`)

```kotlin
var name: String? = "Samir"
name = null  // ✅ Allowed
```

---

### 🔹 3. Safe Call Operator `?.`

Use this to **access properties or methods only if the variable isn’t null**.

```kotlin
val name: String? = "Samir"
println(name?.length)  // Prints length if not null, else prints null
```

---

### 🔹 4. Elvis Operator `?:`

Provides a **default value** when the expression is null.

```kotlin
val name: String? = null
val length = name?.length ?: 0  // If name is null, use 0
println(length)  // Output: 0
```

---

### 🔹 5. Not-null Assertion `!!`

Use it when you're **sure** the variable is not null. If it **is** null, the app will crash.

```kotlin
val name: String? = null
println(name!!.length)  // ❌ Crashes with NullPointerException
```

---

### 🔹 6. Smart Cast with `if` and `let`

Safely handle nullable variables.

```kotlin
val name: String? = "Samir"

// Using if-check
if (name != null) {
    println(name.length)
}

// Using let
name?.let {
    println(it.uppercase())
}
```

---

