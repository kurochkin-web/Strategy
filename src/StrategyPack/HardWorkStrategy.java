package StrategyPack;

public class HardWorkStrategy implements WorkStrategy {

    @Override
    public void executeWork() {
        System.out.println("Это сложно");
    }

    @Override
    public Level getLevelToApply() {
        return Level.HARD;
    }
}
