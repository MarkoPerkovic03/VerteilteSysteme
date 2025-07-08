package network;

import java.io.Serializable;

public class Message implements Serializable {
    private MessageType type;
    private String payload;
    private String correlationId;

    public Message(MessageType type, String payload, String correlationId) {
        this.type = type;
        this.payload = payload;
        this.correlationId = correlationId;
    }

    public MessageType getType() {
        return type;
    }

    public String getPayload() {
        return payload;
    }

    public String getCorrelationId() {
        return correlationId;
    }
} 