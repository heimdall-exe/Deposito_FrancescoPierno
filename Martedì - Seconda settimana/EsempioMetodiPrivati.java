public class EsempioMetodiPrivati {

    private String nome;
    private int eta;
}

public Persona(String nome, int eta){
    this.nome=nome;
    this.eta=eta;
}

private boolean verificaMaggiorenne(){
    return this.eta>=18;
}

public void stampaStatus(){
    if (verificaMaggiorenne()) {
        System.out.println(this.nome + " è maggiorenne.");
    }else{
        System.out.println(this.nome + " non è maggiorenne.");
    }
}