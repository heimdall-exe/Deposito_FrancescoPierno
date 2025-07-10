// Interfaccia Strategy
public interface ProvaStrategy {
    void execute();
}

// Strategie Concrete
 class ConcreteStrategyA implements ProvaStrategy {
    public void execute() {
        System.out.println("Strategia A eseguita.");
    }
}

 class ConcreteStrategyB implements ProvaStrategy {
    public void execute() {
        System.out.println("Strategia B eseguita.");
    }
}

// Context
 class Context {
    private ProvaStrategy strategy;

    public void setStrategy(ProvaStrategy strategy) {
        this.strategy = strategy;
    }

    public void performTask() {
        strategy.execute();
    }
}

// Uso da parte del Client
Context context = new Context();
context.setStrategy(new ConcreteStrategyA());
context.performTask(); // Output: Strategia A eseguita.
context.setStrategy(new ConcreteStrategyB());
context.performTask(); // Output: Strategia B eseguita.
