package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TervehtijaSovellus extends Application {
    
  public static void main(String[] args) {
      launch(TervehtijaSovellus.class);
  }

    public void start(Stage ikkuna) throws Exception {
        //eka näkymä
        Label ohjeteksti = new Label("Kirjoita nimesi ja aloita.");
        TextField nimikentta = new TextField();
        Button nappi = new Button("Aloita");
        GridPane gPane = new GridPane();
        
        gPane.add(ohjeteksti, 0,0);
        gPane.add(nimikentta, 0,1);
        gPane.add(nappi, 0, 3);
        
        Scene eka = new Scene(gPane);
        
        // toka näkymä
        Label tervetuloaTeksti = new Label();
        GridPane gPane2 = new GridPane();
        gPane2.add(tervetuloaTeksti, 0, 0);
        
        Scene toka = new Scene(gPane2);
        
        nappi.setOnAction((event) -> {
            tervetuloaTeksti.setText("Tervetuloa " + nimikentta.getText() + "!");
            ikkuna.setScene(toka);
        });
        ikkuna.setScene(eka);
        ikkuna.show();
        
    }
}
