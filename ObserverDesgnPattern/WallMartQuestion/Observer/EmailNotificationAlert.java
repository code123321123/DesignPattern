package Observer;

import Observable.StockObservable;

public class EmailNotificationAlert implements NotificationObserver{

    String emaiId;
     StockObservable observable;

     EmailNotificationAlert(String emaiId,StockObservable observable)
     {
        this.emaiId=emaiId;
        this.observable=observable;
     }

    @Override
    public void update() {
        System.out.println("Prduct is available , Please checkout ");
        sendEmail(emaiId,"Product is in the stock hurry Up ");
    }

    public void sendEmail(String emString,String msg)
    {
         System.out.println( "Email send to "+emString);
    }
    
}
