public class ArrayPerCIclo {
    public static void main(String[] args) {
        int[] numeri = new int[5];
        for(int i=0; i< numeri.length; i++){
            numeri[i]=i+1;
        }

        System.out.println("ELementi dell'array: ");
        for(int i=0; i< numeri.length; i++){
            System.out.println(numeri[i] + " ");
        }

    }
}
