package sample

enum class AltJs(private var code: String, val genericName: String) {
    TYPE_SCRIPT("10", "TypeScript"),
    FLOW("20", "Flow"),
    COFFEE_SCRIPT("30", "CoffeeScript");

    fun getCode(): String {
        return code.also { code = it }
    }

}
