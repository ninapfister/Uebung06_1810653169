import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main (String []args)
    {
        //Aufgabe 4

        List<Freund> freunde = new ArrayList<>(); // <Freund> der Datentyp, den die Liste enthält wird angegeben

        for (int i = 0; i < 5; i++) // es sollen nicht mehr als 5 Freunde eingegeben werden
        {
            freunde.add(new Freund(JOptionPane.showInputDialog("Bitte " + (i + 1) + " Freund eingeben:"))); // mit freunde.add füge ich hinzu zu Liste, neuen Freund - new
        }

        for (int i=0; i <5; i++)
        {
            System.out.println(freunde.get(i).toString()); // ausgeben, get i greift auf Freund zu, mit toString Methode
        }
    }
}
