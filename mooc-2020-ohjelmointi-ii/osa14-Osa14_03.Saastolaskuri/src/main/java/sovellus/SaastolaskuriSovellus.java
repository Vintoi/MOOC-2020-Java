package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.beans.value.ChangeListener; 
import javafx.beans.value.ObservableValue; 

public class SaastolaskuriSovellus extends Application {
 
    @Override
    public void start(Stage ikkuna) {
    // borderPane asettelua varten
    BorderPane asettelu = new BorderPane();
    
    //Vbox johon laitetaan 2kpl BorderPaneja, 
    VBox sliderit = new VBox(20);
    
    // borderPane Talletusta varatan, johon luodaan Label ja slider
    BorderPane kkTalletus = new BorderPane();
    Label kk_talletus = new Label("Kuukausittainen tallennus"); //label,
    Slider talletus = new Slider(25, 250, 50); //slideri, alin 25, ylin 250, alku 25
    Label talletusArvo = new Label(Double.toString(talletus.getValue())); // haetaan Labelin teksti sliderista
    talletus.setShowTickLabels(true); // luodaan "otsikot" merkelle slideriin
    talletus.setShowTickMarks(true); // luodaan merkit slideriin
    talletus.setMajorTickUnit(25); // arvot 25 välein
    talletus.setMinorTickCount(5); // merkit 5 välein
    talletus.setBlockIncrement(25);
    kkTalletus.setLeft(kk_talletus); //tuodaan lablel vasemmalle
    kkTalletus.setCenter(talletus); // tuodaan Slider keskelle
    kkTalletus.setRight(talletusArvo); // tuodaan arvo oikealle
    
    //luodaan Borderpane korolle, ja laitetaan siihen tarvittavat asiat
    BorderPane vKorko = new BorderPane();
    Label v_koro = new Label("Vuosittainen korko"); //label, ja sen teksti
    Slider korko = new Slider(0, 10, 0); //slideri, alin 0, ylin 10, alku arvo 0
    Label korkoArvo = new Label(Double.toString(korko.getValue())); // haetaan Labelin teksti sliderista
    korko.setShowTickLabels(true); // luodaan "otsikot" merkelle slideriin
    korko.setShowTickMarks(true); // luodaan merkit slideriin
    korko.setMajorTickUnit(5); // arvot 25 välein
    korko.setMinorTickCount(1); // merkit 5 välein
    vKorko.setLeft(v_koro); //tuodaan lablel vasemmalle
    vKorko.setCenter(korko); // tuodaan Slider keskelle
    vKorko.setRight(korkoArvo); // tuodaan arvo oikealle
    
    //lisätään slidereille tehdyt BorderPanet vBoxiin   
    sliderit.getChildren().addAll(kkTalletus,vKorko);
    
    
    //viedään vBox, asettelun ylälaitaan
    asettelu.setTop(sliderit);
    
    //luodaan x ja y akselit
    NumberAxis xAkseli = new NumberAxis(0,30,1); 
    NumberAxis yAkseli = new NumberAxis(); 
    
    XYChart.Series laskuri = new XYChart.Series(); //
    
    LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli); // luodaan viivakaavion alue
    viivakaavio.setTitle("Säästölaskuri");
    
    //lisätään kuuntelija ja action ensimmäiselle sliderille
    talletus.valueProperty().addListener(
            new ChangeListener<Number>() { 
            public void changed(ObservableValue<? extends Number> ov,
                Number old_val, Number new_val) {
                
                talletusArvo.setText(String.format("%.2f", new_val));
                laskuri.getData().clear();
                
                    for (int i = 0; i< 31; i++) {
                        if ( i == 0) {
                        laskuri.getData().add(new XYChart.Data(0,0));
                        } else {
                        laskuri.getData().add(new XYChart.Data(i, (((int) talletus.getValue() *12) * i)));
                        }
                    }    
                }
                
            });
    XYChart.Series korkoineen = new XYChart.Series(); // säästöt korkoineen
    
    //kuuntelija toiselle sliderille
    korko.valueProperty().addListener(
            new ChangeListener<Number>() { 
            public void changed(ObservableValue<? extends Number> ov,
                Number old_val, Number new_val) {    
                korkoArvo.setText(String.format("%.2f", new_val));
                korkoineen.getData().clear();
                
                int ilmankorkoa = 0;
                double korkoKasvaa = 0;
                double tulosKoronKanssa = 0;
                double saastoPerVuosi = 0;
                
                for (int i = 0; i< 31; i++) {
                    if (i == 0 ) {
                    korkoineen.getData().add(new XYChart.Data(0,0));
                    } else {
                        ilmankorkoa = ((int) talletus.getValue() * 12 * i );
                        korkoKasvaa = korko.getValue() / 100 + 1;
                        
                        saastoPerVuosi = saastoPerVuosi + ilmankorkoa / i;
                        saastoPerVuosi = saastoPerVuosi * korkoKasvaa;
                        
                        korkoineen.getData().add(new XYChart.Data(i, saastoPerVuosi ));
                    }
                }
                
            }
    });
    
    
    //lisätään data viivakaavioon.
    viivakaavio.getData().add(laskuri);
    viivakaavio.getData().add(korkoineen);
    
    //tuodaan viivakaavio asetteluun
    asettelu.setCenter(viivakaavio);
    //luodaan näkymä
    Scene nakyma = new Scene(asettelu, 600, 600);
    ikkuna.setScene(nakyma);
    ikkuna.show(); 
    
    }
    public static void main(String[] args) {
        launch(SaastolaskuriSovellus.class);
    }

}
