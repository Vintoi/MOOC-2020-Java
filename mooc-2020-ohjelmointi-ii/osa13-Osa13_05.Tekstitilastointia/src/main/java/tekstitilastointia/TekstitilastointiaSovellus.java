package tekstitilastointia;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;


public class TekstitilastointiaSovellus extends Application  {

    @Override
    public void start(Stage ikkuna) {
        HBox hBox = new HBox();
        hBox.getChildren().add(new Label("Kirjaimia: 0"));
        hBox.getChildren().add(new Label("Sanoja: 0"));
        hBox.getChildren().add(new Label("Pisin sana on:"));
        
        BorderPane bPane = new BorderPane();
        
        bPane.setCenter(new TextArea(""));
        bPane.setBottom(hBox);
        
        Scene nakyma = new Scene(bPane);
        ikkuna.setScene(nakyma);
        ikkuna.show();
        
    }
   
    public static void main(String[] args) {
        launch(TekstitilastointiaSovellus.class);
    }
}

