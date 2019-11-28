package sample

enum class JvmLanguage(override val code: String, val genericName: String) : EnumBase<JvmLanguage> {
    JAVA("10", "Java"),
    KOTLIN("20", "Kotlin"),
    SCALA("30", "Scala"),
    GROOVY("40", "Groovy");
}
