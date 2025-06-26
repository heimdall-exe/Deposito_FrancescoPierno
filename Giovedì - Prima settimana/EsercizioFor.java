import java.util.Scanner;

public class EsercizioFor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int votesNumber = 0;

        //chiediamo all'utente il numero di dati che vuole inserire
        while (votesNumber<=0) {
                System.out.println("How many votesNumber do you want to enter?");
                votesNumber = sc.nextInt();
                //e ci assicuriamop che siano numeri positivi
                if (votesNumber<=0) {
                    System.out.println("Please, insert a positive number.");
                }
        }

        //impostiamo il voto di partenza a 0, e inseriamo i numeri
        int validVotes = 0;

        for (int i = 0; i<votesNumber; i++){
            System.out.print("Insert vote number " + (i + 1) + ": ");
            int votes = sc.nextInt();
        }

        //ora verifichiamo la validità dei numeri inseriti
        if (validVotes>=0 && validVotes<=30) {
            validVotes++;

            if (validVotes>=18 && validVotes<=24) {
                System.out.println("Sufficient.");
            } else if (validVotes>=24) {
                System.out.println("Great.");
            } else{
                System.out.println("Not sufficient, you donkey!");
            }
        } else{
            System.out.println("Incorrect vote.");
        }

        System.out.println("Number of valid votes: " + validVotes);
}
}
