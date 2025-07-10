import java.util.Scanner;

public class EsercizioGaraSportiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //richiesta e raccolta dei dati
        System.out.println("Insert your age.");
        int age = sc.nextInt();

        System.out.println("Insert your best time on the 100 meters run (in seconds)");
        int bestTime = sc.nextInt();

        System.out.println("Insert your height.");
        double height = sc.nextDouble();

        System.out.println("Insert your weight.");
        double weight= sc.nextDouble();


        //calcolo BMI
        double bmi = weight / Math.pow(height, 2);

        //verifica delle condizioni richieste
        boolean validAge = (age <= 40 && age >= 18);
        boolean validTimeRecord = (bestTime>=1 && bestTime<=12);
        boolean validBMI = (bmi<25);

        //stampiamo la risposta in base ai dati raccolti

        if (validAge && validTimeRecord && validBMI) {
            System.out.println("You are admitted to the race!");
        } else{
            System.out.println("You are not admitted to the race!");
        }
    }
}
