package com.garage.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class GarageController {
    @GetMapping
    fun helloWorld() : String {
        return  "Hello World!"
    }
}
