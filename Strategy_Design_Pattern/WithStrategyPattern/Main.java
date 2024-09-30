package WithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vechile vechile=new PassengerDriveStrategy();
        vechile.Drive();
    }
}
