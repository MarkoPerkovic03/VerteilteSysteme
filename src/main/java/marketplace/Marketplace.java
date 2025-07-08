package marketplace;

import common.Order;
import network.Configuration;
import org.zeromq.SocketType;
import org.zeromq.ZMQ;
import org.zeromq.ZContext;
import com.google.gson.Gson;

public class Marketplace {
    private final String id;
    private final ZContext context;
    private final ZMQ.Socket socket;
    private final Gson gson;
    private final SagaCoordinator sagaCoordinator;

    public Marketplace(String id, String bindAddress) {
        this.id = id;
        this.context = new ZContext();
        this.socket = context.createSocket(SocketType.REP);
        this.socket.bind(bindAddress);
        this.gson = new Gson();
        this.sagaCoordinator = new SagaCoordinator();
        
        System.out.println("Marketplace " + id + " started on " + bindAddress);
    }

    public void start() {
        System.out.println("Marketplace " + id + " listening for orders...");
        
        while (!Thread.currentThread().isInterrupted()) {
            try {
                String message = socket.recvStr();
                if (message != null) {
                    System.out.println("Received order: " + message);
                    
                    // Parse order
                    Order order = gson.fromJson(message, Order.class);
                    
                    // Process order
                    processOrder(order);
                    
                    // Send response
                    socket.send("Order " + order.getOrderId() + " received by " + id);
                }
            } catch (Exception e) {
                System.err.println("Error processing message: " + e.getMessage());
            }
        }
    }

    private void processOrder(Order order) {
        System.out.println("Processing order " + order.getOrderId() + " for customer " + order.getCustomerId());
        System.out.println("Items: " + order.getItems().size());
        
        // TODO: Implement SAGA coordination with sellers
        // For now, just log the order
    }

    public void stop() {
        socket.close();
        context.close();
    }

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("Usage: java -cp target/distributed-marketplace-1.0-SNAPSHOT.jar marketplace.Marketplace <marketplace_id>");
            return;
        }
        
        String marketplaceId = args[0];
        String bindAddress = "tcp://*:5555";
        
        Marketplace marketplace = new Marketplace(marketplaceId, bindAddress);
        
        // Add shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down marketplace " + marketplaceId);
            marketplace.stop();
        }));
        
        marketplace.start();
    }
} 