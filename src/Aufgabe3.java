public class Aufgabe3
{
    public static void main (String []args)
    {
        // Integer Array mit der Größe 100
        int [] array2;
        int length = 100;
        array2 = new int [length];

        for (int i=0; i < array2.length; i++)
        {
            array2[i] = (int)(Math.random() * 100); // mit Zufallszahlen befüllen,

        }
    }
}
