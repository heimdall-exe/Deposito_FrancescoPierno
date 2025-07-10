package EsercizioAsiloPokèmon;

public class Pokemon {
    private String nome, tipo;
    private int eta;

    public Pokemon (String nome, String tipo, int eta){
        this.nome=nome;
        this.tipo=tipo;
        this.eta=eta;
    }

    public void faiVerso(){
        System.out.println("Verso generico...");
    }

    public void stampaPokeInfo() {
        System.out.println("Nome Pokèmon: " + nome + "\nTipo: " + tipo + "\nEta: " + eta);

        faiVerso();
    }
}
