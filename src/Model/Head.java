package Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Head implements Item{
    @Override
    public void draw(GraphicsContext gr, int c) {
        if(c == 0)
            gr.setFill(Color.GREEN);
        else if(c == 1)
            gr.setFill(Color.ORANGE);
        else if(c == 3)
            gr.setFill(Color.BLUE);
        else gr.setFill(Color.RED);
        gr.fillOval(213-50, 51, 184, 150);
    }
}
