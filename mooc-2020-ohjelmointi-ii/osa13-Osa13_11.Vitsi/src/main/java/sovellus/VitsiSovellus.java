package sovellus;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class VitsiSovellus extends Application {
    
    public static void main(String[] args) {
        launch(VitsiSovellus.class);
    }
  
    public void start(Stage ikkuna) throws Exception {
        BorderPane asettelu = new BorderPane();
        
        HBox valikko = new HBox();
        valikko.setPadding(new Insets(20, 20, 20, 20));
        valikko.setSpacing(10);
        
        Button eka = new Button("Vitsi");
        Button toka = new Button("Vastaus");
        Button kolmas = new Button("Selitys");
        
        valikko.getChildren().addAll(eka, toka, kolmas);
        asettelu.setTop(valikko);
        
        StackPane ekaAsettelu = luoNakyma("What do you call a bear with no teeth?");
        StackPane tokaAsettelu = luoNakyma("A gummy bear.");
        StackPane kolmasAsettelu = luoNakyma("A gummy bear.");
        
        eka.setOnAction((event) -> asettelu.setCenter(ekaAsettelu));
        toka.setOnAction((event) -> asettelu.setCenter(tokaAsettelu));
        kolmas.setOnAction((event) -> asettelu.setCenter(kolmasAsettelu));
        
        asettelu.setCenter(ekaAsettelu);
        
        Scene nakyma = new Scene(asettelu);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }
    private StackPane luoNakyma(String teksti) {

        StackPane asettelu = new StackPane();
        asettelu.setPrefSize(300, 180);
        asettelu.getChildren().add(new Label(teksti));
        asettelu.setAlignment(Pos.CENTER);

        return asettelu;
    }
}
