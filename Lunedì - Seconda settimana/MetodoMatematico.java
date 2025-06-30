public class MetodoMatematico {

    static int quadrato(int num){//statico
        return num*num;
    }

    int cubo(int num){ //non statico
        return num*num*num;
    }
    public static void main(String[] args) {
        System.out.println(MetodoMatematico.quadrato(5));//oggetto non necessario

        MetodoMatematico pippoFranco = new MetodoMatematico();
        System.out.println(pippoFranco.cubo(5)); //oggetto necessario
    }
}
