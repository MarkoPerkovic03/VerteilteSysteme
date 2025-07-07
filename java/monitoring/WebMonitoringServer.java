import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class WebMonitoringServer {

    private HttpServer server;

    public WebMonitoringServer(int port) throws IOException {
        server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext("/metrics", new MetricsHandler());
        server.setExecutor(null); // creates a default executor
    }

    public void start() {
        server.start();
        System.out.println("WebMonitoringServer started on port " + server.getAddress().getPort());
    }

    public void stop() {
        server.stop(0);
        System.out.println("WebMonitoringServer stopped.");
    }

    private static class MetricsHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response = "Metrics data will be displayed here.";
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

    public static void main(String[] args) {
        try {
            WebMonitoringServer server = new WebMonitoringServer(8080);
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}