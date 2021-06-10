package src.ua.kupaiev.hw7;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Student[] array = new Student[3];
        array[0] = new Student("Nikita", "Bronks", "BIBMI", 5);
        array[1] = new Aspirant("Samuel","Wilson","BIBMI",4);
        array[2] = new Student("Jack","Davies","BIBMI",3);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Cтипендия студента: " + array[i].lastName + " "+ array[i].getScholarship());
        }
    }
}
