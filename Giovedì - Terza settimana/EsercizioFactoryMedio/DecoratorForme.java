package EsercizioFactoryMedio;

//PATTERN DECORATOR
public abstract class DecoratorForme implements IShape {
    protected IShape formaDecorata;

    public DecoratorForme(IShape shape) {
        this.formaDecorata = shape;
    }

    @Override
    public void disegna() {
        formaDecorata.disegna();
    }
}