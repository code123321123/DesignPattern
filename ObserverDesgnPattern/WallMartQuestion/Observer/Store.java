package Observer;

import Observable.IphoneObservable;
import Observable.StockObservable;

public class Store {
    

    public static void main(String[] args) {
        
        StockObservable iphObservable=new IphoneObservable();

        NotificationObserver notificationObserver1=new EmailNotificationAlert("abc@gmail.com",iphObservable);
        NotificationObserver notificationObserver2=new EmailNotificationAlert("pqrt@gmail.com",iphObservable);
        NotificationObserver notificationObserver3=new MobileNotificationAlert("username ",iphObservable);
        NotificationObserver notificationObserver4=new MobileNotificationAlert("usecase",iphObservable);

        iphObservable.add(notificationObserver1);
        iphObservable.add(notificationObserver2);
        iphObservable.add(notificationObserver3);
        iphObservable.add(notificationObserver4);
        

        iphObservable.setStockCount(10);
    }
    
}
