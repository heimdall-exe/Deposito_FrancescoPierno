public class ProvaOperatori {
    public static void main(String[] args) {
        // l'operatore += aggiunge piuttosto che sostituire
        int x=10;
        x+=5;
        System.out.println(x); //il risultato sarà 15

        //operatori aritmetici
        System.out.println(x+10); //il risultato sarà 20

        System.out.println(x-10); //il risultato sarà 0

        System.out.println(x*10); //il risultato sarà 100

        System.out.println(x/2); //il risultato sarà 5

        System.out.println(x%3); //il risultato sarà 1

        System.out.println(x*10); //il risultato sarà 100

        
        //operatori di confronto

        System.out.println(x>5); //il risultato sarà true

        System.out.println(x<5); //il risultato sarà false

        System.out.println(x>=10); //il risultato sarà true

        System.out.println(x==10); //il risultato sarà true

        System.out.println(x!=10); //il risultato sarà false

        //operatori logici
        System.out.println(x>2 && x<23); //il risultato sarà true

        System.out.println(x>2 || x<23); //il risultato sarà true

        System.out.println (!(x>2 && x<23)); //il risultato sarà false
    }
}
