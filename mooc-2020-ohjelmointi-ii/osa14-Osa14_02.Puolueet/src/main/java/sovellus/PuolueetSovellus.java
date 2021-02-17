package sovellus;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PuolueetSovellus extends Application {
 
    @Override
    public void start(Stage ikkuna) {
        //luodaan lista riveille
        List<String[]> rivit = new ArrayList<>();
        //luoteen tieodostosta
        //jaetaan tiedostorivit \t avulla riveiksi taulukkoon
        try {
            Files.lines(Paths.get("puoluedata.tsv")).map(line -> line.split("\t")).forEach(rivi -> rivit.add(rivi));
        } catch (IOException ex) {
             System.out.println("epäonnistui.");
            return;
        }
        
        // x- ja y-akselit
        NumberAxis xAkseli = new NumberAxis(1968, 2008, 4);
        NumberAxis yAkseli = new NumberAxis();        
        // viivakaavio, johon asetetaan x ja y akseli
        LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);
        //viivakaavion nimi
        viivakaavio.setTitle("Puolueiden suhteellinen kannatus");
        // jaetaan Listallla olevat rivit taulukkoon
        for (int i = 1; i < rivit.size(); i++){
            String[] rivi = rivit.get(i);
        
        // luodaan datajoukko
        XYChart.Series data = new XYChart.Series();
        // nimi, tulee ensimmäisestä sarakkeessta
        data.setName(rivi[0]);
        
        
        for (int sarake = 1; sarake < rivi.length; sarake++) {
            String arvo = rivi[sarake];
            if (arvo.equals("-")) {
                continue;
            }
            int vuosi = Integer.valueOf(rivit.get(0)[sarake]);
            data.getData().add(new XYChart.Data(vuosi, Double.valueOf(arvo)));
        }
        
        viivakaavio.getData().add(data);
        
        }
        
        Scene nakyma = new Scene(viivakaavio, 400, 300);
        ikkuna.setScene(nakyma);
        ikkuna.show();        
    
   }
   
    public static void main(String[] args) {
        launch(PuolueetSovellus.class);
    }
}
