package tekstitilastointia;

import java.util.Arrays;
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

        BorderPane bPane = new BorderPane();
        Label kirjaimia = new Label();
        Label words = new Label();
        Label longest = new Label();
        TextArea kentta = new TextArea();
        bPane.setCenter(kentta);
        /*
        kentta.textProperty().addListener(new ChangeListener<String>() {
        @Override   
        public void changed(ObservableValue<? extends String> muutos,    
        });
        */
        
        kentta.textProperty().addListener((muutos, vanhaArvo, uusiArvo) -> {
        int merkkeja = uusiArvo.length();
        String[] palat = uusiArvo.split(" ");
        int sanoja = palat.length;
        String pisin = Arrays.stream(palat)
        .sorted((s1, s2) -> s2.length() - s1.length())
        .findFirst()
        .get();
        
    // asetetaan arvot tekstielementteihin
        kirjaimia.setText("Kirjaimia: " + merkkeja);
        words.setText("Sanoja: " + sanoja);
        longest.setText("Pisin sana on: "+ pisin);
    
    });
    
    hBox.getChildren().addAll(kirjaimia, words, longest);
        
        
        
        

        
        
        bPane.setBottom(hBox);
        Scene nakyma = new Scene(bPane);
        ikkuna.setScene(nakyma);
        ikkuna.show();
        
    }
   
    public static void main(String[] args) {
        launch(TekstitilastointiaSovellus.class);
    }
}

