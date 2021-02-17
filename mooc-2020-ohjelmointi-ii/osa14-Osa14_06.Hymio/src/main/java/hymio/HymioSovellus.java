package hymio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class HymioSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {
    //luodaan borderPane asettelua varten
    BorderPane asettelu = new BorderPane();
    //luodaan piirtoalusta
    Canvas piirtoalusta = new Canvas(400,400);
    //luodaan piirtäjä
    GraphicsContext piirturi = piirtoalusta.getGraphicsContext2D();
        //silmat
        //sijainti x, sijainti y, leveys, korkeus, 
        piirturi.fillRect(300, 50, 50, 50);
        piirturi.fillRect(100, 50, 50, 50);
        
        //suu
        //sijainti x, sijainti y, leveys, korkeus
        piirturi.fillRect(350, 200, 50, 50);
        piirturi.fillRect(50, 200, 50, 50);
        piirturi.fillRect(100, 250, 250, 50);
    
    //asetellaan piirtoalue borderPaneen
    asettelu.setCenter(piirtoalusta);
    //luodaan näkymä
    Scene nakyma = new Scene(asettelu);
    ikkuna.setScene(nakyma);
    ikkuna.show();    
    }


    public static void main(String[] args) {
       launch(HymioSovellus.class);
    }

}
