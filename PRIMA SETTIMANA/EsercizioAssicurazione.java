import java.util.Scanner;

public class EsercizioAssicurazione {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //impostiamo il prezzo base e poniamo tutte le domande di rito all'utente, raccogliendo i dati necessari per elaborarli
        double basePrice = 500;
        //variazioni in base all'età

        System.out.println("Insert your age.");
        int age = sc.nextInt();

        if (age>=18 && age<=25) {
            basePrice = basePrice+(basePrice*0.20);
            System.out.println("Price up by 20%.");
        } else if(age>=26 && age <=50){
            basePrice = basePrice;
            System.out.println("No price variations.");
        }else if (age>50) {
            basePrice = basePrice + (basePrice*0.10);
        } else{
            System.out.println("Insert a valid age number.");
            return;
        }

        //variazioni in base all'esperienza alla guida

        System.out.println("How many years of driving experience do you have?");
        int drivingExp = sc.nextInt();

        if (drivingExp<2) {
            basePrice = basePrice + (basePrice*1.3);
        } else if (drivingExp>=2) {
            basePrice = basePrice;
            System.out.println("No price variations.");
        }

        //variazioni in base al numero di incidenti

        System.out.println("How many incidents did you have in the last 5 years?");
        int incidents = sc.nextInt();

        switch (incidents) {
            case 1:
                if (incidents==0) {
                    System.out.println("No incidents, no price variation.");
                }
                break;
        
            case 2:
            if (incidents==1) {
                basePrice = basePrice + (basePrice*0.015);
                System.out.println("Price up by 15%.");
            }
                break;

                case 3:
            if (incidents>=2 && incidents<4) {
                basePrice = basePrice + (basePrice*0.3);
                System.out.println("Price up by 30%.");
            }
                break;

                case 4:
            if (incidents>=4) {
                System.out.println("Too many incidents, you are unsuitable for an insurance.");
            }
                break;
        }

        //variazioni in base al pacchetto assicurativo

        System.out.println("Which insurance package did you select? (premium, medium, base)");
        String pack = sc.nextLine();     
    
        if (pack.equals("premium")) {
            basePrice = basePrice +(basePrice*0.5);
            System.out.println("Price up by 50% for premium package.");
        } else if (pack.equals("medium")) {
            basePrice = basePrice + (basePrice*0.20);
            System.out.println("Price up by 20% for medium package.");
        } else if (pack.equals("base")) {
            basePrice = basePrice;
            System.out.println("No price variations for base package.");
        } else{
            System.out.println("Invalid package option.");
        }

        System.out.println("Final price for your insurance plan is: " + basePrice + "." );
    }

}
