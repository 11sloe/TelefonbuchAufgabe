
public class Person
{
    private String name;
    private String nummer;

    public Person(String name_, String nummer_){
        name = name_;
        nummer = nummer_;     
    }

    public String getName()
    {
        return name;
    }
    
    public String getNummer()
    {
        return nummer;
    }
    
    public String datenGeben()
    {
        return name + " | " + nummer;
    }

}
