import StrategyPack.Level;
import StrategyPack.WorkStrategyExecutor;

public class TaskerLevel {

    private WorkStrategyExecutor workStrategy;

    public TaskerLevel(WorkStrategyExecutor workStrategyExecutor) {
        this.workStrategy = workStrategyExecutor;
    }

    public void doWork(Level level) {
        WorkStrategyExecutor.execute(level);
    }
}
