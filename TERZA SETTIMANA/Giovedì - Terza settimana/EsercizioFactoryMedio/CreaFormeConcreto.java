package EsercizioFactoryMedio;

//PATTERN FACTORY METHOD
public class CreaFormeConcreto extends CreaForme {
    @Override
    public IShape creaForma(String tipo) {
        switch (tipo.toLowerCase()) {
            case "circle":
                return new Cerchio();
            case "square":
                return new Quadrato();
            default:
                throw new IllegalArgumentException("Tipo sconosciuto: " + tipo);
        }
    }
}