package network;

public enum MessageType {
    RESERVE_PRODUCT,
    RESERVE_CONFIRM,
    RESERVE_REJECT,
    COMMIT_ORDER,
    ROLLBACK_ORDER,
    HEARTBEAT
} 