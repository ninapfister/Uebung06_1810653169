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

        // Aufgabe 5

        List<Student> students = new ArrayList<>(); //ArrayList, <> Liste von Studenten, mit Konstruktor neue Studenten erstellen, in der Liste

        students.add(new Student("Nina", 1810653169, 1997)); // 3 Objekte vom Typ Student
        students.add(new Student("Sabrina", 1810653748, 1993)); //mit add fügt man den Student der Liste hinzu
        students.add(new Student("Martin", 1810653444, 1992));

        for (Student item : students) // mit item greift man auf die Studenten zu, for-each-Schleife
        {
            System.out.println(item.toString()); // gibt mit der Methode to String aus, würde auch ohne toString gehen, aber man macht es meistens weil sonst speicherort (z.B. St5e78) von String wiedergegeben und nicht inhalt
        }
    }
}
