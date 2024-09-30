package WithStrategyPattern;

import WithStrategyPattern.Stategy.NormalDriveStrategy;

public class GoodVechile extends Vechile{


    public GoodVechile()
    {
        super(new NormalDriveStrategy());
    }
    
}
