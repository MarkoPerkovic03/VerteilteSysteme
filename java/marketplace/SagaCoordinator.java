package marketplace;

import java.util.ArrayList;
import java.util.List;

public class SagaCoordinator {
    private List<SagaStep> sagaSteps;
    private SagaStatus status;

    public SagaCoordinator() {
        this.sagaSteps = new ArrayList<>();
        this.status = SagaStatus.PENDING;
    }

    public void addSagaStep(SagaStep step) {
        sagaSteps.add(step);
    }

    public void executeSaga() {
        for (SagaStep step : sagaSteps) {
            try {
                step.execute();
                status = SagaStatus.SUCCESS;
            } catch (Exception e) {
                status = SagaStatus.FAILED;
                rollbackSaga();
                break;
            }
        }
    }

    private void rollbackSaga() {
        for (int i = sagaSteps.size() - 1; i >= 0; i--) {
            SagaStep step = sagaSteps.get(i);
            try {
                step.rollback();
            } catch (Exception e) {
                // Log rollback failure
            }
        }
    }

    public SagaStatus getStatus() {
        return status;
    }
}