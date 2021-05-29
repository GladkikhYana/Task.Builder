package Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class Mouth implements Item{
    @Override
    public void draw(GraphicsContext gr, int c) {
        gr.setStroke(Color.BLACK);
        gr.setFill(Color.BLACK);
        if(c == 0)
            gr.fillArc(115,-15, 284,179,245,50, ArcType.OPEN);
        else {
            gr.strokePolygon(new double[]{227, 287},
                    new double[]{161, 161}, 2);
        }
    }
}