package com.game;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
/* Criando a tela  */
public class Scenario {
    private Scene scene;
    private Group root = new Group();
    private Cobra cobra;
    
    public Scenario (Stage primarStage, Cobra cobra){
        this.scene = new Scene(root, Config.WIDTH, Config.HEIGHT);
        primarStage.setScene(scene);
        primarStage.setTitle("Jogo da cobrinha - A.L");
        primarStage.show();

        this.cobra = cobra;
        root.getChildren().add(cobra.getCabeca());

    }

    /* Capturando a ação de movimento da cobra */
    public void setKeyPressed(EventHandler<? super KeyEvent> action) {
        this.scene.setOnKeyPressed(action);
        
    }
}
