package com.example.springnativeexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringNativeExampleApplication

fun main(args: Array<String>) {
    runApplication<SpringNativeExampleApplication>(*args)
}
