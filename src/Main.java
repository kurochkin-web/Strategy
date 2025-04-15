import StrategyPack.Level;
import StrategyPack.WorkStrategyExecutor;

public class Main {
    public static void main(String[] args) {
        WorkStrategyExecutor workStrategyExecutor = new WorkStrategyExecutor();
        TaskerLevel worker = new TaskerLevel(workStrategyExecutor);
        worker.doWork(Level.EASY);
    }
}

