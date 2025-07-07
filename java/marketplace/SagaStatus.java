package marketplace;

public enum SagaStatus {
    PENDING,      // The saga is pending and has not yet started
    IN_PROGRESS,  // The saga is currently in progress
    COMPLETED,    // The saga has completed successfully
    FAILED,       // The saga has failed
    ROLLED_BACK;  // The saga has been rolled back due to failure
}