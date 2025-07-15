//interfaccia per centralizzare la comunicazione    
interface ChatMediator {
    void sendMessage(String message, ChatUser sender);
    void addUser(ChatUser user);
}
