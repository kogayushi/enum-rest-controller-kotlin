package sample

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/alt-js")
@RestController
class AltJsResource {
    @GetMapping
    fun list(): List<String?> {
        return AltJs.values()
            .map { obj: AltJs -> obj.genericName }
    }

    @GetMapping("/genericName")
    fun answer(@RequestParam(name = "code") altJs: AltJs): String {
        return altJs.genericName
    }
}
