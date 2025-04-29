package StrategyPack;

public class EasyWorkStrategy implements WorkStrategy{
    @Override
    public void executeWork() {
        System.out.println("Слишком легко");
    }

    @Override
    public Level getLevelToApply() {
        return Level.EASY;
    }

}
