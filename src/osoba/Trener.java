package osoba;

import data.Data;

import java.util.concurrent.ThreadLocalRandom;

public class Trener extends  Osoba{
    static Data d =new Data();
    private int godIskustva;

    public Trener(String ime, String prezime, int godIskustva) {
        super(ime, prezime);
        this.godIskustva = godIskustva;
    }

    public static Trener generirajTrenera() {
        String tempIme = d.imena[ThreadLocalRandom.current().nextInt(0, (d.imena.length-1))];
        String tempPrezime = d.prezimena[ThreadLocalRandom.current().nextInt(0, (d.prezimena.length-1))];
        int iskustvo = ThreadLocalRandom.current().nextInt(2, 35);
        return new Trener(tempIme, tempPrezime, iskustvo);
    }

    @Override
    public String toString() {
        return super.toString() +" godina iskustva: "+godIskustva;
    }
}
