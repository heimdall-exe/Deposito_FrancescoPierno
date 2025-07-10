package EsercizioSingleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger istanza; 

    private Logger() {}

    public static Logger GetIstanza() {
        if (istanza == null) {
            istanza = new Logger();
        }
        return istanza;
    }

    public void ScriviMessaggio(String messaggio) {
        LocalDateTime ora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("[" + ora.format(formatter) + "] " + messaggio);
    }
}
