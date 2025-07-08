package seller;

import network.Configuration;

public class Seller {
    public static void main(String[] args) throws Exception {
        Configuration config = new Configuration("config/seller.properties");
        System.out.println("Seller started with config: " + config.get("seller.id"));
        // TODO: Implement ZeroMQ receiver and inventory management
    }
}