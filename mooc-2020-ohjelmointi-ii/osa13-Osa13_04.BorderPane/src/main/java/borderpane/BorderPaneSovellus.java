package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneSovellus extends Application  {

    @Override
    public void start(Stage ikkuna) {
        BorderPane bPane = new BorderPane();
        bPane.setTop(new Label("NORTH"));
        bPane.setRight(new Label("EAST"));
        bPane.setBottom(new Label("SOUTH"));
        
        Scene nakyma = new Scene(bPane);
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    
    public static void main(String[] args) {
        launch(BorderPaneSovellus.class);
    }
}
