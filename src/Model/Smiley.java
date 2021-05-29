package Model;

import javafx.scene.canvas.GraphicsContext;

public class Smiley {
    private Eyes eyes;
    private Head head;
    private Brows brows;
    private Mouth mouth;

    public void setEyes(Eyes eyes){this.eyes=eyes;}
    public void setHead(Head head){
        this.head=head;

    }
    public void setBrows(Brows brows){
        this.brows=brows;
    }
    public void setMouth(Mouth mouth){this.mouth=mouth;}
    public void draw(GraphicsContext gr, int c){
        head.draw(gr,c);
        eyes.draw(gr,c);
        brows.draw(gr,c);
        mouth.draw(gr,c);
    }
}
