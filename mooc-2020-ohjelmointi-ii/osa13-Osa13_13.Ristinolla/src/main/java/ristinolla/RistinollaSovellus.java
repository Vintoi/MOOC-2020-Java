package ristinolla;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class RistinollaSovellus extends Application{


    public static void main(String[] args) {
        launch(RistinollaSovellus.class);
    }
    
    public void start(Stage ikkuna) throws Exception {
        Peli peli = new Peli();
        
        Button[] napit = new Button[9];
        BorderPane asettelu = new BorderPane();
        Label vuoro = new Label("Vuoro: X");
        vuoro.setFont(Font.font("Monospaced", 40));

        GridPane gPane = new GridPane();
        int i = 0;
        while (i < 9){
            for (int x = 1; x <= 3; x++) {
                for (int y = 1; y <= 3; y++) {
                    napit[i] = new Button(" ");
                    napit[i].setFont(Font.font("Monospaced", 40));
                    gPane.add(napit[i], x, y);
                    i++;
                }
            }
        }
        
        
        asettelu.setTop(vuoro);
        asettelu.setCenter(gPane);
        
        for (Button nappi : napit){
            nappi.setOnAction((event) -> {
                nappi.setText(peli.getVuoro());
                nappi.setDisable(true);
                if (peli.getSeuraavaVuoro().equals("Loppu!")){
                    vuoro.setText("Loppu!");
                } else {
                vuoro.setText("Vuoro: " + peli.getSeuraavaVuoro());
                }
                peli.setVuoro();
                if (peli.onkoVoitettu(napit) == true) {
                    vuoro.setText("Loppu!");
                    for(Button loput : napit){
                        loput.setDisable(true); 
                    }
                }
            });
        }
        
        
        
        Scene nakyma = new Scene(asettelu);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

}
