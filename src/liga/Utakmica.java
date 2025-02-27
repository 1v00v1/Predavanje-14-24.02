package liga;

import osoba.Igrac;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

import static liga.Klub.radndomKlub;

public class Utakmica extends ID {

    private Klub domači;
    private Klub gosti;
    private int rezDomači;
    private int rezGosti;
    private List<Igrac> strijelciDomači = new ArrayList<>();
    private List<Igrac> strijelciGosti = new ArrayList<>();

    public Utakmica(Klub domači, Klub gosti, int rezDomači, int rezGosti, List<Igrac> strijelciDomači, List<Igrac> strijelciGosti) {
        this.domači = domači;
        this.gosti = gosti;
        this.rezDomači = rezDomači;
        this.rezGosti = rezGosti;
        this.strijelciDomači = strijelciDomači;
        this.strijelciGosti = strijelciGosti;
    }

    public Klub getDomači() {
        return domači;
    }

    public Klub getGosti() {
        return gosti;
    }

    public int getRezDomači() {
        return rezDomači;
    }

    public int getRezGosti() {
        return rezGosti;
    }

    public static Utakmica simulirajUtakmicu() {
        Klub k1 = radndomKlub();
        Klub k2;

        do {
            k2 = radndomKlub();
        }while ( k1 == k2);

        List<Igrac> strijelciDomači = new ArrayList<>();
        List<Igrac> strijelciGosti = new ArrayList<>();
        int goloviDomaci = ThreadLocalRandom.current().nextInt(0, 6);
        int goloviGosti = ThreadLocalRandom.current().nextInt(0, 6);
        if (goloviDomaci != 0) {
            for (int i = 0; i < goloviDomaci; i++) {

                strijelciDomači.add(k1.getIgrači().get(ThreadLocalRandom.current().nextInt(0, k1.getIgrači().size())));
            }
        }
        if (goloviGosti != 0) {
            for (int i = 0; i < goloviGosti; i++) {
                strijelciGosti.add(k2.getIgrači().get(ThreadLocalRandom.current().nextInt(0, k2.getIgrači().size())));

            }
        }
        return new Utakmica(k1, k2, goloviDomaci, goloviGosti, strijelciDomači, strijelciGosti);
    }
private String strijelci(List<Igrac> i){
        String temp ="";
        if (i.isEmpty()){
            return temp ="";
        }else {
            for (Igrac igrac : i) {
                temp+=igrac.toString();
            }
        }return temp;
}


    @Override
    public String toString() {
        return domači.getNaziv() + " vs " + gosti.getNaziv() + " " + rezDomači + " : " + rezGosti + "\nTrener Domačih : \n\t" + domači.getTrener() +
                "\nStrijelci Domačih :\n" + strijelci(strijelciDomači) +"\n"+
                "\nTrener gostiju : \n\t" + gosti.getTrener() +
                "\nStrijelci Gostiju :\n" + strijelci(strijelciGosti) + "\n------------------------------------";
    }
}
