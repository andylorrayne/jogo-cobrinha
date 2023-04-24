package com.game;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.input.KeyCode;
import javafx.util.Duration;

public class EventoMovimentos {
    
    private Scenario scenario;
    private KeyCode direcaoAtual;
    private Cobra cobra;

    public EventoMovimentos(Scenario scenario, Cobra cobra){
        this.scenario = scenario;
        this.scenario.setKeyPressed(e->{
            KeyCode teclaPressionada = e.getCode();

            if (teclaPressionada.equals(KeyCode.RIGHT)){
                direcaoAtual = teclaPressionada;
            }
            if (teclaPressionada.equals(KeyCode.LEFT)){
                direcaoAtual = teclaPressionada;
            }
            if (teclaPressionada.equals(KeyCode.UP)){
                direcaoAtual = teclaPressionada;
            }
            if (teclaPressionada.equals(KeyCode.DOWN)){
                direcaoAtual = teclaPressionada;
            }
        });

        startMovimento();
    }

    private void startMovimento() {
        Timeline timeline = new Timeline();
        KeyFrame keyFrame = new KeyFrame(Duration.millis(200), e->{
            Integer positionX= cobra.getPositionX();
            Integer positionY= cobra.getPositionY();
/* condições de movimento */
            if (KeyCode.RIGHT.equals(direcaoAtual)){
                positionX = positionX + Config.SQUARE_SIZE;
            }

            if (KeyCode.LEFT.equals(direcaoAtual)){
                positionX = positionX - Config.SQUARE_SIZE;
            }

            if (KeyCode.UP.equals(direcaoAtual)){
                positionY = positionY - Config.SQUARE_SIZE;
            }

            if (KeyCode.DOWN.equals(direcaoAtual)){
                positionY = positionY + Config.SQUARE_SIZE;
            }

            this.cobra.setPosition(positionX, positionY);
        });

        timeline.getKeyFrames().add(keyFrame);
        timeline.setCycleCount(Integer.MAX_VALUE);
        timeline.play();
    }


}
