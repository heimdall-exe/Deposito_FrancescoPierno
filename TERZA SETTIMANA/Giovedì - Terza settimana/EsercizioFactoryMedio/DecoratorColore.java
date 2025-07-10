package EsercizioFactoryMedio;

//PATTERN DECORATOR
public class DecoratorColore extends DecoratorForme {
    public DecoratorColore(IShape forma) {
        super(forma);
    }

    @Override
    public void disegna() {
        formaDecorata.disegna();
        colora();
    }

    private void colora() {
        System.out.println("Ho colorato la forma di rosso");
    }
}