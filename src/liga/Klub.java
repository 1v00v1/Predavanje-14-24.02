package liga;

import osoba.Igrac;
import osoba.Trener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;


public class Klub extends ID {

    private String naziv;
    private String grad;
    private Trener trener;
    private List<Igrac> igrači;

    public Klub(String naziv, String grad) {
        this.naziv = naziv;
        this.grad = grad;
        this.trener = setTrener();
        this.igrači = setIgrači();
    }

    static List<Klub> klubovi = new ArrayList<>(
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

    public static Klub radndomKlub() {
        return klubovi.get(ThreadLocalRandom.current().nextInt(0, (klubovi.size() - 1)));
    }


    public Trener setTrener() {
        return Trener.generirajTrenera();
    }

    public List<Igrac> setIgrači() {
        return Igrac.generiranjeIgrača();
    }


    public String getNaziv() {
        return naziv;
    }

    public List<Igrac> getIgrači() {
        return igrači;
    }

    public String getGrad() {
        return grad;
    }

    public Trener getTrener() {
        return trener;
    }

    @Override
    public String toString() {
        return
                "Ime Kluba= " + naziv +
                        " , \nGrad= " + grad +
                        ",  \nTrener= " + trener +
                        ", \nIgrači= " + igrači +
                        "\n";
    }
}
