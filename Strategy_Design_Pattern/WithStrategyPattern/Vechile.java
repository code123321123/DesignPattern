package WithStrategyPattern;

import WithStrategyPattern.Stategy.Strategy;

public class Vechile {

    Strategy strategy;
    
    public Vechile(Strategy strategy)
    {
        this.strategy=strategy;
    }
    public void Drive()
    {
        strategy.drive();
    }

    
}
