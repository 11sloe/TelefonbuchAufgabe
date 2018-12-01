
public class Abschluss extends Listenelement
{

    public Listenelement hintenEinfuegen(Person p)
    {
        Knoten k = new Knoten(p);
        k.setNaechster(this);
        return k;
    }

    public Person getInhalt()
    {
        return null;
    }

    public Listenelement getNaechster()
    {
        return this;
    }

    public int getAnzahl()
    {
        return 0;
    }

    public void listeFuellen(int i, String[] s)
    {}


}
