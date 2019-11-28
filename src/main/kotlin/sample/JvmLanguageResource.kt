package sample

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/jvm-languages")
@RestController
class JvmLanguageResource {
    @GetMapping
    fun list(): List<String> {
        return JvmLanguage.values().map { it.genericName }
    }

    @GetMapping("/genericName")
    fun answer(@RequestParam(name = "code") jvmLanguage: JvmLanguage): String? {
        return jvmLanguage.genericName
    }
}
