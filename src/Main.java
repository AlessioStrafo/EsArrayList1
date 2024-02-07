//Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con n elementi e stamparlo in console.
//Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Student studente1 = new Student("Mario", 20);
//        Student studente2 = new Student("Romina", 22);
//        Student studente3 = new Student("Pietro", 24);
//        Student studente4 = new Student("Maria", 25);
//
//        List<Student> studente = new ArrayList<>();
//        studente.add(studente1);
//        studente.add(studente2);
//        studente.add(studente3);
//        studente.add(studente4);
//        System.out.println(studente);

        ArrayList<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Raul", 43));
        studenti.add(new Student("Gioia",20));
        for (Student student:studenti) {
            System.out.println(student);
        }
        System.out.println("-------------------------");
        studenti.add(new Student("Gabri",22));
        studenti.add(new Student("Mario",24));
        studenti.add(new Student("Maria",28));
        studenti.add(new Student("Teresa",21));

        for (Student student:studenti){
            System.out.println(student);
        }
    }
}