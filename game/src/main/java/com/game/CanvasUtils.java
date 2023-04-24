package com.game;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;

public class CanvasUtils {
    /* Configurando o bloco que fará parte do corpo da cobra da fruta */
    public static Canvas squareCanvas(Paint color) {
       Canvas square =  new Canvas(Config.SQUARE_SIZE , Config.SQUARE_SIZE);
       GraphicsContext sqr = square.getGraphicsContext2D();
       sqr.setFill(color);
       sqr.fillRect(0,0, Config.SQUARE_SIZE , Config.SQUARE_SIZE);
       return square;
        
    }
}
