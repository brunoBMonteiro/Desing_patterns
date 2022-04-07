package comportamentais.observer3;

import java.util.ArrayList;
import java.util.List;

// Publisher ou publicadora
public class PublicFigure implements Subject {
    protected List<Observer> observers = new ArrayList<Observer>();
    protected String name;
    protected String handle;

    public PublicFigure(String name, String handle) {
        super();
        this.name = name;
        this.handle = "#" + handle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHandle() {
        return handle;
    }

    public void tweet(String tweet) {
        System.out.printf("\nNome: %s, Tweet: %s\n", name, tweet);
        notifySubscribers(tweet);
    }

    @Override
    public synchronized void addSubscriber(Observer observer) {
        observers.add(observer);
    }

    @Override
    public synchronized void removeSubscriber(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers(String tweet) {
        observers.forEach(observer -> observer.notification(handle, tweet));
    }
}

