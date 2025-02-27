package liga;
import data.Data;
import osoba.Igrac;
import osoba.Trener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;


public class Klub extends ID {
    private static Data d = new Data();
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



    public static Klub radndomKlub() {
        return d.klubovi.get(ThreadLocalRandom.current().nextInt(0, (d.klubovi.size() - 1)));
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
