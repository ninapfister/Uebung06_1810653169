public class Aufgabe3
{
    public static void main (String []args)
    {
        // Integer Array mit der Größe 100
        int [] array2;
        int length = 100;
        array2 = new int [length];

        for (int i=0; i < array2.length; i++) // mit array.length greift man auf die Länge zu
        {
            array2[i] = (int)(Math.random() * 100); // mit Zufallszahlen befüllen (Math.random), Obergrenze 100
        }

        // nicht vollständig
    }
}
