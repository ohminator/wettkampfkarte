import java.util.ArrayList;
public class Wettkampfliste
{
    ArrayList<Wettkampfkarte> teilnehmer = new ArrayList<Wettkampfkarte>();
    Wettkampfkarte Karte0;
    Wettkampfkarte Karte1;
    Wettkampfkarte Karte2;
    Wettkampfkarte Karte3;
    Wettkampfkarte Karte4;
    Wettkampfkarte Karte5;

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
        Karte0 = new Wettkampfkarte("Büchner", "Georg", "a", 11);
        Karte0.setzePunkte(1, 270);
        Karte0.setzePunkte(2, 140);
        Karte0.setzePunkte(3, 610);
        teilnehmer.add(Karte0);
        
        Karte1 = new Wettkampfkarte("Schmidt", "Anne", "c", 12);
        Karte1.setzePunkte(1, 320);
        Karte1.setzePunkte(2, 220);
        Karte1.setzePunkte(3, 720);
        teilnehmer.add(Karte1);
        
        Karte2 = new Wettkampfkarte("Mustermann", "Max", "b", 9);
        Karte2.setzePunkte(1, 32);
        Karte2.setzePunkte(2, 340);
        Karte2.setzePunkte(3, 830);
        teilnehmer.add(Karte2);
        
        Karte3 = new Wettkampfkarte("Musterfrau", "Melanie", "c", 11);
        Karte3.setzePunkte(1, 320);
        Karte3.setzePunkte(2, 90);
        Karte3.setzePunkte(3, 940);
        teilnehmer.add(Karte3);
        
        Karte4 = new Wettkampfkarte("Nachname", "Vorname", "abc", 123);
        Karte4.setzePunkte(1, 123);
        Karte4.setzePunkte(2, 234);
        Karte4.setzePunkte(3, 345);
        teilnehmer.add(Karte4);
        
        Karte5 = new Wettkampfkarte("Langer", "Franz", "a", 10);
        Karte5.setzePunkte(1, 87);
        Karte5.setzePunkte(2, 13);
        Karte5.setzePunkte(3, 7);
        teilnehmer.add(Karte5);
    }
    
    public void zeigeAnzahlTeilnehmer()
    {
        cls();
        // System.out.println(teilnehmer);
        System.out.println(teilnehmer.size());
        // System.err.println(teilnehmer); // für roten Text
    }
    
    public void zeigeKarte(int nKarte)
    {
        System.out.println();
        System.out.println("+--------------------------+");
        System.out.println("|      Wettkampfkarte  " + nKarte + "   |");
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
    
    public void topLauf()
    {
        int hoechsterWert = 0;
        int hoechsteKarte = 0;
        for (int i = 0; i <= (teilnehmer.size())-1; i++)
        {
            if (teilnehmer.get(i).punkte(1) >= hoechsterWert)
            {
                hoechsterWert = teilnehmer.get(i).punkte(1);
                hoechsteKarte = i;
            }
        }
        zeigeKarte(hoechsteKarte);
    }
    
    public void topSprung()
    {
        int hoechsterWert = 0;
        int hoechsteKarte = 0;
        for (int i = 0; i <= (teilnehmer.size())-1; i++)
        {
            if (teilnehmer.get(i).punkte(2) >= hoechsterWert)
            {
                hoechsterWert = teilnehmer.get(i).punkte(2);
                hoechsteKarte = i;
            }
        }
        zeigeKarte(hoechsteKarte);
    }
    
    public void topWurf()
    {
        int hoechsterWert = 0;
        int hoechsteKarte = 0;
        for (int i = 0; i <= (teilnehmer.size())-1; i++)
        {
            if (teilnehmer.get(i).punkte(3) >= hoechsterWert)
            {
                hoechsterWert = teilnehmer.get(i).punkte(3);
                hoechsteKarte = i;
            }
        }
        zeigeKarte(hoechsteKarte);
    }
}
