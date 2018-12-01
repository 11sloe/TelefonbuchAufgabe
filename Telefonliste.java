
public class Telefonliste
{
    private Listenelement erster;

    public Telefonliste()
    {
        erster = new Abschluss();
    }

    public String[] getListe()
    {
        String[] liste = new String[getAnzahl()];
        erster.listeFuellen(0,liste);
        return liste;
    }

    public void einfuegen(Person pat)
    {
        erster = erster.hintenEinfuegen(pat);
    }


    public int getAnzahl()
    {
        return erster.getAnzahl();
    }



}
