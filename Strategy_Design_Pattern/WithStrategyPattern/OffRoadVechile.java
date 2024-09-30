package WithStrategyPattern;

import WithStrategyPattern.Stategy.SpecialDriveStrategy;

public class OffRoadVechile extends Vechile{
    
public OffRoadVechile()
{
    super(new SpecialDriveStrategy());
}

}
