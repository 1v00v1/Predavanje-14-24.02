package osoba;

import data.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Igrac extends Osoba{
    static Data d =new Data();
   private int brojDresa;
    private int velKopačke;

    public Igrac(String ime, String prezime, int brojDresa, int velKopačke) {
        super(ime, prezime);
        this.brojDresa = brojDresa;
        this.velKopačke = velKopačke;
    }


    public static List<Igrac> generiranjeIgrača() {
        String tempIme;
        String tempPrezime;
        int brojDresa;
        int brojKopačke;
        Igrac tempIgrač;

        List<Igrac> temp = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            tempIme = d.imena[ThreadLocalRandom.current().nextInt(1, d.imena.length) - 1];
            tempPrezime = d.imena[ThreadLocalRandom.current().nextInt(1, d.prezimena.length) - 1];
            brojDresa = ThreadLocalRandom.current().nextInt(1, 99);
            brojKopačke = ThreadLocalRandom.current().nextInt(32, 48);
            tempIgrač = new Igrac(tempIme, tempPrezime, brojDresa, brojKopačke);
            temp.add(tempIgrač);
        }
        return temp;
    }

    @Override
    public String toString() {
        return "\n("+
                 brojDresa +
                ") " +super.toString();
    }
}
