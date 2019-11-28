package sample

interface EnumBase<E : Enum<E>> {
    val code: String

    companion object {
        fun <E : EnumBase<*>> of(enumClass: Class<E>, code: String): E {
            return enumClass.enumConstants
                .firstOrNull { it.code == code }
                ?: throw IllegalArgumentException(String.format("%s does not have such code => [%s]", enumClass.simpleName, code))
        }
    }
}
