package StrategyPack;

import java.util.List;

public class WorkStrategyExecutor {
    private static List<WorkStrategy> workStrategies =
            List.of(new HardWorkStrategy(),
                    new MediumWorkStrategy(),
                    new EasyWorkStrategy()
            );

    public static void execute(Level level) {
        for (WorkStrategy workStrategy : workStrategies) {
            if(workStrategy.getLevelToApply() == level) {
                workStrategy.executeWork();
            }
        }
    }
    
}
