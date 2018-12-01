
public class Knoten extends Listenelement
{
    private Person inhalt;
    private Listenelement naechster;

    public Knoten(Person f)
    {
        inhalt = f;
    }

    public Listenelement hintenEinfuegen(Person p)
    {
        naechster = naechster.hintenEinfuegen(p);
        return this;
    }

    public Listenelement getNaechster()
    {
        return naechster;
    }

    public void setNaechster(Listenelement k)
    {
        naechster = k;
    }

    public  Person getInhalt()
    {
        return inhalt;
    }

    public int getAnzahl()
    {
        return naechster.getAnzahl() + 1;
    }

    public void listeFuellen(int i, String[] s)
    {
        s[i] = inhalt.datenGeben();
        naechster.listeFuellen(i+1,s);
    }


}
