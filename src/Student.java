public class Student
{
    private String name; // Attribute
    private int matrikelnummer;
    private int jahrgang;

    public Student(String name, int matrikelnummer, int jahrgang) // Konstruktor, die Werte bestimmen
    {
        this.name = name; // mit this greife ich darauf zu, .name bestimmt den Namen
        this.matrikelnummer = matrikelnummer;
        this.jahrgang = jahrgang;
    }

    @Override // to String Methode wird mit Override implementiert
    public String toString()
    {
        return "Name: " + name + ", Matrikelnummer: " + matrikelnummer + ", Jahrgang: " + jahrgang; // soll das rückgeben
    }
}
