public class Student
{
    private String name; // Attribute
    private int matrikelnummer;
    private int jahrgang;

    public Student(String name, int matrikelnummer, int jahrgang) // Konstruktor, die Werte bestimmen, für 3 Objekte
    {
        this.name = name; // mit this greife ich darauf zu, .name bestimmt den Namen
        this.matrikelnummer = matrikelnummer;
        this.jahrgang = jahrgang;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getMatrikelnummer()
    {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikel)
    {
        this.matrikelnummer = matrikelnummer;
    }

    public int getJahrgang()
    {
        return jahrgang;
    }

    public void setJahrgang(int jahrgang)
    {
        this.jahrgang = jahrgang;
    }

    @Override // to String Methode wird überschrieben, toString wird verwwendet
    public String toString()
    {
        return "Name: " + getName() + ", Matrikelnummer: " + getMatrikelnummer() + ", Jahrgang: " + getJahrgang(); // soll das rückgeben
    }
}
