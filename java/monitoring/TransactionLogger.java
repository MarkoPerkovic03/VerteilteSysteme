package monitoring;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class TransactionLogger {
    private String logFilePath;

    public TransactionLogger(String logFilePath) {
        this.logFilePath = logFilePath;
    }

    public void logTransaction(String transactionDetails) {
        String timestamp = LocalDateTime.now().toString();
        String logEntry = timestamp + " - " + transactionDetails;

        try (FileWriter writer = new FileWriter(logFilePath, true)) {
            writer.write(logEntry + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}