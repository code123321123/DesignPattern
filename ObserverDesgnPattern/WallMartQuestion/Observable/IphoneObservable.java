package Observable;

import java.util.ArrayList;
import java.util.List;

import Observer.NotificationObserver;

public class IphoneObservable implements StockObservable{

    List<NotificationObserver> observerList=new ArrayList<>();
    public int stocksCount=0;

    @Override
    public void add(NotificationObserver notificationObserver) {
        observerList.add(notificationObserver);
    }

    @Override
    public void remove(NotificationObserver notificationObserver) {
         observerList.remove(notificationObserver);
    }

    @Override
    public void notifyAllSubscriber() {
        for(NotificationObserver observer:observerList)
        {
             observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
       
        if(stocksCount==0)
        {
            notifyAllSubscriber();
        }
        stocksCount+=newStockAdded;
    }

    @Override
    public int getStockCount() {
          return stocksCount;
    }

    
    
}
