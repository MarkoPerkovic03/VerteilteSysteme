package network;

import org.zeromq.ZContext;
import org.zeromq.ZMQ;

public class NetworkManager {
    private ZContext context;
    private ZMQ.Socket socket;

    public NetworkManager(String address) {
        context = new ZContext();
        socket = context.createSocket(ZMQ.REQ);
        socket.connect(address);
    }

    public void sendMessage(String message) {
        socket.send(message);
    }

    public String receiveMessage() {
        return socket.recvStr();
    }

    public void close() {
        socket.close();
        context.close();
    }
}