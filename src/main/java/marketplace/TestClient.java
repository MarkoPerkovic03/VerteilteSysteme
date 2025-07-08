package marketplace;

import org.zeromq.SocketType;
import org.zeromq.ZMQ;
import org.zeromq.ZContext;
import com.google.gson.Gson;
import common.Order;
import common.OrderItem;
import java.util.Arrays;

public class TestClient {
    public static void main(String[] args) {
        try (ZContext context = new ZContext()) {
            ZMQ.Socket socket = context.createSocket(SocketType.REQ);
            socket.connect("tcp://localhost:5555");
            
            Gson gson = new Gson();
            
            // Create test order
            Order order = new Order(
                "TEST-001",
                "C1234",
                Arrays.asList(
                    new OrderItem("P1", 2),
                    new OrderItem("P2", 1)
                )
            );
            
            String orderJson = gson.toJson(order);
            System.out.println("Sending order: " + orderJson);
            
            // Send order
            socket.send(orderJson);
            
            // Receive response
            String response = socket.recvStr();
            System.out.println("Response: " + response);
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
} 