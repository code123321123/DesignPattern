package WithStrategyPattern.Stategy;

public class SpecialDriveStrategy implements Strategy {

    @Override
    public void drive() {
        System.out.println("Special Strategy");
    }
    
}
