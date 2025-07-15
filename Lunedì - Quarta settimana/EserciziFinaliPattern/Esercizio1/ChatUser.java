public class ChatUser implements Observer {
    private String name;
    private ChatMediator chat;

    public ChatUser(String name, ChatMediator chat) {
        this.name = name;
        this.chat = chat;
    }

    public String getName() {
        return name;
    }

    public void send(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void update(String message) {
        // Riceve e mostra il messaggio (notifica)
            System.out.println(name + " ha ricevuto: " + message);
    }
}
