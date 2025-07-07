package marketplace;

public class SagaStep {
    private String stepName;
    private SagaStepType stepType;
    private SagaStatus status;

    public SagaStep(String stepName, SagaStepType stepType) {
        this.stepName = stepName;
        this.stepType = stepType;
        this.status = SagaStatus.PENDING; // Default status
    }

    public String getStepName() {
        return stepName;
    }

    public SagaStepType getStepType() {
        return stepType;
    }

    public SagaStatus getStatus() {
        return status;
    }

    public void setStatus(SagaStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SagaStep{" +
                "stepName='" + stepName + '\'' +
                ", stepType=" + stepType +
                ", status=" + status +
                '}';
    }
}