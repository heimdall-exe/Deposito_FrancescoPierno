import java.util.Scanner;

public class EsercizioGiganteUltraSuperSayian {
    
        //IL PRIMO
    public static int sum (int a, int b){
            return a+b; 
    }
        //IL SECONDO
    public static int multiply(int a, int b){
        return a*b;
    }

    public static double multiply (double a, double b, double c){
        return a*b*c;
    }

        //IL TERZO
    public static int sumNaturals (int a){
        if (a==1) {
            return 1;

        } else{
            return a+sumNaturals(a-1);
        }
}
        //IL QUARTO
    public static void modifyVariable(int n){
        n = n+10;

        System.out.println("Variable has been modified: " + n);
    }
    
    public static void modifyArray(int [] array){
        array[0]=999;
        System.out.println("Array has been modified: " + array[0]);   //questo dell'array te l'ho proprio copiato per far funzionare
                                                                    // non avevo minimamente idea di come poterlo fare, 0 assoluto SCUSA MIRKO <3
        }

        //IL MENU
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int selection;

        do{
            System.out.println("\n SELECTION MENU");
            System.out.println("1. Sum two numbers.");
            System.out.println("2. Multiplication with overload.");
            System.out.println("3. Recursive sum.");
            System.out.println("4. Pass by value and by reference.");
            System.out.println("0. Exit.");
            System.out.println("SELECT YOUR OPTION");
            selection = sc.nextInt();
            

            switch (selection) {
                case 1 -> { //esercizio 1
                    System.out.println("Select first number.");
                    int a = sc.nextInt();
                    System.out.println("Select second number.");
                    int b = sc.nextInt();

                    System.out.println("The sum of your numbers is: " + sum(a, b));
                }

                case 2 -> { //esercizio 2
                    System.out.println("1. Multiply two INT");
                    System.out.println("2. Multiply three DOUBLE");
                    int type = sc.nextInt();

                    if (type == 1) {
                        System.out.print("Insert two INT: ");
                        int x = sc.nextInt();
                        int y = sc.nextInt();
                        System.out.println("The result of your multiplication is : " + multiply(x, y));
                    } else {
                        System.out.print("Insert three DOUBLE: ");
                        double x = sc.nextDouble();
                        double y = sc.nextDouble();
                        double z = sc.nextDouble();
                        System.out.println("The result of your multiplication is : " + multiply(x, y, z));
                    }
                }
                
                case 3 ->{//esercizio 3
                    System.out.print("Insert a number: ");
                    int a = sc.nextInt();
                    System.out.println("The result of your recursive sum is : " + sumNaturals(a));
                }

                case 4 ->{ //esercizio 4
                        int var = 5;
                    int[] array = {1, 2, 3};

                    System.out.println("Before the modification:");
                    System.out.println("Variable: " + var);
                    System.out.println("Array: " + array[0]);

                    modifyVariable(var);
                    modifyArray(array);

                    System.out.println("After the modification:");
                    System.out.println("Variable: " + var); 
                    System.out.println("Array: " + array[0]);          
                    //manco col menu l'ho capito CHIEDO UMILMENTE VENIA MAESTRO
                }

                case 0 -> System.out.println("Exiting the program. Farewell.");
                
                default -> System.out.println("Selection not valid. Please, select a correct operation from the menu.");
                
            }
        } while (selection!=0); 
            
        sc.close();
    }
}