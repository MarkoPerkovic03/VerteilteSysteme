public class SagaTransaction {
    private String transactionId;
    private String status;
    private List<SagaStep> steps;

    public SagaTransaction(String transactionId) {
        this.transactionId = transactionId;
        this.status = "PENDING";
        this.steps = new ArrayList<>();
    }

    public void addStep(SagaStep step) {
        steps.add(step);
    }

    public void execute() {
        for (SagaStep step : steps) {
            if (!step.execute()) {
                rollback();
                return;
            }
        }
        status = "COMPLETED";
    }

    private void rollback() {
        for (int i = steps.size() - 1; i >= 0; i--) {
            steps.get(i).rollback();
        }
        status = "ROLLED_BACK";
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getStatus() {
        return status;
    }
}