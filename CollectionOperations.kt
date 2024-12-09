```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }.filter { it > 5 }
    println(result) // Output: [6, 8, 10]

    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    val newMap = map.mapValues { it.value * 2 }
    println(newMap) //Output: {a=2, b=4, c=6}

    val set = setOf(1, 2, 3, 4, 5)
    val newSet = set.map { it * 2 }.toSet()
    println(newSet) //Output: [2, 4, 6, 8, 10]
}
```