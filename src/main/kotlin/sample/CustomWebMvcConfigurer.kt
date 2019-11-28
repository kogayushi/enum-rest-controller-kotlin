package sample

import org.springframework.context.annotation.Configuration
import org.springframework.format.FormatterRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
internal class CustomWebMvcConfigurer : WebMvcConfigurer {
    override fun addFormatters(registry: FormatterRegistry) {
        registry.addConverterFactory(CustomStringToEnumConverterFactory())
    }
}
