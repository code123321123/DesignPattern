package Observer;

import Observable.StockObservable;

public class MobileNotificationAlert implements NotificationObserver{

    public String mobileNumber;
    StockObservable observable;

    MobileNotificationAlert(String mobileNumber,StockObservable observable)
     {
        this.mobileNumber=mobileNumber;
        this.observable=observable;
     }


    @Override
    public void update() {
         System.out.println("Pingggg Stock is available ");
         sendMsg(mobileNumber,"Stock available ");
    }

    
    public void sendMsg(String emString,String msg)
    {
         System.out.println( "Message  send to "+emString);
    }
    
}
