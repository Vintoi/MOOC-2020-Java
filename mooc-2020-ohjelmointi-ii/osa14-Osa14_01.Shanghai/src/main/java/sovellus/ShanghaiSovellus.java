package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiSovellus extends Application {

    public static void main(String[] args) {
            launch(ShanghaiSovellus.class);
        }
    public void start(Stage ikkuna) throws Exception {
        
        //luodaan x- ja y-akseli
        NumberAxis xAkseli = new NumberAxis(2006,2018,3);
        NumberAxis yAkseli = new NumberAxis(40,100,5);
        
        //akselien nimet
        xAkseli.setLabel("Vuosi");
        yAkseli.setLabel("Sijoitus");
        
        //viivakaavio
        LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);
        viivakaavio.setTitle("Helsingin yliopisto, Shaghai-rankig");
        
        //viivakaavion datajoukko
        XYChart.Series HYShangai = new XYChart.Series();
        HYShangai.setName("HY");
        
        HYShangai.getData().add(new XYChart.Data(2007, 73));
        HYShangai.getData().add(new XYChart.Data(2008, 68));
        HYShangai.getData().add(new XYChart.Data(2009, 72));
        HYShangai.getData().add(new XYChart.Data(2010, 72));
        HYShangai.getData().add(new XYChart.Data(2011, 74));
        HYShangai.getData().add(new XYChart.Data(2012,73));
        HYShangai.getData().add(new XYChart.Data(2013,76));
        HYShangai.getData().add(new XYChart.Data(2014,73));
        HYShangai.getData().add(new XYChart.Data(2015,67));
        HYShangai.getData().add(new XYChart.Data(2016,56));
        HYShangai.getData().add(new XYChart.Data(2017,56));
        
        viivakaavio.getData().add(HYShangai);
        
        Scene nakyma = new Scene(viivakaavio, 640, 480);
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

}
