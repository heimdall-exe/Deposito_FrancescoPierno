package EsercizioFactoryMedio;

//PATTERN FACADE
public class FacadeForma {
    private final CreaForme creatoreForme;

    public FacadeForma() {
        this.creatoreForme = new CreaFormeConcreto();
    }

    public void disegnaForme(String tipoForma, boolean conBordo, boolean conColore) {
        IShape forma = creatoreForme.creaForma(tipoForma);

        if (conBordo) {
            forma = new DecoratorBordo(forma);
        }

        if (conColore) {
            forma = new DecoratorColore(forma);
        }

        forma.disegna();
    }
}