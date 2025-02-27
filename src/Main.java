// Napišite program koji vodi rezultate o 1. HNL-u.
// Program mora omogućiti sljedeće:
//        •	klubovi i utakmice imaju ključ (id) koji se sam uvećava (autoincrement) pri instanciranju novog objekta
// •	unos novog rezultata
// •	trener je dio kluba, ali igrači se unose samo kao strijelci utakmice
// •	unos strijelaca (obavezan podatak, ne možete unijeti rezultat ako niste unijeli i strijelce)
// •	ispis tablice utakmica
// •	+ ispis tablice strijelaca
// •	ispis aktivnih klubova lige
// Klubove i igrače definirajte u programu, ne morate ih unositi kroz izbornik. Koristeći paradigmu OOP,
// oblikujte rješenje (hint: liga sadrži klubove i utakmice, igrači i trener imaju zajedničke elemente, ali i zasebne).
// Osoba je apstraktna klasa.
// Igrač ima osobine:
//       •	broj
// •	veličina kopačke
// •	ime, prezime
// Trener ima osobine:
//        •	Ime, prezime
// •	Godine iskustva
// Klub ima osobine:
//        •	ID
// •	Naziv
// •	Grad
// •	Trener
// Liga se sastoji od dvije kolekcije – List/ArrayList (Utakmice, Klubovi) i treba imati metode za ispis Aktivnih klubova i Ispis Utakmica.
// Utakmica ima osobine:
//        •	ID
// •	Klub domaćin
// •	Klub gost
// •	Rezultat domaćin
// •	Rezultat gost
// •	Strijelci domaći//•	Strijelci gost
// /Unesi nekoliko utakmica i ispiši podatke o odigranim utakmicama i strijelcima.
// Primjer ispisa: https://prnt.sc/SgXmdHE8dvte
//TODO update klub za bodove
// print tablice
// dodati ui za kola print

import liga.Klub;
import liga.Liga;
import liga.Utakmica;
import osoba.Igrac;
import osoba.Trener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static osoba.Trener.generirajTrenera;

public class Main {

   public static void main(String[] args) {

List<Utakmica> utakmicas = new ArrayList<>();
       for (int i = 0; i <5 ; i++) {
           Utakmica tempUtakmica =Utakmica.simulirajUtakmicu();
           utakmicas.add(tempUtakmica);
           System.out.println(tempUtakmica);
       }

      Liga hnl = new Liga(utakmicas);
       System.out.println(hnl);
       hnl.ispisKlubova();
       hnl.ispisUtakmica();
    }
}