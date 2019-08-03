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
open class TaskButler : Application() {
    override fun start(stage: Stage?) {
        val javaVersion = System.getProperty("java.version")
        val javafxVersion = System.getProperty("javafx.version")
        val l = Label("Hello, JavaFX $javafxVersion, running on Java $javaVersion.")
        val scene = Scene(StackPane(l), 640.0, 480.0)
        stage?.setScene(scene)
        stage?.show()
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(TaskButler::class.java, *args)
    Application.launch(TaskButler::class.java)
}