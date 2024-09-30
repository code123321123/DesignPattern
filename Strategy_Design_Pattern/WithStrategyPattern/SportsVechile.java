package WithStrategyPattern;

import WithStrategyPattern.Stategy.SpecialDriveStrategy;

public class SportsVechile extends Vechile {

    public SportsVechile()
    {
        super(new SpecialDriveStrategy());
    }
    
}
