import java.util.Scanner;

public class EsercizioCondizioni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert your age.");
        int age = sc.nextInt();

        System.out.println("Do you have a valid ticket? (yes/no)");
        String ticket = sc.nextLine();
        boolean ticketBoolean;
        if (ticket.equals("yes")) {
            ticketBoolean = true;
            System.out.println("Your ticket is valid, we can proceed.");
        } else {
            ticketBoolean= false;
            System.out.println("Ticket not valid.");
        }

        System.out.println("Are you escorted by an adult person? (yes/no)");
        String adult = sc.nextLine();
        boolean adultBoolean;
        if (adult.equals("yes")) {
            adultBoolean=true;
            System.out.println("User escorted by an adult.");
        } else {
            adultBoolean = false;
            System.out.println("User not escorted by an adult.");
        }

        System.out.println("Did you but the 'SkipLine' option? (yes/no)");
        String skipLine = sc.nextLine();
        boolean skipLineBoolean;
        if (skipLine.equals("yes")) {
            skipLineBoolean=true;
            System.out.println("User can skip the line.");
        } else {
            skipLineBoolean = false;
            System.out.println("User can't skip the line.");
        }


        if (ticketBoolean=true && adultBoolean=true) {
            System.out.println("Choose your ride, Taxi or Bus.");
            String trasportation = sc.nextLine();

            if (trasportation.equals("taxi")) {
                System.out.println("Congratulations, you have chosen the Taxi ride.");
            } else if (trasportation.equals("bus")) {
                System.out.println("Congratulations, you have chosen the Bus ride.");
            } else{
                System.out.println("Option not valid. Please, select a valid option.");
            }
        }
    }
}
