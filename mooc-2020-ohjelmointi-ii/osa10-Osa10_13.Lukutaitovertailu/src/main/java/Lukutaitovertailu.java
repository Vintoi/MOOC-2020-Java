
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lukutaitovertailu {
    
    public static void main(String[] args) {
        ArrayList<Lukutaito> lista = new ArrayList<>();
        
        try {
            Files.lines(Paths.get("lukutaito.csv"))
            .map(rivi -> rivi.split(","))        
            .filter(palat -> palat.length >= 6)       
            .map(palat -> new Lukutaito(palat[0], palat[1], palat[2] = palat[2].replace(" (%)", ""), palat[3], Integer.valueOf(palat[4]), Double.valueOf(palat[5])))
            .forEach(lukutaito -> lista.add(lukutaito));        
            } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
            }
        
        Collections.sort(lista);
        
        lista.stream()
           .forEach(mjono -> System.out.println(mjono));
        /*
            lista.stream().sorted((h1, h2) -> {
            return h1.getProsentti().compareTo(h2.getProsentti());})
            .forEach(h -> System.out.println(h));        
        */
        
        }
    }
