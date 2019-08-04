package ch.d4span.taskbutler

import javafx.application.Platform
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


/**
 * The core Spring Boot application, responsible for proper application startup.
 */
@SpringBootApplication
open class TaskButler {
    init {
        // Ensure that OpenJFX has been properly initialized.
        try {
            Platform.startup { }
        } catch (e: IllegalStateException) {
        }
    }
}

/**
 * Application entry point.
 */
fun main(args: Array<String>) {
    SpringApplication.run(TaskButler::class.java, *args)
}