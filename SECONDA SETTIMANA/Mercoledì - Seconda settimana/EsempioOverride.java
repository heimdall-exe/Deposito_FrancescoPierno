public class EsempioOverride {
    
}

class Veicolo{
    //creazione di una classe genitore, definire un metodo
    
    void run(){
        System.out.println("Il veicolo è in marcia");
    }
}

class Bici extends Veicolo{
    public static void main(String[] args) {
        Bici bicicletta = new Bici();
        bicicletta.run();
    }
}

class Bici2 extends Veicolo{
    void run(){
        System.out.println("La bici sta correndo in sicurezza");
        Bici2 bicicletta2 = new Bici2();
        bicicletta2.run();
    }
}