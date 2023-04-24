package com.game;
import javafx.application.Application;
import javafx.stage.Stage;


public class Game extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Cobra cobra = new Cobra();
        Scenario scenario =  new Scenario(primaryStage, cobra);
        EventoMovimentos movimento = new EventoMovimentos(scenario, cobra);
    }
}