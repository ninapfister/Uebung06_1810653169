public class Freund
{
    private String name; // getter und setter

    public Freund(String name) //Konstruktor
    {
        this.name = name;
    }

    public String getName() // getter
    {
        return name;
    }

    public void setName(String name) // setter
    {
        this.name = name;
    }

    @Override // überschreiben
    public String toString()  // toString Methode
    {
        return "Freund: " + name; //gibt die Freunde aus
    }
}
