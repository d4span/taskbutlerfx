package ch.d4span.taskbutler

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class TaskButler

fun main(args: Array<String>) {
    SpringApplication.run(TaskButler::class.java, *args)
}