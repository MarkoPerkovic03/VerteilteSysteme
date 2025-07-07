package network;

public class Message {
    private String content;
    private MessageType messageType;

    public Message(String content, MessageType messageType) {
        this.content = content;
        this.messageType = messageType;
    }

    public String getContent() {
        return content;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                ", messageType=" + messageType +
                '}';
    }
}