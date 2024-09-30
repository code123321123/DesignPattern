package Observable;

import Observer.NotificationObserver;

public interface  StockObservable
{

  public void add(NotificationObserver notificationObserver);

  public void remove(NotificationObserver notificationObserver);

  public void notifyAllSubscriber();

  public void setStockCount(int newStockAdded);

  public int getStockCount();
  



}
