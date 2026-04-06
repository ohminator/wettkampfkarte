import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Wettkampfliste.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wettkampfliste
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    ArrayList<Wettkampfkarte> teilnehmer = new ArrayList<Wettkampfkarte>();
    Wettkampfkarte Karte1;
    Wettkampfkarte Karte2;
    Wettkampfkarte Karte3;
    Wettkampfkarte Karte4;

    /**
     * Konstruktor für Objekte der Klasse Wettkampfliste
     */
    public Wettkampfliste()
    {
        // Instanzvariable initialisieren
        
    }
    
    private void cls()
    {
        for (int i = 0; i <= 50; i++)
        {
            System.out.println();
        }
    }
    
    public void erzeueTestKarten()
    {
        Karte1 = new Wettkampfkarte("Büchner", "Georg", "a", 11);
        Karte1.setzePunkte(1, 270);
        Karte1.setzePunkte(2, 140);
        Karte1.setzePunkte(3, 610);
        teilnehmer.add(Karte1);
        
        Karte2 = new Wettkampfkarte("Schmidt", "Anne", "c", 12);
        Karte2.setzePunkte(1, 320);
        Karte2.setzePunkte(2, 220);
        Karte2.setzePunkte(3, 720);
        teilnehmer.add(Karte2);
        
        Karte3 = new Wettkampfkarte("Mustermann", "Max", "b", 9);
        Karte3.setzePunkte(1, 32);
        Karte3.setzePunkte(2, 340);
        Karte3.setzePunkte(3, 830);
        teilnehmer.add(Karte3);
        
        Karte4 = new Wettkampfkarte("Musterfrau", "Melanie", "c", 11);
        Karte4.setzePunkte(1, 320);
        Karte4.setzePunkte(2, 90);
        Karte4.setzePunkte(3, 940);
        teilnehmer.add(Karte4);
    }
    
    public void zeigeAnzahlTeilnehmer()
    {
        cls();
        // System.out.println(teilnehmer);
        System.out.println(teilnehmer.size());
        // System.err.println(teilnehmer); // für roten Text
    }
    
    public void zeigeKarte(int tKarte)
    {
        int nKarte = tKarte - 1;
        System.out.println();
        System.out.println("+--------------------------+");
        System.out.println("|      Wettkampfkarte  " + tKarte + "   |");
        System.out.println("+--------------------------+");
        System.out.println("| Name: " + teilnehmer.get(nKarte).name());
        System.out.println("| Vorname: " + teilnehmer.get(nKarte).vorname());
        System.out.println("| Klasse: " + teilnehmer.get(nKarte).klasse());
        System.out.println("| Jahrgang: " + teilnehmer.get(nKarte).jahrgang());
        System.out.println("+--------------------------+");
        System.out.println("| Gesamt: " + teilnehmer.get(nKarte).punkte(0));
        System.out.println("| Lauf: " + teilnehmer.get(nKarte).punkte(1));
        System.out.println("| Sprung: " + teilnehmer.get(nKarte).punkte(2));
        System.out.println("| Wurf: " + teilnehmer.get(nKarte).punkte(3));
        System.out.println("+--------------------------+");
        System.out.println();
    }
}
