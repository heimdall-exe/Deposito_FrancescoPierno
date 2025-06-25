public class ProvaCondizioni {

    //PROVA IF
    public static void main(String[] args) {
        if (20>10){
            System.out.println("20 is greater than 10");
        }
        //se le condizioni tra parentesi sono true, stampa il risultato
        int x = 10;
        int y = 5;
        if (x>y){
            System.out.println("x is greater than y");
        }
    //PROVA ELSE
        //se le condizioni tra parentesi sono true, stampa il primo risultato, altrimenti stampa il secondo
        int time = 24;
        if (time<=12) {
            System.out.println("Good morning");
        } else {
            System.out.println("Good evening");
        }

    //PROVA ELSE-IF
        //se le condizioni dell'if e dell'else-if sono vere, stampa quella vera, altrimenti va nell'else

        int day = 24;
        if (day<=12) {
            System.out.println("Good morning");
        } else if(day>12 && day<20){
            System.out.println("Good day");
        } else{
            System.out.println("Good evening");
        }
            
        }
}