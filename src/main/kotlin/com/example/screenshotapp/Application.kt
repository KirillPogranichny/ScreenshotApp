package com.example.screenshotapp

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

class ScreenshotApp : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(ScreenshotApp::class.java.getResource("design.fxml"))
        val layout: Parent = fxmlLoader.load()
        fxmlLoader.getController<Controller>().stage = stage
        val scene = Scene(layout)
        scene.stylesheets
        stage.title = "ScreenshotApp"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(ScreenshotApp::class.java)
}