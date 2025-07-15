public class ChatMain {
    public static void main(String[] args) {
        GameChat chat = new GameChat();

        ChatUser gennaro = new ChatUser("Gennaro Bullo", chat);
        ChatUser beppe = new ChatUser("Beppe Braida", chat);
        ChatUser gabibbo = new ChatUser("Il Gabibbo", chat);

        chat.addUser(gennaro);
        chat.addUser(beppe);
        chat.addUser(gabibbo);

        gennaro.send("Uè uagliù! Sono pronto ad arrubbarvi tutti i Pokèmmònn!!!");
        beppe.send("Gennaro ma che cazzo dici, non si fa!");
        gabibbo.send("BELANDI BESUGHIIIIIII!!!");
    }
}