import sum.strukturen.*;
public class Liste_fürListe_für_Wettkampf extends Liste
{
    public Liste_fürListe_für_Wettkampf()
    {
        super();
    }
    
    public Wettkampfkarte aktuelleWettkampfkarte()
    {
        return (Wettkampfkarte) this.aktuelles();
    }
    
    public void geheZurBestenKarte(int pDisziplin)
    {
        if (this.istLeer()) return;
        this.zumAnfang();
        Wettkampfkarte lBester = this.aktuelleWettkampfkarte();
        this.vor();
        while (!this.istDahinter())
        {
            if (lBester.punkte(pDisziplin) < this.aktuelleWettkampfkarte().punkte(pDisziplin))
            {
                lBester = this.aktuelleWettkampfkarte();
            }
            this.vor();
        }
        this.zumAnfang();
        while (!(lBester == this.aktuelleWettkampfkarte()))
        {
            this.vor();
        }
    }
}
