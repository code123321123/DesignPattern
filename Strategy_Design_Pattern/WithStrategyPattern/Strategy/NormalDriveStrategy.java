package WithStrategyPattern.Stategy;

public class NormalDriveStrategy implements Strategy{

    @Override
    public void drive() {
        System.out.println("Normal  Strategy");
    }
    
    
    
}
