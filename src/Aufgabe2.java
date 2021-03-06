import javax.swing.*;

public class Aufgabe2
{
    public static void main (String[]args)
    {
        int [] array1 = new int [Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die Länge ein!"))]; // array erstellen, das Nutzer einliest (JOptionPane), wissen die Länge nicht - new, Integer weil Zahl

        for (int i = 0; i < array1.length; i++) // mit array.length greift man auf die Länge zu, length gibt Größe des Arrays zurück
        {
            array1[i]=(int)(Math.random()*1000); // array mit Zufallszahlen befüllen, das Ergebnis darf nie über 1000 sein, math.random gibt Zufallszahl aus
        }

        // mit i=0 wird bestimmt bei welcher Zahl es startet
        //i<array.length ist die Aussage/Bedingung, wird angegeben dass i kleiner als die eingegebene Größe (vom Benutzer eingegeben) sein soll
        //i++ Zählmechanismus, wird angegegeben, dass immer eine Zahl dazu gegeben werden soll
        // mit der Eingabe darunter wird gesagt, dass die Obergrenze der Zufallszahl 1000 sein muss
        // math.random weil man eine Zufallszahl generieren möchte, Methode

        System.out.println("Vorwärts");

        for (int i = 0; i <array1.length; i++)
        {
            System.out.println(array1[i]);
        }

        System.out.println("Rückwärts"); // in umgekehrter Reihenfolge ausgeben, beginne beim höchsten platz und gehe bis 0, -1 da index bei 0 zählen beginnt und die länge aber bei 1

        for (int i = array1.length-1; i >= 0; i--) // int i =array1.length-1 weil umdrehen, definitiv größer als 0, i-- weil es soll runter gehen
        {
            System.out.println(array1[i]); // minus 1 weil, index eines nach links - zb 5 Kästchen... 4, dann 5-1 =4, so lange wie i größer gleich 0, immer eines weniger
        }
    }
}
