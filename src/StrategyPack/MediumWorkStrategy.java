package StrategyPack;

public class MediumWorkStrategy implements WorkStrategy {
    @Override
    public void executeWork() {
        System.out.println("Это нормальная работа, берусь");
    }

    @Override
    public Level getLevelToApply() {
        return Level.MEDIUM;
    }
}
