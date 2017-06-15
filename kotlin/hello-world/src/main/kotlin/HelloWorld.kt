fun hello(name: String = "World"): String {
    return "Hello, ${format(name)}!"
}

fun format(name: String): String {
    val trimmed = name.trim()
    return if (trimmed.isEmpty()) "World" else trimmed
}
