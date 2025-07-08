package EsercizioDecoratorMedio;

//creo questo affare per centralizzare la "decorazione", fargli fare da classe base per i decorators bacon e formaggio 
//ed evitare di dover sempre ripetere roba
public abstract class HamburgerDecorator implements Hamburger {
    protected Hamburger hamburger;

    public HamburgerDecorator(Hamburger hamburger){
        this.hamburger=hamburger;
    }
}
