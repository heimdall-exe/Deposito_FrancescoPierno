//interface
interface EuropeanSocket {
    void giveElectricity();
}

class AmericanSocket{
    void provideElectricity() {
        System.out.println("Elettricità: fornita");
    }
}


//Adapter
class SocketAdapter implements EuropeanSocket { //implementa europeansocket...
    private AmericanSocket americanSocket;//...ma utilizza americansocket

    public SocketAdapter(AmericanSocket socket) {
        this.americanSocket = socket;
    }

    @Override
    public void giveElectricity() {
        System.out.println("Adattatore in uso.");
        americanSocket.provideElectricity();
    }
}
//IL DISPOSITIVO EUROPEO DI MERDA, BORCO PIO
class EuropeanDevice {
    public void plugIn(EuropeanSocket socket) {
        System.out.println("Dispositivo europeo DEL CAZZO collegato MANNAGGIA A CHI SO IO ");
        socket.giveElectricity();
    }
}

//Client
 class Client {
    public static void main(String[] args) {
        AmericanSocket americanSocket = new AmericanSocket();
        EuropeanSocket adapter = new SocketAdapter(americanSocket);

        EuropeanDevice device = new EuropeanDevice();

        //Collegamento
        device.plugIn(adapter);
    }
}