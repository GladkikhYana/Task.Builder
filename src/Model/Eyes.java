package Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Eyes implements Item{
    @Override
    public void draw(GraphicsContext gr, int c) {
        gr.setFill(Color.BLACK);
        gr.fillOval(213, 101, 20, 20);
        gr.fillOval(283, 101, 20, 20);
    }
}
