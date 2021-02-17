package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UseampiNakyma extends Application {
    
    public static void main(String[] args) {
        launch(UseampiNakyma.class);        
    }
    
    @Override
    public void start(Stage ikkuna) {
        
      BorderPane bPane = new BorderPane();
      Label teksti = new Label("Eka näkymä!");
      Button nappi = new Button("Tokaan näkymään!");
      bPane.setCenter(nappi);
      bPane.setTop(teksti);
      Scene eka = new Scene(bPane);
      
      VBox vBox = new VBox();
      Button tokaNappi = new Button("Kolmanteen näkymään!");
      Label tokaTeksti = new Label("Toka näkymä!");
      vBox.getChildren().addAll(tokaNappi, tokaTeksti);
      Scene toka = new Scene(vBox);
      
      GridPane gPane = new GridPane();
      Button kolmasNappi = new Button("Ekaan näkymään!");
      Label kolmasTeksti = new Label("Kolmas näkymä!");
      gPane.add(kolmasTeksti, 0, 0);
      gPane.add(kolmasNappi, 1, 1);
      Scene kolmas = new Scene(gPane);
      
      nappi.setOnAction((event) -> {
        ikkuna.setScene(toka);
    });
     
      tokaNappi.setOnAction((event) -> {
        ikkuna.setScene(kolmas);
    });
        kolmasNappi.setOnAction((event) -> {
        ikkuna.setScene(eka);
    });
        
      ikkuna.setScene(eka);
      ikkuna.show();
  
  }
}
