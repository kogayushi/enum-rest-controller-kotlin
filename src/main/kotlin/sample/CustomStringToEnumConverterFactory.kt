package sample

import org.springframework.core.convert.converter.Converter
import org.springframework.core.convert.converter.ConverterFactory

class CustomStringToEnumConverterFactory : ConverterFactory<String, EnumBase<*>> {
    override fun <T : EnumBase<*>> getConverter(targetType: Class<T>): Converter<String, T> {
        return CustomStringToEnumConverter(targetType)
    }

    private class CustomStringToEnumConverter<T : EnumBase<*>>(private val enumType: Class<T>) : Converter<String, T> {
        override fun convert(source: String): T? {
            return if (source.isEmpty()) {
                null
            } else EnumBase.of(enumType, source.trim { it <= ' ' })
        }
    }
}
