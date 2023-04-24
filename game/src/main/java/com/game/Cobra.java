package com.game;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public class Cobra {

    /* Criamos a cabeça a partir das pré configurações do canvas */
    private Canvas cabeca;
    private int positionX;
    private int positionY;


    public Cobra() {
        criarCobra(); 
    }

    private void criarCobra() {
        this.cabeca = CanvasUtils.squareCanvas(Color.GREEN);
        /*this.cabeca.setTranslateX(Config.WIDTH/2 - Config.SQUARE_SIZE);
        this.cabeca.setTranslateY(Config.HEIGHT/2 - Config.SQUARE_SIZE);*/

        this.cabeca.setTranslateX(650/2 - 20);
        this.cabeca.setTranslateY(650/2 - 20);
    }
    
    public Canvas getCabeca(){ return cabeca; }

    public Integer getPositionX(){ 
       this.positionX = (int)cabeca.getTranslateX();
        return positionX; 
    }

    public Integer getPositionY(){ 
        this.positionY = (int)cabeca.getTranslateY();
        return positionY; 
    }

    public void setPosition(Integer x, Integer y) {
        this.cabeca.setTranslateX(x);
        this.cabeca.setTranslateY(y);
    }

}
