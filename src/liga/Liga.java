package liga;


import java.util.ArrayList;
import java.util.List;

public class Liga {
   private List<Utakmica> utakmice = new ArrayList<>();
   private List<Klub> klubovi = Klub.klubovi;

    public Liga(List<Utakmica> utakmice) {
        this.utakmice = utakmice;

    }


    public void ispisKlubova() {
        System.out.println("Klubovi su:\n");
        for (Klub klub : klubovi) {
            System.out.println( klub.getNaziv());
        }
        System.out.println("----------------------------");
    }
    public void ispisUtakmica(){
        for (Utakmica utakmica : utakmice) {
            System.out.println(utakmica.getDomači().getNaziv() + " vs " + utakmica.getGosti().getNaziv() + " " + utakmica.getRezDomači() + " : " + utakmica.getRezGosti());

        }
    }

    @Override
    public String toString() {
        return "";
    }
}