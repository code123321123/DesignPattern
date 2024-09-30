package WithStrategyPattern;

import WithStrategyPattern.Stategy.NormalDriveStrategy;

public class PassengerDriveStrategy extends Vechile{

    public PassengerDriveStrategy()
    {
        super(new NormalDriveStrategy());
    }
    
}
