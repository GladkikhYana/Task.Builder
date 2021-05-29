package sample;

import Model.Director;
import Model.SimpleSmileyBilder;
import Model.Smiley;
import Model.SmileyBuilder;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Controller {


    public Canvas can;
    GraphicsContext gr;

    Director harddiskBuildingCompany;
    SmileyBuilder builder;
    Smiley smileys;
    @FXML
    public void initialize(){
        gr = can.getGraphicsContext2D();
        harddiskBuildingCompany = new Director();
        builder = new SimpleSmileyBilder();
        harddiskBuildingCompany.build(builder);
        smileys = harddiskBuildingCompany.build(builder);
    }
    public void addPict(){
        clearPic();
        smileys.draw(gr,0);
    }
    public void clearPic(){
        GraphicsContext gr = can.getGraphicsContext2D();
        gr.clearRect(0, 0, 560, 273);
    }
    public void addPictThree(ActionEvent actionEvent) {
        clearPic();
        smileys.draw(gr,2);
    }

    public void addPictTwo(ActionEvent actionEvent) {
        clearPic();
        smileys.draw(gr,1);
    }

    public void addPictFour(ActionEvent actionEvent) {
        clearPic();
        smileys.draw(gr,3);
    }
}
