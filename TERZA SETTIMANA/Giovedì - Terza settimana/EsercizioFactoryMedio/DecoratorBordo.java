package EsercizioFactoryMedio;

//PATTERN DECORATOR
public class DecoratorBordo extends DecoratorForme {
    public DecoratorBordo(IShape forma) {
        super(forma);
    }

    @Override
    public void disegna() {
        formaDecorata.disegna();
        aggiungiBordo();
    }

    private void aggiungiBordo() {
        System.out.println("Ho aggiunto un bordo nero");
    }
}