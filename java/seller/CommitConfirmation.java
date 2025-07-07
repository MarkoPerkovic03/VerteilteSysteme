public class CommitConfirmation {
    private String transactionId;
    private String message;

    public CommitConfirmation(String transactionId, String message) {
        this.transactionId = transactionId;
        this.message = message;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "CommitConfirmation{" +
                "transactionId='" + transactionId + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}