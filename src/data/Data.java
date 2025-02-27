package data;

import liga.Klub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {
   public final String[] imena = {"Ante", "Duje", "Bruno", "Petar", "Niko", "Toni", "Dejan", "Toni", "Toni", "Lindon", "Silvio", "Ivan", "Jerko", "Goran", "Filip", "Dario"};
   public final String[] prezimena = {"Oreč", "Čop", "Burčul", "Raguž", "Petrovič", "Fruk", "Gojak", "Selahi", "Bočkaj", "Galešić", "Ilinkovic", "Mikić"};

   public final static List<Klub> klubovi = new ArrayList<>(
            Arrays.asList(
                    new Klub("Osijek", "Osijek"),
                    new Klub("Dinamo", "Zagreb"),
                    new Klub("Hajduk", "Split"),
                    new Klub("Varaždin", "Varaždin"),
                    new Klub("Slaven Belupo", "Koprivnica"),
                    new Klub("Lokomotiva", "Zagreb"),
                    new Klub("Istra", "Poreč"),
                    new Klub("Gorica", "Velika Gorica")
            )
    );
    public Data() {
    }
}
