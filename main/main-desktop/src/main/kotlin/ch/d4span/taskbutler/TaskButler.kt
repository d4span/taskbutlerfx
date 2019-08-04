package ch.d4span.taskbutler

import javafx.application.Application
import javafx.application.Platform
import javafx.stage.Stage
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import javafx.scene.layout.StackPane
import javafx.scene.Scene
import javafx.scene.control.Label


@SpringBootApplication
open class TaskButler {
    init {
        Platform.startup { }
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(TaskButler::class.java, *args)
}