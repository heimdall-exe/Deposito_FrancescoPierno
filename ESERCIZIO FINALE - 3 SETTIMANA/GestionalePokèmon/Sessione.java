package GestionalePokèmon;

//SINGLETON
public class Sessione {
    private static Sessione instance;
    private Allenatore allenatore;

    private Sessione() {}

    public static Sessione getInstance() {
        if (instance == null) {
            instance = new Sessione();
        }
        return instance;
    }

    public void setAllenatore(Allenatore allenatore) {
        this.allenatore = allenatore;
    }

    public Allenatore getAllenatore() {
        return allenatore;
    }

    public void logout() {
        this.allenatore = null;
    }
}