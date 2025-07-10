package EsempioDecorator;

import javax.swing.plaf.basic.ComboPopup;

public interface Component {
    void operation();
}

public class concreteComponent implements Component{
    public void operation(){
        System.out.println("Operazione base");
    }
}

//decoratore astratto
public abstract class Decorator implements Component{
    protected Component component;

    public Decorator (Component component){
        this.component=component;
    }

    public void operation(){
        component.operation();
    }
}

//decoratore concreto
public class concreteDecoratorA extends Decorator{
    public concreteDecoratorA(Component component){
        super(component);
    }

    public void operation(){
        super.operation();
        System.out.println("Aggiunta funzionalità A");
    }
}