package com.example.springnativeexample

import kotlinx.coroutines.delay
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {

    @GetMapping("/hello")
    suspend fun hello(): String {
        delay(100)
        return "hello world"
    }
}