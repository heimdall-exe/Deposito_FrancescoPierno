import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EsercizioArrayList {
    //impostiamo l'arraylist e le solite cose
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        //Gestiamo l'inserimento degli studenti

        String name;

        do{
            System.out.println("Insert the students name. If you want to exit, type 'end'.");
            name = sc.nextLine();

            if (!name.equals("end")) {
                students.add(name);
            }
        } while (!name.equals("end"));

        //ordine alfabetico
        Collections.sort(students);

        System.out.println("\nList of students in alphabetical order: ");
        for (String student : students) {
            System.out.println(student);
        }
        

        //numero di studenti
        System.out.println("Number of all students is: " + students.size());

        //metodo per eliminare studenti dalla lista (si, come Hitman)
        System.out.println("Do you want to delete a student from the list? (Type yes/no)");
        String hitman = sc.nextLine();

        if (hitman.equals("yes")) {
            System.out.println("Enter the student you want to delete: ");
            String toDelete = sc.nextLine();

            if (students.remove(toDelete)) {
                System.out.println("Student succesfully executed-EHM deleted. I meant deleted.");
            }else{
                System.out.println("Student name not found.");
            }
        }

        //stampiamo una lista finale con tutte le modifiche
        System.out.println("Final list: ");

        for (String student : students) {
            System.out.println(student);
        }

        sc.close();
    }
}