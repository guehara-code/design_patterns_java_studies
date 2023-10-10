public class NotificationIterator implements Iterator {
    Notification[] notificationList;

    // maintain curr pos of iterator over the array
    int pos = 0;

    // constructor takes the array of notificationList are going to iterate over
    public NotificationIterator(Notification[] notificationList) {
        this.notificationList = notificationList;
    }

    public Object next() {
        // return next element in the array and increment pos
        Notification notification = notificationList[pos];
        pos += 1;
        return notification;
    }

    public boolean hasNext() {
        if(pos >= notificationList.length || notificationList[pos] == null)
            return false;
        else
            return true;
    }

}
