package Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Brows implements Item{
    @Override
    public void draw(GraphicsContext gr, int c) {
        gr.setStroke(Color.BLACK);
        if(c == 0||c==3) {
            gr.strokePolygon(new double[]{207,237},
                    new double[]{91,71},2);
            gr.strokePolygon(new double[]{277,307},
                    new double[]{71,91},2);
        }
        else if(c == 1) {
            gr.strokePolygon(new double[]{207,237},
                    new double[]{91,91},2);
            gr.strokePolygon(new double[]{277,307},
                    new double[]{91,91},2);
        }
        else {
            gr.strokePolygon(new double[]{207,237},
                    new double[]{81,107},2);
            gr.strokePolygon(new double[]{277,307},
                    new double[]{107,81},2);
        }
    }
}