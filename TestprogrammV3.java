public class testprogramm
{
    Wettkampfkarte Karte0;
    Wettkampfkarte Karte1;
    Wettkampfkarte Karte2;
    Wettkampfkarte Karte3;
    Wettkampfkarte Karte4;
    Wettkampfkarte Karte5;

    public testprogramm()
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
        
        Karte1 = new Wettkampfkarte("Arschmann", "Mattias", "c", 12);
        Karte1.setzePunkte(1, 320);
        Karte1.setzePunkte(2, 220);
        Karte1.setzePunkte(3, 720);
        
        Karte2 = new Wettkampfkarte("Trump", "Donald", "b", 9);
        Karte2.setzePunkte(1, 32);
        Karte2.setzePunkte(2, 340);
        Karte2.setzePunkte(3, 830);
        
        Karte3 = new Wettkampfkarte("straub", "Melanie", "c", 11);
        Karte3.setzePunkte(1, 320);
        Karte3.setzePunkte(2, 90);
        Karte3.setzePunkte(3, 940);
        
        Karte4 = new Wettkampfkarte("Nachname", "Vorname", "abc", 123);
        Karte4.setzePunkte(1, 123);
        Karte4.setzePunkte(2, 234);
        Karte4.setzePunkte(3, 345);
        
        Karte5 = new Wettkampfkarte("Langer", "Franz", "a", 10);
        Karte5.setzePunkte(1, 87);
        Karte5.setzePunkte(2, 13);
        Karte5.setzePunkte(3, 7);
        
        zeigeKarte(Karte0);
        zeigeKarte(Karte1);
        zeigeKarte(Karte2);
        zeigeKarte(Karte3);
        zeigeKarte(Karte4);
        zeigeKarte(Karte5);
    }
    
    private void zeigeKarte(Wettkampfkarte pKarte)
    {
        System.out.println();
        System.out.println("+--------------------------+");
        System.out.println("|      Wettkampfkarte      |");
        System.out.println("+--------------------------+");
        System.out.println("| Name: " + pKarte.name());
        System.out.println("| Vorname: " + pKarte.vorname());
        System.out.println("| Klasse: " + pKarte.klasse());
        System.out.println("| Jahrgang: " + pKarte.jahrgang());
        System.out.println("+--------------------------+");
        System.out.println("| Gesamt: " + pKarte.punkte(0));
        System.out.println("| Lauf: " + pKarte.punkte(1));
        System.out.println("| Sprung: " + pKarte.punkte(2));
        System.out.println("| Wurf: " + pKarte.punkte(3));
        System.out.println("+--------------------------+");
        System.out.println();
    }
}
